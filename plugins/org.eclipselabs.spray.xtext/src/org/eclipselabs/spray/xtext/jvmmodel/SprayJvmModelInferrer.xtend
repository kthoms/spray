package org.eclipselabs.spray.xtext.jvmmodel

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.xtext.util.GenModelHelper

import static org.eclipse.xtext.EcoreUtil2.*

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. 
 * Other Xtend models link against the JVM model rather than the source model. The JVM
 * model elements should be associated with their source element by means of the
 * {@link IJvmModelAssociator}.</p>     
 */
class SprayJvmModelInferrer implements IJvmModelInferrer {
	@Inject TypesFactory typesFactory
	
	@Inject 
	extension IJvmModelAssociator jvmModelAssociator
	@Inject 
	TypeReferences typeReferences
	@Inject
	GenModelHelper genModelHelper

   	override List<? extends JvmDeclaredType> inferJvmModel(EObject sourceObject) {
		sourceObject.disassociate
		transform( sourceObject ).toList
   	}

	def dispatch Iterable<JvmDeclaredType> transform(EObject object) { emptyList }

	def dispatch Iterable<JvmDeclaredType> transform(Diagram model) {
		model.metaClasses.map(e | transform(e)).flatten
	}

	def dispatch Iterable<JvmDeclaredType> transform(MetaClass clazz) {
		if (clazz.type==null || clazz.type.eIsProxy) return emptyList
		try {
		    genModelHelper.getJavaInterfaceName(clazz.type)
		} catch (IllegalStateException e) {
		    return emptyList
		}
		val jvmClass = typesFactory.createJvmGenericType 
		jvmClass.simpleName = clazz.type.name
		jvmClass.packageName = clazz.type.EPackage.name
		clazz.associatePrimary(jvmClass)
		jvmClass.visibility = JvmVisibility::PUBLIC
		
		val instanceClassName = genModelHelper.getJavaInterfaceName(clazz.type)
		val eClassJvmType = typeReferences.getTypeForName(instanceClassName, clazz, null)

		val jvmField = typesFactory.createJvmField
		jvmField.simpleName = "ecoreClass"
		jvmField.visibility = JvmVisibility::PRIVATE
		clazz.associatePrimary(jvmField)
		jvmField.type = eClassJvmType
		jvmClass.members += jvmField
		
		val jvmGetter = typesFactory.createJvmOperation
		jvmGetter.simpleName = "getEcoreClass"
		jvmGetter.returnType = cloneWithProxies(jvmField.type)
		jvmGetter.visibility = JvmVisibility::PUBLIC
		jvmClass.members += jvmGetter
		clazz.associatePrimary(jvmGetter)
		
		newArrayList(jvmClass as JvmDeclaredType) 
	}
}


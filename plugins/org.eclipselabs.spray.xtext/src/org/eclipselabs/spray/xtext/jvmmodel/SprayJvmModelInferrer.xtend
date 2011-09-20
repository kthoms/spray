package org.eclipselabs.spray.xtext.jvmmodel
 
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.emf.ecore.EObject
import java.util.List
import com.google.inject.Inject
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.generator.graphiti.util.ProjectProperties
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipselabs.spray.mm.spray.Shape
import org.eclipse.xtext.common.types.JvmType
import org.eclipselabs.spray.mm.spray.Text
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipselabs.spray.mm.spray.Container
import org.eclipselabs.spray.mm.spray.SprayElement
import java.util.ArrayList
import org.eclipse.xtext.common.types.util.TypeReferences
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
	EcoreJvmModelInferrer ecoreJvmModelInferrer
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
		val types1 = model.metaClasses.map(e | transform(e)).flatten
//		val types2 = model.metaClasses.map(e | ecoreJvmModelInferrer.inferJvmModel(e.type)).flatten
//		val result = new ArrayList<JvmDeclaredType> ()
//		for (e : types2) {
//			result.add(e)
//		}
//		return result
		types1
	}

	def dispatch Iterable<JvmDeclaredType> transform(MetaClass clazz) {
		val jvmClass = typesFactory.createJvmGenericType 
		jvmClass.simpleName = clazz.type.name
		jvmClass.packageName = ProjectProperties::diagramPackage
		clazz.associatePrimary(jvmClass)
		jvmClass.visibility = JvmVisibility::PUBLIC
		
		val instanceClassName = genModelHelper.getInstanceClassName(clazz.type)
		val eClassJvmType = typeReferences.getTypeForName(instanceClassName, clazz, null)

		val jvmField = typesFactory.createJvmField
		jvmField.simpleName = "eClass"
		jvmField.visibility = JvmVisibility::PRIVATE
		clazz.associatePrimary(jvmField)
		jvmField.type = eClassJvmType
		jvmClass.members += jvmField
		
		val jvmGetter = typesFactory.createJvmOperation
		jvmGetter.simpleName = "getEClass"
		jvmGetter.returnType = cloneWithProxies(jvmField.type)
		jvmGetter.visibility = JvmVisibility::PUBLIC
		jvmClass.members += jvmGetter
		clazz.associatePrimary(jvmGetter)
		
		newArrayList(jvmClass as JvmDeclaredType) 
	}
}


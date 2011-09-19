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
	EcoreJvmModelInferer ecoreJvmModelInferer

   	override List<? extends JvmDeclaredType> inferJvmModel(EObject sourceObject) {
		sourceObject.disassociate
		transform( sourceObject ).toList
   	}

	def dispatch Iterable<JvmDeclaredType> transform(EObject object) { emptyList }

	def dispatch Iterable<JvmDeclaredType> transform(Diagram model) {
		val types1 = model.metaClasses.map(e | transform(e)).flatten
		val types2 = model.metaClasses.map(e | ecoreJvmModelInferer.transform(e.type)).flatten
		System::out.println("===> " + types2.map(t|t.simpleName)) 
		types1 + types2
	}

	def dispatch Iterable<JvmDeclaredType> transform(MetaClass clazz) {
		var i=1
		val jvmClass = typesFactory.createJvmGenericType 
		jvmClass.simpleName = clazz.type.name
		jvmClass.packageName = ProjectProperties::diagramPackage
		clazz.associatePrimary(jvmClass)
		jvmClass.visibility = JvmVisibility::PUBLIC
		
		transform(clazz.representedBy,jvmClass,i)
		newArrayList(jvmClass as JvmDeclaredType) 	 
	}
	
	def dispatch Iterable<JvmDeclaredType> transform(SprayElement shape, JvmGenericType containerType, int i) { emptyList }

	def dispatch Iterable<JvmDeclaredType> transform(Container shape, JvmGenericType containerType, int i) {
		val jvmClass = typesFactory.createJvmGenericType 
		jvmClass.simpleName = "Container"+i
		jvmClass.packageName = containerType.packageName
		jvmClass.declaringType = containerType
		shape.associatePrimary(jvmClass)
		for (part : shape.parts) {
			transform(part, jvmClass, i)
		}
		newArrayList(jvmClass as JvmDeclaredType)
	}

	/*
	def dispatch Iterable<JvmDeclaredType> transform(Text shape, JvmGenericType containerType, int i) {
		val jvmClass = typesFactory.createJvmGenericType 
		jvmClass.simpleName = "Text"+i
		jvmClass.packageName = containerType.packageName
		jvmClass.declaringType = containerType
		shape.associatePrimary(jvmClass)
		newArrayList(jvmClass as JvmDeclaredType)
	}
	*/
}

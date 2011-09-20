package org.eclipselabs.spray.xtext.jvmmodel

import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer
import com.google.inject.Inject
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import java.util.List
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmVisibility
import static org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.xtext.xtype.XtypeFactory
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.common.types.JvmField
import java.util.HashSet

class EcoreJvmModelInferer implements IJvmModelInferrer {
	@Inject TypesFactory typesFactory
	
	@Inject 
	extension IJvmModelAssociator jvmModelAssociator
	
	@Inject
	extension IQualifiedNameProvider qualifiedNameProvider

	HashSet<JvmDeclaredType> types
	
   	override List<? extends JvmDeclaredType> inferJvmModel(EObject sourceObject) {
		sourceObject.disassociate
		transform( sourceObject ).toList
   	}

	def dispatch Iterable<JvmDeclaredType> transform(EObject object) { emptyList }
	
	def dispatch Iterable<JvmDeclaredType> transform(EPackage ePackage) {
		ePackage.EClassifiers.map(e | transform(e)).flatten
	}
	
	def dispatch Iterable<JvmDeclaredType> transform (EClass eClass) {
//		types.clear()
		types = newHashSet()
		internalTransform(eClass)
		types
	}
	
	def internalTransform (EClassifier eClassifier) {
		switch (eClassifier) {
			EClass: internalTransform(eClassifier)
			EDataType: internalTransform(eClassifier)
		}
	}
	
	def create jvmClass : typesFactory.createJvmGenericType internalTransform (EClass eClass) {
		eClass.associatePrimary(jvmClass)
		types += jvmClass
		jvmClass.simpleName = eClass.name
		jvmClass.packageName = eClass.fullyQualifiedName.skipLast(1).toString
		jvmClass.visibility = JvmVisibility::PUBLIC

		for (superType : eClass.ESuperTypes) {
			val jvmSuperType = internalTransform(superType)
			
			val superTypeJvmTypeRef = typesFactory.createJvmParameterizedTypeReference
			superTypeJvmTypeRef.type = jvmSuperType
			jvmClass.superTypes += superTypeJvmTypeRef
		}
		
		for(f : eClass.EStructuralFeatures) {
			val JvmField field = transform(f, jvmClass)
		}
		
		jvmClass
	}

	def create jvmClass : typesFactory.createJvmGenericType internalTransform (EDataType eClass) {
		eClass.associatePrimary(jvmClass)
		types += jvmClass
		jvmClass.simpleName = eClass.name
		jvmClass.packageName = eClass.fullyQualifiedName.skipLast(1).toString
		jvmClass.visibility = JvmVisibility::PUBLIC
	}
	
	
	
	def JvmField transform(EStructuralFeature property, JvmGenericType type) {
		val jvmFieldTypeRef = typesFactory.createJvmParameterizedTypeReference
		val jvmField = typesFactory.createJvmField
		jvmField.simpleName = property.name
		jvmField.visibility = JvmVisibility::PRIVATE
		
		jvmFieldTypeRef.type = internalTransform(property.EType)
		jvmField.type = jvmFieldTypeRef
		type.members += jvmField
		property.associatePrimary(jvmField)
		
		val jvmGetter = typesFactory.createJvmOperation
		jvmGetter.simpleName = "get" + property.name.toFirstUpper
		jvmGetter.returnType = cloneWithProxies(jvmField.type)
		jvmGetter.visibility = JvmVisibility::PUBLIC
		type.members += jvmGetter
		property.associatePrimary(jvmGetter)
		
		val jvmSetter = typesFactory.createJvmOperation
		jvmSetter.simpleName = "set" + property.name.toFirstUpper
		val parameter = typesFactory.createJvmFormalParameter
		parameter.name = property.name.toFirstUpper
		parameter.parameterType = cloneWithProxies(jvmField.type)
		jvmSetter.visibility = JvmVisibility::PUBLIC
		jvmSetter.parameters += parameter
		type.members += jvmSetter
		property.associatePrimary(jvmSetter)
		return jvmField
	}
	
}
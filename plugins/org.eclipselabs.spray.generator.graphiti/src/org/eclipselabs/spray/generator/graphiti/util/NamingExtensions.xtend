package org.eclipselabs.spray.generator.graphiti.util

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions

import static org.eclipse.xtext.EcoreUtil2.*
import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import org.eclipse.emf.ecore.EAttribute
import org.eclipselabs.spray.mm.spray.Behaviour
import org.eclipselabs.spray.xtext.util.GenModelHelper

/**
 * Computation of class names, file names etc.
 * @author Karsten Thoms
 */
class NamingExtensions {
	@Inject extension SprayExtensions e1
	@Inject GenModelHelper genModelHelper
	
	//---------------------------------------------------------------------------------------------
	// Class names for Diagram
	//---------------------------------------------------------------------------------------------
	def getDiagramTypeProviderClassName (Diagram diagram) {
		diagram_package() + "." + diagram.getDiagramTypeProviderSimpleClassName
	}
	def getDiagramTypeProviderSimpleClassName (Diagram diagram) {
		diagram.name.toFirstUpper + "DiagramTypeProvider"
	}
	def getFeatureProviderClassName (Diagram diagram) {
		diagram_package() + "." + diagram.getFeatureProviderSimpleClassName
	}
	def getFeatureProviderSimpleClassName (Diagram diagram) {
		diagram.name.toFirstUpper + "FeatureProvider"
	}
	def getImageProviderClassName (Diagram diagram) {
		diagram_package() + "." + diagram.getImageProviderSimpleClassName
	}
	def getImageProviderSimpleClassName (Diagram diagram) {
		diagram.name.toFirstUpper + "ImageProvider"
	}
	def getToolBehaviourProviderClassName (Diagram diagram) {
		diagram_package() + "." + diagram.getToolBehaviourProviderSimpleClassName
	}
	def getToolBehaviourProviderSimpleClassName (Diagram diagram) {
		diagram.name.toFirstUpper + "ToolBehaviourProvider"
	}
	def getDiagramEditorClassName (Diagram diagram) {
		diagram_package() + "." + diagram.getDiagramEditorSimpleClassName
	}
	def getDiagramEditorSimpleClassName (Diagram diagram) {
		diagram.name.toFirstUpper() + "DiagramEditor"
	}

	//---------------------------------------------------------------------------------------------
	// Class names for MetaClass
	//---------------------------------------------------------------------------------------------
	def getCreateFeatureClassName (MetaClass clazz) {
		getFeatureClassName (clazz, FeatureType::Create)
	}
	def getCreateFeatureSimpleClassName (MetaClass clazz) {
		getFeatureSimpleClassName (clazz, FeatureType::Create)
	}
	def getAddFeatureClassName (MetaClass clazz) {
		getFeatureClassName (clazz, FeatureType::Add)
	}
	def getAddFeatureSimpleClassName (MetaClass clazz) {
		getFeatureSimpleClassName (clazz, FeatureType::Add)
	}
	def getUpdateFeatureClassName (MetaClass clazz) {
		getFeatureClassName (clazz, FeatureType::Update)
	}
	def getUpdateFeatureSimpleClassName (MetaClass clazz) {
		getFeatureSimpleClassName (clazz, FeatureType::Update)
	}
	def getLayoutFeatureClassName (MetaClass clazz) {
		getFeatureClassName (clazz, FeatureType::Layout)
	}
	def getLayoutFeatureSimpleClassName (MetaClass clazz) {
		getFeatureSimpleClassName (clazz, FeatureType::Layout)
	}
	/**
	 * Result example:
	 * Diagram = "mod4j", MetaClass = "BusinessClass", featureType="Add" 
	 * Result = "Mod4jAddBusinessClassFeature"
	 */
	def getFeatureClassName (MetaClass clazz, FeatureType featureType) {
		feature_package() + "." + getFeatureSimpleClassName(clazz, featureType)
	}

	def getFeatureSimpleClassName (MetaClass clazz, FeatureType featureType) {
		clazz.diagram.name.toFirstUpper + featureType + visibleName(clazz) + "Feature"
	}
	def dispatch getFilterClassName (MetaClass clazz) {
		property_package() + "." + clazz.getFilterSimpleClassName
	}
	def dispatch getFilterSimpleClassName (MetaClass clazz) {
		clazz.name+"Filter"
	}

	//---------------------------------------------------------------------------------------------
	// Class names for MetaReference
	//---------------------------------------------------------------------------------------------
	def getCreateFeatureClassName (MetaReference reference) {
		getFeatureClassName (reference, FeatureType::Create)
	}
	def getAddFeatureClassName (MetaReference reference) {
		getFeatureClassName (reference, FeatureType::Add)
	}
	def getUpdateFeatureClassName (MetaReference reference) {
		getFeatureClassName (reference, FeatureType::Update)
	}
	def getFeatureClassName (MetaReference reference, FeatureType featureType) {
		val cls = getContainerOfType(reference, typeof(MetaClass))
		feature_package() + "." + cls.diagram.name.toFirstUpper + featureType + cls.name + reference.name.toFirstUpper + reference.reference.EReferenceType.name + "Feature"
	}	
	def getAddReferenceAsConnectionFeatureClassName (MetaReference reference) {
		feature_package() + "." + reference.getAddReferenceAsConnectionFeatureSimpleClassName 
	}
	def getAddReferenceAsConnectionFeatureSimpleClassName (MetaReference reference) {
		val cls = getContainerOfType(reference, typeof(MetaClass))
		cls.diagram.name.toFirstUpper + "AddReference" + cls.name + reference.name.toFirstUpper + "Feature" 
	}
	def getCreateReferenceAsListFeatureClassName (MetaReference reference) {
		feature_package() + "." + reference.getCreateReferenceAsListFeatureSimpleClassName
	}
	def getCreateReferenceAsListFeatureSimpleClassName (MetaReference reference) {
		val cls = getContainerOfType(reference, typeof(MetaClass))
		cls.diagram.name.toFirstUpper + "Create" + cls.name + reference.name.toFirstUpper + reference.reference.EReferenceType.name + "Feature"
	}
	def getUpdateReferenceAsListFeatureClassName (MetaReference reference) {
		feature_package() + "." + reference.getUpdateReferenceAsListFeatureSimpleClassName
	}
	def getUpdateReferenceAsListFeatureSimpleClassName (MetaReference reference) {
		val cls = getContainerOfType(reference, typeof(MetaClass))
		cls.diagram.name.toFirstUpper + "Update" + cls.name + reference.name.toFirstUpper + "Feature"
	}
	def getCreateReferenceAsListFeatureClassName (MetaReference reference, EClass subClass) {
		feature_package() + "." + reference.getCreateReferenceAsListFeatureSimpleClassName(subClass)
	}
	def getCreateReferenceAsListFeatureSimpleClassName (MetaReference reference, EClass subClass) {
		val cls = getContainerOfType(reference, typeof(MetaClass))
		cls.diagram.name.toFirstUpper + "Create" + cls.name + reference.name.toFirstUpper + subClass.name + "Feature"
	}
	def getAddReferenceAsListFeatureClassName (MetaReference reference) {
		feature_package() + "." + reference.getAddReferenceAsListFeatureSimpleClassName 
	}
	def getAddReferenceAsListFeatureSimpleClassName (MetaReference reference) {
		val cls = getContainerOfType(reference, typeof(MetaClass))
		cls.diagram.name.toFirstUpper + "Add" + cls.name + reference.name.toFirstUpper + "ListFeature" 
	}
	def getCreateReferenceAsConnectionFeatureClassName (MetaReference reference) {
		feature_package() + "." + reference.getCreateReferenceAsConnectionFeatureSimpleClassName
	}
	def getCreateReferenceAsConnectionFeatureSimpleClassName (MetaReference reference) {
		val cls = getContainerOfType(reference, typeof(MetaClass))
		cls.diagram.name.toFirstUpper + "Create" + cls.name + reference.name.toFirstUpper + "Feature"
	}
	def getDeleteReferenceFeatureClassName (MetaReference reference) {
		feature_package() + "." +  reference.getDeleteReferenceFeatureSimpleClassName
	}
	def getDeleteReferenceFeatureSimpleClassName (MetaReference reference) {
		val cls = getContainerOfType(reference, typeof(MetaClass))
		cls.diagram.name.toFirstUpper + "DeleteReference" + cls.name + reference.name.toFirstUpper + "Feature"
	}
	//---------------------------------------------------------------------------------------------
	// Class names for Behaviour
	//---------------------------------------------------------------------------------------------
	def getCustomFeatureClassName (Behaviour behaviour) {
		feature_package() + "." + behaviour.getCustomFeatureSimpleClassName
	}
	def getCustomFeatureSimpleClassName (Behaviour behaviour) {
		val diagram = getContainerOfType(behaviour, typeof(Diagram))
		diagram.name.toFirstUpper + "Custom" + behaviour.name.toFirstUpper  + "Feature"
	}
	
	//---------------------------------------------------------------------------------------------
	// Class names for EClass
	//---------------------------------------------------------------------------------------------
	def dispatch getFilterClassName (EClass clazz) {
		property_package() + "." + clazz.getFilterSimpleClassName
	}
	def dispatch getFilterSimpleClassName (EClass clazz) {
		clazz.name+"Filter"
	}
	//---------------------------------------------------------------------------------------------
	// Class names for EAttribute
	//---------------------------------------------------------------------------------------------
	def getPropertySectionClassName (EAttribute attribute) {
		property_package() + "." + attribute.getPropertySectionSimpleClassName
	}
	def getPropertySectionSimpleClassName (EAttribute attribute) {
		attribute.EContainingClass.name + attribute.name.toFirstUpper + "Section"
	}
	def getPropertySectionClassName (EClass clazz, EAttribute attribute) {
		property_package() + "." + getPropertySectionSimpleClassName(clazz,attribute)
	}
	def getPropertySectionSimpleClassName (EClass clazz, EAttribute attribute) {
		clazz.name + attribute.name.toFirstUpper + "Section"
	}
	//---------------------------------------------------------------------------------------------
	// Names from GenModel
	//---------------------------------------------------------------------------------------------
	def String getJavaInterfaceName (EClass eClass) {
		genModelHelper.getJavaInterfaceName(eClass)
	}
	def String getJavaInterfaceName (MetaClass clazz) {
		genModelHelper.getJavaInterfaceName(clazz.type)
	}
	def String getEPackageClassName (MetaClass clazz) {
		genModelHelper.getEPackageClassName(clazz.type)
	}
	def String getEPackageClassName (EClass eClass) {
		genModelHelper.getEPackageClassName(eClass)
	}
	def String getLiteralConstant (EClass eClass) {
		genModelHelper.getLiteralConstant(eClass)
	}
	def String getLiteralConstant (MetaClass clazz) {
		genModelHelper.getLiteralConstant(clazz.type)
	}
	def String getEFactoryInterfaceName (EClass clazz) {
		genModelHelper.getEFactoryInterfaceName(clazz)
	}
	def String getEFactoryInterfaceName (MetaClass clazz) {
		genModelHelper.getEFactoryInterfaceName(clazz.type)
	}
	//---------------------------------------------------------------------------------------------
	// Other names for MetaClass
	//---------------------------------------------------------------------------------------------
	def String getDiagramName (MetaClass clazz) {
		clazz.diagram.name
	}
	//---------------------------------------------------------------------------------------------
	// Other names
	//---------------------------------------------------------------------------------------------
	def String getImageIdentifier (Diagram diagram, String imagePath) {
		if (imagePath==null) return null
		// strip file extension and replace all non-word characters by underscore
		return diagram.name.toUpperCase+"_"+imagePath.substring(0, imagePath.lastIndexOf('.')).replaceAll("\\W","_").toUpperCase
	}
	def String getImageBaseName (String imagePath) {
		if (imagePath==null) return null
		// strip file extension and replace all non-word characters by underscore
		return imagePath.substring(0, imagePath.lastIndexOf('.')).replaceAll("\\W","_").toLowerCase
	}
}


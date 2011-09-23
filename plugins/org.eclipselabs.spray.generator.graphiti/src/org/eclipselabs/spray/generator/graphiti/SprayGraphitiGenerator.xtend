package org.eclipselabs.spray.generator.graphiti

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess
import org.eclipselabs.spray.generator.graphiti.templates.*
import org.eclipselabs.spray.mm.spray.*
import org.eclipselabs.spray.generator.graphiti.util.ProjectProperties
import org.eclipselabs.spray.generator.graphiti.util.StringHelpers
import static extension org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import static extension org.eclipselabs.spray.generator.graphiti.util.MetaModel.*
import static extension org.eclipselabs.spray.generator.graphiti.util.XtendProperties.*
import org.eclipse.internal.xtend.util.StringHelper
import org.eclipse.emf.common.util.URI
import org.eclipselabs.spray.mm.spray.*
import com.google.inject.Inject
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions

class SprayGraphitiGenerator implements IGenerator {
	@Inject extension SprayExtensions e1
	@Inject extension NamingExtensions e2
	
	@Inject Plugin plugin
	@Inject DiagramTypeProvider dtp
	@Inject FeatureProvider fp
	@Inject AddShapeFeature addShapeFeature
	@Inject AddConnectionFeature addConnectionFeature
	@Inject AddReferenceAsConnectionFeature addReferenceAsConnectionFeature
	@Inject AddReferenceAsListFeature addReferenceAsListFeature
	@Inject CreateConnectionFeature createConnectionFeature
	@Inject CreateShapeFeature createShapeFeature
	@Inject CreateReferenceAsListFeature createReferenceAsListFeature
	@Inject CreateReferenceAsListFeature createReferenceAsListFeature
	@Inject CreateReferenceAsListFeature createReferenceAsListFeature
	@Inject CreateReferenceAsConnectionFeature createReferenceAsConnectionFeature 
	@Inject UpdateConnectionFeature updateConnectionFeature
	@Inject LayoutFeature layoutFeature
	@Inject UpdateShapeFeature updateShapeFeature
	@Inject UpdateReferenceAsListFeature updateReferenceAsListFeature
	@Inject DeleteReferenceFeature deleteReferenceFeature
	@Inject ImageProvider imageProvider
	@Inject ToolBehaviourProvider toolBehaviourProvider
	@Inject PropertySection propertySection
	@Inject Filter filter
	@Inject Filter filter2
	@Inject CustomFeature customFeature
	
	/**
	 * This method is a long sequence of calling all templates for the code generation
	 */
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {  
		var JavaIoFileSystemAccess javaFsa 
		var EclipseResourceFileSystemAccess eclipseFsa
		var String modelPath = resource.getURI().devicePath;
		var String propertiesPath = StringHelpers::replaceLastSubstring(modelPath, "spray", "properties")
		ProjectProperties::setModelUri(resource.URI)
		var String genOutputPath = ProjectProperties::projectPath + "/" + ProjectProperties::srcGenPath;
		var String manOutputPath = ProjectProperties::projectPath + "/" + ProjectProperties::srcManPath;

		if( fsa instanceof JavaIoFileSystemAccess) {
			javaFsa = (fsa as JavaIoFileSystemAccess) 
		}
		if( fsa instanceof EclipseResourceFileSystemAccess){
			println("EclipseResourceFileSystemAccess: WARNING: dos not work yet")
			eclipseFsa = (fsa as EclipseResourceFileSystemAccess)
		}
		
		var Diagram diagram = resource.contents.head as Diagram
		fsa.generateFile("plugin.xml", plugin.generate(diagram))
		
		var JavaGenFile java
		if(  javaFsa != null ){
			java = new JavaGenFile(javaFsa)
			java.setGenOutputPath(genOutputPath)
			java.setManOutputPath(manOutputPath)
		} else  {
			java = new JavaGenFile(eclipseFsa)
		}
		
		java.hasExtensionPoint = true
		java.setPackageAndClass(diagram_package(), diagram.diagramTypeProviderSimpleClassName)
		dtp.generate(diagram, java)
		
		java.setPackageAndClass(diagram_package(), diagram.diagramTypeProviderSimpleClassName)
		fp.generate(diagram, java)
		
		// Generate for all Container Shapes
		for( metaClass : diagram.metaClasses.filter(m | m.representedBy instanceof Container)){
			var container = metaClass.representedBy as Container
			java.setPackageAndClass(feature_package(), metaClass.addFeatureSimpleClassName)
			
			addShapeFeature.generate(container, java)
		}

		// Generate for all Connection
		for( metaClass : diagram.metaClasses.filter(m | m.representedBy instanceof Connection)){
			var connection = metaClass.representedBy as Connection
			java.setPackageAndClass(feature_package(), metaClass.addFeatureSimpleClassName)
			addConnectionFeature.generate(metaClass, java)
		}

		// Generate for all EReferences as Connection   TODO metaClass.name ==> metaClass.viibleName()
		for( metaClass : diagram.metaClasses) {
			for( reference : metaClass.references.filter(ref|ref.representedBy != null) ){
				java.setPackageAndClass(feature_package(), reference.addReferenceAsConnectionFeatureSimpleClassName)
				
				addReferenceAsConnectionFeature.generate(reference, java)
			}
		}

		for( metaClass : diagram.metaClasses) {
			if( metaClass.representedBy instanceof Container ){
				var container = metaClass.representedBy as Container
				for(metaRef : container.parts.filter(typeof(MetaReference)) ){
					java.setPackageAndClass(feature_package(), metaRef.addReferenceAsListFeatureSimpleClassName)
					addReferenceAsListFeature.generate(metaRef, java)
				}
			}
			
		}
		
		for( metaClass : diagram.metaClasses) {
			if( metaClass.representedBy instanceof Connection){
				java.setPackageAndClass(feature_package(), metaClass.createFeatureSimpleClassName)
				createConnectionFeature.generate(metaClass, java)
			} else {
				java.setPackageAndClass(feature_package(), metaClass.createFeatureSimpleClassName)
				createShapeFeature.generate(metaClass, java)
			}
		}
		
//		println("1 : " +  diagram.metaClasses.filter( m | m.container != null))
		for( reference : diagram.metaClasses.filter( m | m.representedBy != null).map(m | m.representedBy).filter(typeof(Container)).map(c | (c as Container).parts.filter(typeof(MetaReference))).flatten) {
			val referenceName = reference.getName
			var metaClass = (reference.eContainer as Container).represents
			var target = metaClass.type.EAllReferences.findFirst(e|e.name == referenceName) 
			var targetType = target.EReferenceType 
			if( ! targetType.abstract){
				println("NOT ABSTRACT: " + targetType.name)
				java.setPackageAndClass(feature_package(), reference.createReferenceAsListFeatureSimpleClassName)
				createReferenceAsListFeature.setTarget(targetType)
				createReferenceAsListFeature.generate(reference, java)
			} else {
				println("ABSTRACT: " + targetType.name)
//				java.setPackageAndClass(feature_package(), metaClass.diagram.name.toFirstUpper + "Create" + metaClass.name + reference.name + targetType.name + "Feature")
//				var CreateReferenceAsListFeature ft = new CreateReferenceAsListFeature()
//				ft.setTarget(targetType)
//				ft.generate(reference, java)
			}
			for( subclass : targetType.getSubclasses() ){
				if( ! subclass.abstract ){
					println("NOT ABSTRACT subclass: " + subclass.name)
					java.setPackageAndClass(feature_package(), reference.getCreateReferenceAsListFeatureSimpleClassName(subclass))
					createReferenceAsListFeature.setTarget(subclass)
					createReferenceAsListFeature.generate(reference, java)
				} else {
					println("ABSTRACT subclass: " +subclass.name)
					java.setPackageAndClass(feature_package(), reference.getCreateReferenceAsListFeatureSimpleClassName(subclass))
					createReferenceAsListFeature.setTarget(subclass)
					createReferenceAsListFeature.generate(reference, java)
				}
			}	
		}
		for( metaClass : diagram.metaClasses) {
			for( reference : metaClass.references.filter(ref|ref.representedBy != null) ) {
				java.setPackageAndClass(feature_package(), reference.getCreateReferenceAsConnectionFeatureSimpleClassName)
				createReferenceAsConnectionFeature.generate(reference, java)
		    }
 	    }
 	    
		for( metaClass : diagram.metaClasses) {
			if( metaClass.representedBy instanceof Connection) {
				//    No layout feature needed 
				java.setPackageAndClass(feature_package(), metaClass.updateFeatureSimpleClassName)
				updateConnectionFeature.generate(metaClass.representedBy, java)
			} else if( metaClass.representedBy instanceof Container) {
				java.setPackageAndClass(feature_package(), metaClass.layoutFeatureSimpleClassName)
				layoutFeature.generate(metaClass.representedBy, java)
				
				java.setPackageAndClass(feature_package(), metaClass.updateFeatureSimpleClassName)
				updateShapeFeature.generate(metaClass.representedBy, java)

				var container = metaClass.representedBy as Container
				for(reference : container.parts.filter(p | p instanceof MetaReference).map(p | p as MetaReference) ){
					val referenceName = reference.getName
				    var eClass = metaClass.type.EAllReferences.findFirst(e|e.name == referenceName).EReferenceType 
					updateReferenceAsListFeature.setTarget(eClass)
					java.setPackageAndClass(feature_package(), reference.updateReferenceAsListFeatureSimpleClassName)
					updateReferenceAsListFeature.generate(reference, java)
				}
			}
		}	
		
		for( metaClass : diagram.metaClasses) {
			for( reference : metaClass.references) {
				java.setPackageAndClass(feature_package(), reference.deleteReferenceFeatureSimpleClassName)
				deleteReferenceFeature.generate(reference, java)
			}
			
		}
		
		java.setPackageAndClass(diagram_package(), diagram.imageProviderSimpleClassName)
		imageProvider.generate(diagram, java)

		java.setPackageAndClass(diagram_package(), diagram.toolBehaviourProviderSimpleClassName)
		toolBehaviourProvider.generate(diagram, java)
		
		// PropertySections Java code
		for( metaClass : diagram.metaClasses) {
			val eClass1 = metaClass.type
			for( attribute : eClass1.EAllAttributes){
				java.setPackageAndClass(property_package(), attribute.propertySectionSimpleClassName)
				propertySection.setDiagram(diagram)
				propertySection.generate(attribute, java)
			}
			if( metaClass.representedBy instanceof Container ){
				val container = metaClass.representedBy as Container
				for( reference : container.parts.filter(p | p instanceof MetaReference).map(p | p as MetaReference)) {
					val referenceName = reference.getName
					var eClass = metaClass.type.EAllReferences.findFirst(r | r.name == referenceName).EReferenceType
					for( attribute : eClass.EAllAttributes ){
						java.setPackageAndClass(property_package(), attribute.propertySectionSimpleClassName)
						propertySection.setDiagram(diagram)
						propertySection.generate(attribute, java)
					}
				}
			}
		}		
		
		for( metaClass : diagram.metaClasses) {
			filter.setDiagram(diagram)
			java.setPackageAndClass(property_package(), metaClass.filterSimpleClassName)
			filter.generate(metaClass.type, java)

			if( metaClass.representedBy instanceof Container){
				val container = metaClass.representedBy as Container
				for( reference : container.parts.filter( p | p instanceof MetaReference).map(p | p as MetaReference)){
					val referenceName = reference.getName
					val eClass = metaClass.type.EAllReferences.findFirst(ref| ref.name == referenceName).EReferenceType 
					filter2.setDiagram(diagram)
					java.setPackageAndClass(property_package(), eClass.filterSimpleClassName)
					filter2.generate(eClass, java)
				}
			}
		}

		for( metaClass : diagram.metaClasses) {
			for( behaviour : metaClass.behaviours){
				java.setPackageAndClass(feature_package(), behaviour.customFeatureSimpleClassName)
				customFeature.generate(behaviour, java)
			}
		}
	}


}

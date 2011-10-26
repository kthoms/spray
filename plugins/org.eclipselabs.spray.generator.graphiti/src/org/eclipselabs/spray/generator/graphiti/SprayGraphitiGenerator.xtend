package org.eclipselabs.spray.generator.graphiti

import com.google.inject.Inject
import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipselabs.spray.generator.graphiti.templates.AddConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.AddReferenceAsConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.AddReferenceAsListFeature
import org.eclipselabs.spray.generator.graphiti.templates.AddShapeFeature
import org.eclipselabs.spray.generator.graphiti.templates.CreateConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.CreateReferenceAsConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.CreateReferenceAsListFeature
import org.eclipselabs.spray.generator.graphiti.templates.CreateShapeFeature
import org.eclipselabs.spray.generator.graphiti.templates.CustomFeature
import org.eclipselabs.spray.generator.graphiti.templates.DeleteReferenceFeature
import org.eclipselabs.spray.generator.graphiti.templates.DiagramTypeProvider
import org.eclipselabs.spray.generator.graphiti.templates.ExecutableExtensionFactory
import org.eclipselabs.spray.generator.graphiti.templates.FeatureProvider
import org.eclipselabs.spray.generator.graphiti.templates.Filter
import org.eclipselabs.spray.generator.graphiti.templates.GuiceModule
import org.eclipselabs.spray.generator.graphiti.templates.ImageProvider
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile
import org.eclipselabs.spray.generator.graphiti.templates.LayoutFeature
import org.eclipselabs.spray.generator.graphiti.templates.Plugin
import org.eclipselabs.spray.generator.graphiti.templates.PluginActivator
import org.eclipselabs.spray.generator.graphiti.templates.PropertySection
import org.eclipselabs.spray.generator.graphiti.templates.ToolBehaviourProvider
import org.eclipselabs.spray.generator.graphiti.templates.UpdateConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.UpdateReferenceAsListFeature
import org.eclipselabs.spray.generator.graphiti.templates.UpdateShapeFeature
import org.eclipselabs.spray.generator.graphiti.util.EclipseHelpers
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.ProjectProperties
import org.eclipselabs.spray.generator.graphiti.util.StringHelpers
import org.eclipselabs.spray.mm.spray.Connection
import org.eclipselabs.spray.mm.spray.Container
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions

import static extension org.eclipselabs.spray.generator.graphiti.util.MetaModel.*

class SprayGraphitiGenerator implements IGenerator {
	@Inject extension SprayExtensions e1
	@Inject extension NamingExtensions naming
	
	@Inject PluginActivator pluginActivator
	@Inject ExecutableExtensionFactory executableExtensionFactory
	@Inject GuiceModule guiceModule
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
			var IProject project  = EclipseHelpers::toEclipseResource(resource).project  
			
			java.setGenOutputPath(project.fullPath.toPortableString + "/" + ProjectProperties::srcGenPath);
			java.setManOutputPath(project.fullPath.toPortableString + "/" + ProjectProperties::srcManPath);
		}
		
        java.hasExtensionPoint = false
        // Generate Plugin Activator
        java.setPackageAndClass(diagram.activatorClassName)
        pluginActivator.generate(diagram, java)
        // Generate ExectuableExtensionFactory
        java.setPackageAndClass(diagram.extensionFactoryClassName)
        executableExtensionFactory.generate(diagram, java)
        // Generate Guice Module
        java.setPackageAndClass(diagram.guiceModuleClassName)
        guiceModule.generate(diagram, java)
        
        java.hasExtensionPoint = true
		// Generate Diagram Type Provider
		java.setPackageAndClass(diagram.diagramTypeProviderClassName)
		dtp.generate(diagram, java)
		
		// Generate Feature Provider
		java.setPackageAndClass(diagram.featureProviderClassName)
		fp.generate(diagram, java)
		
		// Generate for all Container Shapes
		for( metaClass : diagram.metaClasses.filter(m | m.representedBy instanceof Container)){
			var container = metaClass.representedBy as Container
			java.setPackageAndClass(metaClass.addFeatureClassName)
			
			addShapeFeature.generate(container, java)
		}

		// Generate for all Connection
		for( metaClass : diagram.metaClasses.filter(m | m.representedBy instanceof Connection)){
			var connection = metaClass.representedBy as Connection
			java.setPackageAndClass(metaClass.addFeatureClassName)
			addConnectionFeature.generate(metaClass, java)
		}

		// Generate for all EReferences as Connection   TODO metaClass.name ==> metaClass.viibleName()
		for( metaClass : diagram.metaClasses) {
			for( reference : metaClass.references.filter(ref|ref.representedBy != null) ){
				java.setPackageAndClass(reference.addReferenceAsConnectionFeatureClassName)
				
				addReferenceAsConnectionFeature.generate(reference, java)
			}
		}

		for( metaClass : diagram.metaClasses) {
			if( metaClass.representedBy instanceof Container ){
				var container = metaClass.representedBy as Container
				for(metaRef : container.parts.filter(typeof(MetaReference)) ){
					java.setPackageAndClass(metaRef.addReferenceAsListFeatureClassName)
					addReferenceAsListFeature.generate(metaRef, java)
				}
			}
			
		}
		
		for( metaClass : diagram.metaClasses) {
			if( metaClass.representedBy instanceof Connection){
				java.setPackageAndClass(metaClass.createFeatureClassName)
				createConnectionFeature.generate(metaClass, java)
			} else {
				java.setPackageAndClass(metaClass.createFeatureClassName)
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
				java.setPackageAndClass(reference.createReferenceAsListFeatureClassName)
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
					java.setPackageAndClass(reference.getCreateReferenceAsListFeatureClassName(subclass))
					createReferenceAsListFeature.setTarget(subclass)
					createReferenceAsListFeature.generate(reference, java)
				} else {
					println("ABSTRACT subclass: " +subclass.name)
					java.setPackageAndClass(reference.getCreateReferenceAsListFeatureClassName(subclass))
					createReferenceAsListFeature.setTarget(subclass)
					createReferenceAsListFeature.generate(reference, java)
				}
			}	
		}
		for( metaClass : diagram.metaClasses) {
			for( reference : metaClass.references.filter(ref|ref.representedBy != null) ) {
				java.setPackageAndClass(reference.getCreateReferenceAsConnectionFeatureClassName)
				createReferenceAsConnectionFeature.generate(reference, java)
		    }
 	    }
 	    
		for( metaClass : diagram.metaClasses) {
			if( metaClass.representedBy instanceof Connection) {
				//    No layout feature needed 
				java.setPackageAndClass(metaClass.updateFeatureClassName)
				updateConnectionFeature.generate(metaClass.representedBy, java)
			} else if( metaClass.representedBy instanceof Container) {
				java.setPackageAndClass(metaClass.layoutFeatureClassName)
				layoutFeature.generate(metaClass.representedBy, java)
				
				java.setPackageAndClass(metaClass.updateFeatureClassName)
				updateShapeFeature.generate(metaClass.representedBy, java)

				var container = metaClass.representedBy as Container
				for(reference : container.parts.filter(p | p instanceof MetaReference).map(p | p as MetaReference) ){
					val referenceName = reference.getName
				    var eClass = metaClass.type.EAllReferences.findFirst(e|e.name == referenceName).EReferenceType 
					updateReferenceAsListFeature.setTarget(eClass)
					java.setPackageAndClass(reference.updateReferenceAsListFeatureClassName)
					updateReferenceAsListFeature.generate(reference, java)
				}
			}
		}	
		
		for( metaClass : diagram.metaClasses) {
			for( reference : metaClass.references) {
				java.setPackageAndClass(reference.deleteReferenceFeatureClassName)
				deleteReferenceFeature.generate(reference, java)
			}
			
		}
		
		java.setPackageAndClass(diagram.imageProviderClassName)
		imageProvider.generate(diagram, java)

		java.setPackageAndClass(diagram.toolBehaviourProviderClassName)
		toolBehaviourProvider.generate(diagram, java)
		
		// PropertySections Java code
		for( metaClass : diagram.metaClasses) {
			val eClass1 = metaClass.type
			for( attribute : eClass1.EAllAttributes){
				java.setPackageAndClass(naming.getPropertySectionClassName(eClass1, attribute))
				propertySection.setDiagram(diagram)
				propertySection.generate(attribute, java)
			}
			if( metaClass.representedBy instanceof Container ){
				val container = metaClass.representedBy as Container
				for( reference : container.parts.filter(p | p instanceof MetaReference).map(p | p as MetaReference)) {
					val referenceName = reference.getName
					var eClass = metaClass.type.EAllReferences.findFirst(r | r.name == referenceName).EReferenceType
					for( attribute : eClass.EAllAttributes ){
						java.setPackageAndClass(naming.getPropertySectionClassName(eClass, attribute))
						propertySection.setDiagram(diagram)
						propertySection.generate(attribute, java)
					}
				}
			}
		}		
		
		for( metaClass : diagram.metaClasses) {
			filter.setDiagram(diagram)
			java.setPackageAndClass(metaClass.filterClassName)
			filter.generate(metaClass.type, java)

			if( metaClass.representedBy instanceof Container){
				val container = metaClass.representedBy as Container
				for( reference : container.parts.filter( p | p instanceof MetaReference).map(p | p as MetaReference)){
					val referenceName = reference.getName
					val eClass = metaClass.type.EAllReferences.findFirst(ref| ref.name == referenceName).EReferenceType 
					filter2.setDiagram(diagram)
					java.setPackageAndClass(eClass.filterClassName)
					filter2.generate(eClass, java)
				}
			}
		}

		for( metaClass : diagram.metaClasses) {
			for( behaviour : metaClass.behaviours){
				java.setPackageAndClass(behaviour.customFeatureClassName)
				customFeature.generate(behaviour, java)
			}
		}
	}


}

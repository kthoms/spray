package org.eclipselabs.spray.xtext.ui.wizard.codegen

import org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo
import org.eclipse.xtext.generator.IFileSystemAccess

class SprayModelGenerator {
    def doGenerate (SprayProjectInfo info, IFileSystemAccess fsa) {
        val project = info.projectName
        fsa.generateFile("model/"+info.getDiagramTypeName + ".spray", info.projectName, generateModel(info))
        fsa.generateFile("model/"+info.getDiagramTypeName + ".properties", info.projectName, generateProperties(info))
    }
    
    def generateModel (SprayProjectInfo info) '''
        /*************************************************************************************
         *
         * Spray diagram definition
         * 
         * This file contains the definition of a graphical editor using the Spray Language.
         * Refer to http://code.google.com/a/eclipselabs.org/p/spray/ for documentation.
         *
         * See also «info.getDiagramTypeName».properties to configure generator properties.
         *************************************************************************************/
        diagram   «info.getDiagramTypeName»
        
        // Add import statements here, e.g.
        // import BusinessDomainDsl.*
        
        // Add class mappings here. Refer to EClasses here. Don't forget to configure a
        // dependency to the plugin defining the EMF metamodel in META-INF/MANIFEST.MF.
        // It is required to have a genmodel for the metamodel. 
        // Currently, the metamodel plugin must be deployed in your Eclipse installation,
        // i.e. it is not possible to refer to an Ecore model within your workspace.
        //
        // Example class mapping:
        //   class BusinessClass:
        //     container  ( fill=dark_green ) 
        //     [
        //       text ( )  { "<<"+eClass.name+">> " + name};
        //     ]
        
        
    '''
    
    def generateProperties (SprayProjectInfo info) '''
        pluginId        = «info.getBasePackage»
        mainPackage     = «info.getBasePackage»
        diagramPackage  = «info.getBasePackage».diagram
        featurePackage     = «info.getBasePackage».features
        propertyPackage = «info.getBasePackage».property
        utilPackage     = org.eclipselabs.spray.runtime.graphiti.containers
        
        srcGenPath         = src-gen
        resourceGenPath = resource-gen
        srcManPath         = src
        resourceManPath = resource
        projectPath     = ./«info.projectName»
        headerTimestamp = false
    '''
    
}
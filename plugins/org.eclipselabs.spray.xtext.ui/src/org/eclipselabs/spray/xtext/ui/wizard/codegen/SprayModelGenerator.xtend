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
		diagram   «info.getDiagramTypeName»
		extension "«info.getMetamodelExtension»"
	'''
	
	def generateProperties (SprayProjectInfo info) '''
		diagramPackage 	= «info.getBasePackage».diagram
		featurePackage 	= «info.getBasePackage».features
		propertyPackage = «info.getBasePackage».property
		utilPackage 	= «info.getBasePackage».runtime.containers
		
		srcGenPath 		= src-gen
		resourceGenPath = resource-gen
		srcManPath 		= src
		resourceManPath = resource
		projectPath 	= ./«info.projectName»
		headerTimestamp = false
	'''
	
}
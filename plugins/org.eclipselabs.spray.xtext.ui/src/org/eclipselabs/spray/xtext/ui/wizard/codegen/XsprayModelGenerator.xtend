package org.eclipselabs.spray.xtext.ui.wizard.codegen

import org.eclipselabs.spray.xtext.ui.wizard.XsprayProjectInfo
import org.eclipse.xtext.generator.IFileSystemAccess

class XsprayModelGenerator {
	def doGenerate (org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo info, IFileSystemAccess fsa) {
		val project = info.projectName
		fsa.generateFile("model/"+info.getDiagramTypeName + ".xspray", info.projectName, generateModel(info))
		fsa.generateFile("model/"+info.getDiagramTypeName + ".properties", info.projectName, generateProperties(info))
	}
	
	def generateModel (org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo info) '''
		diagram   «info.getDiagramTypeName»
		extension "«info.getMetamodelExtension»"
	'''
	
	def generateProperties (org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo info) '''
		diagramPackage 	= «info.getBasePackage».diagram
		featurePackage 	= «info.getBasePackage».features
		propertyPackage = «info.getBasePackage».property
		utilPackage 	= org.xspray.runtime.containers
		
		srcGenPath 		= src-gen
		resourceGenPath = resource-gen
		srcManPath 		= src
		resourceManPath = resource
		projectPath 	= ./«info.projectName»
		headerTimestamp = false
	'''
	
}
package org.eclipselabs.spray.xtext.ui.wizard.codegen

import org.eclipselabs.spray.xtext.ui.wizard.XsprayProjectInfo
import org.eclipse.xtext.generator.IFileSystemAccess

class XsprayModelGenerator {
	def doGenerate (XsprayProjectInfo info, IFileSystemAccess fsa) {
		val project = info.projectName
		fsa.generateFile("model/"+info.diagramTypeName + ".xspray", info.projectName, generateModel(info))
		fsa.generateFile("model/"+info.diagramTypeName + ".properties", info.projectName, generateProperties(info))
	}
	
	def generateModel (XsprayProjectInfo info) '''
		diagram   «info.diagramTypeName»
		extension "«info.metamodelExtension»"
	'''
	
	def generateProperties (XsprayProjectInfo info) '''
		diagramPackage 	= «info.basePackage».diagram
		featurePackage 	= «info.basePackage».features
		propertyPackage = «info.basePackage».property
		utilPackage 	= org.xspray.runtime.containers
		
		srcGenPath 		= src-gen
		resourceGenPath = resource-gen
		srcManPath 		= src
		resourceManPath = resource
		projectPath 	= ./«info.projectName»
		headerTimestamp = false
	'''
	
}
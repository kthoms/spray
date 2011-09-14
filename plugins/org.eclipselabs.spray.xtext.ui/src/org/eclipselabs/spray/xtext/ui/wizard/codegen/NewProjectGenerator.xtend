package org.eclipselabs.spray.xtext.ui.wizard.codegen

import org.eclipselabs.spray.xtext.ui.wizard.XsprayProjectInfo
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject

class NewProjectGenerator {
	@Inject ActivatorGenerator generateActivator
	@Inject XsprayModelGenerator generateModel
	
	def doGenerate (XsprayProjectInfo projectInfo, IFileSystemAccess fsa) {
		generateActivator.doGenerate(projectInfo, fsa)
		generateModel.doGenerate(projectInfo, fsa)
	}
}
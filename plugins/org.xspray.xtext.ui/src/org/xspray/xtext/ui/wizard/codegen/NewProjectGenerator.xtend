package org.xspray.xtext.ui.wizard.codegen

import org.xspray.xtext.ui.wizard.XsprayProjectInfo
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
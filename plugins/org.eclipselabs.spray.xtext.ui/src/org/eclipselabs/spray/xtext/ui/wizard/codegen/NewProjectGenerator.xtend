package org.eclipselabs.spray.xtext.ui.wizard.codegen

import org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject

class NewProjectGenerator {
	@Inject ActivatorGenerator generateActivator
	@Inject SprayModelGenerator generateModel
	
	def doGenerate (SprayProjectInfo projectInfo, IFileSystemAccess fsa) {
		generateActivator.doGenerate(projectInfo, fsa)
		generateModel.doGenerate(projectInfo, fsa)
		generateBuildProperties(projectInfo, fsa)
	}
	
	def generateBuildProperties (SprayProjectInfo pi, IFileSystemAccess fsa) {
	   val content = '''
        source.. = «pi.javaMainSrcDir»/,\
                   «pi.javaGenSrcDir»/,\
                   «pi.sprayModelDir»/
        bin.includes = META-INF/,\
                       plugin.xml,\
                       icons/,\
                       «pi.sprayModelDir»/
	   '''
	   fsa.generateFile("build.properties", pi.projectName, content);
	}
}
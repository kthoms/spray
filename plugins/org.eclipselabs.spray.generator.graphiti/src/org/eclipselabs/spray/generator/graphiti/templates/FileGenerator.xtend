package org.eclipselabs.spray.generator.graphiti.templates

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.util.XtendProperties
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipselabs.spray.generator.graphiti.util.ImportUtil

class FileGenerator extends TemplateUtil   {
	
	extension GenFile genFile
	extension JavaGenFile javaGenFile

	def getJavaGenFile() {
		return javaGenFile
	}
	
    def StringConcatenation generateBaseFile(EObject modelElement) {
    }

    def StringConcatenation generateExtensionFile(EObject modelElement) {
    }
        
    def generate(EObject modelElement, GenFile genFile1) {
    	this.genFile = genFile1
    	
    	if( genFile1 instanceof JavaGenFile){
    		javaGenFile = (genFile1 as JavaGenFile)
    	}
    	
    	var block = [String s1| s1.replaceAll("// MARKER_IMPORT", XtendProperties::importsAsString) ]
    	
    	if( genFile.hasExtensionPoint ){
    		if( javaGenFile.extensionFileExists ){
    			println("Not regenerating extension point [" + javaGenFile.fileName + "]")
    		} else {
    			println("generating " + javaGenFile.getPathName)
		    	XtendProperties::initializeImports()
		    	var StringConcatenation file = generateExtensionFile(modelElement)
		    	var result = file.toString.replaceAll("// MARKER_IMPORT", XtendProperties::importsAsString) 
    			javaGenFile.fsa.generateFile(javaGenFile.getPathName, result)
    		}
    	}
		println("generating " + javaGenFile.getBasePathName + " from " + this.getClass().name)
		XtendProperties::initializeImports();
		var CharSequence base =  generateBaseFile(modelElement)
    	var result = base.toString.replaceAll("// MARKER_IMPORT", XtendProperties::importsAsString) 
		genFile.fsa.generateFile(javaGenFile.basePathName, result)
    }
} 
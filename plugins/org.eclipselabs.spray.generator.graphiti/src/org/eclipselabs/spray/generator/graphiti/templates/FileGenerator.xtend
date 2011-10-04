package org.eclipselabs.spray.generator.graphiti.templates

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.util.XtendProperties
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipselabs.spray.generator.graphiti.util.ImportUtil
import com.google.inject.Inject

class FileGenerator extends TemplateUtil {
    
    extension GenFile genFile
    extension JavaGenFile javaGenFile
    @Inject ImportUtil importUtil

    def getJavaGenFile() {
        return javaGenFile
    }
    
    def StringConcatenation generateBaseFile(EObject modelElement) {
    }

    def StringConcatenation generateExtensionFile(EObject modelElement) {
    }
        
    def generate(EObject modelElement, GenFile genFile) {
        this.genFile = genFile
        
        if( genFile instanceof JavaGenFile){
            javaGenFile = (genFile as JavaGenFile)
        } else {
        	javaGenFile = null
        }
        
        val organizeImports = [String s1| s1.replace("// MARKER_IMPORT", importUtil.printImports) ]
        var String fileContent
        if(javaGenFile!=null && javaGenFile.hasExtensionPoint){
            importUtil.initImports(javaGenFile.packageName)
            if( javaGenFile.extensionFileExists ){
                println("Not regenerating extension point [" + javaGenFile.fileName + "]")
            } else {
                println("generating " + javaGenFile.getPathName)
                fileContent = generateExtensionFile(modelElement).toString
                fileContent = organizeImports.apply(fileContent) 
                javaGenFile.fsa.generateFile(javaGenFile.getPathName, fileContent)
            }
        }
        println("generating " + javaGenFile.getBasePathName + " from " + this.getClass().name)
        if (javaGenFile!=null) {
            importUtil.initImports(javaGenFile.packageName)
            fileContent = generateBaseFile(modelElement).toString
            fileContent = organizeImports.apply(fileContent) 
        } else {
            fileContent = generateBaseFile(modelElement).toString
        }
        genFile.fsa.generateFile(javaGenFile.basePathName, fileContent)
    }
    
    //---------------------------------------------------------------------------------------------
    // delegate methods from ImportUtil
    //---------------------------------------------------------------------------------------------
    def String shortName (JvmTypeReference typeRef) {
        return importUtil.shortName(typeRef)
    }
    def String shortName (String qualifiedName) {
        return importUtil.shortName(qualifiedName)
    }
    def String shortName (Class<?> clazz) {
        return importUtil.shortName(clazz)
    }
    
} 
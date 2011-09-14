package org.eclipselabs.spray.generator.graphiti.templates

import static extension org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import org.eclipselabs.spray.mm.xspray.*
import com.google.inject.Inject
import org.eclipselabs.spray.mm.xspray.extensions.XsprayExtensions

class TemplateUtil extends Object {
	@Inject extension XsprayExtensions e1
	
	def header(Object templateClass) '''
		/*************************************************************************************
		 *
		 * Generated «timestamp()»by Xspray «templateClass.getClass().simpleName».xtend
		 *
		 * This file contains generated and should not be changed.
		 * Use the extension point class (the direct subclass of this class) to add manual code
		 *
		 *************************************************************************************/
	'''

	def extensionHeader(Object templateClass) '''
		/*************************************************************************************
		 *
		 * Generated «timestamp()»by Xspray «templateClass.getClass().simpleName».xtend
		 * 
		 * This file is an extension point: copy to "src" folder to manually add code to this
		 * extension point.
		 *
		 *************************************************************************************/
	'''

	def pluginHeader(Object templateClass) '''
		<!--
		 Generated «timestamp()»by XSpray «templateClass.getClass().simpleName».xtend
		 This file will be generated oinly once if it need to be regenerated, remove this file.
		 
		-->
	'''

	/**
	 * Generate the fulle expression to calculate the  value of a Text, existing of string literals and navigation expressions
	 */
	def valueGenerator(Text text, String metaClassVariable)	'''
		«FOR value : text.value  SEPARATOR  " + "»
			«IF value instanceof StringLiteral»"«(value as StringLiteral).name»"
			«ELSEIF value instanceof MetaAttribute»«metaClassVariable».
				«IF (value as MetaAttribute).path.contains(".")» 
				    «FOR id : (value as MetaAttribute).path.split("\\.") SEPARATOR "."»
				    	get«id.toFirstUpper()»()
				    «ENDFOR»
				«ELSE»
	                get«(value as MetaAttribute).path.replaceFirst("\\^","").toFirstUpper()»()
	            «ENDIF»
	        «ENDIF»
		«ENDFOR».toString()
	'''
	
	/**
	 * Generate a unique key for the full expression to be used in map storage
	 */
	def keyGenerator(Text text) '''
		«FOR value : text.value  SEPARATOR  " + "»
		   «IF value instanceof StringLiteral»"«(value as StringLiteral).name»"
		   «ELSEIF value instanceof MetaAttribute»"«(value as MetaAttribute).path.toFirstUpper()»"
		   «ENDIF»
	   «ENDFOR»
	'''
}
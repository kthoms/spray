package org.eclipselabs.spray.generator.graphiti.templates

import static extension org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import org.eclipselabs.spray.mm.spray.*
import com.google.inject.Inject
import org.eclipselabs.spray.mm.spray.*
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions
import org.eclipselabs.spray.generator.graphiti.util.SprayGraphitiCompiler
import org.eclipselabs.spray.generator.graphiti.util.SprayCompiler
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipse.xtext.xtend2.lib.StringConcatenation

class TemplateUtil extends Object {
	@Inject extension SprayExtensions e1
	@Inject SprayCompiler compiler
	
	def header(Object templateClass) '''
		/*************************************************************************************
		 *
		 * Generated «timestamp()»by Spray «templateClass.getClass().simpleName».xtend
		 *
		 * This file contains generated and should not be changed.
		 * Use the extension point class (the direct subclass of this class) to add manual code
		 *
		 *************************************************************************************/
	'''

	def extensionHeader(Object templateClass) '''
		/*************************************************************************************
		 *
		 * Generated «timestamp()»by Spray «templateClass.getClass().simpleName».xtend
		 * 
		 * This file is an extension point: copy to "src" folder to manually add code to this
		 * extension point.
		 *
		 *************************************************************************************/
	'''

	def pluginHeader(Object templateClass) '''
		<!--
		 Generated «timestamp()»by Spray «templateClass.getClass().simpleName».xtend
		 This file will be generated oinly once if it need to be regenerated, remove this file.
		 
		-->
	'''

	/**
	 * Generate the fulle expression to calculate the  value of a Text, existing of string literals and navigation expressions
	 */
	def StringConcatenation valueGenerator(Text text, String metaClassVariable)	{
		try {
			compiler.metaClassVariable = metaClassVariable
			val body = compiler.compile(text, new ImportManager(false))
			val result = new StringConcatenation()
			result.append(body)
			return result
		} finally {
			compiler.metaClassVariable = null
		}
	}
	
	/**
	 * Generate a unique key for the full expression to be used in map storage
	 */
	def keyGenerator(Text text) {
		return text.value.toString
	}
}
package org.xspray.generator.graphiti.templates

import java.util.*
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.xtend2.lib.*
import org.xspray.generator.graphiti.util.XtendProperties

class IncorrectFeatureProvider {
	
	def finalError(EPackage pack, String className) '''
		«FOR cls : pack.EClassifiers.filter(typeof(EClass))»
			«XtendProperties::setValue("className", cls.name)»
			«FOR attribute : cls.EAllAttributes»
				«XtendProperties::setValue("attName", attribute.name)»
				«var target = cls.EAllReferences.findFirst(e| XtendProperties::getValue("className") == XtendProperties::getValue("attName") ) » 
			«ENDFOR»
		«ENDFOR»
		}
	'''
	
	def String eClassName(EClass cls) {
		return cls.name
	}
}
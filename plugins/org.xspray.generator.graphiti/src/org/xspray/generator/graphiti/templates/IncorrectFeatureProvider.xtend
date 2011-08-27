package org.xspray.generator.graphiti.templates

import java.util.*
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.xtend2.lib.*
import org.xspray.generator.graphiti.util.XtendProperties

class IncorrectFeatureProvider {
	
	def finalError(EPackage pack, String className) '''
		«FOR cls : pack.EClassifiers.filter(c | c instanceof EClass)»
		    «IF cls instanceof EClass»
		        «var eClass = cls as  EClass»
		        «XtendProperties::setValue("className", eClass.name)»
				«FOR attribute : eClass.EAllAttributes»
		        	«XtendProperties::setValue("attName", attribute.name)»
					«var target = eClass.EAllReferences.findFirst(e| XtendProperties::getValue("className") == XtendProperties::getValue("attName") ) » 
				«ENDFOR»	
			«ENDIF»
		«ENDFOR»
		}
	'''
	
	def String eClassName(EClass cls) {
		return cls.name
	}
}
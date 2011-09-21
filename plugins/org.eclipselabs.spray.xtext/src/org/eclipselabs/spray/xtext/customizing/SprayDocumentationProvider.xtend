package org.eclipselabs.spray.xtext.customizing

import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider
import org.eclipse.emf.ecore.EObject

class SprayDocumentationProvider extends MultiLineCommentDocumentationProvider {
	override String getDocumentation (EObject object) {
		var doc = super.getDocumentation(object)
		
		doc
	}
}
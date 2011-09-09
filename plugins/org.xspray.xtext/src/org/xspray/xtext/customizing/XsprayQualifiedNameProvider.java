package org.xspray.xtext.customizing;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.xspray.mm.xspray.MetaAttribute;
import org.xspray.mm.xspray.MetaClass;

public class XsprayQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	public QualifiedName qualifiedName (MetaClass element) {
		return getFullyQualifiedName(element.getType());
	}

	/**
	 * MetaAttribute has a name property, but we do not want to get it scoped
	 */
	public QualifiedName qualifiedName (MetaAttribute element) {
		return null;
	}
}

package org.xspray.xtext.customizing;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.xspray.mm.xspray.MetaAttribute;

public class XsprayQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	/**
	 * MetaAttribute has a name property, but we do not want to get it scoped
	 */
	public QualifiedName qualifiedName (MetaAttribute element) {
		return null;
	}
}

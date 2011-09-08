package org.xspray.mm.xspray.extensions;

import org.xspray.mm.xspray.MetaReference;

public class XsprayExtensions {
	public String getName (final MetaReference ref) {
		return ref.getReference().getName();
	}
	
	/**
	 * If the MetaReference has configured the labelProperty, then use the label property's
	 * name, otherwise use 'name' as default
	 */
	public String getLabelPropertyName (MetaReference ref) {
		return ref.getLabelProperty() != null ? ref.getLabelProperty().getName() : "name";
	}
}

package org.xspray.mm.xspray.extensions;

import org.xspray.mm.xspray.MetaReference;

public class XsprayExtensions {
	public String getName (final MetaReference ref) {
		return ref.getReference().getName();
	}
}

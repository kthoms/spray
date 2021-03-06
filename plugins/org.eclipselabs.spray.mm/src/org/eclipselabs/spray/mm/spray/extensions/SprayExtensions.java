package org.eclipselabs.spray.mm.spray.extensions;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.spray.mm.spray.ColorConstantRef;
import org.eclipselabs.spray.mm.spray.MetaAttribute;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;

public class SprayExtensions {
	public String getName(final MetaClass metaClass) {
		return metaClass.getType().getName();
	}

	public String getName(final MetaReference ref) {
		return ref.getReference().getName();
	}

	/**
	 * If the MetaReference has configured the labelProperty, then use the label
	 * property's name, otherwise use 'name' as default
	 */
	public String getLabelPropertyName(MetaReference ref) {
		return ref.getLabelProperty() != null ? ref.getLabelProperty().getName() : "name";
	}

	public String getPath(MetaAttribute attr) {
		StringBuilder b = new StringBuilder();
		for (EReference r : attr.getPathsegments()) {
			if (r.eIsProxy()) {
				r = (EReference) EcoreUtil.resolve(r, attr);
			}
			b.append(r.getName()).append(".");
		}
		b.append(attr.getAttribute().getName());
		return b.toString();
	}

	public String shortName (ColorConstantRef colorConstant) {
	    return new StringBuilder(colorConstant.getType().getIdentifier())
	    .append('.')
	    .append(colorConstant.getField().getSimpleName())
	    .toString();
	}
}

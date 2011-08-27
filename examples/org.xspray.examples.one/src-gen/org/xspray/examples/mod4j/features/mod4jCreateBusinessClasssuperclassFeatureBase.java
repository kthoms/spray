/*************************************************************************************
 *
 * Generated on Sat Aug 27 20:37:43 CEST 2011 by XSpray CreateReferenceAsConnectionFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.xspray.examples.mod4j.features;

import BusinessDomainDsl.BusinessClass;
import BusinessDomainDsl.BusinessClass;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

public class mod4jCreateBusinessClasssuperclassFeatureBase extends AbstractCreateConnectionFeature {

	public mod4jCreateBusinessClasssuperclassFeatureBase(IFeatureProvider fp) {
		// provide name and description for the UI, e.g. the palette
		super(fp, "superclass", "Create superclass");
	}

	public boolean canCreate(ICreateConnectionContext context) {
		// return true if both anchors belong to an EClass
		// and those EClasses are not identical
		BusinessClass source = getBusinessClass(context.getSourceAnchor());
		BusinessClass target = getSuperclass(context.getTargetAnchor());
		if ( (source != null) && (target != null) && (source != target) ) {
			return true;
		}
		return false;
	}

	public boolean canStartConnection(ICreateConnectionContext context) {
		// return true if start anchor belongs to a EClass
		if (getBusinessClass(context.getSourceAnchor()) != null) {
			return true;
		}
		return false;
	}

	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		// get EClasses which should be connected
		BusinessClass source = getBusinessClass(context.getSourceAnchor());
		BusinessClass target = getSuperclass(context.getTargetAnchor());

		if (source != null && target != null) {
			// create new business object
			setSuperclass(source, target);
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext( context.getSourceAnchor(), context.getTargetAnchor());
			addContext.setNewObject(source);
			addContext.putProperty("REFERENCE", "superclass");
			// TODO: assume that the target object has a Name property
	//		addContext.putProperty("TARGETOBJECT", target.getName());
			newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
		}

		return newConnection;
	}

	/**
	 * Returns the BusinessClass belonging to the anchor, or null if not available.
	 */
	protected BusinessClass getBusinessClass(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor.getParent());
			if (object instanceof BusinessClass) {
				return (BusinessClass) object;
			}
		}
		return null;
	}
	/**
	 * Returns the superclass belonging to the anchor, or null if not available.
	 */
	protected BusinessClass getSuperclass(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor.getParent());
			if (object instanceof BusinessClass) {
				return (BusinessClass) object;
			}
		}
		return null;
	}

	/**
	 * Creates a superclass .
	 */
	protected void setSuperclass(BusinessClass source, BusinessClass target) {
		// TODO Check multiplcity, if > 1, use addTo instead of set
		source.setSuperclass(target);
	}
	
    @Override
    public boolean hasDoneChanges() {
        return false;
    }

    @Override
    public boolean canUndo(IContext context) {
        return false;
    }

}

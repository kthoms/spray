/*************************************************************************************
 *
 * Generated on Sat Aug 27 19:33:29 CEST 2011 by XSpray CreateConnectionFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.xspray.examples.mod4j.features;
import java.io.IOException;

import BusinessDomainDsl.Association;
import BusinessDomainDsl.AbstractBusinessClass;
import BusinessDomainDsl.BusinessClass;
import BusinessDomainDsl.BusinessDomainDslFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.xspray.runtime.containers.SampleUtil;
import org.xspray.examples.mod4j.diagram.mod4jImageProvider;

public class mod4jCreateAssociationFeatureBase extends AbstractCreateConnectionFeature {

	public mod4jCreateAssociationFeatureBase(IFeatureProvider fp) {
		// provide name and description for the UI, e.g. the palette
		super(fp, "Association", "Create Association");
	}

	public boolean canCreate(ICreateConnectionContext context) {
		// return true if both anchors belong to an EClass
		// and those EClasses are not identical
		BusinessClass source = getBusinessClass(context.getSourceAnchor());
		AbstractBusinessClass target = getAbstractBusinessClass(context.getTargetAnchor());
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
		AbstractBusinessClass target = getAbstractBusinessClass(context.getTargetAnchor());

		if (source != null && target != null) {
			// create new business object
			Association eReference = createAssociation(source, target);
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), context.getTargetAnchor());
			addContext.setNewObject(eReference);
			newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
		}

		return newConnection;
	}

	/**
	 * Returns the BusinessClass belonging to the anchor, or null if not available.
	 */
	private BusinessClass getBusinessClass(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor.getParent());
			if (object instanceof BusinessClass) {
				return (BusinessClass) object;
			}
		}
		return null;
	}
	/**
	 * Returns the AbstractBusinessClass belonging to the anchor, or null if not available.
	 */
	private AbstractBusinessClass getAbstractBusinessClass(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor.getParent());
			if (object instanceof AbstractBusinessClass) {
				return (AbstractBusinessClass) object;
			}
		}
		return null;
	}

	/**
	 * Creates a EReference between two EClasses.
	 */
	protected Association createAssociation(BusinessClass source, AbstractBusinessClass target) {
		// TODO: Domain Object
		Association domainObject = BusinessDomainDslFactory.eINSTANCE.createAssociation();
		domainObject.setSource(source);
		domainObject.setTarget(target);
//		getDiagram().eResource().getContents().add(domainObject);

        try {
			SampleUtil.saveToModelFile(domainObject, getDiagram(), "businessdomaindsl");
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return domainObject;
	}
	
@Override
public String getCreateImageId() {
    return mod4jImageProvider.mod4j_connection16;
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

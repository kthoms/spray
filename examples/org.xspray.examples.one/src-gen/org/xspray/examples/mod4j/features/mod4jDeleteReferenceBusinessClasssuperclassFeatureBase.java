/*************************************************************************************
 *
 * Generated on Sat Aug 27 20:37:43 CEST 2011 by XSpray DeleteReferenceFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
/*******************************************************************************
 * <copyright>
 *
 * </copyright>
 *******************************************************************************/
package org.xspray.examples.mod4j.features;

import BusinessDomainDsl.BusinessClass;
import BusinessDomainDsl.BusinessClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

public class mod4jDeleteReferenceBusinessClasssuperclassFeatureBase extends DefaultDeleteFeature {

	public mod4jDeleteReferenceBusinessClasssuperclassFeatureBase(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.graphiti.features.IDeleteFeature#delete(org.eclipse.graphiti.
	 * features.context.IDeleteContext)
	 */
	@Override
	public void delete(IDeleteContext context) {
		PictogramElement pe = context.getPictogramElement();
		String reference = Graphiti.getPeService().getPropertyValue(pe, "REFERENCE");
		String element   = Graphiti.getPeService().getPropertyValue(pe, "TARGETOBJECT");

		Object[] businessObjectsForPictogramElement = getAllBusinessObjectsForPictogramElement(pe);
		if (businessObjectsForPictogramElement != null && businessObjectsForPictogramElement.length > 0) {
			if (!getUserDecision()) {
				return;
			}
		}

		preDelete(context);

		// TRY
		if( pe instanceof Connection) {
			Connection line = (Connection)pe;
			AnchorContainer parent = line.getStart().getParent();
			Object start = getBusinessObjectForPictogramElement(parent);
			AnchorContainer child = line.getEnd().getParent();
			Object end = getBusinessObjectForPictogramElement(child);
		}
		//END TRY

		IRemoveContext rc = new RemoveContext(pe);
		IFeatureProvider featureProvider = getFeatureProvider();
		IRemoveFeature removeFeature = featureProvider.getRemoveFeature(rc);
		if (removeFeature != null) {
			removeFeature.remove(rc);
		}

		deleteReferences(businessObjectsForPictogramElement, reference, element);

		postDelete(context);
	}
	/**
	 * Delete business objects.
	 * 
	 * @param businessObjects
	 *            the business objects
	 */
	protected void deleteReferences(Object[] businessObjects, String reference, String element) {
		if (businessObjects != null) {
			for (Object bo : businessObjects) {
				deleteReference(bo, reference, element);
			}
		}
	}

	/**
	 * Delete business object.
	 * 
	 * @param bo
	 *            the bo
	 */
	protected void deleteReference(Object bo, String reference, String element) {
		if (bo instanceof EObject) {
			if( reference == null){
				EcoreUtil.delete((EObject) bo, true);
			} else {
			    if( bo instanceof BusinessClass ){
					BusinessClass object = (BusinessClass ) bo;
					
			object.setSuperclass(null);
				} else {
					System.out.println("DELETE OBJECT " + bo);
				}
			}
		}
	}

}

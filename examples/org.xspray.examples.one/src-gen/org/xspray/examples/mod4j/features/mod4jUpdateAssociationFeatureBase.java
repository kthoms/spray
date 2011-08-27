/*************************************************************************************
 *
 * Generated on Sat Aug 27 20:37:43 CEST 2011 by XSpray UpdateConnectionFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.xspray.examples.mod4j.features;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import BusinessDomainDsl.Association;
		
public class mod4jUpdateAssociationFeatureBase extends AbstractUpdateFeature {

	Map<String, String> values = null;

	public mod4jUpdateAssociationFeatureBase(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
		// return true, if linked business object is a EClass
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		PictogramElement pictogramElement = context.getPictogramElement();
		return (bo instanceof Association) && (!(pictogramElement instanceof Diagram));
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if ( ! (bo instanceof Association)) {
		    return Reason.createFalseReason();
		}
		Association eClass = (Association) bo;

		if (pictogramElement instanceof FreeFormConnection) {
			FreeFormConnection free = (FreeFormConnection) pictogramElement;
			for (ConnectionDecorator decorator : free.getConnectionDecorators()) {
				String type = Graphiti.getPeService().getPropertyValue(decorator, "MODEL_TYPE");
                String value = getValue(type, eClass);
				GraphicsAlgorithm ga = decorator.getGraphicsAlgorithm();
				Text text = (Text) ga;
				String current = text.getValue();
				if (! current.equals(value) ) {
					return Reason.createTrueReason(type + " is changed");
				}
			}
		}
		return Reason.createFalseReason();
	}

	@Override
	public boolean update(IUpdateContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		Association eClass = (Association) bo;

		FreeFormConnection free = (FreeFormConnection) pictogramElement;
		for (ConnectionDecorator decorator : free.getConnectionDecorators()) {
			String type = Graphiti.getPeService().getPropertyValue(decorator, "MODEL_TYPE");
	                String value = getValue(type, eClass);
			GraphicsAlgorithm ga = decorator.getGraphicsAlgorithm();
			Text text = (Text) ga;
			String current = text.getValue();
			if (! current.equals(value) ) {
				text.setValue(value);
			}
		}
		//
		// return SprayContainerService.update(pictogramElement,
		// getValues(eClass));
		//
		return true;
	}

    protected String getValue(String type, Association eClass) {
    	String result = "";
    	if( "FROM_LABEL".equals(type) ){
			result = "source " + 
					eClass.
				getSource().
				getName()
					.toString()
			;
    	}
    	if( "TO_LABEL".equals(type) ){
			result = eClass.
			getName()
					.toString()
			;
    	}
    	if( "CONNECTION_LABEL".equals(type) ){
			result = eClass.
			getTargetMultiplicity()
					.toString()
			;
    	}
        return result;
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

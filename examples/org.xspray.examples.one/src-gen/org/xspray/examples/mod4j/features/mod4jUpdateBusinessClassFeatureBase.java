/*************************************************************************************
 *
 * Generated on Mon Aug 29 17:53:16 CEST 2011 by XSpray UpdateShapeFeature.xtend
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
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.xspray.runtime.containers.SprayContainerService;

import BusinessDomainDsl.BusinessClass;

public class mod4jUpdateBusinessClassFeatureBase extends AbstractUpdateFeature {

    Map<String, String> values = null;

    public mod4jUpdateBusinessClassFeatureBase(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canUpdate(IUpdateContext context) {
        // return true, if linked business object is a EClass
        Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
        PictogramElement pictogramElement = context.getPictogramElement();
        return (bo instanceof BusinessClass) && (!(pictogramElement instanceof Diagram));
    }

    @Override
    public IReason updateNeeded(IUpdateContext context) {
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (!(bo instanceof BusinessClass)) {
            return Reason.createFalseReason();
        }
        BusinessClass eClass = (BusinessClass) bo;

        // retrieve name from pictogram model
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
            ContainerShape textBox = SprayContainerService.findTextShape(cs);
            for (Shape shape : textBox.getChildren()) {
                if (shape.getGraphicsAlgorithm() instanceof Text) {
                    Text text = (Text) shape.getGraphicsAlgorithm();
                    String type = Graphiti.getPeService().getPropertyValue(shape, "MODEL_TYPE");
                    String value = getValues(eClass).get(type);
                    if (value != null) {
                        String pictogramName = text.getValue();

                        // update needed, if names are different
                        boolean updateNameNeeded = ((pictogramName == null && value != null) || (pictogramName != null && !pictogramName
                                .equals(value)));
                        if (updateNameNeeded) {
                            return Reason.createTrueReason("Name [" + pictogramName + "] is out of date");
                        }
                    }
                }
            }
        }
        return Reason.createFalseReason();
    }

    @Override
    public boolean update(IUpdateContext context) {
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        BusinessClass eClass = (BusinessClass) bo;
        return SprayContainerService.update(pictogramElement, getValues(eClass));

    }

    protected Map<String, String> getValues(BusinessClass eClass) {
        if (values == null) {
            values = new HashMap<String, String>();
            fillValues(eClass);
        }
        return values;
    }

    protected void fillValues(BusinessClass eClass) {
        String type, value;
        value = "Class7 " + eClass.getName() + " ;;;".toString();
        type = "Class7 " + "Name" + " ;;;";
        values.put(type, value);
        value = "::" + eClass.getDescription().toString();
        type = "::" + "Description";
        values.put(type, value);
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

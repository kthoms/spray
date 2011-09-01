/*************************************************************************************
 *
 * Generated on Mon Aug 29 17:53:15 CEST 2011 by XSpray AddReferenceAsListFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.xspray.examples.mod4j.features;

import BusinessDomainDsl.BusinessClass;
import BusinessDomainDsl.Property;

import java.util.ArrayList;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;
import org.xspray.runtime.containers.ISprayContainer;
import org.xspray.runtime.containers.SprayContainerService;
import org.xspray.runtime.containers.ISprayColorConstants;

public class mod4jAddBusinessClasspropertiesListFeatureBase extends AbstractAddShapeFeature {

    private static final IColorConstant CLASS_TEXT_FOREGROUND = new ColorConstant(51, 51, 153);

    private static final ArrayList<org.eclipse.graphiti.mm.Property> EMPTY_PROPERTIES_LIST = new ArrayList<org.eclipse.graphiti.mm.Property>(0);

    public mod4jAddBusinessClasspropertiesListFeatureBase(IFeatureProvider fp) {
        super(fp);
    }

    /*
     * This method very much depends on the sturtcure of the stnadard rectangle shape.
     */
    public PictogramElement add(IAddContext context) {
        final Property addedModelElement = (Property) context.getNewObject();
        final ContainerShape containerShape = (ContainerShape) context.getTargetContainer();

        // CONTAINER SHAPE WITH ROUNDED RECTANGLE
        IGaService gaService = Graphiti.getGaService();
        Shape found = null;
        int index = 0;
        int i = 0;
        ContainerShape textbox = SprayContainerService.findTextShape(containerShape);
        for (Shape shape : textbox.getChildren()) {
            GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
            IDimension size = gaService.calculateSize(graphicsAlgorithm, true);
            gaService.setLocation(graphicsAlgorithm, 0, 0);
            String modelType = Graphiti.getPeService().getPropertyValue(shape, "MODEL_TYPE");
            if (modelType != null && modelType.equals("Property")) {
                found = shape;
                index = i;
            }
            i++;
        }

        // LIST of PROPERTIES
        Shape newShape = createShape(textbox, index);
        Graphiti.getPeService().setPropertyValue(newShape, "STATIC", "true");
        Graphiti.getPeService().setPropertyValue(newShape, "MODEL_TYPE", "Property");
        Graphiti.getPeService().setPropertyValue(newShape, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.TEXT);
        // TODO NAme attribute shopuld not be default
        Text text = gaService.createDefaultText(getDiagram(), newShape, addedModelElement.getDataType());
        // TODO find the right text color
        text.setForeground(manageColor(CLASS_TEXT_FOREGROUND));
        text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
        text.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
        gaService.setLocationAndSize(text, 0, 0, 0, 0);
        // create link and wire it
        link(newShape, addedModelElement);
        layoutPictogramElement(containerShape);

        return containerShape;
    }

    protected Shape createShape(final ContainerShape containerShape, int index) {
        Shape newShape = PictogramsFactory.eINSTANCE.createShape();
        newShape.getProperties().addAll(EMPTY_PROPERTIES_LIST);
        newShape.setVisible(true);
        newShape.setActive(true);
        containerShape.getChildren().add(index, newShape);
        return newShape;
    }

    public boolean canAdd(IAddContext context) {
        final Object newObject = context.getNewObject();
        if (newObject instanceof Property) {
            // check if user wants to add to a diagram
            Shape target = context.getTargetContainer();
            Object domainObject = getBusinessObjectForPictogramElement(target);
            if (domainObject instanceof BusinessClass) {
                return true;
            }
        }
        return false;
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

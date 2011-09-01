/*************************************************************************************
 *
 * Generated on Mon Aug 29 17:53:15 CEST 2011 by XSpray AddShapeFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.xspray.examples.mod4j.features;

import BusinessDomainDsl.BusinessClass;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.xspray.runtime.containers.ISprayColorConstants;
import org.xspray.runtime.containers.ISprayContainer;
import org.xspray.runtime.containers.SprayRectangleContainer;
import org.xspray.runtime.containers.SprayContainerService;
import BusinessDomainDsl.Property;
import BusinessDomainDsl.AbstractBusinessRule;

public class mod4jAddBusinessClassFeatureBase extends AbstractAddShapeFeature {

    protected final static String typeOrAliasName = "BusinessClass";

    protected Diagram targetDiagram = null;

    protected SprayRectangleContainer container = null;

    protected IGaService gaService = null;

    public mod4jAddBusinessClassFeatureBase(IFeatureProvider fp) {
        super(fp);
        container = new SprayRectangleContainer();
        gaService = Graphiti.getGaService();
    }

    public boolean canAdd(IAddContext context) {
        final Object newObject = context.getNewObject();
        if (newObject instanceof BusinessClass) {
            // check if user wants to add to a diagram
            if (context.getTargetContainer() instanceof Diagram) {
                return true;
            }
        }
        return false;
    }

    public PictogramElement add(IAddContext context) {
        BusinessClass addedModelElement = (BusinessClass) context.getNewObject();
        targetDiagram = Graphiti.getPeService().getDiagramForShape(context.getTargetContainer());
        IPeCreateService peCreateService = Graphiti.getPeCreateService();

        ContainerShape containerShape = container.createContainer(context, addedModelElement);
        GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
        containerGa.setBackground(manageColor(ISprayColorConstants.DARK_GREEN));
        ContainerShape textContainer = SprayContainerService.findTextShape(containerShape);
        link(containerShape, addedModelElement);

        // Part is Text
        {
            String type = "Class7 " + "Name" + " ;;;";
            // create shape for text and set text graphics algorithm
            Shape shape = peCreateService.createShape(textContainer, false);
            Text text = gaService.createDefaultText(getDiagram(), shape);
            text.setForeground(manageColor(ISprayColorConstants.BLACK));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
            text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
            gaService.setLocationAndSize(text, 0, 0, 0, 0);
            Graphiti.getPeService().setPropertyValue(shape, "MODEL_TYPE", type);
            Graphiti.getPeService().setPropertyValue(shape, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.TEXT);
            // create link and wire it
            link(shape, addedModelElement);
        }
        // Part is Line
        {
            // create shape for line
            Shape shape = peCreateService.createShape(textContainer, false);
            // create and set graphics algorithm
            Polyline polyline = gaService.createPolyline(shape, new int[] { 0, 0, 0, 0 });
            polyline.setForeground(manageColor(ISprayColorConstants.BLACK /*  */));
            polyline.setLineWidth(2);
            gaService.setLocation(polyline, 0, 0);
            Graphiti.getPeService().setPropertyValue(shape, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.LINE);
        }
        // Part is reference list
        {
            // Create a dummy invisible line to have an ancjhor point for adding new elements to the list
            Shape dummy = peCreateService.createShape(textContainer, false);
            Graphiti.getPeService().setPropertyValue(dummy, "MODEL_TYPE", "Property");
            Polyline p = gaService.createPolyline(dummy, new int[] { 0, 0, 0, 0 });
            p.setForeground(manageColor(ISprayColorConstants.BLACK));
            p.setLineWidth(0);
            p.setLineVisible(false);
            gaService.setLocation(p, 0, 0);
            Graphiti.getPeService().setPropertyValue(dummy, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.LINE);
        }
        for (Property p : addedModelElement.getProperties()) {
            Shape shape = peCreateService.createContainerShape(textContainer, true);
            Graphiti.getPeService().setPropertyValue(shape, "STATIC", "true");
            Graphiti.getPeService().setPropertyValue(shape, "MODEL_TYPE", "Property");
            Graphiti.getPeService().setPropertyValue(shape, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.TEXT);
            // create and set text graphics algorithm
            Text text = gaService.createDefaultText(getDiagram(), shape, p.getDataType());
            // TODO should have a text color here, refer to representation of reference type
            text.setForeground(manageColor(ISprayColorConstants.BLACK));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
            text.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
            gaService.setLocationAndSize(text, 0, 0, 0, 0);
            // create link and wire it
            link(shape, p);
        }
        // Part is Line
        {
            // create shape for line
            Shape shape = peCreateService.createShape(textContainer, false);
            // create and set graphics algorithm
            Polyline polyline = gaService.createPolyline(shape, new int[] { 0, 0, 0, 0 });
            polyline.setForeground(manageColor(ISprayColorConstants.RED /*  */));
            polyline.setLineWidth(2);
            gaService.setLocation(polyline, 0, 0);
            Graphiti.getPeService().setPropertyValue(shape, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.LINE);
        }
        // Part is reference list
        {
            // Create a dummy invisible line to have an ancjhor point for adding new elements to the list
            Shape dummy = peCreateService.createShape(textContainer, false);
            Graphiti.getPeService().setPropertyValue(dummy, "MODEL_TYPE", "AbstractBusinessRule");
            Polyline p = gaService.createPolyline(dummy, new int[] { 0, 0, 0, 0 });
            p.setForeground(manageColor(ISprayColorConstants.BLACK));
            p.setLineWidth(0);
            p.setLineVisible(false);
            gaService.setLocation(p, 0, 0);
            Graphiti.getPeService().setPropertyValue(dummy, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.LINE);
        }
        for (AbstractBusinessRule p : addedModelElement.getBusinessRules()) {
            Shape shape = peCreateService.createContainerShape(textContainer, true);
            Graphiti.getPeService().setPropertyValue(shape, "STATIC", "true");
            Graphiti.getPeService().setPropertyValue(shape, "MODEL_TYPE", "AbstractBusinessRule");
            Graphiti.getPeService().setPropertyValue(shape, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.TEXT);
            // create and set text graphics algorithm
            Text text = gaService.createDefaultText(getDiagram(), shape, p.getName());
            // TODO should have a text color here, refer to representation of reference type
            text.setForeground(manageColor(ISprayColorConstants.BLACK));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
            text.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
            gaService.setLocationAndSize(text, 0, 0, 0, 0);
            // create link and wire it
            link(shape, p);
        }
        // Part is Line
        {
            // create shape for line
            Shape shape = peCreateService.createShape(textContainer, false);
            // create and set graphics algorithm
            Polyline polyline = gaService.createPolyline(shape, new int[] { 0, 0, 0, 0 });
            polyline.setForeground(manageColor(ISprayColorConstants.DARK_BLUE /*  */));
            polyline.setLineWidth(2);
            gaService.setLocation(polyline, 0, 0);
            Graphiti.getPeService().setPropertyValue(shape, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.LINE);
        }
        // Part is Text
        {
            String type = "::" + "Description";
            // create shape for text and set text graphics algorithm
            Shape shape = peCreateService.createShape(textContainer, false);
            Text text = gaService.createDefaultText(getDiagram(), shape);
            text.setForeground(manageColor(ISprayColorConstants.BLACK));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
            text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
            gaService.setLocationAndSize(text, 0, 0, 0, 0);
            Graphiti.getPeService().setPropertyValue(shape, "MODEL_TYPE", type);
            Graphiti.getPeService().setPropertyValue(shape, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.TEXT);
            // create link and wire it
            link(shape, addedModelElement);
        }
        // Part is Line
        {
            // create shape for line
            Shape shape = peCreateService.createShape(textContainer, false);
            // create and set graphics algorithm
            Polyline polyline = gaService.createPolyline(shape, new int[] { 0, 0, 0, 0 });
            polyline.setForeground(manageColor(ISprayColorConstants.BLACK /*  */));
            polyline.setLineWidth(1);
            gaService.setLocation(polyline, 0, 0);
            Graphiti.getPeService().setPropertyValue(shape, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.LINE);
        }

        // add a chopbox anchor to the shape
        peCreateService.createChopboxAnchor(containerShape);

        // call the update and layout features
        updatePictogramElement(containerShape);
        layoutPictogramElement(containerShape);

        return containerShape;
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

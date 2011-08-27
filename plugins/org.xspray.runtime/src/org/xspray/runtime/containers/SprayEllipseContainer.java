package org.xspray.runtime.containers;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

public class SprayEllipseContainer implements ISprayContainer {

    protected IPeCreateService peCreateService = null;

    protected IGaService       gaService       = null;

    protected Diagram          targetDiagram   = null;

//    protected boolean          isConcept       = false;
//
//    public void setConcept(boolean isConcept) {
//        this.isConcept = isConcept;
//    }

    public SprayEllipseContainer() {
        peCreateService = Graphiti.getPeCreateService();
        gaService = Graphiti.getGaService();
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sample.common.ISprayContainer#addShape(org.eclipse.graphiti.features.context.IAddContext,
     * java.lang.Object)
     */
    @Override
    public ContainerShape createContainer(IAddContext context, Object addedModelElement) {
        targetDiagram = (Diagram) context.getTargetContainer();

        // check whether the context has a size (e.g. from a create feature)
        // otherwise define a default size for the shape
        int width = context.getWidth() <= 0 ? DEFAULT_WIDTH : context.getWidth();
        int height = context.getHeight() <= 0 ? DEFAULT_HEIGHT : context.getHeight();

        SprayLayout layout = new SprayLayout(ISprayColorConstants.BLACK, ISprayColorConstants.CALCULATION, 1);
        ContainerShape mainShape = createContainerShape(addedModelElement, targetDiagram, context.getX(), context.getY(), width, height, true, layout);

        ContainerShape textContainer = createContainerShape(addedModelElement, mainShape, 0, 0, 0, 0, false, layout);
        ((RoundedRectangle) textContainer.getGraphicsAlgorithm()).setTransparency(100.0);
        Graphiti.getPeService().setPropertyValue(textContainer, CONCEPT_SHAPE_KEY, TEXTBOX);

        final IGaService gaService = Graphiti.getGaService();
        {
            // create and set graphics algorithm for container
            Ellipse ellipse = gaService.createEllipse(mainShape);
            // Rectangle rectangle = gaService.createRectangle(containerShape);
            ellipse.setForeground(manageColor(ISprayColorConstants.BLACK));
            ellipse.setBackground(manageColor(ISprayColorConstants.CALCULATION));
            ellipse.setLineWidth(1);
            gaService.setLocationAndSize(ellipse, context.getX(), context.getY(), width, height);
            // create link and wire it
            Graphiti.getPeService().setPropertyValue(mainShape, CONCEPT_SHAPE_KEY, "RoleSpec");

        }

        return mainShape;
    }

    private ContainerShape createContainerShape(Object addedModelElement, ContainerShape parentShape, int x, int y, int width, int height, boolean active, SprayLayout layout) {
        ContainerShape c = peCreateService.createContainerShape(parentShape, active);
        {
            RoundedRectangle rectangle = gaService.createRoundedRectangle(c, 0, 0);
            rectangle.setForeground(manageColor(layout.getLine()));
            rectangle.setBackground(manageColor(layout.getFill()));
            rectangle.setLineWidth(layout.getLineWidth());
            gaService.setLocationAndSize(rectangle, x, y, width, height);
        }
        return c;
    }

    /**
     * Manage color. (Copied from Graphiti)
     * 
     * @param colorConstant
     *            the color constant
     * @return the color
     */
    protected Color manageColor(IColorConstant colorConstant) {
        return Graphiti.getGaService().manageColor(targetDiagram, colorConstant);
    }

    private static final int MIN_HEIGHT = 60;

    private static final int MIN_WIDTH  = 100;

    /*
     * (non-Javadoc)
     * @see org.sample.common.ISprayContainer#layoutConcept(org.eclipse.graphiti.features.context.
     * ILayoutContext)
     */
    @Override
    public boolean layoutContainer(ILayoutContext context) {
        boolean anythingChanged = false;
        ContainerShape containerShape = (ContainerShape) context.getPictogramElement();
        GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();

        // height
        if (containerGa.getHeight() < MIN_HEIGHT) {
            containerGa.setHeight(MIN_HEIGHT);
            anythingChanged = true;
        }

        // width
        if (containerGa.getWidth() < MIN_WIDTH) {
            containerGa.setWidth(MIN_WIDTH);
            anythingChanged = true;
        }

        IGaService gaService = Graphiti.getGaService();

        int width = containerGa.getWidth();
        int height = containerGa.getHeight();
        int blockWidth = width / 3;
        int downRibbonHeight = height / 5;
        int leftMargin = width / 10;
        int y = 5;

        for (Shape shape : containerShape.getChildren()) {
            GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
            String shapeType = Graphiti.getPeService().getPropertyValue(shape, CONCEPT_SHAPE_KEY);

            y = 0;

            ContainerShape textBox = SprayContainerService.findTextShape(containerShape);
            GraphicsAlgorithm graphicsAlgorithmText = textBox.getGraphicsAlgorithm();
            RoundedRectangle rectangle = (RoundedRectangle) graphicsAlgorithmText;
            rectangle.setLineVisible(false);
            rectangle.setFilled(false);
            // gaService.setLocationAndSize(rectangle, 0, 0, width, height);
            gaService.setLocationAndSize(rectangle, leftMargin, 0, width - (2 * leftMargin), height - downRibbonHeight);
            // ContainerShape textBox = (ContainerShape) shape;
            for (Shape sh : textBox.getChildren()) {
                String textType = Graphiti.getPeService().getPropertyValue(sh, CONCEPT_SHAPE_KEY);
                String id = Graphiti.getPeService().getPropertyValue(sh, "ID");
                if (textType.equalsIgnoreCase(TEXT)) {
                    GraphicsAlgorithm ga = sh.getGraphicsAlgorithm();
                    Text text = (Text) ga;
                    text.setWidth(width - (2 * leftMargin));
                    text.setHeight(TEXT_LINE_HEIGHT);
                    text.setX(0);
                    text.setY(y);
                    y += TEXT_LINE_HEIGHT;
                    IDimension size = gaService.calculateSize(text, true);
                } else if (textType.equalsIgnoreCase(LINE)) {
                    GraphicsAlgorithm ga = sh.getGraphicsAlgorithm();
                    Polyline polyline = (Polyline) ga;
                    Point newFirstPoint = gaService.createPoint(0, y);
                    Point newSecondPoint = gaService.createPoint(width, y);
                    polyline.getPoints().set(0, newFirstPoint);
                    polyline.getPoints().set(1, newSecondPoint);
                    gaService.setLocation(polyline, 0, 0);
                    anythingChanged = true;
                    y += 4;
                }
            }
            IDimension size = gaService.calculateSize(graphicsAlgorithmText, true);
            // IDimension size = gaService.calculateSize(graphicsAlgorithm, true);
        }
        return anythingChanged;
    }

}

package org.eclipselabs.spray.runtime.graphiti.containers;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
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

public class SprayPmwRoleContainer implements ISprayContainer {

    final public String        LEFT_UP         = "left_up";
    final public String        RIGHT_UP        = "right_up";

    protected IPeCreateService peCreateService = null;

    protected IGaService       gaService       = null;

    protected Diagram          targetDiagram   = null;

    protected boolean          isConcept       = false;

    public void setConcept(boolean isConcept) {
        this.isConcept = isConcept;
    }

    public SprayPmwRoleContainer() {
        peCreateService = Graphiti.getPeCreateService();
        gaService = Graphiti.getGaService();
    }

    /*
     * (non-Javadoc)
     * @see org.sample.common.ISprayContainer#addShape(org.eclipse.graphiti.features.context.IAddContext, java.lang.Object)
     */
    @Override
    public ContainerShape createContainer(IAddContext context, Object addedModelElement) {
        targetDiagram = (Diagram) context.getTargetContainer();

        // check whether the context has a size (e.g. from a create feature)
        // otherwise define a default size for the shape
        int width = context.getWidth() <= 0 ? DEFAULT_WIDTH : context.getWidth();
        int height = context.getHeight() <= 0 ? DEFAULT_HEIGHT : context.getHeight();
        int indent = width / 2;
        int half = height / 2;

        SprayLayout layout = new SprayLayout(ISprayColorConstants.BLACK, ISprayColorConstants.RED, 1);
        ContainerShape mainShape = createContainerShape(addedModelElement, targetDiagram, context.getX(), context.getY(), width, height, true, layout);
        RoundedRectangle rect = ((RoundedRectangle) mainShape.getGraphicsAlgorithm());
        rect.setTransparency(100.0);
        rect.setFilled(false);
        rect.setLineVisible(false);

        SprayLayout textLayout = new SprayLayout(ISprayColorConstants.BLACK, ISprayColorConstants.LIGHT_GREEN, 1);
        //      ContainerShape textContainer = createContainerShape(addedModelElement, mainShape, indent / 3, 0, width - (indent / 3), height, false, textLayout);
        ContainerShape textContainer = createContainerShape(addedModelElement, mainShape, 0, 0, width, height, false, textLayout);
        RoundedRectangle textRect = ((RoundedRectangle) textContainer.getGraphicsAlgorithm());
        textRect.setTransparency(100.0);
        textRect.setFilled(false);
        textRect.setLineVisible(false);
        Graphiti.getPeService().setPropertyValue(textContainer, CONCEPT_SHAPE_KEY, TEXTBOX);

        // Part is PolyLine
        {
            //            Shape shape = peCreateService.createShape(mainShape, false);
            Polyline polyline = gaService.createPolygon(mainShape, new int[]{indent, 0, width, half, indent, height, 0, half});
            polyline.setForeground(manageColor(ISprayColorConstants.BLACK/* */));
            polyline.setBackground(manageColor(ISprayColorConstants.ROLE));
            polyline.setLineWidth(1);
            gaService.setLocationAndSize(polyline, context.getX(), context.getY(), width, height);
            Graphiti.getPeService().setPropertyValue(polyline, CONCEPT_SHAPE_KEY, "REQUEST_POLYLINE");
        }

        if (isConcept) {
            createLine(mainShape, DOWN);
            createLine(mainShape, LEFT);
            createLine(mainShape, RIGHT);
        }
        Graphiti.getPeService().sendToFront(mainShape);
        return mainShape;
    }

    /**
     * Create a line inside mainShape with key "key"
     * 
     * @param mainShape
     * @param key
     */
    protected void createLine(ContainerShape mainShape, String key) {
        {
            Shape shape = peCreateService.createShape(mainShape, false);
            Polyline polyline = gaService.createPolyline(shape, new int[]{0, 0, 0, 0});
            polyline.setForeground(manageColor(ISprayColorConstants.BLACK/* */));
            polyline.setLineWidth(1);
            Graphiti.getPeService().setPropertyValue(shape, CONCEPT_SHAPE_KEY, key);
            gaService.setLocation(polyline, 0, 0);
        }
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

    private static final int MIN_HEIGHT = 80;

    private static final int MIN_WIDTH  = 100;

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
        int indent = width / 2;
        int half = height / 2;
        int downRibbonHeight = height / 5;

        if (!isConcept) {
            downRibbonHeight = 0;
        }

        {
            Polygon polygon = (Polygon) containerGa;
            EList<Point> points = polygon.getPoints();
            //            Polyline polyline = gaService.createPolygon(mainShape, new int[]{indent, 0, width, half, indent, height, 0, half});
            Point p = points.get(0);
            p.setX(indent);
            p.setY(0);
            p = points.get(1);
            p.setX(width);
            p.setY(half);
            p = points.get(2);
            p.setX(indent);
            p.setY(height);
            p = points.get(3);
            p.setX(0);
            p.setY(half);
            anythingChanged = true;
        }

        for (Shape shape : containerShape.getChildren()) {
            GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
            String shapeType = Graphiti.getPeService().getPropertyValue(shape, CONCEPT_SHAPE_KEY);
            if (shapeType.equalsIgnoreCase(DOWN)) {
                Polyline polyline = (Polyline) graphicsAlgorithm;
                Point newFirstPoint = gaService.createPoint(width / 3, 5 * height / 6);
                Point newSecondPoint = gaService.createPoint(2 * width / 3, 5 * height / 6);
                polyline.getPoints().set(0, newFirstPoint);
                polyline.getPoints().set(1, newSecondPoint);
                anythingChanged = true;
            } else if (shapeType.equalsIgnoreCase(LEFT)) {
                Polyline polyline = (Polyline) graphicsAlgorithm;
                Point newFirstPoint = gaService.createPoint(4 * width / 9, 5 * height / 6);
                Point newSecondPoint = gaService.createPoint(4 * width / 9, 23 * height / 24);
                polyline.getPoints().set(0, newFirstPoint);
                polyline.getPoints().set(1, newSecondPoint);
                anythingChanged = true;
            } else if (shapeType.equalsIgnoreCase(RIGHT)) {
                Polyline polyline = (Polyline) graphicsAlgorithm;
                Point newFirstPoint = gaService.createPoint(5 * width / 9, 5 * height / 6);
                Point newSecondPoint = gaService.createPoint(5 * width / 9, 23 * height / 24);
                polyline.getPoints().set(0, newFirstPoint);
                polyline.getPoints().set(1, newSecondPoint);
                anythingChanged = true;
            } else if (shapeType.equalsIgnoreCase(LEFT_UP)) {
                Polyline polyline = (Polyline) graphicsAlgorithm;
                int space = 3 * height / 9;
                Point newFirstPoint = gaService.createPoint(space, 2 * height / 6);
                Point newSecondPoint = gaService.createPoint(space, 4 * height / 6 + 2);
                polyline.getPoints().set(0, newFirstPoint);
                polyline.getPoints().set(1, newSecondPoint);
                anythingChanged = true;
            } else if (shapeType.equalsIgnoreCase(RIGHT_UP)) {
                Polyline polyline = (Polyline) graphicsAlgorithm;
                int space = 3 * height / 9;
                Point newFirstPoint = gaService.createPoint(width - space, 2 * height / 6);
                Point newSecondPoint = gaService.createPoint(width - space, 4 * height / 6 + 2);
                polyline.getPoints().set(0, newFirstPoint);
                polyline.getPoints().set(1, newSecondPoint);
                anythingChanged = true;
            } else if (shapeType.equalsIgnoreCase("REQUEST_POLYLINE")) {
                anythingChanged = true;
            }
            int y = 0;

            ContainerShape textBox = SprayContainerService.findTextShape(containerShape);
            GraphicsAlgorithm graphicsAlgorithmText = textBox.getGraphicsAlgorithm();
            RoundedRectangle rectangle = (RoundedRectangle) graphicsAlgorithmText;
            //            rectangle.setLineVisible(false);
            //            rectangle.setFilled(false);

            gaService.setLocationAndSize(rectangle, 0, 0, width, height);
            // ContainerShape textBox = (ContainerShape) shape;
            for (Shape sh : textBox.getChildren()) {
                String textType = Graphiti.getPeService().getPropertyValue(sh, CONCEPT_SHAPE_KEY);
                String id = Graphiti.getPeService().getPropertyValue(sh, "ID");
                if (textType.equalsIgnoreCase(TEXT)) {
                    GraphicsAlgorithm ga = sh.getGraphicsAlgorithm();
                    Text text = (Text) ga;
                    text.setWidth(width);
                    text.setHeight(TEXT_LINE_HEIGHT);
                    text.setX(0);
                    text.setY(y);
                    y += TEXT_LINE_HEIGHT;
                } else if (textType.equalsIgnoreCase("line")) {
                    GraphicsAlgorithm ga = sh.getGraphicsAlgorithm();
                    Polyline polyline = (Polyline) ga;
                    Point newFirstPoint = gaService.createPoint(0, y);
                    Point newSecondPoint = gaService.createPoint(width, y);
                    polyline.getPoints().set(0, newFirstPoint);
                    polyline.getPoints().set(1, newSecondPoint);
                    polyline.setLineWidth(0);
                    gaService.setLocation(polyline, 0, 0);
                    anythingChanged = true;
                    y += 4;
                }
            }
            IDimension size = gaService.calculateSize(graphicsAlgorithmText, true);
        }
        return anythingChanged;
    }

}

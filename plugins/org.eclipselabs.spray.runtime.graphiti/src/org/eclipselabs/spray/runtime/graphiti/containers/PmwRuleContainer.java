package org.eclipselabs.spray.runtime.graphiti.containers;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal;
import org.eclipse.graphiti.ui.internal.services.IGefService;
import org.eclipse.graphiti.util.IColorConstant;

public class PmwRuleContainer implements ISprayContainer {

    private static final String   REQUEST_POLYLINE   = "REQUEST_POLYLINE";

    protected static final String REQUEST_LEFT_INNER = "REQUEST_LEFT_INNER";
    public static final String    LEFT2              = "left2";
    public static final String    RIGHT2             = "right2";
    public static final String    MIDDLE             = "middle";

    protected IPeCreateService    peCreateService    = null;

    protected IGaService          gaService          = null;

    protected Diagram             targetDiagram      = null;

    protected boolean             isConcept          = false;

    public void setConcept(boolean isConcept) {
        this.isConcept = isConcept;
    }

    public PmwRuleContainer() {
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
        int indent = width / 5;
        int half = height / 2;

        SprayLayout layout = new SprayLayout(ISprayColorConstants.BLACK, ISprayColorConstants.RED, 1);
        ContainerShape mainShape = createContainerShape(addedModelElement, targetDiagram, context.getX(), context.getY(), width, height, true, layout);
        RoundedRectangle rect = ((RoundedRectangle) mainShape.getGraphicsAlgorithm());
        rect.setTransparency(100.0);
        rect.setFilled(false);
        rect.setLineVisible(false);

        SprayLayout textLayout = new SprayLayout(ISprayColorConstants.BLACK, ISprayColorConstants.LIGHT_GREEN, 1);
        ContainerShape textContainer = createContainerShape(addedModelElement, mainShape, indent, 0, width - (2 * indent), height, false, textLayout);
        RoundedRectangle textRect = ((RoundedRectangle) textContainer.getGraphicsAlgorithm());
        textRect.setTransparency(100.0);
        textRect.setFilled(false);
        textRect.setLineVisible(false);
        Graphiti.getPeService().setPropertyValue(textContainer, CONCEPT_SHAPE_KEY, TEXTBOX);

        // PolyLine as containing algorithm
        {
            Polygon polygon = gaService.createPolygon(mainShape, new int[]{indent, 0, width - indent, 0, width, half, width - indent, height, indent, height, 0, half, indent, 0});
            polygon.setForeground(manageColor(ISprayColorConstants.BLACK/* */));
            polygon.setBackground(manageColor(ISprayColorConstants.RULE));
            polygon.setLineWidth(1);
            gaService.setLocationAndSize(polygon, context.getX(), context.getY(), width, height);
            Graphiti.getPeService().setPropertyValue(polygon, CONCEPT_SHAPE_KEY, REQUEST_POLYLINE);

        }

        if (isConcept) {
            // Part is Line
            {
                Shape shape = peCreateService.createShape(mainShape, false);
                Polyline polyline = gaService.createPolyline(shape, new int[]{0, 0, 0, 0});
                polyline.setForeground(manageColor(ISprayColorConstants.BLACK/* */));
                polyline.setLineWidth(1);
                Graphiti.getPeService().setPropertyValue(shape, CONCEPT_SHAPE_KEY, DOWN);
                gaService.setLocation(polyline, 0, 0);
            }
            // Part is Line
            createLine(mainShape, LEFT);
            createLine(mainShape, RIGHT);
            createLine(mainShape, LEFT2);
            createLine(mainShape, RIGHT2);
            createLine(mainShape, MIDDLE);
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

    private static final int MIN_HEIGHT = 70;

    private static final int MIN_WIDTH  = 100;

    /*
     * (non-Javadoc)
     * @see org.sample.common.ISprayContainer#layoutConcept(org.eclipse.graphiti.features.context.ILayoutContext)
     */
    public boolean layoutContainer0(ILayoutContext context) {
        return true;
    }

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
        int indent = height / 3;
        int half = height / 2;
        int indentPlus = indent / 2;
        int downRibbonHeight = height / 5;

        if (!isConcept) {
            downRibbonHeight = 0;
        }

        // layout the main outer shape algorithm
        {
            Polygon polygon = (Polygon) containerGa;
            EList<Point> points = polygon.getPoints();
            Point p = points.get(0);
            p.setX(indent);
            p.setY(0);

            p = points.get(1);
            p.setX(width - indent);
            p.setY(0);

            p = points.get(2);
            p.setX(width);
            p.setY(half);

            p = points.get(3);
            p.setX(width - indent);
            p.setY(height);

            p = points.get(4);
            p.setX(indent);
            p.setY(height);

            p = points.get(5);
            p.setX(0);
            p.setY(half);

            p = points.get(6);
            p.setX(indent);
            p.setY(0);
            anythingChanged = true;
        }

        for (Shape shape : containerShape.getChildren()) {
            GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
            String shapeType = Graphiti.getPeService().getPropertyValue(shape, CONCEPT_SHAPE_KEY);
            if (shapeType.equals(DOWN)) {
                Polyline polyline = (Polyline) graphicsAlgorithm;
                Point newFirstPoint = gaService.createPoint(indent - (indent / 3), 5 * height / 6);
                Point newSecondPoint = gaService.createPoint(width - indent + (indent / 3), 5 * height / 6);
                polyline.getPoints().set(0, newFirstPoint);
                polyline.getPoints().set(1, newSecondPoint);
                anythingChanged = true;
            } else if (shapeType.equals(LEFT)) {
                Polyline polyline = (Polyline) graphicsAlgorithm;
                Point newFirstPoint = gaService.createPoint(indent, 5 * height / 6);
                Point newSecondPoint = gaService.createPoint(indent, height);
                polyline.getPoints().set(0, newFirstPoint);
                polyline.getPoints().set(1, newSecondPoint);
                anythingChanged = true;
            } else if (shapeType.equals(RIGHT)) {
                Polyline polyline = (Polyline) graphicsAlgorithm;
                Point newFirstPoint = gaService.createPoint(width - indent, 5 * height / 6);
                Point newSecondPoint = gaService.createPoint(width - indent, height);
                polyline.getPoints().set(0, newFirstPoint);
                polyline.getPoints().set(1, newSecondPoint);
                anythingChanged = true;
            } else if (shapeType.equals(LEFT2)) {
                Polyline polyline = (Polyline) graphicsAlgorithm;
                int space = (width - 2 * indent) / 4;
                Point newFirstPoint = gaService.createPoint(indent + space, 5 * height / 6);
                Point newSecondPoint = gaService.createPoint(indent + space, height);
                polyline.getPoints().set(0, newFirstPoint);
                polyline.getPoints().set(1, newSecondPoint);
                anythingChanged = true;
            } else if (shapeType.equals(RIGHT2)) {
                Polyline polyline = (Polyline) graphicsAlgorithm;
                int space = (width - 2 * indent) / 4;
                Point newFirstPoint = gaService.createPoint(width - indent - space, 5 * height / 6);
                Point newSecondPoint = gaService.createPoint(width - indent - space, height);
                polyline.getPoints().set(0, newFirstPoint);
                polyline.getPoints().set(1, newSecondPoint);
                anythingChanged = true;
            } else if (shapeType.equals(MIDDLE)) {
                Polyline polyline = (Polyline) graphicsAlgorithm;
                int space = (width - 2 * indent) / 4;
                Point newFirstPoint = gaService.createPoint(width - indent - 2 * space, 5 * height / 6);
                Point newSecondPoint = gaService.createPoint(width - indent - 2 * space, height);
                polyline.getPoints().set(0, newFirstPoint);
                polyline.getPoints().set(1, newSecondPoint);
                anythingChanged = true;
            }
        }
        int y = 0;

        ContainerShape textBox = SprayContainerService.findTextShape(containerShape);
        GraphicsAlgorithm graphicsAlgorithmText = textBox.getGraphicsAlgorithm();
        RoundedRectangle rectangle = (RoundedRectangle) graphicsAlgorithmText;
        //            rectangle.setLineVisible(false);
        //            rectangle.setFilled(false);

        gaService.setLocationAndSize(rectangle, indent, 0, width - (2 * indent), height);
        // ContainerShape textBox = (ContainerShape) shape;
        for (Shape sh : textBox.getChildren()) {
            String textType = Graphiti.getPeService().getPropertyValue(sh, CONCEPT_SHAPE_KEY);
            String id = Graphiti.getPeService().getPropertyValue(sh, "ID");
            if (textType.equalsIgnoreCase(TEXT)) {
                GraphicsAlgorithm ga = sh.getGraphicsAlgorithm();
                if (ga instanceof Text) {
                    Text text = (Text) ga;
                    text.setWidth(width - (2 * indent));
                    text.setHeight(TEXT_LINE_HEIGHT);
                    text.setX(0);
                    text.setY(y);
                    y += TEXT_LINE_HEIGHT;
                    IDimension dim = Graphiti.getGaLayoutService().calculateSize(text);
                    //                    System.out.println("Text [" + text.getValue() + "] DIMENSION width [" + dim.getWidth() + "] height [" + dim.getHeight() + "]");
                } else {
                    MultiText text = (MultiText) ga;
                    text.setWidth(width - (2 * indent));
                    text.setHeight(30);
                    text.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
                    text.setX(0);
                    text.setY(y);
                    y += 40;
                    IGefService gefSvc = GraphitiUiInternal.getGefService();
                    //                    gefSvc.calculateTextSize(text, font)
                    IDimension dim = Graphiti.getGaLayoutService().calculateSize(text);
                    //                    System.out.println("MultiText [" + text.getValue() + "] DIMENSION width [" + dim.getWidth() + "] height [" + dim.getHeight() + "]");
                }
            } else if (textType.equalsIgnoreCase("line")) {
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

        return anythingChanged;
    }

}

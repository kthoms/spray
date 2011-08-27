package org.xspray.runtime.containers;

import java.util.Map;

import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

public class SprayContainerService {

    static public void printContainer(String indent, ContainerShape main) {
        for (Shape shape : main.getChildren()) {
            if (shape instanceof ContainerShape) {
                printContainer(indent + indent, (ContainerShape) shape);
            } else {
                System.out.println(indent + indent + Graphiti.getPeService().getPropertyValue(shape, ISprayContainer.CONCEPT_SHAPE_KEY));
            }
        }
    }

    static public ContainerShape findTextShape(ContainerShape main) {
        String mainType = Graphiti.getPeService().getPropertyValue(main, ISprayContainer.CONCEPT_SHAPE_KEY);
        if ((mainType != null) && mainType.equalsIgnoreCase("textbox")) {
            return (ContainerShape) main;
        }
        for (Shape shape : main.getChildren()) {
            String shapeType = Graphiti.getPeService().getPropertyValue(shape, ISprayContainer.CONCEPT_SHAPE_KEY);
            if ((shapeType != null) && shapeType.equalsIgnoreCase(ISprayContainer.TEXTBOX)) {
                return (ContainerShape) shape;
            }
            if (shape instanceof ContainerShape) {
                Shape result = findTextShape((ContainerShape) shape);
                if (result != null) {
                    return (ContainerShape) result;
                }
            }
        }
        return null;
    }

    /**
     * Recursively go though the Shape and its children and update any Sahpe with a Text algorithm
     * based on the match of the Text propertyvalue with a type in the values list.
     * 
     * @param pictogramElement
     */
    static public boolean update(PictogramElement pictogramElement, Map<String, String> values) {
        boolean result = false;
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
            for (Shape shape : cs.getChildren()) {
                if (shape instanceof ContainerShape) {
                    update(shape, values);
                } else {
                    if (shape.getGraphicsAlgorithm() instanceof Text) {
                        String type = Graphiti.getPeService().getPropertyValue(shape, "MODEL_TYPE");
                        String value = values.get(type);
                        if (value != null) {
                            Text text = (Text) shape.getGraphicsAlgorithm();
                            String pictogramName = text.getValue();
                            // update needed, if names are different
                            boolean updateNameNeeded = ((pictogramName == null && value != null) || (pictogramName != null && !pictogramName.equals(value)));
                            if (updateNameNeeded) {
                                // return Reason.createTrueReason("Name [" + pictogramName +
                                // "] is out of date");
                                text.setValue(value);
                                result = true;
                            }
                        }
                    }
                    if (shape.getGraphicsAlgorithm() instanceof MultiText) {
                        String type = Graphiti.getPeService().getPropertyValue(shape, "MODEL_TYPE");
                        String value = values.get(type);
                        if (value != null) {
                            MultiText text = (MultiText) shape.getGraphicsAlgorithm();
                            String pictogramName = text.getValue();
                            // update needed, if names are different
                            boolean updateNameNeeded = ((pictogramName == null && value != null) || (pictogramName != null && !pictogramName.equals(value)));
                            if (updateNameNeeded) {
                                // return Reason.createTrueReason("Name [" + pictogramName +
                                // "] is out of date");
                                text.setValue(value);
                                result = true;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    static public boolean updateConnection(PictogramElement pictogramElement, Map<String, String> values) {
        return true;
    }

}

package org.eclipselabs.spray.runtime.graphiti.containers;

import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

public class PmwAllowedValueContainer extends SprayConceptContainer {

    public PmwAllowedValueContainer() {
        super();
        layout = new SprayLayout(ISprayColorConstants.BLACK, ISprayColorConstants.ALLOWEDVALUE, 1);
        setLayout(layout);
    }

    @Override
    public ContainerShape createContainer(IAddContext context, Object addedModelElement) {
        ContainerShape mainShape = super.createContainer(context, addedModelElement);
        ContainerShape textContainer = SprayContainerService.findTextShape(mainShape);
        GraphicsAlgorithm g = textContainer.getGraphicsAlgorithm();
        g.setLineVisible(false);

        return mainShape;
    }

}

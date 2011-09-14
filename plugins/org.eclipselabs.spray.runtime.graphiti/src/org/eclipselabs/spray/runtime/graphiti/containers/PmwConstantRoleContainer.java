package org.eclipselabs.spray.runtime.graphiti.containers;

import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

public class PmwConstantRoleContainer extends SprayPmwRoleContainer {

    public PmwConstantRoleContainer() {
        super();
    }

    @Override
    public ContainerShape createContainer(IAddContext context, Object addedModelElement) {
        ContainerShape mainShape = super.createContainer(context, addedModelElement);
        createLine(mainShape, LEFT_UP);
        createLine(mainShape, RIGHT_UP);
        return mainShape;
    }

}

package org.eclipselabs.spray.runtime.graphiti.containers;

public class PmwPropertySpecContainer extends SprayRectangleContainer {

    public PmwPropertySpecContainer() {
        super();
        cornerHeight = 30;
        cornerWidth = 30;
        layout = new SprayLayout(ISprayColorConstants.BLACK, ISprayColorConstants.PROPERTYSPEC, 1);
        setLayout(layout);

    }
}

package org.eclipselabs.spray.runtime.graphiti.containers;

import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

public interface ISprayContainer {

    public static final String RIGHT             = "right";

    public static final String TEXT              = "text";

    public static final String LINE              = "line";

    public static final String CONCEPT_SHAPE_KEY = "CONCEPT_SHAPE";

    public static final String LEFT              = "left";

    public static final String DOWN              = "down";

    public static final String TEXTBOX           = "textbox";

    public static int          DEFAULT_WIDTH     = 150;

    public static int          DEFAULT_HEIGHT    = 50;

    public static int          TEXT_LINE_HEIGHT  = 16;

    public abstract ContainerShape createContainer(IAddContext context, Object addedModelElement);

    public abstract boolean layoutContainer(ILayoutContext context);

}

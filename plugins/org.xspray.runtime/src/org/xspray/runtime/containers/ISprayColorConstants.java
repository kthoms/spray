package org.xspray.runtime.containers;

import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

public interface ISprayColorConstants extends IColorConstant {

    /**
     * The color to use for Xspray shapes and connectors.
     */
    IColorConstant CONCEPT          = new ColorConstant(229, 155, 215);
    IColorConstant PINK             = new ColorConstant(229, 155, 215);
    IColorConstant CALCULATION      = new ColorConstant(120, 181, 236);
    IColorConstant RULE             = CALCULATION;
    IColorConstant REQUEST          = new ColorConstant(238, 201, 1);
    IColorConstant ROLE             = LIGHT_GREEN;
    IColorConstant TRANSPARANT      = new ColorConstant(256, 256, 256);
    IColorConstant PROPERTYSPEC     = new ColorConstant(193, 255, 193);
    IColorConstant ALLOWEDVALUE     = new ColorConstant(207, 181, 59);
    IColorConstant USAGE_INCOMPLETE = RED;

}

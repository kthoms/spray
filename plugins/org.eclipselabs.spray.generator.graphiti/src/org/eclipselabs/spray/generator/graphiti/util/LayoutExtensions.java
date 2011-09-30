package org.eclipselabs.spray.generator.graphiti.util;

import org.eclipse.graphiti.util.IColorConstant;
import org.eclipselabs.spray.mm.spray.Color;
import org.eclipselabs.spray.mm.spray.ColorConstantRef;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.RGBColor;
import org.eclipselabs.spray.mm.spray.Shape;

import com.google.inject.Inject;

public class LayoutExtensions {
    @Inject
    private ImportUtil importUtil;

    // --------------------------------------------------------------------------------------------
    // Shape colors
    // --------------------------------------------------------------------------------------------
    protected String colorString(Color color) {
        if (color == null) {
            return importUtil.shortName(IColorConstant.class) + ".BLACK";
        }
        if (color instanceof ColorConstantRef) {
            ColorConstantRef colorConstant = (ColorConstantRef) color;
            if (colorConstant != null) {
                return importUtil.shortName(colorConstant.getField().getDeclaringType().getSimpleName()) + "." + colorConstant.getField().getSimpleName();
            }
        } else if (color instanceof RGBColor) {
            RGBColor rgb = (RGBColor) color;
            return String.format("%s,%s,%s", rgb.getRed(), rgb.getGreen(), rgb.getBlue());
        } else {
            throw new IllegalArgumentException(color.getClass().getName());
        }
        return null;
    }

    public boolean hasFillColor(Shape element) {
        return element.getLayout().getFillColor() != null;
    }

    public String fillColor(Shape element) {
        Color color = element.getLayout().getFillColor();
        return colorString(color);
    }

    public boolean hasLineColor(Shape element) {
        return element.getLayout().getLineColor() != null;
    }

    public String lineColor(Shape element) {
        Color color = element.getLayout().getLineColor();
        return colorString(color);
    }

    public boolean hasTextColor(Shape element) {
        return element.getLayout().getTextColor() != null;
    }

    public String textColor(Shape element) {
        Color color = element.getLayout().getTextColor();
        return colorString(color);
    }

    // --------------------------------------------------------------------------------------------
    // MetaClass colors
    // --------------------------------------------------------------------------------------------
    public boolean hasFillColor(MetaClass element) {
        return hasFillColor(element.getRepresentedBy());
    }

    public String fillColor(MetaClass element) {
        return fillColor(element.getRepresentedBy());
    }

    public boolean hasLineColor(MetaClass element) {
        return hasLineColor(element.getRepresentedBy());
    }

    public String lineColor(MetaClass element) {
        return lineColor(element.getRepresentedBy());
    }

    public boolean hasTextColor(MetaClass element) {
        return hasTextColor(element.getRepresentedBy());
    }

    public String textColor(MetaClass element) {
        return textColor(element.getRepresentedBy());
    }

    // --------------------------------------------------------------------------------------------
    // MetaReference colors
    // --------------------------------------------------------------------------------------------
    public boolean hasFillColor(MetaReference element) {
        return hasFillColor(element.getRepresentedBy());
    }

    public String fillColor(MetaReference element) {
        return fillColor(element.getRepresentedBy());
    }

    public boolean hasLineColor(MetaReference element) {
        return hasLineColor(element.getRepresentedBy());
    }

    public String lineColor(MetaReference element) {
        return lineColor(element.getRepresentedBy());
    }

    public boolean hasTextColor(MetaReference element) {
        return hasTextColor(element.getRepresentedBy());
    }

    public String textColor(MetaReference element) {
        return textColor(element.getRepresentedBy());
    }

    // --------------------------------------------------------------------------------------------
    // Container colors
    // --------------------------------------------------------------------------------------------
}

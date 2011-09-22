package org.eclipselabs.spray.generator.graphiti.util;

import org.eclipse.core.runtime.Assert;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipselabs.spray.mm.spray.ColorConstantRef;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.Shape;

import com.google.inject.Inject;

public class LayoutExtensions {
    @Inject
    private ImportUtil importUtil;
    
    // --------------------------------------------------------------------------------------------
    // Shape colors
    // --------------------------------------------------------------------------------------------
    public boolean hasFillColor (Shape element) {
        return element.getLayout().getFillColor()!=null;
    }
    public String fillColor (Shape element) {
        ColorConstantRef colorConstant = element.getLayout().getFillColor();
        if (colorConstant != null) {
            return importUtil.shortName(colorConstant.getField().getDeclaringType().getSimpleName())+"."+colorConstant.getField().getSimpleName();
        } else {
            return importUtil.shortName(IColorConstant.class)+".BLACK";
        }
    }
    
    public boolean hasLineColor (Shape element) {
        return element.getLayout().getLineColor()!=null;
    }
    public String lineColor (Shape element) {
        ColorConstantRef colorConstant = element.getLayout().getLineColor();
        if (colorConstant != null) {
            return importUtil.shortName(colorConstant.getField().getDeclaringType().getSimpleName())+"."+colorConstant.getField().getSimpleName();
        } else {
            return importUtil.shortName(IColorConstant.class)+".BLACK";
        }
    }
    
    public boolean hasTextColor (Shape element) {
        return element.getLayout().getTextColor()!=null;
    }
    public String textColor (Shape element) {
        ColorConstantRef colorConstant = element.getLayout().getTextColor();
        if (colorConstant != null) {
            return importUtil.shortName(colorConstant.getField().getDeclaringType().getSimpleName())+"."+colorConstant.getField().getSimpleName();
        } else {
            return importUtil.shortName(IColorConstant.class)+".BLACK";
        }
    }

    // --------------------------------------------------------------------------------------------
    // MetaClass colors
    // --------------------------------------------------------------------------------------------
    public boolean hasFillColor (MetaClass element) {
        return hasFillColor(element.getRepresentedBy());
    }
    public String fillColor (MetaClass element) {
        return fillColor(element.getRepresentedBy());
    }
    
    public boolean hasLineColor (MetaClass element) {
        return hasLineColor(element.getRepresentedBy());
    }
    public String lineColor (MetaClass element) {
        return lineColor(element.getRepresentedBy());
    }
    
    public boolean hasTextColor (MetaClass element) {
        return hasTextColor(element.getRepresentedBy());
    }
    public String textColor (MetaClass element) {
        return textColor(element.getRepresentedBy());
    }

    // --------------------------------------------------------------------------------------------
    // MetaReference colors
    // --------------------------------------------------------------------------------------------
    public boolean hasFillColor (MetaReference element) {
        return hasFillColor(element.getRepresentedBy());
    }
    public String fillColor (MetaReference element) {
        return fillColor(element.getRepresentedBy());
    }
    
    public boolean hasLineColor (MetaReference element) {
        return hasLineColor(element.getRepresentedBy());
    }
    public String lineColor (MetaReference element) {
        return lineColor(element.getRepresentedBy());
    }
    
    public boolean hasTextColor (MetaReference element) {
        return hasTextColor(element.getRepresentedBy());
    }
    public String textColor (MetaReference element) {
        return textColor(element.getRepresentedBy());
    }

    // --------------------------------------------------------------------------------------------
    // Container colors
    // --------------------------------------------------------------------------------------------
}

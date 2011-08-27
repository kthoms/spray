package org.xspray.runtime.containers;

import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.util.IColorConstant;

public class SprayLayout {

    public static SprayLayout DEFAULT             = new SprayLayout();

    protected IColorConstant  line                = ISprayColorConstants.BLACK;

    protected IColorConstant  fill                = ISprayColorConstants.WHITE;

    protected int             lineWidth           = 1;

    protected Orientation     horizontalAlignment = Orientation.ALIGNMENT_CENTER;

    protected Orientation     verticalAlignment   = Orientation.ALIGNMENT_CENTER;

    private SprayLayout() {
    }

    public SprayLayout(IColorConstant line, IColorConstant fill, int width) {
        this.line = line;
        this.fill = fill;
        this.lineWidth = width;
    }

    public IColorConstant getLine() {
        return line;
    }

    public IColorConstant getFill() {
        return fill;
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public Orientation getHorizontalAlignment() {
        return horizontalAlignment;
    }

    public Orientation getVerticalAlignment() {
        return verticalAlignment;
    }

}

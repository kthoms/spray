/*************************************************************************************
 *
 * Generated on Mon Aug 29 17:53:16 CEST 2011 by XSpray LayoutFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.xspray.examples.mod4j.features;

import java.util.Iterator;

import BusinessDomainDsl.BusinessClass;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.xspray.runtime.containers.SprayRectangleContainer;

public class mod4jLayoutBusinessClassFeatureBase extends AbstractLayoutFeature {

    private static final int MIN_HEIGHT = 30;

    private static final int MIN_WIDTH = 50;

    protected SprayRectangleContainer container = null;

    public mod4jLayoutBusinessClassFeatureBase(IFeatureProvider fp) {
        super(fp);
        container = new SprayRectangleContainer();
    }

    public boolean canLayout(ILayoutContext context) {
        PictogramElement pe = context.getPictogramElement();
        if (!(pe instanceof ContainerShape)) {
            return false;
        }
        EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
        return (businessObjects.size() == 1) && (businessObjects.get(0) instanceof BusinessClass);
    }

    public boolean layout(ILayoutContext context) {
        return container.layoutContainer(context);
    }

    @Override
    public boolean hasDoneChanges() {
        return false;
    }

    @Override
    public boolean canUndo(IContext context) {
        return false;
    }

}

/*************************************************************************************
 *
 * Generated on Sat Aug 27 19:33:30 CEST 2011 by XSpray CustomFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.xspray.examples.mod4j.features;

import java.util.Iterator;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;


public class mod4jCustomDoWithBusinessClassFeatureBase extends  AbstractCustomFeature {

    public mod4jCustomDoWithBusinessClassFeatureBase(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public String getName() {
        return "Do It With"; //$NON-NLS-1$
    }

    @Override
    public String getDescription() {
        return "Do It With description"; //$NON-NLS-1$
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        // allow rename if exactly one pictogram element
        // representing an EClass is selected
        boolean ret = true;
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
        }
        return ret;
    }

    @Override
    public void execute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            // TODO add code here.
        }
    }

    @Override
    public boolean canUndo(IContext context) {
        return false;
    }

    @Override
    public boolean hasDoneChanges() {
        return false;
    }
 
}

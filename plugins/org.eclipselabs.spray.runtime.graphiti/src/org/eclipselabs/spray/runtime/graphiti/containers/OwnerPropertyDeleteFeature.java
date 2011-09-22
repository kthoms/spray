package org.eclipselabs.spray.runtime.graphiti.containers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.impl.LayoutContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;

public class OwnerPropertyDeleteFeature extends DefaultDeleteFeature {

    public OwnerPropertyDeleteFeature(IFeatureProvider fp) {
        super(fp);
    }

    public void delete(IDeleteContext context) {
        PictogramElement pe = context.getPictogramElement();

        Object[] businessObjectsForPictogramElement = getAllBusinessObjectsForPictogramElement(pe);
        if (businessObjectsForPictogramElement != null && businessObjectsForPictogramElement.length > 0) {
            if (!getUserDecision()) {
                return;
            }
        }

        Object o = getBusinessObjectForPictogramElement(pe);
        EObject prop = (EObject) o;
        EObject owner = prop.eContainer();
        //		BusinessClass cls = (BusinessClass)prop.getOwningType();
        List<PictogramElement> picts = Graphiti.getLinkService().getPictogramElements(getDiagram(), owner);

        preDelete(context);

        IRemoveContext rc = new RemoveContext(pe);
        IFeatureProvider featureProvider = getFeatureProvider();
        IRemoveFeature removeFeature = featureProvider.getRemoveFeature(rc);
        if (removeFeature != null) {
            removeFeature.remove(rc);
        }

        deleteBusinessObjects(businessObjectsForPictogramElement);

        for (PictogramElement pictogramElement : picts) {
            LayoutContext layoutCcontext = new LayoutContext(pictogramElement);
            getFeatureProvider().layoutIfPossible(layoutCcontext);
        }
        postDelete(context);
    }
}

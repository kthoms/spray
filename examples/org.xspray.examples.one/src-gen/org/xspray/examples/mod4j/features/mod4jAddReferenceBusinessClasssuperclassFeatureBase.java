/*************************************************************************************
 *
 * Generated on Sat Aug 27 20:37:42 CEST 2011 by XSpray AddReferenceAsConnectionFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.xspray.examples.mod4j.features;

import BusinessDomainDsl.BusinessClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.xspray.runtime.containers.ISprayColorConstants;

public class mod4jAddReferenceBusinessClasssuperclassFeatureBase extends  AbstractAddFeature {

    public mod4jAddReferenceBusinessClasssuperclassFeatureBase(IFeatureProvider fp) {
        super(fp);
    }
 
    public PictogramElement add(IAddContext context) {
        IAddConnectionContext addConContext = (IAddConnectionContext) context;
        BusinessClass addedDomainObject = (BusinessClass) context.getNewObject();
    removeExisting(context);
        IPeCreateService peCreateService = Graphiti.getPeCreateService();
      
        // CONNECTION WITH POLYLINE
        Connection connection = peCreateService.createFreeFormConnection(getDiagram());
        connection.setStart(addConContext.getSourceAnchor());
        connection.setEnd(addConContext.getTargetAnchor());
 
        // TRY
		AnchorContainer parent = connection.getStart().getParent();
		Object start = getBusinessObjectForPictogramElement(parent);
		AnchorContainer child = connection.getEnd().getParent();
		Object end = getBusinessObjectForPictogramElement(child);
		//END TRY

        IGaService gaService = Graphiti.getGaService();
        Polyline polyline = gaService.createPolyline(connection);
        polyline.setLineWidth(1);
        polyline.setForeground(manageColor(ISprayColorConstants.BLACK));
		 
        // create link and wire it
        Graphiti.getPeService().setPropertyValue(connection, "MODEL_TYPE", "BusinessClass.superclass");
        Graphiti.getPeService().setPropertyValue(connection, "REFERENCE", (String)context.getProperty("REFERENCE"));
        Graphiti.getPeService().setPropertyValue(connection, "TARGETOBJECT", (String)context.getProperty("TARGETOBJECT"));
 //       link(connection, addedDomainObject);

		// add static graphical decorator
		ConnectionDecorator cd;
		cd = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
//      No arraows
//		createArrow(cd);

        return connection;
    }

    public boolean canAdd(IAddContext context) {
        // return true if given business object is an BusinessClass
        // note, that the context must be an instance of IAddConnectionContext
        if (context instanceof IAddConnectionContext
            && context.getNewObject() instanceof BusinessClass) {
            return true;
        }
        return false;
    }
    
    protected void removeExisting(IAddContext context) {
        IAddConnectionContext addConContext = (IAddConnectionContext) context;
        BusinessClass addedDomainObject = (BusinessClass) context.getNewObject();
        Object[] pictogramElements = Graphiti.getPeService().getLinkedPictogramElements(new EObject[] { addedDomainObject }, getDiagram());
        for (Object pict : pictogramElements) {
			if( pict instanceof PictogramElement){
				PictogramElement p = (PictogramElement)pict;
				String reference = Graphiti.getPeService().getPropertyValue(p, "REFERENCE");
				if( "superclass".equals(reference)){
					Graphiti.getPeService().deletePictogramElement(p) ;
				}
			}
		}
	}

	private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {
		Polyline polyline = Graphiti.getGaCreateService().createPolyline(gaContainer, new int[] { -15, 10, 0, 0, -15, -10 });
//		polyline.setStyle(StyleUtil.getStyleForEClass(getDiagram()));
        polyline.setLineWidth(1);
        polyline.setForeground(manageColor(ISprayColorConstants.BLACK));
		return polyline;
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

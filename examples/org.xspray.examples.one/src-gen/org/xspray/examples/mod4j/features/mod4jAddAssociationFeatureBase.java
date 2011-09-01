/*************************************************************************************
 *
 * Generated on Mon Aug 29 17:53:15 CEST 2011 by XSpray AddConnectionFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.xspray.examples.mod4j.features;

import BusinessDomainDsl.Association;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.xspray.runtime.containers.ISprayColorConstants;
import org.eclipse.graphiti.util.IColorConstant;

public class mod4jAddAssociationFeatureBase extends AbstractAddFeature {

    public mod4jAddAssociationFeatureBase(IFeatureProvider fp) {
        super(fp);
    }

    public PictogramElement add(IAddContext context) {
        IAddConnectionContext addConContext = (IAddConnectionContext) context;
        // TODO: Domain object
        Association addedDomainObject = (Association) context.getNewObject();
        IPeCreateService peCreateService = Graphiti.getPeCreateService();

        // CONNECTION WITH POLYLINE
        Connection connection = peCreateService.createFreeFormConnection(getDiagram());
        connection.setStart(addConContext.getSourceAnchor());
        connection.setEnd(addConContext.getTargetAnchor());

        IGaService gaService = Graphiti.getGaService();
        Polyline polyline = gaService.createPolyline(connection);
        polyline.setLineWidth(1);
        polyline.setForeground(manageColor(ISprayColorConstants.BLACK));

        ConnectionDecorator toDecorator = peCreateService.createConnectionDecorator(connection, true, 1.0, true);
        Text text = gaService.createDefaultText(getDiagram(), toDecorator);
        text.setForeground(manageColor(IColorConstant.BLACK));

        GraphicsAlgorithm ga = addConContext.getTargetAnchor().getParent().getGraphicsAlgorithm();
        int targetHeight = ga.getHeight();
        Graphiti.getGaLayoutService().setLocation(text, 10, -(targetHeight / 2) - 20);
        text.setValue(addedDomainObject.getName().toString());
        Graphiti.getPeService().setPropertyValue(toDecorator, "MODEL_TYPE", "TO_LABEL");
        link(toDecorator, addedDomainObject);
        ConnectionDecorator connectionDecorator = peCreateService.createConnectionDecorator(connection, true, 0.5, true);
        Text sourceText = gaService.createDefaultText(getDiagram(), connectionDecorator);
        sourceText.setForeground(manageColor(IColorConstant.BLACK));
        Graphiti.getGaLayoutService().setLocation(sourceText, 10, 0);
        sourceText.setValue(addedDomainObject.getTargetMultiplicity().toString());
        Graphiti.getPeService().setPropertyValue(connectionDecorator, "MODEL_TYPE", "CONNECTION_LABEL");
        link(connectionDecorator, addedDomainObject);
        ConnectionDecorator fromDecorator = peCreateService.createConnectionDecorator(connection, true, 0.0, true);
        Text fromText = gaService.createDefaultText(getDiagram(), fromDecorator);
        fromText.setForeground(manageColor(IColorConstant.BLACK));
        Graphiti.getGaLayoutService().setLocation(fromText, 10, 20);
        fromText.setValue("source " + addedDomainObject.getSource().getName().toString());
        Graphiti.getPeService().setPropertyValue(fromDecorator, "MODEL_TYPE", "FROM_LABEL");
        link(fromDecorator, addedDomainObject);

        // create link and wire it
        Graphiti.getPeService().setPropertyValue(connection, "MODEL_TYPE", "Association");
        link(connection, addedDomainObject);

        return connection;
    }

    public boolean canAdd(IAddContext context) {
        // return true if given business object is an Association
        // note, that the context must be an instance of IAddConnectionContext
        if (context instanceof IAddConnectionContext && context.getNewObject() instanceof Association) {
            return true;
        }
        return false;
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

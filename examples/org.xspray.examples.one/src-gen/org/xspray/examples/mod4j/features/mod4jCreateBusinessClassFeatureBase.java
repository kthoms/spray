/*************************************************************************************
 *
 * Generated on Mon Aug 29 17:53:16 CEST 2011 by XSpray CreateShapeFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.xspray.examples.mod4j.features;

import java.io.IOException;
import BusinessDomainDsl.BusinessClass;
import BusinessDomainDsl.BusinessDomainDslFactory;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.core.runtime.CoreException;
import org.xspray.runtime.containers.SampleUtil;
import org.xspray.examples.mod4j.diagram.mod4jImageProvider;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

public class mod4jCreateBusinessClassFeatureBase extends AbstractCreateFeature {

    private static final String TITLE = "Create BusinessClass";

    private static final String USER_QUESTION = "Enter new BusinessClass name";

    public final static String typeOrAliasName = "BusinessClass";

    public mod4jCreateBusinessClassFeatureBase(IFeatureProvider fp) {
        // set name and description of the creation feature
        super(fp, "BusinessClass", "Create BusinessClass");
    }

    public boolean canCreate(ICreateContext context) {
        return context.getTargetContainer() instanceof Diagram;
    }

    protected BusinessClass newClass = null;

    public Object[] create(final ICreateContext context) {
        newClass = createBusinessClass(context);

        if (newClass == null) {
            return EMPTY;
        }

        // do the add
        addGraphicalRepresentation(context, newClass);
        // return newly created business object(s)
        return new Object[] { newClass };
    }

    protected BusinessClass createBusinessClass(ICreateContext context) {
        // ask user for mod4jCreateBusinessClassFeatureBase name
        String newName = SampleUtil.askString(TITLE, USER_QUESTION, "");
        if (newName == null || newName.trim().length() == 0) {
            return null;
        }
        // create BusinessClass
        BusinessClass newClass = BusinessDomainDslFactory.eINSTANCE.createBusinessClass();
        newClass.setName(newName);
        // default is to add it to a file resource, which is created if it does not exist.
        try {
            SampleUtil.saveToModelFile(newClass, getDiagram(), "businessdomaindsl");
        } catch (CoreException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return newClass;
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

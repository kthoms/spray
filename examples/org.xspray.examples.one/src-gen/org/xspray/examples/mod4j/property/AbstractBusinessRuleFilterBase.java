/*************************************************************************************
 *
 * Generated on Sat Aug 27 20:37:44 CEST 2011 by XSpray Filter.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.xspray.examples.mod4j.property;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

import BusinessDomainDsl.AbstractBusinessRule;

public class AbstractBusinessRuleFilterBase extends  AbstractPropertySectionFilter {
		 
    @Override
    protected boolean accept(PictogramElement pe) {
        EObject eObject = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
        if (eObject instanceof AbstractBusinessRule) {
            return true;
        }
        return false;
    }
}

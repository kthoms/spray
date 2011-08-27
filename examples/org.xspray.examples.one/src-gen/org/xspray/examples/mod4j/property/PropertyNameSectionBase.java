/*************************************************************************************
 *
 * Generated on Sat Aug 27 19:33:30 CEST 2011 by XSpray PropertySection.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.xspray.examples.mod4j.property;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import java.util.List;

//import BusinessDomainDsl.ModelElement;
import BusinessDomainDsl.ModelElement;
public class PropertyNameSectionBase extends GFPropertySection implements ITabbedPropertyConstants {
 
    protected ModelElement bc = null;
protected Text nameWidget;
 
    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);
 
        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        Composite composite = factory.createFlatFormComposite(parent);
        FormData data;

nameWidget = factory.createText(composite, "");
        data = new FormData();
        data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, VSPACE);
        nameWidget.setLayoutData(data);
 
        CLabel valueLabel = factory.createCLabel(composite, "Name");
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(nameWidget, -HSPACE);
        data.top = new FormAttachment(nameWidget, 0, SWT.CENTER);
        valueLabel.setLayoutData(data);
}
 
@Override
public void refresh() {
    nameWidget.removeModifyListener(nameListener);
		
    PictogramElement pe = getSelectedPictogramElement();
    if (pe != null) {
        Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
       // the filter assured, that it is a ModelElement
        if (bo == null)
            return;
        bc = (ModelElement)bo;
        String value = "";
value = bc.getName();
        nameWidget.setText(value == null ? "" : value);
        nameWidget.addModifyListener(nameListener);
    }
}
		
private ModifyListener nameListener = new ModifyListener() {
    public void modifyText(ModifyEvent arg0) {
					TransactionalEditingDomain editingDomain = getDiagramEditor().getEditingDomain();
					editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
						@Override
						protected void doExecute() {
							changePropertyValue();
						}
					});
    }
};

protected void changePropertyValue(){
	String newValue = nameWidget.getText();
			if( ! newValue.equals(bc.getName() ) ) { 
				    	bc.setName(newValue);
			}
}
    
}	
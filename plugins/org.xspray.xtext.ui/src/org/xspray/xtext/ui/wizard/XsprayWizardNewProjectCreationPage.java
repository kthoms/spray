package org.xspray.xtext.ui.wizard;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.xspray.xtext.ui.internal.XsprayActivator;

public class XsprayWizardNewProjectCreationPage extends WizardNewProjectCreationPage {
    // constants; same as in super class
    private static final int SIZING_TEXT_FIELD_WIDTH = 250;
    
    // widgets
    Text diagramTypeNameField;
    
	public XsprayWizardNewProjectCreationPage(String pageName) {
		super(pageName);
	}
	
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);

		createXsprayGroup (parent);
	}

	private void createXsprayGroup(Composite parent) {
        // project specification group
        Composite group = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        group.setLayout(layout);
        group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        // new project label
        Label dialogTypeLabel = new Label(group, SWT.NONE);
        dialogTypeLabel.setText("Dialog type name");
        dialogTypeLabel.setFont(parent.getFont());
        
        // new project name entry field
        diagramTypeNameField = new Text(group, SWT.BORDER);
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        data.widthHint = SIZING_TEXT_FIELD_WIDTH;
        diagramTypeNameField.setLayoutData(data);
        diagramTypeNameField.setFont(parent.getFont());
        
	}
	
    /**
     * Returns the value of the diagram type field
     * with leading and trailing spaces removed.
     * 
     * @return the project name in the field
     */
    private String getProjectNameFieldValue() {
        if (diagramTypeNameField == null) {
			return ""; //$NON-NLS-1$
		}

        return diagramTypeNameField.getText().trim();
    }
    
    @Override
    public Image getImage() {
    	ILabelProvider labelProvider = XsprayActivator.getInstance().getInjector("org.xspray.xtext.Xspray").getInstance(ILabelProvider.class);
    	return labelProvider.getImage("xspray-logo-large.png");
    	// return XsprayActivator.getInstance().getImageRegistry().getDescriptor("xspray-logo-large.png").createImage();
//    	return super.getImage();
    }
    
    
}

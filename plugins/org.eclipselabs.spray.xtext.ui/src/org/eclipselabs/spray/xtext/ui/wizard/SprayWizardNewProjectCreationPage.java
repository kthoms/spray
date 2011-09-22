package org.eclipselabs.spray.xtext.ui.wizard;

import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipselabs.spray.xtext.ui.internal.SprayActivator;

public class SprayWizardNewProjectCreationPage extends WizardNewProjectCreationPage {
    // constants; same as in super class
    private static final int SIZING_TEXT_FIELD_WIDTH = 250;

    // widgets
    Text                     diagramTypeNameField;

    public SprayWizardNewProjectCreationPage(String pageName) {
        super(pageName);
    }

    @Override
    public void createControl(Composite parent) {
        super.createControl(parent);

        createSprayGroup(parent);
    }

    private void createSprayGroup(Composite parent) {
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
        URL url = null;
        url = SprayActivator.getInstance().getBundle().getEntry("/icons/Spray-Logo-Project-Wizard.png");
        ImageDescriptor imgDesc = ImageDescriptor.createFromURL(url);
        Image img = imgDesc.createImage(true);
        return img;
    }
}

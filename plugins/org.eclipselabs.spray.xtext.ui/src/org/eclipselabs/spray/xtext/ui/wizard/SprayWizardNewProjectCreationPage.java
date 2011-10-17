package org.eclipselabs.spray.xtext.ui.wizard;

import java.net.URL;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipselabs.spray.xtext.ui.internal.SprayActivator;

public class SprayWizardNewProjectCreationPage extends WizardNewProjectCreationPage {
    private DataBindingContext  m_bindingContext;
    // constants; same as in super class
    private static final int    SIZING_TEXT_FIELD_WIDTH = 250;

    // widgets
    Text                        diagramTypeNameField;
    Text                        projectNameField;
    MetamodelSelectionComposite metamodelSelectionComposite;

    private SprayProjectInfo    projectInfo;

    public SprayWizardNewProjectCreationPage(String pageName) {
        super(pageName);
        setImageDescriptor(ResourceManager.getPluginImageDescriptor("org.eclipselabs.spray.xtext.ui", "icons/Spray-Logo-Project-Wizard.png"));
    }

    @Override
    public void createControl(Composite parent) {
        //        Composite c = new Composite(parent, SWT.NULL);
        //        c.setLayout(new GridLayout());
        super.createControl(parent);

        Composite clientComposite = parent.getChildren().length > 0 ? (Composite) parent.getChildren()[parent.getChildren().length - 1] : parent;
        //        if (clientComposite == null)
        //        clientComposite = parent;
        projectNameField = getProjectNameField(clientComposite);

        createSprayGroup(clientComposite);
        metamodelSelectionComposite = new MetamodelSelectionComposite(clientComposite, SWT.NONE, getProjectInfo());
        SprayActivator.getInstance().getInjector("org.eclipselabs.spray.xtext.Spray").injectMembers(metamodelSelectionComposite);
        //        Composite verticalFiller = new Composite(clientComposite, SWT.NULL);
        //        GridData gd_verticalFiller = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
        //        gd_verticalFiller.heightHint = 140;
        //        verticalFiller.setLayoutData(gd_verticalFiller);
        setDeriveDiagramTypeFromProjectName(true);
        m_bindingContext = initDataBindings();

    }

    private void createSprayGroup(Composite parent) {
        // project specification group
        Composite group = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        group.setLayout(layout);
        group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        final Button btnTakeLastSegment = new Button(group, SWT.CHECK);
        btnTakeLastSegment.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
        btnTakeLastSegment.setSelection(true);
        btnTakeLastSegment.setText("Take last segment from project name");

        Label lblDiagramName = new Label(group, SWT.NONE);
        lblDiagramName.setText("Diagram type name:");

        // new project name entry field
        diagramTypeNameField = new Text(group, SWT.BORDER);
        diagramTypeNameField.setEnabled(false);
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        data.grabExcessHorizontalSpace = false;
        data.widthHint = 100;
        diagramTypeNameField.setLayoutData(data);
        diagramTypeNameField.setFont(parent.getFont());

        btnTakeLastSegment.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                setDeriveDiagramTypeFromProjectName(btnTakeLastSegment.getSelection());
            }
        });
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

    public SprayProjectInfo getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(SprayProjectInfo projectInfo) {
        this.projectInfo = projectInfo;
    }

    private Text getProjectNameField(Composite parent) {
        Composite c = parent;
        while (c.getChildren().length > 0 && c.getChildren()[0] instanceof Composite) {
            c = (Composite) c.getChildren()[0];
        }
        Text projectNameField = (Text) c.getChildren()[1];
        return projectNameField;
    }

    final ModifyListener modifyListener = new ModifyListener() {
                                            @Override
                                            public void modifyText(ModifyEvent e) {
                                                String lastSegment = getProjectName().indexOf('.') > 0 ? getProjectName().substring(getProjectName().lastIndexOf('.') + 1) : getProjectName();
                                                diagramTypeNameField.setText(lastSegment);
                                            }
                                        };

    protected void setDeriveDiagramTypeFromProjectName(boolean derive) {
        if (projectNameField == null || diagramTypeNameField == null)
            return;
        if (derive) {
            String lastSegment = getProjectName().indexOf('.') > 0 ? getProjectName().substring(getProjectName().lastIndexOf('.') + 1) : getProjectName();
            diagramTypeNameField.setEnabled(false);
            diagramTypeNameField.setText(lastSegment);
            projectNameField.addModifyListener(modifyListener);
        } else {
            diagramTypeNameField.setEnabled(true);
            projectNameField.removeModifyListener(modifyListener);
        }
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue diagramTypeNameFieldObserveTextObserveWidget = SWTObservables.observeText(diagramTypeNameField, SWT.Modify);
        IObservableValue projectInfoDiagramTypeNameObserveValue = PojoObservables.observeValue(projectInfo, "diagramTypeName");
        bindingContext.bindValue(diagramTypeNameFieldObserveTextObserveWidget, projectInfoDiagramTypeNameObserveValue, null, null);
        //
        return bindingContext;
    }
}

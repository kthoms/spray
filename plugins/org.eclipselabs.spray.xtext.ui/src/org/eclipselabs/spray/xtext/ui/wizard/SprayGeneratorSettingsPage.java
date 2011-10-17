package org.eclipselabs.spray.xtext.ui.wizard;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;

public class SprayGeneratorSettingsPage extends WizardPage {
    private DataBindingContext m_bindingContext;
    private Text               textBasePackage;
    private Text               txtDiagramPackage;
    private Text               txtFeaturesPackage;
    private Text               txtPropertyPackage;
    private Text               txtSrc;
    private Text               txtSrcgen;
    private Text               txtModel;

    private SprayProjectInfo   projectInfo;
    private Label              lblJavaMainSrcDir;
    private Label              lblJavaGeneratedSources;
    private Label              lblSprayModelFolder;
    private Label              lblNewLabel_1;
    private Label              lblNewLabel;
    private Label              lblFeaturePackage;
    private Button             btnCheckDefaultNaming;
    private Label              lblResourceFoldermanual;
    private Text               txtResources;
    private Label              lblResourceFoldergenerated;
    private Text               txtResourceGen;
    private Button             btnGenerateTimestamp;

    /**
     * Create the wizard.
     */
    public SprayGeneratorSettingsPage() {
        super("wizardPage");
        setImageDescriptor(ResourceManager.getPluginImageDescriptor("org.eclipselabs.spray.xtext.ui", "icons/Spray-Logo-Project-Wizard.png"));
        setTitle("Spray Project");
        setDescription("Specify settings for the Spray generator");
    }

    /**
     * Create contents of the wizard.
     * 
     * @param parent
     */
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);

        setControl(container);
        container.setLayout(new GridLayout(1, false));

        Group grpProjectStructure = new Group(container, SWT.NONE);
        GridData gd_grpProjectStructure = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
        gd_grpProjectStructure.widthHint = 583;
        grpProjectStructure.setLayoutData(gd_grpProjectStructure);
        grpProjectStructure.setText("Project structure");
        grpProjectStructure.setLayout(new GridLayout(2, false));

        final Button btnCheckDefaultStructure = new Button(grpProjectStructure, SWT.CHECK);
        btnCheckDefaultStructure.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                setProjectStructure(btnCheckDefaultStructure.getSelection());
            }
        });
        btnCheckDefaultStructure.setSelection(true);
        btnCheckDefaultStructure.setText("Use default structure");
        new Label(grpProjectStructure, SWT.NONE);

        lblSprayModelFolder = new Label(grpProjectStructure, SWT.NONE);
        lblSprayModelFolder.setText("Spray model folder");

        txtModel = new Text(grpProjectStructure, SWT.BORDER);
        txtModel.setEnabled(false);
        txtModel.setText("model");
        txtModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        lblJavaMainSrcDir = new Label(grpProjectStructure, SWT.NONE);
        lblJavaMainSrcDir.setText("Java source folder (manual)");

        txtSrc = new Text(grpProjectStructure, SWT.BORDER);
        txtSrc.setEnabled(false);
        txtSrc.setText("src");
        txtSrc.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        lblJavaGeneratedSources = new Label(grpProjectStructure, SWT.NONE);
        lblJavaGeneratedSources.setText("Java source folder (generated)");

        txtSrcgen = new Text(grpProjectStructure, SWT.BORDER);
        txtSrcgen.setEnabled(false);
        txtSrcgen.setText("src-gen");
        txtSrcgen.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        lblResourceFoldermanual = new Label(grpProjectStructure, SWT.NONE);
        lblResourceFoldermanual.setText("Resource folder (manual)");

        txtResources = new Text(grpProjectStructure, SWT.BORDER);
        txtResources.setEnabled(false);
        txtResources.setText("resource");
        txtResources.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        lblResourceFoldergenerated = new Label(grpProjectStructure, SWT.NONE);
        lblResourceFoldergenerated.setText("Resource folder (generated)");

        txtResourceGen = new Text(grpProjectStructure, SWT.BORDER);
        txtResourceGen.setEnabled(false);
        txtResourceGen.setText("resource-gen");
        txtResourceGen.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Group grpPackageNames = new Group(container, SWT.NONE);
        grpPackageNames.setText("Package names");
        grpPackageNames.setLayout(new GridLayout(2, false));
        GridData gd_grpPackageNames = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
        gd_grpPackageNames.widthHint = 582;
        grpPackageNames.setLayoutData(gd_grpPackageNames);

        btnCheckDefaultNaming = new Button(grpPackageNames, SWT.CHECK);
        btnCheckDefaultNaming.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                setNamingScheme(btnCheckDefaultNaming.getSelection());
            }
        });
        btnCheckDefaultNaming.setSelection(true);
        btnCheckDefaultNaming.setText("Use default naming");
        new Label(grpPackageNames, SWT.NONE);

        lblNewLabel_1 = new Label(grpPackageNames, SWT.NONE);
        lblNewLabel_1.setText("Base backage");

        textBasePackage = new Text(grpPackageNames, SWT.BORDER);
        textBasePackage.setEnabled(false);
        textBasePackage.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        lblNewLabel = new Label(grpPackageNames, SWT.NONE);
        lblNewLabel.setToolTipText("Diagram Type Provider, Feature Provider, Tool Behavior Provider, Image Provider");
        lblNewLabel.setText("Diagram package");

        txtDiagramPackage = new Text(grpPackageNames, SWT.BORDER);
        txtDiagramPackage.setEnabled(false);
        txtDiagramPackage.setText("diagram");
        txtDiagramPackage.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        lblFeaturePackage = new Label(grpPackageNames, SWT.NONE);
        lblFeaturePackage.setText("Feature package");

        txtFeaturesPackage = new Text(grpPackageNames, SWT.BORDER);
        txtFeaturesPackage.setEnabled(false);
        txtFeaturesPackage.setText("features");
        txtFeaturesPackage.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Label lblNewLabel_2 = new Label(grpPackageNames, SWT.NONE);
        lblNewLabel_2.setText("Property package");

        txtPropertyPackage = new Text(grpPackageNames, SWT.BORDER);
        txtPropertyPackage.setEnabled(false);
        txtPropertyPackage.setText("property");
        txtPropertyPackage.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        btnGenerateTimestamp = new Button(container, SWT.CHECK);
        btnGenerateTimestamp.setToolTipText("If checked a timestamp will be generated into the generated sources");
        btnGenerateTimestamp.setSelection(true);
        btnGenerateTimestamp.setText("Generate timestamp");
        m_bindingContext = initDataBindings();

        setNamingScheme(true);
        setProjectStructure(true);
    }

    protected void setNamingScheme(boolean useDefault) {
        textBasePackage.setEnabled(!useDefault);
        txtDiagramPackage.setEnabled(!useDefault);
        txtFeaturesPackage.setEnabled(!useDefault);
        txtPropertyPackage.setEnabled(!useDefault);

        if (useDefault) {
            if (projectInfo.getProjectName().endsWith("." + projectInfo.getDiagramTypeName())) {
                textBasePackage.setText(projectInfo.getProjectName().toLowerCase());
            } else {
                textBasePackage.setText(projectInfo.getProjectName().toLowerCase() + "." + projectInfo.getDiagramTypeName().toLowerCase());
            }
            txtDiagramPackage.setText("diagram");
            txtFeaturesPackage.setText("features");
            txtPropertyPackage.setText("property");
        }
    }

    protected void setProjectStructure(boolean useDefault) {
        txtSrc.setEnabled(!useDefault);
        txtSrcgen.setEnabled(!useDefault);
        txtModel.setEnabled(!useDefault);
        txtResources.setEnabled(!useDefault);
        txtResourceGen.setEnabled(!useDefault);
        if (useDefault) {
            txtSrc.setText("src");
            txtSrcgen.setText("src-gen");
            txtModel.setText("model");
            txtResources.setText("resource");
            txtResourceGen.setText("resource-gen");
        }
    }

    public SprayProjectInfo getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(SprayProjectInfo projectInfo) {
        this.projectInfo = projectInfo;
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue txtSrcObserveTextObserveWidget = SWTObservables.observeText(txtSrc, SWT.Modify);
        IObservableValue projectInfoJavaMainSrcDirObserveValue = PojoObservables.observeValue(projectInfo, "javaMainSrcDir");
        bindingContext.bindValue(txtSrcObserveTextObserveWidget, projectInfoJavaMainSrcDirObserveValue, null, null);
        //
        IObservableValue txtSrcgenObserveTextObserveWidget = SWTObservables.observeText(txtSrcgen, SWT.Modify);
        IObservableValue projectInfoJavaGenSrcDirObserveValue = PojoObservables.observeValue(projectInfo, "javaGenSrcDir");
        bindingContext.bindValue(txtSrcgenObserveTextObserveWidget, projectInfoJavaGenSrcDirObserveValue, null, null);
        //
        IObservableValue txtModelObserveTextObserveWidget = SWTObservables.observeText(txtModel, SWT.Modify);
        IObservableValue projectInfoSprayModelDirObserveValue = PojoObservables.observeValue(projectInfo, "sprayModelDir");
        bindingContext.bindValue(txtModelObserveTextObserveWidget, projectInfoSprayModelDirObserveValue, null, null);
        //
        IObservableValue textBasePackageObserveTextObserveWidget = SWTObservables.observeText(textBasePackage, SWT.Modify);
        IObservableValue projectInfoBasePackageObserveValue = PojoObservables.observeValue(projectInfo, "basePackage");
        bindingContext.bindValue(textBasePackageObserveTextObserveWidget, projectInfoBasePackageObserveValue, null, null);
        //
        IObservableValue txtDiagramPackageObserveTextObserveWidget = SWTObservables.observeText(txtDiagramPackage, SWT.Modify);
        IObservableValue projectInfoDiagramPackageObserveValue = PojoObservables.observeValue(projectInfo, "diagramPackage");
        bindingContext.bindValue(txtDiagramPackageObserveTextObserveWidget, projectInfoDiagramPackageObserveValue, null, null);
        //
        IObservableValue txtFeaturesPackageObserveTextObserveWidget = SWTObservables.observeText(txtFeaturesPackage, SWT.Modify);
        IObservableValue projectInfoFeaturePackageObserveValue = PojoObservables.observeValue(projectInfo, "featurePackage");
        bindingContext.bindValue(txtFeaturesPackageObserveTextObserveWidget, projectInfoFeaturePackageObserveValue, null, null);
        //
        IObservableValue txtPropertyPackageObserveTextObserveWidget = SWTObservables.observeText(txtPropertyPackage, SWT.Modify);
        IObservableValue projectInfoPropertyPackageObserveValue = PojoObservables.observeValue(projectInfo, "propertyPackage");
        bindingContext.bindValue(txtPropertyPackageObserveTextObserveWidget, projectInfoPropertyPackageObserveValue, null, null);
        //
        IObservableValue txtResourcesObserveTextObserveWidget = SWTObservables.observeText(txtResources, SWT.Modify);
        IObservableValue projectInfoResourceManDirObserveValue = PojoObservables.observeValue(projectInfo, "resourceManDir");
        bindingContext.bindValue(txtResourcesObserveTextObserveWidget, projectInfoResourceManDirObserveValue, null, null);
        //
        IObservableValue txtResourceGenObserveTextObserveWidget = SWTObservables.observeText(txtResourceGen, SWT.Modify);
        IObservableValue projectInfoResourceGenDirObserveValue = PojoObservables.observeValue(projectInfo, "resourceGenDir");
        bindingContext.bindValue(txtResourceGenObserveTextObserveWidget, projectInfoResourceGenDirObserveValue, null, null);
        //
        IObservableValue btnGenerateTimestampObserveSelectionObserveWidget = SWTObservables.observeSelection(btnGenerateTimestamp);
        IObservableValue projectInfoCreateTimestampObserveValue = PojoObservables.observeValue(projectInfo, "createTimestamp");
        bindingContext.bindValue(btnGenerateTimestampObserveSelectionObserveWidget, projectInfoCreateTimestampObserveValue, null, null);
        //
        return bindingContext;
    }
}

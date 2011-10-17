package org.eclipselabs.spray.xtext.ui.wizard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.presentation.EcoreActionBarContributor.ExtendedLoadResourceAction.RegisteredPackageDialog;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipselabs.spray.xtext.util.GenModelHelper;

import com.google.inject.Inject;

public class MetamodelSelectionComposite extends Composite {
    private DataBindingContext m_bindingContext;
    private Text               txtUri;
    private Text               txtGenmodelUri;
    private SprayProjectInfo   projectInfo;
    @Inject
    private GenModelHelper     genmodelHelper;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public MetamodelSelectionComposite(Composite parent, int style, SprayProjectInfo projectInfo) {
        super(parent, style);
        this.projectInfo = projectInfo;
        FillLayout fillLayout = new FillLayout(SWT.HORIZONTAL);
        setLayout(fillLayout);

        Group grpMetamodel = new Group(this, SWT.NONE);
        grpMetamodel.setText("Metamodel");
        grpMetamodel.setLayout(new GridLayout(2, false));

        Label lblEpackage = new Label(grpMetamodel, SWT.NONE);
        lblEpackage.setText("EPackage URI");

        txtUri = new Text(grpMetamodel, SWT.BORDER);
        txtUri.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Composite composite = new Composite(grpMetamodel, SWT.NONE);
        composite.setLayout(new RowLayout(SWT.HORIZONTAL));
        composite.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));

        Button btnNewButton = new Button(composite, SWT.NONE);
        btnNewButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                Shell shell = new Shell(Display.getDefault());
                RegisteredPackageDialog registeredPackageDialog = new RegisteredPackageDialog(shell);
                registeredPackageDialog.setMultipleSelection(false);
                registeredPackageDialog.open();
                Object[] result = registeredPackageDialog.getResult();
                if (result != null) {
                    List<?> nsURIs = Arrays.asList(result);
                    setNsURIs(nsURIs, txtUri, registeredPackageDialog.isDevelopmentTimeVersion(), false);
                }
            }
        });
        btnNewButton.setText("Browse Registered Packages...");

        Button btnBrowseFileSystem = new Button(composite, SWT.NONE);
        btnBrowseFileSystem.setEnabled(false);
        btnBrowseFileSystem.setText("Browse File System...");

        Button btnBrowseWorkspace = new Button(composite, SWT.NONE);
        btnBrowseWorkspace.setEnabled(false);
        btnBrowseWorkspace.setText("Browse Workspace...");

        Label lblGenmodelUri = new Label(grpMetamodel, SWT.NONE);
        lblGenmodelUri.setText("GenModel URI");

        txtGenmodelUri = new Text(grpMetamodel, SWT.BORDER);
        txtGenmodelUri.setEnabled(false);
        txtGenmodelUri.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Composite composite_1 = new Composite(grpMetamodel, SWT.NONE);
        composite_1.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
        composite_1.setLayout(new RowLayout(SWT.HORIZONTAL));

        Button btnBrowseRegisteredGenmodels = new Button(composite_1, SWT.NONE);
        btnBrowseRegisteredGenmodels.setEnabled(false);
        btnBrowseRegisteredGenmodels.setText("Browse Registered GenModels...");

        Button btnBrowseFileSystem_1 = new Button(composite_1, SWT.NONE);
        btnBrowseFileSystem_1.setEnabled(false);
        btnBrowseFileSystem_1.setText("Browse File System...");

        Button btnBrowseWorkspace_1 = new Button(composite_1, SWT.NONE);
        btnBrowseWorkspace_1.setEnabled(false);
        btnBrowseWorkspace_1.setText("Browse Workspace...");
        new Label(grpMetamodel, SWT.NONE);
        new Label(grpMetamodel, SWT.NONE);

        // Hide unsupported functions for now...
        composite_1.setVisible(false);
        btnBrowseFileSystem.setVisible(false);
        btnBrowseWorkspace.setVisible(false);

        m_bindingContext = initDataBindings();

        txtUri.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                URI ePackageUri = URI.createURI(txtUri.getText());
                ResourceSetImpl rs = new ResourceSetImpl();
                try {
                    Resource r = rs.getResource(ePackageUri, true);
                    EPackage pck = (EPackage) r.getContents().get(0);
                    URI genModelUri = EcorePlugin.getEPackageNsURIToGenModelLocationMap().get(pck.getNsURI());
                    if (genModelUri != null) {
                        txtGenmodelUri.setText(genModelUri.toString());
                    } else {
                        txtGenmodelUri.setText("");
                    }
                } catch (Exception ex) {
                    txtGenmodelUri.setText("");
                }
            }
        });
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

    protected void setNsURIs(List<?> nsURIs, Text uriField, boolean isDevelopmentTimeVersion, boolean append) {
        if (isDevelopmentTimeVersion) {
            ResourceSet resourceSet = new ResourceSetImpl();
            resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());
            StringBuffer uris = new StringBuffer();
            Map<String, URI> ePackageNsURItoGenModelLocationMap = EcorePlugin.getEPackageNsURIToGenModelLocationMap();
            for (int i = 0, length = nsURIs.size(); i < length; i++) {
                URI location = ePackageNsURItoGenModelLocationMap.get(nsURIs.get(i));
                Resource resource = resourceSet.getResource(location, true);
                EcoreUtil.resolveAll(resource);
            }
            for (Resource resource : resourceSet.getResources()) {
                for (EPackage ePackage : getAllPackages(resource)) {
                    if (nsURIs.contains(ePackage.getNsURI())) {
                        uris.append(resource.getURI());
                        uris.append("  ");
                        break;
                    }
                }
            }
            if (append) {
                uriField.setText(uriField.getText() + ", " + uris.toString().trim());
            } else {
                uriField.setText(uris.toString().trim());

            }
        } else {
            StringBuffer uris = new StringBuffer();
            for (int i = 0, length = nsURIs.size(); i < length; i++) {
                uris.append(nsURIs.get(i));
                uris.append("  ");
            }
            if (append) {
                uriField.setText(uriField.getText() + ", " + uris.toString().trim());
            } else {
                uriField.setText(uris.toString().trim());
            }
        }
    }

    protected Collection<EPackage> getAllPackages(Resource resource) {
        List<EPackage> result = new ArrayList<EPackage>();
        for (TreeIterator<?> j = new EcoreUtil.ContentTreeIterator<Object>(resource.getContents()) {
            private static final long serialVersionUID = 1L;

            @Override
            protected Iterator<? extends EObject> getEObjectChildren(EObject eObject) {
                return eObject instanceof EPackage ? ((EPackage) eObject).getESubpackages().iterator() : Collections.<EObject> emptyList().iterator();
            }
        }; j.hasNext();) {
            Object content = j.next();
            if (content instanceof EPackage) {
                result.add((EPackage) content);
            }
        }
        return result;
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
        IObservableValue txtUriObserveTextObserveWidget = SWTObservables.observeText(txtUri, SWT.Modify);
        IObservableValue projectInfoEpackageURIObserveValue = PojoObservables.observeValue(projectInfo, "epackageURI");
        bindingContext.bindValue(txtUriObserveTextObserveWidget, projectInfoEpackageURIObserveValue, null, null);
        //
        IObservableValue txtGenmodelUriObserveTextObserveWidget = SWTObservables.observeText(txtGenmodelUri, SWT.Modify);
        IObservableValue projectInfoGenmodelURIObserveValue = PojoObservables.observeValue(projectInfo, "genmodelURI");
        bindingContext.bindValue(txtGenmodelUriObserveTextObserveWidget, projectInfoGenmodelURIObserveValue, null, null);
        //
        return bindingContext;
    }
}

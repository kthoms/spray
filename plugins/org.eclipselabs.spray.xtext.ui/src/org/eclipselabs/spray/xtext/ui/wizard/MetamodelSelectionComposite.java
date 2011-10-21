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
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
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
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
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
        setLayout(new GridLayout(1, false));

        Group grpMetamodel = new Group(this, SWT.NONE);
        GridData gd_grpMetamodel = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
        gd_grpMetamodel.widthHint = 600;
        grpMetamodel.setLayoutData(gd_grpMetamodel);
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
                Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
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

        Button btnBrowseWorkspace = new Button(composite, SWT.NONE);
        btnBrowseWorkspace.setText("Browse Workspace...");
        btnBrowseWorkspace.addSelectionListener(new BrowseResourceSelectionAdapter(txtUri, "ecore"));

        Label lblGenmodelUri = new Label(grpMetamodel, SWT.NONE);
        lblGenmodelUri.setText("GenModel URI");

        txtGenmodelUri = new Text(grpMetamodel, SWT.BORDER);
        txtGenmodelUri.setEnabled(true);
        txtGenmodelUri.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Composite composite_1 = new Composite(grpMetamodel, SWT.NONE);
        composite_1.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
        composite_1.setLayout(new RowLayout(SWT.HORIZONTAL));

        Button btnBrowseWorkspace_1 = new Button(composite_1, SWT.NONE);
        btnBrowseWorkspace_1.setText("Browse Workspace...");
        btnBrowseWorkspace_1.addSelectionListener(new BrowseResourceSelectionAdapter(txtGenmodelUri, "genmodel"));
        new Label(grpMetamodel, SWT.NONE);
        new Label(grpMetamodel, SWT.NONE);

        m_bindingContext = initDataBindings();

        txtUri.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                URI ePackageUri = URI.createURI(txtUri.getText());
                if (ePackageUri.isPlatformPlugin()) {
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
                } else {
                    // platform resource; clear genmodel
                    if (txtGenmodelUri.getText().length() > 0 && URI.createURI(txtGenmodelUri.getText()).isPlatformPlugin()) {
                        txtGenmodelUri.setText("");
                    }
                    if (ePackageUri.isPlatformResource()) {
                        // try to find a sibling genmodel
                        IPath path = new Path(ePackageUri.toString().replace("platform:/resource", "")).removeFileExtension().addFileExtension("genmodel");
                        if (ResourcesPlugin.getWorkspace().getRoot().findMember(path) != null) {
                            txtGenmodelUri.setText(URI.createPlatformResourceURI(path.toString(), true).toString());
                        }
                    }
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

    class BrowseResourceSelectionAdapter extends SelectionAdapter {
        Text   targetTextField;
        String fileExtensionFilter;

        public BrowseResourceSelectionAdapter(Text targetTextField, String fileExtensionFilter) {
            this.targetTextField = targetTextField;
            this.fileExtensionFilter = fileExtensionFilter;
        }

        @Override
        public void widgetSelected(SelectionEvent e) {
            //                Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
            IFile file = null;

            ViewerFilter filter = new ViewerFilter() {
                @Override
                public boolean select(Viewer viewer, Object parentElement, Object element) {
                    if (element instanceof IResource) {
                        IResource resource = ((IResource) element);

                        try {
                            final IJavaProject jp = (resource.getProject().getNature("org.eclipse.jdt.core.javanature") != null) ? JavaCore.create(resource.getProject()) : null;
                            final boolean[] select = {false}; // we need a final variable, but the value inside can be modified
                            resource.accept(new IResourceVisitor() {
                                @Override
                                public boolean visit(IResource resource) throws CoreException {
                                    // filter the Java output folder
                                    if (resource instanceof IFolder) {
                                        if (jp != null && resource.getFullPath().equals(jp.getOutputLocation())) {
                                            return false;
                                        }
                                    }
                                    if (resource instanceof IFile) {
                                        if (resource.getFileExtension().equals(fileExtensionFilter)) {
                                            select[0] = true;
                                        }
                                    }
                                    return true;
                                }
                            });
                            return select[0];
                        } catch (CoreException e) {
                            ; // ignore
                        }
                    }
                    return true;
                }
            };
            IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), null, null, false, null, Collections.singletonList(filter));
            if (files.length != 0) {
                file = files[0];
            }
            if (file != null) {
                URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
                targetTextField.setText(uri.toString());
            }
        }
    }
}

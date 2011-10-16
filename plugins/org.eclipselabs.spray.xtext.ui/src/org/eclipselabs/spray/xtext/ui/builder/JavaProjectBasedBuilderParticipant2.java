package org.eclipselabs.spray.xtext.ui.builder;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.utils.GenModelHelper;
import org.eclipse.xtext.builder.JavaProjectBasedBuilderParticipant;

import com.google.inject.Inject;

public class JavaProjectBasedBuilderParticipant2 extends JavaProjectBasedBuilderParticipant {

    @Inject
    GenModelHelper genModelHelper;

    @Override
    public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
        registerGenModels();
        super.build(context, monitor);
    }

    private void registerGenModels() {
        for (Map.Entry<String, URI> entry : EcorePlugin.getEPackageNsURIToGenModelLocationMap().entrySet()) {
            if (entry.getKey().contains("Statemachine") || entry.getKey().contains("busmod")) {
                System.err.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        IWorkspace ws = ResourcesPlugin.getWorkspace();
        if (ws != null) {
            IWorkspaceRoot root = ws.getRoot();
            if (root != null) {
                try {
                    root.accept(new IResourceVisitor() {

                        @Override
                        public boolean visit(IResource resource) throws CoreException {
                            if (resource instanceof IFile) {
                                if (resource.getFileExtension().equals("genmodel") && !resource.getProjectRelativePath().toPortableString().contains("target")) {
                                    ResourceSet rs = new ResourceSetImpl();
                                    Resource emfResource = rs.createResource(URI.createPlatformPluginURI((resource.getFullPath().toPortableString()), true));
                                    try {
                                        emfResource.load(Collections.EMPTY_MAP);
                                        genModelHelper.registerGenModel(emfResource.getResourceSet(), emfResource.getURI());
                                        return true;
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            } else if (resource instanceof IContainer) {
                                for (IResource res : ((IContainer) resource).members()) {
                                    visit(res);
                                }
                            }

                            return false;
                        }
                    });
                } catch (CoreException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

}

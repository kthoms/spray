package org.eclipselabs.spray.xtext.ui.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.xtext.util.Modules2;
import org.eclipselabs.spray.generator.graphiti.GraphitiGeneratorModule;
import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;
import org.eclipselabs.spray.xtext.SprayRuntimeModule;
import org.osgi.framework.BundleContext;

import com.google.inject.Module;

public class SprayActivatorExt extends SprayActivator {
    @Override
    protected Module getRuntimeModule(String grammar) {
        // TODO: Get rid of direct dependencies to Graphiti, add Extension Point for additional modules
        return Modules2.mixin(super.getRuntimeModule(grammar), new SprayRuntimeModule(), new GraphitiRuntimeModule(), new GraphitiGeneratorModule());
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        ResourcesPlugin.getWorkspace().addResourceChangeListener(new SprayPropertiesChangeBuildInvoker());
    }

    /**
     * When a .properties file changes that is in the same folder with the same name as a .spray file,
     * trigger the XtextBuilder.
     */
    class SprayPropertiesChangeBuildInvoker implements IResourceChangeListener {
        @Override
        public void resourceChanged(IResourceChangeEvent event) {
            if (event.getType() == IResourceChangeEvent.POST_BUILD)
                return;

            try {
                event.getDelta().accept(new IResourceDeltaVisitor() {
                    boolean traverse = true;

                    @Override
                    public boolean visit(IResourceDelta delta) throws CoreException {
                        if (!traverse)
                            return false;

                        IFile file = delta.getResource() instanceof IFile ? (IFile) delta.getResource() : null;
                        if (file != null && file.exists() && file.getFileExtension().equals("properties")) {
                            IPath sprayPath = file.getFullPath().removeFileExtension().addFileExtension("spray");
                            IFile sprayFile = ResourcesPlugin.getWorkspace().getRoot().getFile(sprayPath);
                            if (sprayFile.exists()) {
                                traverse = false; // found it, do not traverse further
                                triggerBuild(sprayFile);
                            }
                            return false;
                        }
                        return true;
                    }
                });
            } catch (CoreException e) {
                getLog().log(new Status(IStatus.ERROR, getBundle().getSymbolicName(), e.getMessage(), e));
            }
        }

        private void triggerBuild(final IFile sprayFile) {
            new Job("Generating Spray Code") {
                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(sprayFile.getFullPath().segment(0));
                    try {
                        // TODO: Use constant for nature ID
                        if (project.hasNature("org.eclipse.xtext.ui.shared.xtextNature")) {
                            sprayFile.touch(new NullProgressMonitor()); // this triggers the Xtext Builder
                        }
                        return Status.OK_STATUS;
                    } catch (CoreException e) {
                        return new Status(IStatus.ERROR, getBundle().getSymbolicName(), e.getMessage(), e);
                    }
                }

            }.schedule();
        }
    }
}

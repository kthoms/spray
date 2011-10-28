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

/**
 * When a .properties file changes that is in the same folder with the same name as a .spray file,
 * trigger the XtextBuilder.
 */
class SprayResourceChangeBuildInvoker implements IResourceChangeListener {
    /**
     * 
     */
    private final SprayActivator sprayActivator;

    /**
     * @param sprayActivator
     */
    SprayResourceChangeBuildInvoker(SprayActivator sprayActivator) {
        this.sprayActivator = sprayActivator;
    }

    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        if (event.getType() == IResourceChangeEvent.POST_BUILD)
            return;

        if (event.getDelta() == null)
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
            this.sprayActivator.getLog().log(new Status(IStatus.ERROR, this.sprayActivator.getBundle().getSymbolicName(), e.getMessage(), e));
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
                    return new Status(IStatus.ERROR, SprayResourceChangeBuildInvoker.this.sprayActivator.getBundle().getSymbolicName(), e.getMessage(), e);
                }
            }

        }.schedule();
    }
}

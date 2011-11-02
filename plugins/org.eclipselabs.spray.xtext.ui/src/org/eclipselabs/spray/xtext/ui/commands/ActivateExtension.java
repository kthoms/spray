package org.eclipselabs.spray.xtext.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;

public class ActivateExtension extends AbstractHandler {
    private SprayJavaProjectUtil projectUtil = new SprayJavaProjectUtil();

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
        ICompilationUnit cu = (ICompilationUnit) selection.getFirstElement();
        IPackageFragmentRoot pfRoot = projectUtil.getPackageFragmentRoot(cu);
        if (projectUtil.isGeneratedExtensionFile(cu)) {
            IJavaProject project = pfRoot.getJavaProject();
            try {
                IPackageFragmentRoot srcFolder = projectUtil.getSrcManPackageFragmentRoot(project);
                IPath targetPath = srcFolder.getPath().append(cu.getPath().makeRelativeTo(pfRoot.getPath()));
                IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
                // assure intermediate packages exist
                for (int i = 2; i < targetPath.segmentCount() - 1; i++) {
                    if (!root.exists(targetPath.removeLastSegments(targetPath.segmentCount() - 1 - i))) {
                        root.getFolder(targetPath.removeLastSegments(targetPath.segmentCount() - 1 - i)).create(true, true, new NullProgressMonitor());
                    }
                }
                cu.getResource().move(targetPath, true, new NullProgressMonitor());
                root.findMember(targetPath).setDerived(false, new NullProgressMonitor());
                IFile targetFile = (IFile) root.findMember(targetPath);
                IEditorInput editorInput = new FileEditorInput(targetFile);
                IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                IWorkbenchPage page = window.getActivePage();
                page.openEditor(editorInput, "org.eclipse.jdt.ui.CompilationUnitEditor");
                //cu.move(srcFolder, null, null, false, new NullProgressMonitor());
            } catch (CoreException e) {
                throw new ExecutionException(e.getMessage(), e);
            }
        } else {

        }
        return null;
    }

    protected IFolder getSrcManFolder(final IProject builtProject) {
        // TODO: Respect spray properties
        return builtProject.getFolder("src");
    }

}

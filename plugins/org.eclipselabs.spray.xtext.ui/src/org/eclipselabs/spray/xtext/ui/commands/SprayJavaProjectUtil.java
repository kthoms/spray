package org.eclipselabs.spray.xtext.ui.commands;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;

public class SprayJavaProjectUtil {
    protected IPackageFragmentRoot getPackageFragmentRoot(IJavaElement elem) {
        if (elem == null) {
            return null;
        }
        if (elem instanceof IPackageFragmentRoot) {
            return (IPackageFragmentRoot) elem;
        }
        return getPackageFragmentRoot(elem.getParent());
    }

    /**
     * Returns <code>true</code> when the compilation unit is in the generated sources folder, does not end with the name "Base", but
     * has a sibling unit that has this name.
     */
    public boolean isGeneratedExtensionFile(ICompilationUnit cu) {
        IPackageFragmentRoot pfRoot = getPackageFragmentRoot(cu);
        if (pfRoot != null && pfRoot.getResource().equals(getSrcGenFolder(cu.getResource().getProject()))) {
            IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
            IPath baseClassPath = new Path(cu.getPath().removeFileExtension().toString() + "Base.java");
            if (root.findMember(baseClassPath) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean hasGeneratedBaseClass(ICompilationUnit cu) {
        IPackageFragmentRoot pfRoot = null;
        try {
            pfRoot = getSrcGenPackageFragmentRoot(cu.getJavaProject());
            if (pfRoot == null)
                return false;
        } catch (JavaModelException e) {
            return false;
        }

        // compute the relative path of this resource
        IPath relativePath = cu.getPath().makeRelativeTo(getPackageFragmentRoot(cu).getPath());
        IPath baseClassPath = new Path(pfRoot.getPath().append(relativePath.removeFileExtension()).toString() + "Base.java");
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        boolean baseClassExists = root.findMember(baseClassPath) != null;
        return baseClassExists;
    }

    public IFolder getSrcGenFolder(final IProject builtProject) {
        // TODO: Respect spray properties
        return builtProject.getFolder("src-gen");
    }

    public IPackageFragmentRoot getSrcManPackageFragmentRoot(IJavaProject project) throws JavaModelException {
        return getPackageFragmentRoot(project, "src");
    }

    public IPackageFragmentRoot getSrcGenPackageFragmentRoot(IJavaProject project) throws JavaModelException {
        return getPackageFragmentRoot(project, "src-gen");
    }

    protected IPackageFragmentRoot getPackageFragmentRoot(IJavaProject project, String name) throws JavaModelException {
        for (IPackageFragmentRoot pfr : project.getPackageFragmentRoots()) {
            if (pfr.getElementName().equals(name)) {
                return pfr;
            }
        }
        return null;
    }
}

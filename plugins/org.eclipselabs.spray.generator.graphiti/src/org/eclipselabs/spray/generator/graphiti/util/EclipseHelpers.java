/*******************************************************************************
 * Copied and adapted from www.mod4j.org.
 *******************************************************************************/
package org.eclipselabs.spray.generator.graphiti.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class EclipseHelpers {

    /**
     * Return a java.io.File correcponsing to a resource
     * 
     * @param resource
     *            The resource
     * @return
     */
    static public File toJavaFile(IResource resource) {
        if ((resource == null) || (!(resource instanceof IFile))) {
            return null;
        }
        IFile file = (IFile) resource;
        IPath p = file.getRawLocation();
        File f = p.toFile();
        return f;
    }

    /**
     * Get the full local pathname corresponding to a resource.
     * 
     * @param resource
     * @return
     */
    static public String resource2UriString(IResource resource) {
        // System.err.println(resource.getLocationURI().toString());
        return resource.getLocationURI().toString();
    }

    /**
     * Get the full local pathname corresponding to a resource.
     * 
     * @param resource
     * @return
     */
    static public String resource2FullPathnameString(IResource resource) {
        return resource.getLocation().toString();
    }

    static public void printResource(IResource file) {
        System.err.println("resource exists() [" + file.exists() + "]");
        System.err.println("resource getFullPath() [" + file.getFullPath() + "]");
        System.err.println("resource getLocation().toString [" + file.getLocation().toString() + "]");
        System.err.println("resource getLocationPortable() [" + file.getLocation().toPortableString() + "]");
        System.err.println("resource getLocationURI() [" + file.getLocationURI() + "]");
        System.err.println("resource getRawLocation() [" + file.getRawLocation() + "]");
        System.err.println("resource getRawLocationURI()[" + file.getRawLocationURI() + "]");
        System.err.println("resource getWorkspace()[" + file.getWorkspace() + "]");
        System.err.println("resource getProjectRelativePath()  [" + file.getProjectRelativePath() + "]");
        System.err.println("resource getProject() [" + file.getProject() + "]");
    }

    /**
     * return the Ipath for a resource named 'pathname'in bundle 'bundlename'.
     * 
     * @param bundlename
     * @param pathname
     *            path, relative to the bundle root.
     * @return
     */
    static public IPath getPath(String bundlename, String pathname) {
        String myPathname = null;
        // if (Platform.inDevelopmentMode() &&
        // (!bundlename.equals("org.mod4j.eclipse"))) {
        // myPathname = "src/main/oaw/" + pathname;
        // } else {
        // myPathname = pathname;
        // }
        myPathname = pathname;
        IPath result = null;
        try {
            URL installURL = Platform.getBundle(bundlename).getEntry("/" + myPathname);
            URL fromLocation = FileLocator.toFileURL(installURL);
            result = new Path(fromLocation.getPath());
        } catch (Exception e) {
            System.err.println("EclipseUtils.getPath [" + e.getMessage() + "]");
            e.printStackTrace(System.err);
            return null;
        }
        return result;
    }

    static public IFile getIFile(IPath path) {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot workspaceRoot = workspace.getRoot();
        return workspaceRoot.getFile(path);
    }

    static public URL getURL(String bundlename, String pathname) {
        String myPathname = null;
        // if (Platform.inDevelopmentMode() &&
        // (!bundlename.equals("org.mod4j.eclipse"))) {
        // myPathname = "src/main/oaw/" + pathname;
        // } else {
        myPathname = pathname;
        // }
        // System.err.println("EclipseUtil.getURL(" + bundlename + ", " +
        // myPathname + ")");
        IPath result = null;
        URL installURL = null;
        try {
            // System.err.println("dev mode : " + Platform.inDevelopmentMode());

            installURL = Platform.getBundle(bundlename).getEntry("/" + myPathname);
            // System.err.println("installURL [" + installURL.toString() + "]");

            URL fromLocation = FileLocator.toFileURL(installURL);
            // System.err.println("fromLocation [" + fromLocation.toString() +
            // "]");

            result = new Path(fromLocation.getPath());
        } catch (Exception e) {
            System.err.println("EclipseUtils.getPath [" + e.getMessage() + "]");
            e.printStackTrace(System.err);
            return null;
        }
        return installURL;
    }

    static public String getProjectName(EObject eObject) {
        IResource resource = toEclipseResource(eObject);
        return resource.getProject().getName();
    }

    static public File toJavaFile(Resource resource) {
        return toJavaFile(toEclipseResource(resource));
    }

    static public IResource toEclipseResource(Resource eResource) {
        IResource result = null;
        URI eUri = eResource.getURI();
        if (eUri.isPlatformResource()) {
            String platformString = eUri.toPlatformString(true);
            result = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
        }
        return result;
    }

    static public IResource toEclipseResource(EObject eObject) {
        IResource result = null;
        Resource eResource = eObject.eResource();
        URI eUri = eResource.getURI();
        if (eUri.isPlatformResource()) {
            String platformString = eUri.toPlatformString(true);
            result = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
        }
        return result;
    }

    static public Properties readProperties(IProject project, String relativePropertyFileName) {
        IResource propertiesResource = project.findMember(relativePropertyFileName);
        Properties properties = new Properties();
        File file = EclipseHelpers.toJavaFile(propertiesResource);
        if ((file == null) || !file.exists()) {
            return properties;
        }
        try {
            properties.load(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return properties;
    }

    static private boolean log = true;

    /**
     * Creates a directory in the specified project
     * 
     * @param project
     *            project to create the directory in
     * @param loc
     *            the path to create
     * @param monitor
     *            progress monitor
     * @throws CoreException
     */
    public static void createDirectoryTree(IProject project, IPath loc, IProgressMonitor monitor) throws CoreException {
        loc = loc.makeRelativeTo(project.getLocation());
        loc.removeFirstSegments(1);
        for (int i = 1; i < loc.segmentCount(); i++) {
            IFolder currentFolder = project.getFolder(loc.uptoSegment(i));
            if (!currentFolder.exists()) {
                currentFolder.create(true, true, monitor);
            }
        }
    }

}

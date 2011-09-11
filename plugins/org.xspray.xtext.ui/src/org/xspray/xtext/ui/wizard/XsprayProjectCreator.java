package org.xspray.xtext.ui.wizard;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.ui.wizard.AbstractPluginProjectCreator;
import org.xspray.xtext.ui.internal.XsprayActivator;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class XsprayProjectCreator extends AbstractPluginProjectCreator {

	protected static final String DSL_GENERATOR_PROJECT_NAME = "org.xspray.generator.graphiti";

	protected static final String SRC_ROOT = "src";
	protected static final String SRC_GEN_ROOT = "src-gen";
	protected final List<String> SRC_FOLDER_LIST = ImmutableList.of(SRC_ROOT, SRC_GEN_ROOT);
	protected final String rootpath = "/resources/newProjectFiles";
	
	@Override
	protected XsprayProjectInfo getProjectInfo() {
		return (XsprayProjectInfo) super.getProjectInfo();
	}
	
	protected String getModelFolderName() {
		return SRC_ROOT;
	}
	
	@Override
	protected List<String> getAllFolders() {
        return SRC_FOLDER_LIST;
    }

    @Override
	protected List<String> getRequiredBundles() {
		List<String> result = Lists.newArrayList(super.getRequiredBundles());
		result.add(DSL_GENERATOR_PROJECT_NAME);
		return result;
	}

	protected void enhanceProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
		// ResourcesPlugin.getWorkspace().getRoot().findMember(new Path());

		IFolder modelFolder = project.getFolder("model");
		modelFolder.create(true, true, monitor);
		IJavaProject javaProject = JavaCore.create(project);
		createRootFiles(project, monitor);
		IClasspathEntry cpEntry = JavaCore.newSourceEntry(project.getFullPath().append("/model"));
		List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
		for (IClasspathEntry cp : javaProject.getRawClasspath()) {
			entries.add(cp);
		}
		// insert after /src and /src-gen, but before JRE
		entries.add(2, cpEntry);
		javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[0]), monitor);
		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	protected void createRootFiles (final IProject project, final IProgressMonitor monitor) throws CoreException {
		copyRootFiles(project, monitor, rootpath);
		generateFiles(project, monitor);
	}
	
	protected void copyRootFiles (final IProject project, final IProgressMonitor monitor, String basepath) throws CoreException {
		Enumeration<String> entries = XsprayActivator.getInstance().getBundle().getEntryPaths(basepath);
		while (entries.hasMoreElements()) {
			String entry = entries.nextElement();
			
			URL url = XsprayActivator.getInstance().getBundle().getResource(entry);
			String targetPath = entry.substring(rootpath.length());
			if (entry.endsWith("/")) {
				IFolder folder = project.getFolder(targetPath);
				if (!folder.exists()) {
					folder.create(true, true, monitor);
				}
				copyRootFiles(project, monitor, entry);
			} else {
				try {
					IFile targetFile = project.getFile(targetPath);
					if (targetFile.exists())
						targetFile.delete(true, monitor);
					targetFile.create(url.openStream(), true, monitor);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	protected void generateFiles (final IProject project, final IProgressMonitor monitor) throws CoreException {
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, getEncoding(), null, true, project.getLocation().makeAbsolute().toOSString()));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
		execCtx.getResourceManager().setFileEncoding("UTF-8");
		execCtx.registerMetaModel(new JavaBeansMetaModel());

		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate("org::xspray::xtext::ui::wizard::XsprayNewProject::main", getProjectInfo());
	}
	
	@Override
	protected IFile getModelFile(IProject project) throws CoreException {
		return project.getFile("subfolder/sample.xspray");
	}
}
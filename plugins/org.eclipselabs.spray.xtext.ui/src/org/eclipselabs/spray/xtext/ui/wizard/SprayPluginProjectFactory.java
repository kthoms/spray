package org.eclipselabs.spray.xtext.ui.wizard;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.xtext.ui.util.PluginProjectFactory;

public class SprayPluginProjectFactory extends PluginProjectFactory {
    /**
     * Changes:
     * - add .qualifier to version
     */
    @Override
    protected void createManifest(IProject project, IProgressMonitor progressMonitor) throws CoreException {
        final StringBuilder content = new StringBuilder("Manifest-Version: 1.0\n");
        content.append("Bundle-ManifestVersion: 2\n");
        content.append("Bundle-Name: " + projectName + "\n");
        content.append("Bundle-Vendor: My Company\n");
        content.append("Bundle-Version: 1.0.0.qualifier\n");
        content.append("Bundle-SymbolicName: " + projectName + "; singleton:=true\n");
        if (null != activatorClassName) {
            content.append("Bundle-Activator: " + activatorClassName + "\n");
        }
        content.append("Bundle-ActivationPolicy: lazy\n");

        addToContent(content, requiredBundles, "Require-Bundle");
        addToContent(content, exportedPackages, "Export-Package");
        addToContent(content, importedPackages, "Import-Package");

        content.append("Bundle-RequiredExecutionEnvironment: J2SE-1.5\n");

        final IFolder metaInf = project.getFolder("META-INF");
        SubMonitor subMonitor = SubMonitor.convert(progressMonitor, 2);
        try {
            if (metaInf.exists())
                metaInf.delete(false, progressMonitor);
            metaInf.create(false, true, subMonitor.newChild(1));
            createFile("MANIFEST.MF", metaInf, content.toString(), subMonitor.newChild(1));
        } finally {
            subMonitor.done();
        }
    }

}

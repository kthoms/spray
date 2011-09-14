package org.eclipselabs.spray.xtext.ui.wizard.codegen

import org.eclipselabs.spray.xtext.ui.wizard.XsprayProjectInfo
import org.eclipse.xtext.generator.IFileSystemAccess

class ActivatorGenerator {
	def doGenerate (XsprayProjectInfo info, IFileSystemAccess fsa) {
		val project = info.projectName
		val fileName = "src/" + info.basePath + "/Activator.java"
		fsa.generateFile(fileName, info.projectName, generateActivator(info))
	}
	
	def generateActivator (XsprayProjectInfo info) '''
		package «info.basePackage»;
		
		import org.eclipse.ui.plugin.AbstractUIPlugin;
		import org.osgi.framework.BundleContext;
		
		/**
		 * The activator class controls the plug-in life cycle
		 */
		public class Activator extends AbstractUIPlugin {
		
		    // The plug-in ID
		    public static final String PLUGIN_ID = "«info.projectName»"; //$NON-NLS-1$
		
		    // The shared instance
		    private static Activator plugin;
		
		    /**
		     * The constructor
		     */
		    public Activator() {
		    }
		
		    /*
		     * (non-Javadoc)
		     * 
		     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
		     */
		    public void start(BundleContext context) throws Exception {
		        super.start(context);
		        plugin = this;
		    }
		
		    /*
		     * (non-Javadoc)
		     * 
		     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
		     */
		    public void stop(BundleContext context) throws Exception {
		        plugin = null;
		        super.stop(context);
		    }
		
		    /**
		     * Returns the shared instance
		     * 
		     * @return the shared instance
		     */
		    public static Activator getDefault() {
		        return plugin;
		    }
		
		}	
			
	'''
}
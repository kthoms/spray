package org.eclipselabs.spray.xtext.ui.wizard.codegen

import org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo
import org.eclipse.xtext.generator.IFileSystemAccess

class ActivatorGenerator {
    def doGenerate (SprayProjectInfo info, IFileSystemAccess fsa) {
        val project = info.projectName
        val fileName = info.javaMainSrcDir + "/" + info.getBasePath + "/Activator.java"
        fsa.generateFile(fileName, info.projectName, generateActivator(info))
    }
    
    def generateActivator (SprayProjectInfo info) '''
        package «info.getBasePackage»;
        
        import org.eclipse.xtext.util.Modules2;
        import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;
        import org.eclipse.ui.plugin.AbstractUIPlugin;
        import org.osgi.framework.BundleContext;
        import com.google.inject.Guice;
        import com.google.inject.Injector;
        
        /**
         * The activator class controls the plug-in life cycle
         */
        public class Activator extends AbstractUIPlugin {
        
            // The plug-in ID
            public static final String PLUGIN_ID = "«info.projectName»"; //$NON-NLS-1$
        
            // The shared instance
            private static Activator plugin;
        
            private Injector injector;
            
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
                injector = createInjector();
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
        
            protected Injector createInjector() {
                return Guice.createInjector(Modules2.mixin(new GraphitiRuntimeModule(), new «info.diagramTypeName.toFirstUpper»Module()));
            }
        
            public final Injector getInjector() {
                return injector;
            }
        
            public static final <T> T get(Class<T> type) {
                return getDefault().getInjector().getInstance(type);
            }
        }    
            
    '''
}
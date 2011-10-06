package org.eclipselabs.spray.generator.graphiti.templates

import java.util.List
import org.eclipselabs.spray.mm.spray.*
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.xtend2.lib.*
import static extension org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import static extension org.eclipselabs.spray.generator.graphiti.util.MetaModel.*
import static extension org.eclipselabs.spray.generator.graphiti.util.XtendProperties.*
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import org.eclipselabs.spray.mm.spray.*
import org.eclipselabs.spray.generator.graphiti.util.ImportUtil
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions
import org.eclipse.graphiti.util.IColorConstant
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions


class PluginActivator extends FileGenerator  {
    @Inject extension SprayExtensions e1
    @Inject extension LayoutExtensions e2
    @Inject extension NamingExtensions naming
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as Diagram, javaGenFile.className)
    }
    
    def mainFile(Diagram diagram, String className) '''
        «header(this)»
        package «main_package()»;
        
        import org.eclipse.ui.plugin.AbstractUIPlugin;
        import org.eclipse.xtext.util.Modules2;
        import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;
        import org.osgi.framework.BundleContext;
        
        import com.google.inject.Guice;
        import com.google.inject.Injector;
        
        // MARKER_IMPORT
        
        /**
         * The activator class controls the plug-in life cycle
         */
        public class «className» extends AbstractUIPlugin {
            private Injector             injector;
        
            // The plug-in ID
            public static final String   PLUGIN_ID = "«pluginId()»"; //$NON-NLS-1$
        
            // The shared instance
            private static «className» plugin;

            /*
             * (non-Javadoc)
             * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
             */
            public void start(BundleContext context) throws Exception {
                super.start(context);
                plugin = this;
                injector = createInjector();
            }
        
            /*
             * (non-Javadoc)
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
            public static «className» getDefault() {
                return plugin;
            }
        
            protected Injector createInjector() {
                return Guice.createInjector(Modules2.mixin(new GraphitiRuntimeModule(), new «diagram.guiceModuleClassName.shortName»()));
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
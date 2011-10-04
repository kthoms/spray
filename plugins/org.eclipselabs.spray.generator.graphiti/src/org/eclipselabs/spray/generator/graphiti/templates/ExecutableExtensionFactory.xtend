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


class ExecutableExtensionFactory extends FileGenerator  {
    @Inject extension SprayExtensions e1
    @Inject extension LayoutExtensions e2
    @Inject extension NamingExtensions naming
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as Diagram, javaGenFile.className)
    }

    def mainFile(Diagram diagram, String className) '''
        «header(this)»
        package «javaGenFile.packageName»;

        import com.google.inject.Injector;
        import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
        import org.osgi.framework.Bundle;
        import «main_package()».Activator;
        public class «className» extends AbstractGuiceAwareExecutableExtensionFactory {
        
            @Override
            protected Bundle getBundle() {
                return «diagram.activatorSimpleClassName».getDefault().getBundle();
            }
        
            @Override
            protected Injector getInjector() {
                return «diagram.activatorSimpleClassName».getDefault().getInjector();
            }
        
        }

   '''
}
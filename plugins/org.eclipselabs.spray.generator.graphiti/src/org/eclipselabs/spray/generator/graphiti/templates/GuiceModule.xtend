package org.eclipselabs.spray.generator.graphiti.templates

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil


class GuiceModule extends FileGenerator  {
    @Inject extension SprayExtensions e1
    @Inject extension LayoutExtensions e2
    @Inject extension NamingExtensions naming
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as Diagram, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
        mainExtensionPointFile( modelElement as Diagram, javaGenFile.className)
    }

    def mainExtensionPointFile(Diagram diagram, String className) '''
        «extensionHeader(this)»
        package «javaGenFile.packageName»;
        
        public class «className» extends «className»Base {
             // Add custom bindings here
             // public Class<? extends MyInterface> bindMyInterface () {
             //   return MyInterfaceImpl.class;
             // }
             //
             // Get instances through the Activator:
             // MyInterface instance = Activator.get(MyInterface.class);
        }
    '''
    
    def mainFile(Diagram diagram, String className) '''
        «header(this)»
        package «javaGenFile.packageName»;

        import org.eclipse.xtext.service.AbstractGenericModule;
        
        public class «className» extends AbstractGenericModule {
            // no bindings added yet, will be extended later
        }
   '''
}
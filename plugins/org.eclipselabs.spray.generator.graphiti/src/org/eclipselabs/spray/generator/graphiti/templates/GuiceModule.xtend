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


class GuiceModule extends FileGenerator  {
    @Inject extension SprayExtensions e1
    @Inject extension LayoutExtensions e2
    @Inject extension NamingExtensions naming
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as Diagram, javaGenFile.className)
    }

    def mainFile(Diagram diagram, String className) '''
        «header(this)»
        package «javaGenFile.packageName»;

        import org.eclipse.graphiti.dt.IDiagramTypeProvider;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.tb.IToolBehaviorProvider;
        import org.eclipse.graphiti.ui.platform.IImageProvider;
        import org.eclipse.xtext.service.AbstractGenericModule;
        import com.google.inject.Binder;
        import com.google.inject.Scopes;
        import «diagram.diagramTypeProviderClassName»;
        import «diagram.featureProviderClassName»;
        import «diagram.imageProviderClassName»;
        import «diagram.toolBehaviourProviderClassName»;
        
        public class «className» extends AbstractGenericModule {
            public void configureIDiagramTypeProvider (Binder binder) {
                binder.bind(IDiagramTypeProvider.class).to(«diagram.diagramTypeProviderSimpleClassName».class).in(Scopes.SINGLETON);
            }
            public void configureIFeatureProvider (Binder binder) {
                binder.bind(IFeatureProvider.class).to(«diagram.featureProviderSimpleClassName».class).in(Scopes.SINGLETON);
            }
            public void configureIImageProvider (Binder binder) {
                binder.bind(IImageProvider.class).to(«diagram.imageProviderSimpleClassName».class).in(Scopes.SINGLETON);
            }
            public void configureIToolBehaviorProvider (Binder binder) {
                binder.bind(IToolBehaviorProvider.class).to(«diagram.toolBehaviourProviderSimpleClassName».class).in(Scopes.SINGLETON);
            }

        }
   '''
}
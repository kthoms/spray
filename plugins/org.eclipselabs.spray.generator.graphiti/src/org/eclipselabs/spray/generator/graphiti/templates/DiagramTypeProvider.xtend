package org.eclipselabs.spray.generator.graphiti.templates

import java.util.List
import org.eclipselabs.spray.mm.spray.*
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.xtend2.lib.*
import org.eclipselabs.spray.generator.graphiti.util.*
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import static extension org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class DiagramTypeProvider extends FileGenerator  {
    @Inject extension NamingExtensions naming
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as Diagram, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
        mainExtensionPointFile( modelElement as Diagram, javaGenFile.className)
    }

    def mainFile(Diagram diagram, String className) '''
        «header(this)»
        package «diagram_package()»;
        
        import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.platform.IDiagramEditor;
        import org.eclipse.graphiti.tb.IToolBehaviorProvider;
        import com.google.inject.Inject;
        // MARKER_IMPORT
        
        public class «className» extends AbstractDiagramTypeProvider {
            @Inject
            protected IToolBehaviorProvider toolBehaviorProvider;
            @Inject
            protected IFeatureProvider      featureProvider;
        
            @Override
            public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
                 return new IToolBehaviorProvider[] { toolBehaviorProvider };
            }

            @Override
            public void init(Diagram diagram, IDiagramEditor diagramEditor) {
                super.init(diagram, diagramEditor);
                super.setFeatureProvider(featureProvider);
            }

        }
    '''

    def mainExtensionPointFile(Diagram diagram, String className) '''
        «extensionHeader(this)»
        package «GeneratorUtil::diagram_package()»;
         
        public class «className» extends «className»Base {
         
        }
    '''

}
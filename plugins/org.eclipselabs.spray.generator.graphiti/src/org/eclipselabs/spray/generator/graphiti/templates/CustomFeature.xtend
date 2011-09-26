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


class CustomFeature extends FileGenerator  {
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as Behaviour, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
        mainExtensionPointFile( modelElement as Behaviour, javaGenFile.className)
    }
    
    def mainExtensionPointFile(Behaviour metaClass, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
        
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        
        }
    '''

    def mainFile(Behaviour behaviour, String className) '''
        «var diagramName = behaviour.metaClass.diagram.name »
        «header(this)»
        package «feature_package()»;
        
        import java.util.Iterator;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICustomContext;
        import org.eclipse.graphiti.features.context.IContext;
        import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        
        
        public class «className» extends  AbstractCustomFeature {
        
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        
            @Override
            public String getName() {
                return "«behaviour.label»"; //$NON-NLS-1$
            }
        
            @Override
            public String getDescription() {
                return "«behaviour.label» description"; //$NON-NLS-1$
            }
        
            @Override
            public boolean canExecute(ICustomContext context) {
                // allow rename if exactly one pictogram element
                // representing an EClass is selected
                boolean ret = true;
                PictogramElement[] pes = context.getPictogramElements();
                if (pes != null && pes.length == 1) {
                    Object bo = getBusinessObjectForPictogramElement(pes[0]);
                }
                return ret;
            }
        
            @Override
            public void execute(ICustomContext context) {
                PictogramElement[] pes = context.getPictogramElements();
                if (pes != null && pes.length == 1) {
                    Object bo = getBusinessObjectForPictogramElement(pes[0]);
                    // TODO add code here.
                }
            }
        
            @Override
            public boolean canUndo(IContext context) {
                return false;
            }
        
            @Override
            public boolean hasDoneChanges() {
                return false;
            }
         
        }
    '''
}
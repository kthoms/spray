package org.eclipselabs.spray.generator.graphiti.templates

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.mm.spray.Behaviour

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


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
        
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICustomContext;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import com.google.inject.Inject;
        
        public class «className» extends «className»Base {
            @Inject
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        
            @Override
            public void execute(ICustomContext context, EObject object) {
                // TODO add code here.
            }
        
        }
    '''

    def mainFile(Behaviour behaviour, String className) '''
        «var diagramName = behaviour.metaClass.diagram.name »
        «header(this)»
        package «feature_package()»;
        
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICustomContext;
        import org.eclipse.graphiti.features.context.IContext;
        import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        
        public abstract class «className» extends  AbstractCustomFeature {
        
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
                    EObject bo = (EObject) getBusinessObjectForPictogramElement(pes[0]);
                    ret = canExecute (context, bo);
                }
                return ret;
            } 
        
            protected boolean canExecute(ICustomContext context, EObject bo) {
                return true;
            }
        
            @Override
            public void execute(ICustomContext context) {
                PictogramElement[] pes = context.getPictogramElements();
                if (pes != null && pes.length == 1) {
                    EObject bo = (EObject) getBusinessObjectForPictogramElement(pes[0]);
                    execute(context, bo);
                }
            }
            
            public abstract void execute(ICustomContext context, EObject object);
            
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
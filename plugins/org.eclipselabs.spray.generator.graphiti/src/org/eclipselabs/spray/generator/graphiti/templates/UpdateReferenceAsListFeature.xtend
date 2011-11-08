package org.eclipselabs.spray.generator.graphiti.templates

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.util.ImportUtil
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class UpdateReferenceAsListFeature extends FileGenerator  {
    @Inject extension ImportUtil importUtil
    @Inject extension NamingExtensions naming
    @Inject extension SprayExtensions e1
    
    EClass target 
    
    def setTarget(EClass m){
        target = m 
    }
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as MetaReference, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
        mainExtensionPointFile( modelElement as MetaReference, javaGenFile.className)
    }
    
    def mainExtensionPointFile(MetaReference metaReference, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        
        }
    '''

    def mainFile(MetaReference reference, String className) '''
        «importUtil.initImports(feature_package())»
        «header(this)»
        package «feature_package()»;
        «val body = mainFileBody(reference, className)»

        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.IReason;
        import org.eclipse.graphiti.features.context.IUpdateContext;
        import org.eclipse.graphiti.features.context.IContext;
        import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
        import org.eclipse.graphiti.features.impl.Reason;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        
        «importUtil.printImports()»

        «body»
    '''

    def mainFileBody(MetaReference reference, String className) '''
        public class «className» extends AbstractUpdateFeature {
        
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
         
            @Override
            public boolean canUpdate(IUpdateContext context) {
                // return true, if linked business object is a EClass
                Object bo =  getBusinessObjectForPictogramElement(context.getPictogramElement());
                return (bo instanceof «target.javaInterfaceName.shortName»);
            }
        
            @Override
            public IReason updateNeeded(IUpdateContext context) {
                // retrieve name from pictogram model
                String pictogramName = null;
                PictogramElement pictogramElement = context.getPictogramElement();
                if (pictogramElement instanceof Shape) {
                    Shape cs = (Shape) pictogramElement;
                    if (cs.getGraphicsAlgorithm() instanceof Text) {
                        Text text = (Text) cs.getGraphicsAlgorithm();
        //                  Graphiti.getPeService().getPropertyValue(shape, "REFERENCE");
                        if( pictogramName == null ){
                            pictogramName = text.getValue();
                        }
                    }
                }
         
                // retrieve name from business model
                String businessName = null;
                Object bo = getBusinessObjectForPictogramElement(pictogramElement);
                if (bo instanceof «target.name») {
                    «target.name» reference = («target.name») bo;
                    businessName = reference.get«reference.getLabelPropertyName.toFirstUpper()»();
                }
         
                // update needed, if names are different
                boolean updateNameNeeded =
                    ((pictogramName == null && businessName != null) ||
                        (pictogramName != null && !pictogramName.equals(businessName)));
                if (updateNameNeeded) {
                    return Reason.createTrueReason("Property Name is out of date");
                } else {
                    return Reason.createFalseReason();
                }
              }
        
            @Override
            public boolean update(IUpdateContext context) {
               // retrieve name from business model
                String businessName = null;
                PictogramElement pictogramElement = context.getPictogramElement();
                Object bo = getBusinessObjectForPictogramElement(pictogramElement);
                if (bo instanceof «target.name») {
                    «target.name» eClass = («target.name») bo;
                    businessName = eClass.get«reference.getLabelPropertyName.toFirstUpper()»();
                }
         
                // Set name in pictogram model
                if (pictogramElement instanceof Shape) {
                    Shape cs = (Shape) pictogramElement;
                    if (cs.getGraphicsAlgorithm() instanceof Text) {
                        Text text = (Text) cs.getGraphicsAlgorithm();
                        text.setValue(businessName);
                        layoutPictogramElement(cs.getContainer().getContainer());
                        return true;
                    }
                }
                return false;
            }
        
            @Override
            public boolean hasDoneChanges() {
                return false;
            }
        
            @Override
            public boolean canUndo(IContext context) {
                return false;
            }
        }
    '''
}
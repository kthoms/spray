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
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipselabs.spray.generator.graphiti.util.ImportUtil
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions

/*
 * Template for generating Graphiti Update feature for a Container representing a MetaClass
 */
class UpdateShapeFeature extends FileGenerator  {
    @Inject extension NamingExtensions naming
    @Inject extension SprayExtensions e1
    @Inject IQualifiedNameProvider qnProvider
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as Container, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
        mainExtensionPointFile( modelElement as Container, javaGenFile.className)
    }
    
    def mainExtensionPointFile(Container container, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import com.google.inject.Inject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            @Inject
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        
        }
    '''

    def mainFile(Container container, String className) '''
        «header(this)»
        package «feature_package()»;

        import java.util.HashMap;
        import java.util.Map;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.IReason;
        import org.eclipse.graphiti.features.context.IUpdateContext;
        import org.eclipse.graphiti.features.context.IContext;
        import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
        import org.eclipse.graphiti.features.impl.Reason;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        import org.eclipse.graphiti.services.Graphiti;
        import «util_package()».SprayContainerService;
        import «container.represents.javaInterfaceName»;
        // MARKER_IMPORT
        
        public class «className» extends AbstractUpdateFeature {
        
            Map<String, String> values = null; 
        
            public  «className»(IFeatureProvider fp) {
                super(fp);
            }
         
            @Override
            public boolean canUpdate(IUpdateContext context) {
                // return true, if linked business object is a EClass
                Object bo =  getBusinessObjectForPictogramElement(context.getPictogramElement());
                PictogramElement pictogramElement = context.getPictogramElement();
                return (bo instanceof «container.represents.name»)&& (!(pictogramElement instanceof Diagram));
            }
        
            @Override
            public IReason updateNeeded(IUpdateContext context) {
                PictogramElement pictogramElement = context.getPictogramElement();
                Object bo = getBusinessObjectForPictogramElement(pictogramElement);
                if ( ! (bo instanceof «container.represents.name»)) {
                    return Reason.createFalseReason(); 
                }
                   «container.represents.name» eClass = («container.represents.name») bo;
        
                // retrieve name from pictogram model
                if (pictogramElement instanceof ContainerShape) {
                    ContainerShape cs = (ContainerShape) pictogramElement;
                    ContainerShape textBox = SprayContainerService.findTextShape(cs);
                    for (Shape shape : textBox.getChildren()) {
                        if (shape.getGraphicsAlgorithm() instanceof Text) {
                            Text text = (Text) shape.getGraphicsAlgorithm();
                            String type = Graphiti.getPeService().getPropertyValue(shape, "MODEL_TYPE");
                            String value = getValues(eClass).get(type);
                            if( value != null){
                                   String pictogramName = text.getValue();
              
                                 // update needed, if names are different
                                boolean updateNameNeeded =((pictogramName == null && value != null) || (pictogramName != null && !pictogramName.equals(value)));
                                if (updateNameNeeded) {
                                    return Reason.createTrueReason("Name [" + pictogramName + "] is out of date");
                                }
                            }
                        }
                    }
                }
                return Reason.createFalseReason();
             }
        
            @Override
            public boolean update(IUpdateContext context) {
                PictogramElement pictogramElement = context.getPictogramElement();
                Object bo = getBusinessObjectForPictogramElement(pictogramElement);
                  «container.represents.name» eClass = («container.represents.name») bo;
                return SprayContainerService.update(pictogramElement, getValues(eClass));
                
            }
        
            protected Map<String, String> getValues(«container.represents.name» eClass) {
                if (values == null) {
                    values = new HashMap<String, String>();
                    fillValues(eClass);
                }
                return values;
            }
        
            protected void fillValues(«container.represents.name» eClass) {
                String type, value;
            «FOR part :  container.parts »
                «IF part instanceof Text»
                    «var text = part as Text»
                type = "«qnProvider.getFullyQualifiedName(text)»";
                value = getValue(type, eClass);
                values.put(type, value);
                «ENDIF»
            «ENDFOR»            
            }
            
            private String getValue (String type, «container.represents.getName» eClass) {
            «FOR part :  container.parts »
                «IF part instanceof Text»
                    «var text = part as Text»
                    if ("«qnProvider.getFullyQualifiedName(text)»".equals(type)) {
                        «valueGenerator(text, "eClass")»
                    }
                «ENDIF»
            «ENDFOR»            
                throw new IllegalArgumentException(type);
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
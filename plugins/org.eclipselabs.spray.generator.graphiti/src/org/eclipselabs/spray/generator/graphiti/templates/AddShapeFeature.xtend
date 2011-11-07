package org.eclipselabs.spray.generator.graphiti.templates

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.graphiti.util.IColorConstant
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Container
import org.eclipselabs.spray.mm.spray.Line
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.mm.spray.Text
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions

import static extension org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class AddShapeFeature extends FileGenerator  {
    @Inject extension SprayExtensions e1
    @Inject extension LayoutExtensions e2
    @Inject extension IQualifiedNameProvider e3
    @Inject extension NamingExtensions naming
    
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
        «var containerType = constainerClass(container)»
        «header(this)»
        package «feature_package()»;
        
        import «container.represents.javaInterfaceName»;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.IAddContext;
        import org.eclipse.graphiti.features.context.IContext;
        import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
        import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.mm.algorithms.Polyline;
        import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        import org.eclipse.graphiti.services.Graphiti;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipse.graphiti.services.IPeCreateService;
        import org.eclipse.graphiti.util.IColorConstant;
        import «util_package()».ISprayContainer;
        import «util_package()».«containerType»;
        import «util_package()».SprayContainerService;
        // MARKER_IMPORT

        public class «className» extends AbstractAddShapeFeature {
        
            protected final static String typeOrAliasName = "«container.represents.visibleName()»";
        
            protected Diagram targetDiagram = null;
        
            protected «containerType» container = null;
        
            protected IGaService gaService = null;
        
            public «className»(IFeatureProvider fp) {
                super(fp);
                container = new «containerType»();
                gaService = Graphiti.getGaService();
            }
        
            public boolean canAdd(IAddContext context) {
                final Object newObject = context.getNewObject();
                if (newObject instanceof «container.represents.getName») {
                    // check if user wants to add to a diagram
                    if (context.getTargetContainer() instanceof Diagram) {
                        return true;
                    }
                }
                return false;
            }

            public PictogramElement add(IAddContext context) {
                «container.represents.getName» addedModelElement = («container.represents.getName») context.getNewObject();
                targetDiagram = Graphiti.getPeService().getDiagramForShape(context.getTargetContainer());
                IPeCreateService peCreateService = Graphiti.getPeCreateService();
        
                ContainerShape containerShape = container.createContainer(context, addedModelElement);
            «IF container.hasFillColor»
                GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
                containerGa.setBackground(manageColor(«container.fillColor»));
            «ENDIF»    
                ContainerShape textContainer = SprayContainerService.findTextShape(containerShape);
                link(containerShape, addedModelElement);
        
        «FOR part : container.parts »
            «IF part instanceof Line»
                «var line = part as Line»
                // Part is Line
                {
                    // create shape for line
                    Shape shape = peCreateService.createShape(textContainer, false);
                    // create and set graphics algorithm
                    Polyline polyline = gaService.createPolyline(shape, new int[] { 0, 0, 0, 0 });
                    polyline.setForeground(manageColor(«line.lineColor» ));
                    polyline.setLineWidth(«line.layout.lineWidth»);
                «IF line.layout.lineWidth == 0»
                    polyline.setLineVisible(false);
                «ENDIF»
                    gaService.setLocation(polyline, 0, 0);
                    Graphiti.getPeService().setPropertyValue(shape, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.LINE);
                }
            «ELSEIF part instanceof Text»
                «var text = part as Text»
                // Part is Text
                {
                    String type = "«text.fullyQualifiedName»";
                    // create shape for text and set text graphics algorithm
                    Shape shape = peCreateService.createShape(textContainer, false);
                    Text text = gaService.createDefaultText(getDiagram(), shape);
                    text.setFont(gaService.manageFont(getDiagram(), text.getFont().getName(), 12));
                    text.setForeground(manageColor(«text.lineColor»));
                    text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
                    text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
                «IF text.layout.bold»
                    text.getFont().setBold(true);
                «ENDIF»
                «IF text.layout.italic»
                    text.getFont().setItalic(true);
                «ENDIF»
                    gaService.setLocationAndSize(text, 0, 0, 0, 0);
                    Graphiti.getPeService().setPropertyValue(shape, "MODEL_TYPE", type);
                    Graphiti.getPeService().setPropertyValue(shape, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.TEXT);
                    // create link and wire it
                    link(shape, addedModelElement);
                }
            «ELSEIF part instanceof MetaReference»
                «val metaRef = part as MetaReference»
                «val eReference = metaRef.reference» 
                // Part is reference list
                {
                    // Create a dummy invisible line to have an ancjhor point for adding new elements to the list
                    Shape dummy = peCreateService.createShape(textContainer, false);
                    Graphiti.getPeService().setPropertyValue(dummy, "MODEL_TYPE", "«eReference.EReferenceType.name»");
                    Polyline p = gaService.createPolyline(dummy, new int[] { 0, 0, 0, 0 });
                    p.setForeground(manageColor(«typeof(IColorConstant).shortName».BLACK));
                    p.setLineWidth(0);
                    p.setLineVisible(false);
                    gaService.setLocation(p, 0, 0);
                    Graphiti.getPeService().setPropertyValue(dummy, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.LINE);
                }
                for («eReference.EReferenceType.javaInterfaceName.shortName» p : addedModelElement.get«eReference.name.toFirstUpper()»()) {
                    Shape shape = peCreateService.createContainerShape(textContainer, true);
                    Graphiti.getPeService().setPropertyValue(shape, "STATIC", "true");
                    Graphiti.getPeService().setPropertyValue(shape, "MODEL_TYPE", "«eReference.EReferenceType.name»");
                    Graphiti.getPeService().setPropertyValue(shape, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.TEXT);
                    // create and set text graphics algorithm
                    Text text = gaService.createDefaultText(getDiagram(), shape, p.get«metaRef.getLabelPropertyName.toFirstUpper()»());
                    // TODO should have a text color here, refer to representation of reference type
                    text.setForeground(manageColor(«container.textColor»)); 
                    text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
                    text.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
                    gaService.setLocationAndSize(text, 0, 0, 0, 0);
                    // create link and wire it
                    link(shape, p);
                }
            «ELSE»
                // TODO
                System.out.println("Spray: unhandled Container child [«part.getClass().name»]");
            «ENDIF»
        «ENDFOR»
                
                // add a chopbox anchor to the shape
                peCreateService.createChopboxAnchor(containerShape);
        
                // call the update and layout features
                updatePictogramElement(containerShape);
                layoutPictogramElement(containerShape);
                
                return containerShape;
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
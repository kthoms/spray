package org.eclipselabs.spray.generator.graphiti.templates

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.mm.spray.*
import org.eclipselabs.spray.mm.spray.*

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import static org.eclipselabs.spray.generator.graphiti.util.MetaModel.*
import org.eclipselabs.spray.mm.spray.*
import com.google.inject.Inject


class AddReferenceAsListFeature extends FileGenerator  {
	@Inject extension org.eclipselabs.spray.mm.spray.extensions.SprayExtensions e1
	
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
		«val referenceName  = reference.getName »
		«var metaClass = (reference.eContainer as Container).represents»
		«var target = metaClass.type.EAllReferences.findFirst(e|e.name == referenceName) » 
		«var diagramName = metaClass.diagram.name »  
		«var fullPackage = fullPackageName(metaClass.type) »
		«var fullReferencePackage = fullPackageName(target.EReferenceType)  »
		«header(this)»
		package «feature_package()»;
		
		import «fullPackageName(metaClass.type)».«metaClass.getName»;
		import «fullPackageName(target.EReferenceType)».«target.EReferenceType.name»;
		
		import java.util.ArrayList;
		import org.eclipse.graphiti.datatypes.IDimension;
		import org.eclipse.graphiti.features.IFeatureProvider;
		import org.eclipse.graphiti.features.context.IAddContext;
		import org.eclipse.graphiti.features.context.IContext;
		import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
		import org.eclipse.graphiti.mm.pictograms.ContainerShape;
		import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
		import org.eclipse.graphiti.mm.pictograms.PictogramElement;
		import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
		import org.eclipse.graphiti.mm.pictograms.Shape;
		import org.eclipse.graphiti.mm.algorithms.Text;
		import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.graphiti.services.IGaService;
		import org.eclipse.graphiti.services.IPeCreateService;
		import «util_package()».ISprayContainer;
		import «util_package()».SprayContainerService;
		import «util_package()».ISprayColorConstants;
		
		public class «className» extends AbstractAddShapeFeature {
			private static final ArrayList<org.eclipse.graphiti.mm.Property> EMPTY_PROPERTIES_LIST = new ArrayList<org.eclipse.graphiti.mm.Property>(0);
		
		    public «className»(IFeatureProvider fp) {
		        super(fp);
		    }
		 
		    /* This method very much depends on the sturtcure of the stnadard rectangle shape.
		     */
			public PictogramElement add(IAddContext context) {
				final «target.EReferenceType.name» addedModelElement = («target.EReferenceType.name») context.getNewObject();
				final ContainerShape containerShape= (ContainerShape) context.getTargetContainer();
		
				// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		        IGaService gaService = Graphiti.getGaService();
		        Shape found = null;
		        int index = 0; 
		        int i = 0;
		        ContainerShape textbox = SprayContainerService.findTextShape(containerShape);
		        for (Shape shape : textbox.getChildren()) {
		           GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
		            IDimension size = gaService.calculateSize(graphicsAlgorithm, true);
		            gaService.setLocation(graphicsAlgorithm, 0, 0);
			        String modelType = Graphiti.getPeService().getPropertyValue(shape, "MODEL_TYPE");
			        if( modelType != null && modelType.equals("«target.EReferenceType.name»") ){
			        	found = shape; index = i; 
			        }
		            i++;
				}
		
		    	// LIST of PROPERTIES
				Shape newShape = createShape(textbox, index);
		        Graphiti.getPeService().setPropertyValue(newShape, "STATIC", "true");
			    Graphiti.getPeService().setPropertyValue(newShape, "MODEL_TYPE", "«target.EReferenceType.name»");
		        Graphiti.getPeService().setPropertyValue(newShape, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.TEXT);
			    // TODO Name attribute should not be default
				Text text = gaService.createDefaultText(getDiagram(), newShape, addedModelElement.get«reference.getLabelPropertyName.toFirstUpper()»());
				// TODO find the right text color
				text.setForeground(manageColor(ISprayColorConstants.CLASS_TEXT_FOREGROUND));
				text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
				text.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
				gaService.setLocationAndSize(text, 0, 0, 0, 0);
				// create link and wire it
				link(newShape, addedModelElement);
		        layoutPictogramElement(containerShape);
				
				return containerShape;
			}
			
			protected Shape createShape(final ContainerShape containerShape, int index) {
				Shape newShape  = PictogramsFactory.eINSTANCE.createShape();
				newShape.getProperties().addAll(EMPTY_PROPERTIES_LIST);
				newShape.setVisible(true);
				newShape.setActive(true);
				containerShape.getChildren().add(index, newShape);
				return newShape;
			}
			
			
			public boolean canAdd(IAddContext context) {
				final Object newObject = context.getNewObject();
				if (newObject instanceof «target.EReferenceType.name») {
					// check if user wants to add to a diagram
			    	Shape target = context.getTargetContainer();
			    	Object domainObject = getBusinessObjectForPictogramElement(target);
					if (domainObject instanceof «metaClass.getName») {
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
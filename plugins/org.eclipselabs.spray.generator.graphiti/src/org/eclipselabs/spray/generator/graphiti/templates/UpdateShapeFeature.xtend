package org.eclipselabs.spray.generator.graphiti.templates

import java.util.List
import org.eclipselabs.spray.mm.xspray.*
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.xtend2.lib.*
import static extension org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import static extension org.eclipselabs.spray.generator.graphiti.util.MetaModel.*
import static extension org.eclipselabs.spray.generator.graphiti.util.XtendProperties.*
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import org.eclipselabs.spray.mm.xspray.extensions.XsprayExtensions

/*
 * Template for generating Graphiti Update feature for a Container representing a MetaClass
 */
class UpdateShapeFeature extends FileGenerator  {
	@Inject extension org.eclipselabs.spray.mm.xspray.extensions.SprayExtensions e1
	
	override StringConcatenation generateBaseFile(EObject modelElement) {
		mainFile( modelElement as Container, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtentionFile(EObject modelElement) {
		mainExtensionPointFile( modelElement as Container, javaGenFile.className)
    }
	
	def mainExtensionPointFile(Container container, String className) '''	
		«extensionHeader(this)»
		package «feature_package()»;
		
		import org.eclipse.graphiti.features.IFeatureProvider;
		
		public class «className» extends «className»Base {
		
		    public «className»(IFeatureProvider fp) {
		        super(fp);
		    }
		
		}
	'''

	def mainFile(Container container, String className) '''
		«var diagramName = container.represents.diagram.name »
		«var pack = container.represents.type.EPackage.name »
		«var fullPackage = fullPackageName(container.represents.type) »
		«var containerType = constainerClass(container)»
		«var labelName = "name" »
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
		
		import «fullPackage».«container.represents.getName»;
		
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
		        return (bo instanceof «container.represents.getName»)&& (!(pictogramElement instanceof Diagram));
			}
		
			@Override
			public IReason updateNeeded(IUpdateContext context) {
		        PictogramElement pictogramElement = context.getPictogramElement();
		        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		        if ( ! (bo instanceof «container.represents.getName»)) {
		            return Reason.createFalseReason(); 
		        }
		       	«container.represents.getName» eClass = («container.represents.getName») bo;
		
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
		      	«container.represents.getName» eClass = («container.represents.getName») bo;
		        return SprayContainerService.update(pictogramElement, getValues(eClass));
		        
			}
		
		    protected Map<String, String> getValues(«container.represents.getName» eClass) {
		        if (values == null) {
		            values = new HashMap<String, String>();
		            fillValues(eClass);
		        }
		        return values;
		    }
		
			protected void fillValues(«container.represents.getName» eClass) {
			    String type, value;
			«FOR part :  container.parts »
				«IF part instanceof Text»
				    «var text = part as Text»
				value = «valueGenerator(text, "eClass")»;
				type = «keyGenerator(text)»;	
			    values.put(type, value);
				«ENDIF»
			«ENDFOR»			
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
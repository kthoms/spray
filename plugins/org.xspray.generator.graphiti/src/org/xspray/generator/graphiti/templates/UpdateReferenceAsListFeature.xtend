package org.xspray.generator.graphiti.templates

import java.util.List
import org.xspray.mm.xspray.*
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.xtend2.lib.*
import static extension org.xspray.generator.graphiti.util.GeneratorUtil.*
import static extension org.xspray.generator.graphiti.templates.TemplateUtil.*
import static extension org.xspray.generator.graphiti.util.MetaModel.*
import static extension org.xspray.generator.graphiti.util.XtendProperties.*
import org.eclipse.xtext.generator.IFileSystemAccess


class UpdateReferenceAsListFeature extends FileGenerator  {
	
	EClass target 
	
	def setTarget(EClass m){
		target = m 
	}
	
	override StringConcatenation generateBaseFile(EObject modelElement) {
		mainFile( modelElement as MetaReference, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtentionFile(EObject modelElement) {
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
		«var fullPackage = fullPackageName(target) »
		«header(this)»
		package «feature_package()»; 
		
		import org.eclipse.graphiti.features.IFeatureProvider;
		import org.eclipse.graphiti.features.IReason;
		import org.eclipse.graphiti.features.context.IUpdateContext;
		import org.eclipse.graphiti.features.context.IContext;
		import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
		import org.eclipse.graphiti.features.impl.Reason;
		import org.eclipse.graphiti.mm.algorithms.Text;
		import org.eclipse.graphiti.mm.pictograms.PictogramElement;
		import org.eclipse.graphiti.mm.pictograms.Shape;
		
		import «fullPackage».«target.name»;
		
		public class «className» extends AbstractUpdateFeature {
		
		    public «className»(IFeatureProvider fp) {
		        super(fp);
		    }
		 
			@Override
			public boolean canUpdate(IUpdateContext context) {
		        // return true, if linked business object is a EClass
		        Object bo =  getBusinessObjectForPictogramElement(context.getPictogramElement());
		        return (bo instanceof «target.name»);
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
		            businessName = reference.get«reference.labelProperty.toFirstUpper()»();
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
		            businessName = eClass.get«reference.labelProperty.toFirstUpper()»();
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
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
import org.eclipselabs.spray.mm.xspray.extensions.XsprayExtensions
import com.google.inject.Inject


class DeleteReferenceFeature extends FileGenerator  {
	@Inject extension org.eclipselabs.spray.mm.xspray.extensions.SprayExtensions e1
	
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
		«val referenceName  = reference.getName »
		«var target = reference.metaClass.type.EAllReferences.findFirst(e|e.name == referenceName) » 
		«var diagramName = reference.metaClass.diagram.name »
		«var fullPackage = fullPackageName(reference.metaClass.type) »
		«var fullReferencePackage = fullPackageName(target.EReferenceType)  »
		«header(this)»
		/*******************************************************************************
		 * <copyright>
		 *
		 * </copyright>
		 *******************************************************************************/
		package «feature_package()»;
		
		import «fullPackage».«reference.metaClass.getName»;
		import «fullReferencePackage».«target.EReferenceType.name»;
		
		import org.eclipse.emf.ecore.EObject;
		import org.eclipse.emf.ecore.util.EcoreUtil;
		import org.eclipse.graphiti.features.IFeatureProvider;
		import org.eclipse.graphiti.features.IRemoveFeature;
		import org.eclipse.graphiti.features.context.IDeleteContext;
		import org.eclipse.graphiti.features.context.IRemoveContext;
		import org.eclipse.graphiti.features.context.impl.RemoveContext;
		import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
		import org.eclipse.graphiti.mm.pictograms.Connection;
		import org.eclipse.graphiti.mm.pictograms.PictogramElement;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
		import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
		import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
		
		public class «className» extends DefaultDeleteFeature {
		
			public «className»(IFeatureProvider fp) {
				super(fp);
				// TODO Auto-generated constructor stub
			}
			
			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.graphiti.features.IDeleteFeature#delete(org.eclipse.graphiti.
			 * features.context.IDeleteContext)
			 */
			@Override
			public void delete(IDeleteContext context) {
				PictogramElement pe = context.getPictogramElement();
				String reference = Graphiti.getPeService().getPropertyValue(pe, "REFERENCE");
				String element   = Graphiti.getPeService().getPropertyValue(pe, "TARGETOBJECT");
		
				Object[] businessObjectsForPictogramElement = getAllBusinessObjectsForPictogramElement(pe);
				if (businessObjectsForPictogramElement != null && businessObjectsForPictogramElement.length > 0) {
					if (!getUserDecision()) {
						return;
					}
				}
		
				preDelete(context);
		
				// TRY
				if( pe instanceof Connection) {
					Connection line = (Connection)pe;
					AnchorContainer parent = line.getStart().getParent();
					Object start = getBusinessObjectForPictogramElement(parent);
					AnchorContainer child = line.getEnd().getParent();
					Object end = getBusinessObjectForPictogramElement(child);
				}
				//END TRY
		
				IRemoveContext rc = new RemoveContext(pe);
				IFeatureProvider featureProvider = getFeatureProvider();
				IRemoveFeature removeFeature = featureProvider.getRemoveFeature(rc);
				if (removeFeature != null) {
					removeFeature.remove(rc);
				}
		
				deleteReferences(businessObjectsForPictogramElement, reference, element);
		
				postDelete(context);
			}
			/**
			 * Delete business objects.
			 * 
			 * @param businessObjects
			 *            the business objects
			 */
			protected void deleteReferences(Object[] businessObjects, String reference, String element) {
				if (businessObjects != null) {
					for (Object bo : businessObjects) {
						deleteReference(bo, reference, element);
					}
				}
			}
		
			/**
			 * Delete business object.
			 * 
			 * @param bo
			 *            the bo
			 */
			protected void deleteReference(Object bo, String reference, String element) {
				if (bo instanceof EObject) {
					if( reference == null){
						EcoreUtil.delete((EObject) bo, true);
					} else {
					    if( bo instanceof «reference.metaClass.getName» ){
							«reference.metaClass.getName» object = («reference.metaClass.getName» ) bo;
							
					«IF target.upperBound != 1»
							«target.EReferenceType.name» toBeRemoved = null;
							for («target.EReferenceType.name» rule : object.get«target.name.toFirstUpper()»()) {
								if( rule.getName().equals(element)){
									toBeRemoved = rule;
								}
							}	
							if( toBeRemoved != null ){
								object.get«target.name.toFirstUpper()»().remove(toBeRemoved);
								// TODO Must remove toBeRemoved if it is a containment reference !
							}
					«ELSE»
							object.set«referenceName.toFirstUpper()»(null);
					«ENDIF»
						} else {
							System.out.println("DELETE OBJECT " + bo);
						}
					}
				}
			}
		
		}
	'''
}
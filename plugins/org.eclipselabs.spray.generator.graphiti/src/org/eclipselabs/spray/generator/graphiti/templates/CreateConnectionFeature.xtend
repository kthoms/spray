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


class CreateConnectionFeature extends FileGenerator  {
	@Inject extension org.eclipselabs.spray.mm.spray.extensions.SprayExtensions e1
	
	override StringConcatenation generateBaseFile(EObject modelElement) {
		mainFile( modelElement as MetaClass, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
		mainExtensionPointFile( modelElement as MetaClass, javaGenFile.className)
    }
	
	def mainExtensionPointFile(MetaClass metaClass, String className) '''	
		«extensionHeader(this)»
		package «feature_package()»;
		
		import org.eclipse.graphiti.features.IFeatureProvider;
		
		public class «className» extends «className»Base {
		
		    public «className»(IFeatureProvider fp) {
		        super(fp);
		    }
		    @Override
		    public boolean hasDoneChanges() {
		        return false;
		    }
		
		}
	'''

	def mainFile(MetaClass metaClass, String className) '''
		«val connection = metaClass.representedBy as Connection»
		«val fromType = connection.from.EType»
		«val toType = connection.to.EType»
		«val fromName = fromType.name»
		«val toName = toType.name»
		«val pack = metaClass.type.EPackage.name»
		«var fullPackage = fullPackageName(metaClass.type)»
		«var diagramName = metaClass.diagram.name»
		«header(this)»
		package «feature_package()»;
		import java.io.IOException;
		
		import «fullPackage».«metaClass.getName»;
		import «fullPackageName(toType)».«toName»;
		import «fullPackageName(fromType)».«fromName»;
		import «fullPackage».«pack»Factory;
		import org.eclipse.core.runtime.CoreException;
		import org.eclipse.graphiti.features.IFeatureProvider;
		import org.eclipse.graphiti.features.context.ICreateConnectionContext;
		import org.eclipse.graphiti.features.context.IContext;
		import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
		import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
		import org.eclipse.graphiti.mm.pictograms.Anchor;
		import org.eclipse.graphiti.mm.pictograms.Connection;
		import «util_package()».SampleUtil;
		import «diagram_package()».«metaClass.diagram.name»ImageProvider;
		
		public class «className» extends AbstractCreateConnectionFeature {
		
			public «className»(IFeatureProvider fp) {
				// provide name and description for the UI, e.g. the palette
				super(fp, "«metaClass.visibleName()»", "Create «metaClass.visibleName()»");
			}
		
			public boolean canCreate(ICreateConnectionContext context) {
				// return true if both anchors belong to an EClass
				// and those EClasses are not identical
				«fromName» source = get«fromName»(context.getSourceAnchor());
				«toName» target = get«toName»(context.getTargetAnchor());
				if ( (source != null) && (target != null) && (source != target) ) {
					return true;
				}
				return false;
			}
		
			public boolean canStartConnection(ICreateConnectionContext context) {
				// return true if start anchor belongs to a EClass
				if (get«fromName»(context.getSourceAnchor()) != null) {
					return true;
				}
				return false;
			}
		
			public Connection create(ICreateConnectionContext context) {
				Connection newConnection = null;
		
				// get EClasses which should be connected
				«fromName» source = get«fromName»(context.getSourceAnchor());
				«toName» target = get«toName»(context.getTargetAnchor());
		
				if (source != null && target != null) {
					// create new business object
					«metaClass.getName» eReference = create«metaClass.getName»(source, target);
					// add connection for business object
					AddConnectionContext addContext = new AddConnectionContext(
							context.getSourceAnchor(), context.getTargetAnchor());
					addContext.setNewObject(eReference);
					newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
				}
		
				return newConnection;
			}
		
			/**
			 * Returns the «fromName» belonging to the anchor, or null if not available.
			 */
			private «fromName» get«fromName»(Anchor anchor) {
				if (anchor != null) {
					Object object = getBusinessObjectForPictogramElement(anchor.getParent());
					if (object instanceof «fromName») {
						return («fromName») object;
					}
				}
				return null;
			}
			«IF fromName != toName»
			/**
			 * Returns the «toName» belonging to the anchor, or null if not available.
			 */
			private «toName» get«toName»(Anchor anchor) {
				if (anchor != null) {
					Object object = getBusinessObjectForPictogramElement(anchor.getParent());
					if (object instanceof «toName») {
						return («toName») object;
					}
				}
				return null;
			}
			«ENDIF»
		
			/**
			 * Creates a EReference between two EClasses.
			 */
			protected «metaClass.getName» create«metaClass.getName»(«fromName» source, «toName» target) {
				// TODO: Domain Object
				«metaClass.getName» domainObject = «pack»Factory.eINSTANCE.create«metaClass.getName»();
				«IF metaClass.type.EAttributes.exists(att|att.name == "name") »
					domainObject.setName("new «metaClass.visibleName()»");
				«ENDIF»
				domainObject.set«connection.from.name.toFirstUpper()»(source);
				domainObject.set«connection.to.name.toFirstUpper()»(target);
		//		getDiagram().eResource().getContents().add(domainObject);
		
		        try {
					SampleUtil.saveToModelFile(domainObject, getDiagram(), "«metaClass.diagram.modelfileExtension.toLowerCase()»");
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return domainObject;
			}
			
			«IF (metaClass.icon != null) && ! metaClass.icon.equalsIgnoreCase("")»
		        @Override
		        public String getCreateImageId() {
		            return «metaClass.diagram.name»ImageProvider.«metaClass.diagram.name»_«metaClass.icon.base()»;
		        }
		    «ENDIF»
		    
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
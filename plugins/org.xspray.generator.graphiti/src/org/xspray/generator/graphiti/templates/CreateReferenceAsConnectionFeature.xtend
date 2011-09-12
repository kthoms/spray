package org.xspray.generator.graphiti.templates

import java.util.List
import org.xspray.mm.xspray.*
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.xtend2.lib.*
import static extension org.xspray.generator.graphiti.util.GeneratorUtil.*
import static extension org.xspray.generator.graphiti.util.MetaModel.*
import static extension org.xspray.generator.graphiti.util.XtendProperties.*
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xspray.mm.xspray.extensions.XsprayExtensions
import com.google.inject.Inject


class CreateReferenceAsConnectionFeature extends FileGenerator  {
	@Inject extension XsprayExtensions e1
	
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
		    @Override
		    public boolean hasDoneChanges() {
		        return false;
		    }
		
		}
	'''

	def mainFile(MetaReference reference, String className) '''
		«val referenceName  = reference.name »
		«var target = reference.metaClass.type.EAllReferences.findFirst(e|e.name == referenceName) » 
		«var diagramName = reference.metaClass.diagram.name »
		«var fullPackage = fullPackageName(reference.metaClass.type) »
		«var fullReferencePackage = fullPackageName(target.EReferenceType)  »
		«header(this)»
		package «feature_package()»;
		
		import «fullPackage».«reference.metaClass.name»;
		import «fullReferencePackage».«target.EReferenceType.name»;
		import org.eclipse.graphiti.features.IFeatureProvider;
		import org.eclipse.graphiti.features.context.ICreateConnectionContext;
		import org.eclipse.graphiti.features.context.IContext;
		import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
		import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
		import org.eclipse.graphiti.mm.pictograms.Anchor;
		import org.eclipse.graphiti.mm.pictograms.Connection;
		
		public class «className» extends AbstractCreateConnectionFeature {
		
			public «className»(IFeatureProvider fp) {
				// provide name and description for the UI, e.g. the palette
				super(fp, "«referenceName»", "Create «referenceName»");
			}
		
			public boolean canCreate(ICreateConnectionContext context) {
				// return true if both anchors belong to an EClass
				// and those EClasses are not identical
				«reference.metaClass.name» source = get«reference.metaClass.name»(context.getSourceAnchor());
				«target.EReferenceType.name» target = get«target.name.toFirstUpper()»(context.getTargetAnchor());
				if ( (source != null) && (target != null) && (source != target) ) {
					return true;
				}
				return false;
			}
		
			public boolean canStartConnection(ICreateConnectionContext context) {
				// return true if start anchor belongs to a EClass
				if (get«reference.metaClass.name»(context.getSourceAnchor()) != null) {
					return true;
				}
				return false;
			}
		
			public Connection create(ICreateConnectionContext context) {
				Connection newConnection = null;
		
				// get EClasses which should be connected
				«reference.metaClass.name» source = get«reference.metaClass.name»(context.getSourceAnchor());
				«target.EReferenceType.name» target = get«target.name.toFirstUpper()»(context.getTargetAnchor());
		
				if (source != null && target != null) {
					// create new business object
					set«target.name.toFirstUpper()»(source, target);
					// add connection for business object
					AddConnectionContext addContext = new AddConnectionContext( context.getSourceAnchor(), context.getTargetAnchor());
					addContext.setNewObject(source);
					addContext.putProperty("REFERENCE", "«referenceName»");
					// TODO: assume that the target object has a Name property
			//		addContext.putProperty("TARGETOBJECT", target.getName());
					newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
				}
		
				return newConnection;
			}
		
			/**
			 * Returns the «reference.metaClass.name» belonging to the anchor, or null if not available.
			 */
			protected «reference.metaClass.name» get«reference.metaClass.name»(Anchor anchor) {
				if (anchor != null) {
					Object object = getBusinessObjectForPictogramElement(anchor.getParent());
					if (object instanceof «reference.metaClass.name») {
						return («reference.metaClass.name») object;
					}
				}
				return null;
			}
			«IF reference.metaClass.name != target.name»
			/**
			 * Returns the «target.name» belonging to the anchor, or null if not available.
			 */
			protected «target.EReferenceType.name» get«target.name.toFirstUpper()»(Anchor anchor) {
				if (anchor != null) {
					Object object = getBusinessObjectForPictogramElement(anchor.getParent());
					if (object instanceof «target.EReferenceType.name») {
						return («target.EReferenceType.name») object;
					}
				}
				return null;
			}
			«ENDIF»
		
			/**
			 * Creates a «target.name» .
			 */
			protected void set«target.name.toFirstUpper()»(«reference.metaClass.name» source, «target.EReferenceType.name» target) {
				// TODO Check multiplcity, if > 1, use addTo instead of set
				«IF target.upperBound == 1» 
					source.set«target.name.toFirstUpper()»(target);
				«ELSE»
					source.get«target.name.toFirstUpper()»().add(target);
				«ENDIF»
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
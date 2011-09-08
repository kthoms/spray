package org.xspray.generator.graphiti.templates

import java.util.*
import org.xspray.mm.xspray.*
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.xtend2.lib.*
import static extension org.xspray.generator.graphiti.util.GeneratorUtil.*
import static extension org.xspray.generator.graphiti.util.MetaModel.*
import static extension org.xspray.generator.graphiti.util.XtendProperties.*
import org.xspray.mm.xspray.extensions.XsprayExtensions
import com.google.inject.Inject

class FeatureProvider extends FileGenerator {
	@Inject extension XsprayExtensions e1
	
	override StringConcatenation generateBaseFile(EObject modelElement) {
		mainFile( modelElement as Diagram, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtentionFile(EObject modelElement) {
		mainExtensionPointFile( modelElement as Diagram, javaGenFile.className)
    }
	
	def mainExtensionPointFile(Diagram diagram, String className) '''
		«extensionHeader(this)»
		package «diagram_package()»;
		
		import org.eclipse.graphiti.dt.IDiagramTypeProvider;
		
		public class «className» extends «className»Base {
		
		    public «className»(IDiagramTypeProvider dtp) {
		        super(dtp);
		    }
		
		}
	'''
	
	def mainFile(Diagram diagram, String className) '''
		«header(this)»
		package «diagram_package()»;
		
		import org.eclipse.graphiti.dt.IDiagramTypeProvider;
		import org.eclipse.graphiti.features.IAddFeature;
		import org.eclipse.graphiti.features.ICopyFeature;
		import org.eclipse.graphiti.features.ICreateConnectionFeature;
		import org.eclipse.graphiti.features.ICreateFeature;
		import org.eclipse.graphiti.features.IDirectEditingFeature;
		import org.eclipse.graphiti.features.IFeature;
		import org.eclipse.graphiti.features.ILayoutFeature;
		import org.eclipse.graphiti.features.IMoveShapeFeature;
		import org.eclipse.graphiti.features.IPasteFeature;
		import org.eclipse.graphiti.features.IResizeShapeFeature;
		import org.eclipse.graphiti.features.IUpdateFeature;
		import org.eclipse.graphiti.features.IDeleteFeature;
		import org.eclipse.graphiti.features.context.IAddContext;
		import org.eclipse.graphiti.features.context.ICopyContext;
		import org.eclipse.graphiti.features.context.ICustomContext;
		import org.eclipse.graphiti.features.context.IDirectEditingContext;
		import org.eclipse.graphiti.features.context.ILayoutContext;
		import org.eclipse.graphiti.features.context.IMoveShapeContext;
		import org.eclipse.graphiti.features.context.IPasteContext;
		import org.eclipse.graphiti.features.context.IPictogramElementContext;
		import org.eclipse.graphiti.features.context.IResizeShapeContext;
		import org.eclipse.graphiti.features.context.IUpdateContext;
		import org.eclipse.graphiti.features.custom.ICustomFeature;
		import org.eclipse.graphiti.mm.pictograms.ContainerShape;
		import org.eclipse.graphiti.mm.pictograms.PictogramElement;
		import org.eclipse.graphiti.mm.pictograms.Shape;
		import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
		import org.eclipse.graphiti.features.context.IDeleteContext;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
		import org.eclipse.graphiti.features.context.IDeleteContext;
		import «util_package()».OwnerPropertyDeleteFeature;
		
		«FOR cls :  diagram.metaClasses »
		import «feature_package()».«diagram.name»Add«cls.visibleName()»Feature;    // 1
		import «feature_package()».«diagram.name»Create«cls.visibleName()»Feature; 
		import «feature_package()».«diagram.name»Update«cls.visibleName()»Feature; // 3
		«ENDFOR»
		«FOR cls : diagram.metaClasses.filter(m | ! (m.representedBy instanceof Connection) )»
		import «feature_package()».«diagram.name»Layout«cls.visibleName()»Feature; // 4
		    «IF cls.representedBy instanceof Container»
		        «var container = cls.representedBy as Container »
				«FOR MetaReference reference : container.parts.filter(typeof(MetaReference))  »
					«var references = cls.type.EAllReferences » 
					«val referenceName = reference.name»
					«var target = references.findFirst(e|e.name == referenceName ) » 
					«IF ! target.EReferenceType.abstract»
		import «feature_package()».«cls.diagram.name»Create«cls.name»«reference.name»«target.EReferenceType.name»Feature; // 5
					«ENDIF»
		import «feature_package()».«cls.diagram.name»Update«cls.name»«reference.name»Feature; // 5
				    «FOR subclass : target.EReferenceType.getSubclasses() »
						«IF ! subclass.abstract »
		import «feature_package()».«cls.diagram.name»Create«cls.name»«reference.name»«subclass.name»Feature; // 6
						«ENDIF»
					«ENDFOR»
				«ENDFOR»	
			«ENDIF»
		«ENDFOR»
		«FOR cls :  diagram.metaClasses »
		import «fullPackageName(cls.type)».impl.«cls.name»Impl; // 7
		import «fullPackageName(cls.type)».«cls.name»; // 77
			«FOR reference : cls.references.filter(ref|ref.representedBy != null) »
		import «feature_package()».«diagram.name»AddReference«cls.name»«reference.name»Feature; // 8
		import «feature_package()».«diagram.name»Create«reference.metaClass.name»«reference.name»Feature;
		import «feature_package()».«diagram.name»DeleteReference«reference.metaClass.name»«reference.name»Feature;
			«ENDFOR»	
		    «IF cls.representedBy instanceof Container»
		        «var container =  cls.representedBy as Container»
				«FOR reference :  container.parts.filter(typeof(MetaReference))  »
					«val referenceName = reference.name»
					«var target = cls.type.EAllReferences.findFirst(e|e.name == referenceName ) » 
					import «fullPackageName(target.EReferenceType)».«target.EReferenceType.name»;
					import «feature_package()».«diagram.name»Add«cls.name»«reference.name»ListFeature; // 9
					«IF ! target.EReferenceType.abstract»
					import «feature_package()».«diagram.name»Update«target.EReferenceType.name»Feature;
					«ENDIF»
				«ENDFOR»	
			«ENDIF»
		«ENDFOR»
		// import all custom features
		«var List<String> allnames1 = new ArrayList<String>() »
		«FOR metaClass : diagram.metaClasses»
			«FOR behaviour : metaClass.behaviours »
			    «IF ! allnames1.contains(behaviour.name)»
			import «feature_package()».«diagram.name»Custom«behaviour.name.toFirstUpper()»Feature;// «allnames1.add(behaviour.name)»
			    «ENDIF»
			«ENDFOR»
			«ENDFOR»
		
		
		public class «className» extends DefaultFeatureProvider {
		
			public «className»(IDiagramTypeProvider dtp) {
				super(dtp);
			}
		
			@Override
			public IAddFeature getAddFeature(IAddContext context) {
				// is object for add request a EClass or EReference?
				Object object = context.getNewObject() ;
				String reference = (String)context.getProperty("REFERENCE");
				
				«FOR cls :  diagram.metaClasses »
				if ( is«cls.visibleName()»(object) ) {
		            if ( reference == null ){
						return new «diagram.name»Add«cls.visibleName()»Feature(this);
			            «FOR reference :  cls.references.filter(ref|ref.representedBy != null)  »
			            } else if( reference.equals("«reference.name»")){
			                return new «diagram.name»AddReference«cls.name»«reference.name»Feature(this);
			            «ENDFOR»   
					}
				} 
				    «IF cls.representedBy instanceof Container»
				        «var container = cls.representedBy as Container»
						«FOR reference : container.parts.filter(typeof(MetaReference))  »
							«val referenceName = reference.name»
							«var target = cls.type.EAllReferences.findFirst(e|e.name == referenceName) » 
							if( object instanceof «target.EReferenceType.name» ){
								return new «cls.diagram.name»Add«cls.name»«reference.name»ListFeature(this);
							}
						«ENDFOR»	
					«ENDIF»
				«ENDFOR»
				return super.getAddFeature(context);
			}
			
			@Override
			public ICreateFeature[] getCreateFeatures() {
				return new ICreateFeature[] { 
				«FOR cls : diagram.metaClasses.filter(e| ! (e.representedBy instanceof Connection) ) SEPARATOR ","»
				    new «diagram.name»Create«cls.visibleName()»Feature(this) 
				    «IF cls.representedBy instanceof Container»
				        «var container = cls.representedBy as Container»
						«FOR   reference : container.parts.filter(typeof(MetaReference))»
							«val referenceName = reference.name»
							«var target = cls.type.EAllReferences.findFirst(e|e.name == referenceName) »  
							«IF ! target.EReferenceType.abstract»
							, new «cls.diagram.name»Create«cls.name»«reference.name»«target.EReferenceType.name»Feature(this)
							«ENDIF»
						    «FOR subclass : target.EReferenceType.getSubclasses() »
								«IF ! subclass.abstract »
							, new «cls.diagram.name»Create«cls.name»«reference.name»«subclass.name»Feature(this)
								«ENDIF»
							«ENDFOR»
						«ENDFOR»	
					«ENDIF»
				«ENDFOR»
				};
			}
		
			@Override
			public IUpdateFeature getUpdateFeature(IUpdateContext context) {
				PictogramElement pictogramElement = context.getPictogramElement();
			//	if (pictogramElement instanceof ContainerShape) {
					Object bo = getBusinessObjectForPictogramElement(pictogramElement);
				«FOR cls : diagram.metaClasses »
				    «IF ! (cls.representedBy instanceof Connection) »
		            if ( is«cls.visibleName()»(bo) ) { // 11
						return new «diagram.name»Update«cls.visibleName()»Feature(this); 
					}
					«ENDIF»
				    «IF cls.representedBy instanceof Container»
				        «var container = cls.representedBy as Container»
						«FOR reference : container.parts.filter(typeof(MetaReference))  »
							«val referenceName = reference.name»
				    		«var eClass = cls.type.EAllReferences.findFirst(e|e.name == referenceName ).EReferenceType » 
				    		«IF  eClass.abstract»
								if (bo instanceof «eClass.name») { // 22
									return new «diagram.name»Update«cls.name»«reference.name»Feature(this); 
								}
							«ENDIF»
						«ENDFOR»
					«ELSEIF cls.representedBy instanceof Connection»
				        «var connection = cls.representedBy as Connection»
				    		«var eClass = cls.type» 
				    		«IF ! eClass.abstract»
								if (bo instanceof «eClass.name») { // 33
									return new «diagram.name»Update«eClass.name»Feature(this); 
								}
							«ENDIF»
					«ENDIF»
				«ENDFOR»
		//		}
				return super.getUpdateFeature(context);
			}
		
			@Override
			public ILayoutFeature getLayoutFeature(ILayoutContext context) {
				PictogramElement pictogramElement = context.getPictogramElement();
				Object bo = getBusinessObjectForPictogramElement(pictogramElement);
				«FOR cls : diagram.metaClasses.filter(m |! (m.representedBy instanceof Connection) )  »
		        if ( is«cls.visibleName()»(bo) ) {
					return new «diagram.name»Layout«cls.visibleName()»Feature(this);
				}
				«ENDFOR»
				return super.getLayoutFeature(context);
			}
		
		    @Override
		    public ICreateConnectionFeature[] getCreateConnectionFeatures() {
				return new ICreateConnectionFeature[] { 
				«FOR cls : diagram.metaClasses.filter(e|e.representedBy instanceof Connection) SEPARATOR ","»
				    new «diagram.name»Create«cls.visibleName()»Feature(this) 
				«ENDFOR»
				«IF ! diagram.metaClasses.filter(e|e.representedBy instanceof Connection).isEmpty »
				,
				«ENDIF»
			    «FOR metaClass : diagram.metaClasses SEPARATOR ","»
				    «FOR reference : metaClass.references.filter(ref|ref.representedBy != null) SEPARATOR ","»
					      new «diagram.name»Create«reference.metaClass.name»«reference.name»Feature(this) 
				    «ENDFOR»
			    «ENDFOR»
				};
		    }
		
			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.graphiti.features.edit.IFeatureProvider#getDeleteFeatures()
			 */
			@Override
			public IDeleteFeature getDeleteFeature(IDeleteContext context) {
				PictogramElement pictogramElement = context.getPictogramElement();
				Object bo = getBusinessObjectForPictogramElement(pictogramElement);
				String reference = Graphiti.getPeService().getPropertyValue(pictogramElement, "REFERENCE");
		
				«FOR cls : diagram.metaClasses »
		        if ( is«cls.visibleName()»(bo) ) {
					if( reference == null ){
						return new DefaultDeleteFeature(this); 
					«FOR reference : cls.references.filter(ref|ref.representedBy != null)  »
					} else if( reference.equals("«reference.name»")){
						return new «diagram.name»DeleteReference«cls.name»«reference.name»Feature(this);
					«ENDFOR»	
					}
				} 
				    «IF cls.representedBy instanceof Container»
				        «var container = cls.representedBy as Container»
						«FOR reference : container.parts.filter(typeof(MetaReference))  »
							«val referenceName = reference.name»
							«var target = cls.type.EAllReferences.findFirst(e|e.name ==  referenceName )» 
						if( bo instanceof «target.EReferenceType.name» ){
							return new OwnerPropertyDeleteFeature(this);
						}
						«ENDFOR»	
					«ENDIF»
				«ENDFOR»
				
				return new DefaultDeleteFeature(this); 
			}
		
			/** Ensure that any shape with property CAN_MOVE set to false will not have a move feature.
			 */
			@Override
			public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
				Shape s = context.getShape();
				String stat  = Graphiti.getPeService().getPropertyValue(s, "CAN_MOVE");
				if( (stat != null) && (stat.equals("false") )){
					return null;
				}
				return super.getMoveShapeFeature(context);
			}
		
		    @Override
		    public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		        Object bo = getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);
		        «FOR metaClass : diagram.metaClasses »
		            «IF !metaClass.behaviours.isEmpty»
			            if( is«metaClass.visibleName()»(bo)  ){
				        return new ICustomFeature[]{ 
				        «var List<String> allnames2 = new ArrayList<String>()»
				        «FOR behaviour : metaClass.behaviours.filter(b|b.type != BehaviourType::CREATE_BEHAVIOUR)  SEPARATOR  ","»
				            «IF ! allnames2.contains(behaviour.name)»
		    		            new «diagram.name»Custom«behaviour.name.toFirstUpper()»Feature(this) // «allnames2.add(behaviour.name)»
		    		        «ENDIF»
				        «ENDFOR»
				        };
				        }
				    «ENDIF»
		        «ENDFOR»
		        return new ICustomFeature[]{ };
		    }
		
			«FOR metaClass : diagram.metaClasses»
		    	«isOfType(metaClass)»
		    «ENDFOR»
		}
	'''

	def isOfType (MetaClass metaClass)'''
	    /** Check the type of the domain object 'object'
	     */
	    protected boolean is«metaClass.visibleName()»(Object object){
	        if ( (object instanceof «metaClass.name»Impl) && object.getClass().getSimpleName().equals("«metaClass.name»Impl") ) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	'''
	
}
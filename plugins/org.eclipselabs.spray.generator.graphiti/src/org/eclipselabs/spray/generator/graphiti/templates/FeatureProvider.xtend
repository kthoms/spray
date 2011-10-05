package org.eclipselabs.spray.generator.graphiti.templates

import java.util.*
import org.eclipselabs.spray.mm.spray.*
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.xtend2.lib.*
import static extension org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import static extension org.eclipselabs.spray.generator.graphiti.util.MetaModel.*
import static extension org.eclipselabs.spray.generator.graphiti.util.XtendProperties.*
import org.eclipselabs.spray.mm.spray.*
import com.google.inject.Inject
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions
import org.eclipselabs.spray.generator.graphiti.util.ImportUtil
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.GenModelHelper
import org.eclipselabs.spray.xtext.util.GenModelHelper

class FeatureProvider extends FileGenerator {
    @Inject extension SprayExtensions e1
    @Inject extension NamingExtensions e2
    @Inject extension GenModelHelper e3
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as Diagram, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
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
    
    def mainFile (Diagram diagram, String className) '''
        «header(this)»
        package «diagram_package()»;
        
        import org.eclipse.emf.ecore.EObject;
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
        «IF !diagram.metaClasses.empty»
        import «feature_package()».*;
        «ENDIF»
        // MARKER_IMPORT
        
        public class «className» extends DefaultFeatureProvider {
        
            public «className»(IDiagramTypeProvider dtp) {
                super(dtp);
            }
        
            @Override
            public IAddFeature getAddFeature(IAddContext context) {
                // is object for add request a EClass or EReference?
                EObject object = (EObject) context.getNewObject() ;
                String reference = (String)context.getProperty("REFERENCE");
                
                «FOR cls :  diagram.metaClasses »
                if ( object.eClass() == «cls.type.EPackageClassName.shortName».Literals.«cls.type.literalConstant» ) {
                    if ( reference == null ){
                        return new «cls.addFeatureClassName.shortName»(this);
                        «FOR reference :  cls.references.filter(ref|ref.representedBy != null)  »
                        } else if( reference.equals("«reference.getName»")){
                            return new «reference.addReferenceAsConnectionFeatureClassName.shortName»(this);
                        «ENDFOR»
                    }
                } 
                    «IF cls.representedBy instanceof Container»
                        «val container = cls.representedBy as Container»
                        «FOR reference : container.parts.filter(typeof(MetaReference))  »
                            if( object instanceof «reference.reference.EReferenceType.javaInterfaceName.shortName» ){
                                return new «reference.addReferenceAsListFeatureClassName.shortName»(this);
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
                    new «cls.createFeatureClassName.shortName»(this) 
                    «IF cls.representedBy instanceof Container»
                        «val container = cls.representedBy as Container»
                        «FOR reference : container.parts.filter(typeof(MetaReference))»
                            «val target = reference.reference»  
                            «IF ! target.EReferenceType.abstract»
                            , new «reference.createFeatureClassName.shortName»(this)
                            «ENDIF»
                            «FOR subclass : target.EReferenceType.getSubclasses() »
                                «IF ! subclass.abstract »
                            , new «reference.getCreateReferenceAsListFeatureClassName(subclass).shortName»(this)
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
            //    if (pictogramElement instanceof ContainerShape) {
                    EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);
                    if (bo == null) return null;
                «FOR cls : diagram.metaClasses »
                    «IF ! (cls.representedBy instanceof Connection) »
                    if ( bo.eClass() == «cls.type.EPackageClassName.shortName».Literals.«cls.type.literalConstant» ) { // 11
                        return new «cls.updateFeatureClassName.shortName»(this); 
                    }
                    «ENDIF»
                    «IF cls.representedBy instanceof Container»
                        «val container = cls.representedBy as Container»
                        «FOR reference : container.parts.filter(typeof(MetaReference))  »
                            «var eClass = reference.reference.EReferenceType » 
                            «IF  eClass.abstract»
                                if (bo instanceof «eClass.javaInterfaceName.shortName») { // 22
                                    return new «reference.updateReferenceAsListFeatureClassName.shortName»(this); 
                                }
                            «ENDIF»
                        «ENDFOR»
                    «ELSEIF cls.representedBy instanceof Connection»
                        «var connection = cls.representedBy as Connection»
                            «IF !cls.type.abstract»
                                if (bo instanceof «cls.javaInterfaceName.shortName») { // 33
                                    return new «cls.updateFeatureClassName.shortName»(this); 
                                }
                            «ENDIF»
                    «ENDIF»
                «ENDFOR»
        //        }
                return super.getUpdateFeature(context);
            }
        
            @Override
            public ILayoutFeature getLayoutFeature(ILayoutContext context) {
                PictogramElement pictogramElement = context.getPictogramElement();
                EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);
                if (bo == null) return null;
                «FOR cls : diagram.metaClasses.filter(m |! (m.representedBy instanceof Connection) )  »
                if ( bo.eClass()==«cls.type.EPackageClassName.shortName».Literals.«cls.type.literalConstant» ) {
                    return new «cls.layoutFeatureClassName.shortName»(this);
                }
                «ENDFOR»
                return super.getLayoutFeature(context);
            }
        
            @Override
            public ICreateConnectionFeature[] getCreateConnectionFeatures() {
                return new ICreateConnectionFeature[] { 
                «FOR cls : diagram.metaClasses.filter(e|e.representedBy instanceof Connection) SEPARATOR ","»
                    new «cls.createFeatureClassName.shortName»(this) 
                «ENDFOR»
                «IF ! diagram.metaClasses.filter(e|e.representedBy instanceof Connection).isEmpty »
                ,
                «ENDIF»
                «FOR metaClass : diagram.metaClasses»
                    «FOR reference : metaClass.references.filter(ref|ref.representedBy != null) SEPARATOR ","»
                          new «reference.createReferenceAsConnectionFeatureClassName.shortName»(this) 
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
                EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);
                if (bo == null) return null;
                String reference = Graphiti.getPeService().getPropertyValue(pictogramElement, "REFERENCE");
        
                «FOR cls : diagram.metaClasses »
                if ( bo.eClass()==«cls.type.EPackageClassName.shortName».Literals.«cls.type.literalConstant» ) {
                    if( reference == null ){
                        return new DefaultDeleteFeature(this); 
                    «FOR reference : cls.references.filter(ref|ref.representedBy != null)  »
                    } else if( reference.equals("«reference.getName»")){
                        return new «reference.deleteReferenceFeatureClassName.shortName»(this);
                    «ENDFOR»    
                    }
                } 
                    «IF cls.representedBy instanceof Container»
                        «val container = cls.representedBy as Container»
                        «FOR reference : container.parts.filter(typeof(MetaReference))  »
                            «val target = reference.reference» 
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
                EObject bo = (EObject) getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);
                if (bo == null) return new ICustomFeature[0];
                «FOR metaClass : diagram.metaClasses »
                    «IF !metaClass.behaviours.isEmpty»
                        if( bo.eClass()==«metaClass.type.EPackageClassName.shortName».Literals.«metaClass.type.literalConstant» ){
                        return new ICustomFeature[]{ 
                        «val List<String> allnames2 = new ArrayList<String>()»
                        «FOR behaviour : metaClass.behaviours.filter(b|b.type != BehaviourType::CREATE_BEHAVIOUR)  SEPARATOR  ","»
                            «IF ! allnames2.contains(behaviour.name)»
                                new «behaviour.customFeatureClassName.shortName»(this) // «allnames2.add(behaviour.name)»
                            «ENDIF»
                        «ENDFOR»
                        };
                        }
                    «ENDIF»
                «ENDFOR»
                return new ICustomFeature[0];
            }
        }
    '''

}
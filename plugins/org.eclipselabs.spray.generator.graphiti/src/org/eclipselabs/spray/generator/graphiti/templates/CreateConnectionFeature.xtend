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
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.ImportUtil
import org.eclipselabs.spray.xtext.util.GenModelHelper


class CreateConnectionFeature extends FileGenerator  {
    @Inject extension SprayExtensions e1
    @Inject extension NamingExtensions naming
    @Inject extension GenModelHelper genModelHelper
    
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

    def mainFile (MetaClass metaClass, String className) '''
        «val connection = metaClass.representedBy as Connection»
        «val from = connection.from.EType as EClass»
        «val to = connection.to.EType as EClass»
        «val diagram = metaClass.diagram»
        «header(this)»
        package «feature_package()»;
        import java.io.IOException;
        
        import org.eclipse.core.runtime.CoreException;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICreateConnectionContext;
        import org.eclipse.graphiti.features.context.IContext;
        import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
        import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
        import org.eclipse.graphiti.mm.pictograms.Anchor;
        import org.eclipse.graphiti.mm.pictograms.Connection;
        import «util_package()».SampleUtil;
        // MARKER_IMPORT
        
        public class «className» extends AbstractCreateConnectionFeature {
        
            public «className»(IFeatureProvider fp) {
                // provide name and description for the UI, e.g. the palette
                super(fp, "«metaClass.visibleName()»", "Create «metaClass.visibleName()»");
            }
        
            public boolean canCreate(ICreateConnectionContext context) {
                // return true if both anchors belong to an EClass
                // and those EClasses are not identical
                «from.javaInterfaceName.shortName» source = get«from.name»(context.getSourceAnchor());
                «to.javaInterfaceName.shortName» target = get«to.name»(context.getTargetAnchor());
                if ( (source != null) && (target != null) && (source != target) ) {
                    return true;
                }
                return false;
            }
        
            public boolean canStartConnection(ICreateConnectionContext context) {
                // return true if start anchor belongs to a EClass
                if (get«from.name»(context.getSourceAnchor()) != null) {
                    return true;
                }
                return false;
            }
        
            public Connection create(ICreateConnectionContext context) {
                Connection newConnection = null;
        
                // get EClasses which should be connected
                «from.name» source = get«from.name»(context.getSourceAnchor());
                «to.name» target = get«to.name»(context.getTargetAnchor());
        
                if (source != null && target != null) {
                    // create new business object
                    «metaClass.javaInterfaceName.shortName» eReference = create«metaClass.getName»(source, target);
                    // add connection for business object
                    AddConnectionContext addContext = new AddConnectionContext(
                            context.getSourceAnchor(), context.getTargetAnchor());
                    addContext.setNewObject(eReference);
                    newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
                }
        
                return newConnection;
            }
        
            /**
             * Returns the «from.name» belonging to the anchor, or null if not available.
             */
            private «from.name» get«from.name»(Anchor anchor) {
                if (anchor != null) {
                    Object object = getBusinessObjectForPictogramElement(anchor.getParent());
                    if (object instanceof «from.name») {
                        return («from.name») object;
                    }
                }
                return null;
            }
            «IF from.name != to.name»
            /**
             * Returns the «to.name» belonging to the anchor, or null if not available.
             */
            private «to.name» get«to.name»(Anchor anchor) {
                if (anchor != null) {
                    Object object = getBusinessObjectForPictogramElement(anchor.getParent());
                    if (object instanceof «to.name») {
                        return («to.name») object;
                    }
                }
                return null;
            }
            «ENDIF»
        
            /**
             * Creates a EReference between two EClasses.
             */
            protected «metaClass.name» create«metaClass.getName»(«from.name» source, «to.name» target) {
                // TODO: Domain Object
                «metaClass.name» domainObject = «metaClass.EFactoryInterfaceName.shortName».eINSTANCE.create«metaClass.name»();
                «IF metaClass.type.EAttributes.exists(att|att.name == "name") »
                    domainObject.setName("new «metaClass.visibleName()»");
                «ENDIF»
                domainObject.set«connection.from.name.toFirstUpper()»(source);
                domainObject.set«connection.to.name.toFirstUpper()»(target);
        //        getDiagram().eResource().getContents().add(domainObject);
        
                try {
                    SampleUtil.saveToModelFile(domainObject, getDiagram(), "«metaClass.type.fileExtension»");
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
                    return «metaClass.diagram.imageProviderClassName.shortName».«naming.getImageIdentifier(diagram, metaClass.icon)»;
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
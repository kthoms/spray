package org.eclipselabs.spray.generator.graphiti.templates

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions
import org.eclipselabs.spray.xtext.util.GenModelHelper

import static extension org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class CreateShapeFeature extends FileGenerator  {
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
        }
    '''

    def mainFile (MetaClass metaClass, String className) '''
        «val diagram = metaClass.diagram»
        «header(this)»
        package «feature_package()»;

        import java.io.IOException;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICreateContext;
        import org.eclipse.graphiti.features.context.IContext;
        import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.core.runtime.CoreException;
        import «util_package()».SampleUtil;
        import «metaClass.javaInterfaceName»;
        // MARKER_IMPORT
        
        public class «className» extends AbstractCreateFeature {
        
            private static final String TITLE = "Create «metaClass.visibleName()»";
            private static final String USER_QUESTION = "Enter new «metaClass.visibleName()» name";
            public final static String typeOrAliasName = "«metaClass.visibleName()»";
        
            public «className»(IFeatureProvider fp) {
                // set name and description of the creation feature
                super(fp, "«metaClass.visibleName()»", "Create «metaClass.visibleName()»");
            }
        
            public boolean canCreate(ICreateContext context) {
                return context.getTargetContainer() instanceof Diagram;
            }
        
            protected «metaClass.name» newClass = null;
        
            public Object[] create(final ICreateContext context) {
                newClass = create«metaClass.visibleName()»(context);
            
                if (newClass == null ) {
                    return EMPTY;
                }
         
                // do the add
                addGraphicalRepresentation(context, newClass);
                // return newly created business object(s)
                return new Object[] { newClass };
            }
            
            protected «metaClass.name» create«metaClass.visibleName()»(ICreateContext context) {
                // ask user for «className» name
                String newName = SampleUtil.askString(TITLE, USER_QUESTION, "");
                if (newName == null || newName.trim().length() == 0) {
                    return null;
                }
                 // create «metaClass.name»
                «metaClass.getName» newClass = «metaClass.EFactoryInterfaceName.shortName».eINSTANCE.create«metaClass.name»();    
                newClass.setName(newName);     
                //  default is to add it to a file resource, which is created if it does not exist.
                try {
                    SampleUtil.saveToModelFile(newClass, getDiagram(), "«metaClass.type.fileExtension»");
                } catch (CoreException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
         
                return newClass;
            }
            
            
            «IF (metaClass.icon != null)»
                @Override
                public String getCreateImageId() {
                    return «diagram.imageProviderClassName.shortName».«naming.getImageIdentifier(diagram, metaClass.icon)»;
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
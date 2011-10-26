package org.eclipselabs.spray.generator.graphiti.templates

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Container
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class CreateReferenceAsListFeature extends FileGenerator  {
    @Inject extension SprayExtensions e1
    @Inject extension NamingExtensions naming
    
    EClass target 
    
    def setTarget(EClass m){
        target = m
    }
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as MetaReference, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
        mainExtensionPointFile( modelElement as MetaReference, javaGenFile.className)
    }
    
    def mainExtensionPointFile(MetaReference metaReference, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import com.google.inject.Inject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            @Inject
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        }
    '''

    def mainFile (MetaReference reference, String className) '''
        «val metaClass = (reference.eContainer as Container).represents»
        «header(this)»
        package «feature_package()»;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICreateContext;
        import org.eclipse.graphiti.features.context.IContext;
        import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        import «util_package()».SampleUtil;
        // MARKER_IMPORT
        
        public class «className» extends AbstractCreateFeature {
        
            private static final String TITLE = "Create «target.name»";
            private static final String USER_QUESTION = "Enter new «target.name» «reference.getLabelPropertyName»";
        
            public «className»(IFeatureProvider fp) {
                // set name and description of the creation feature
                super(fp, "«target.name»", "Create «target.name»");
            }
            
            public boolean canCreate(ICreateContext context) {
                Shape target = context.getTargetContainer();
                Object domainObject = getBusinessObjectForPictogramElement(target);
                return domainObject instanceof «metaClass.name»;
            }
            
            public Object[] create(ICreateContext context) {
                // ask user for «target.name» name
                String newName = SampleUtil.askString(TITLE, USER_QUESTION, "");
                if (newName == null || newName.trim().length() == 0) {
                    return EMPTY;
                }
         
                 Shape target = context.getTargetContainer();
                Object domainObject = getBusinessObjectForPictogramElement(target);
                «metaClass.javaInterfaceName.shortName» owner = («metaClass.name»)domainObject;
         
                // create «target.name»
                «target.javaInterfaceName.shortName» newDomainObject = «metaClass.EFactoryInterfaceName.shortName».eINSTANCE.create«target.name»();
                newDomainObject.set«reference.getLabelPropertyName.toFirstUpper()»(newName);
                owner.get«reference.name.toFirstUpper()»().add(newDomainObject);
         
                // do the add
                addGraphicalRepresentation(context, newDomainObject);
                // return newly created business object(s)
                return new Object[] { newDomainObject };
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
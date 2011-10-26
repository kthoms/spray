package org.eclipselabs.spray.generator.graphiti.templates

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Diagram

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class Filter extends FileGenerator  {
    @Inject extension NamingExtensions e2
    
    Diagram diagram
    
    def setDiagram(Diagram d){
        diagram = d
    }
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as EClass, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
        mainExtensionPointFile( modelElement as EClass, javaGenFile.className)
    }
    
    def mainExtensionPointFile(EClass eClass, String className) '''    
        «extensionHeader(this)»
        package «property_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
        
        }
    '''

    def mainFile(EClass eClass, String className) '''
        «header(this)»
        package «property_package()»;
        
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.services.Graphiti;
        import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;
        
        import «eClass.javaInterfaceName»;
        
        public class «className» extends  AbstractPropertySectionFilter {
                 
            @Override
            protected boolean accept(PictogramElement pe) {
                EObject eObject = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
                if (eObject instanceof «eClass.name») {
                    return true;
                }
                return false;
            }
        }
    '''
}
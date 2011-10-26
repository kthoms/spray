package org.eclipselabs.spray.generator.graphiti.templates

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Diagram

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*

class ImageProvider extends FileGenerator {
    @Inject extension NamingExtensions naming
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as Diagram, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
        mainExtensionPointFile( modelElement as Diagram, javaGenFile.className)
    }
    
    def mainExtensionPointFile(Diagram diagram, String className) '''
        «extensionHeader(this)»
         package «diagram_package()»;
         
         public class «className» extends «className»Base {
         
         }
    '''
    
    def mainFile(Diagram diagram, String className) '''
        «val icons = diagram.metaClasses.filter(m | m.icon!=null).map(m | m.icon).toSet()»
        «header(this)»
        package  «diagram_package()»;
        
        import org.eclipse.graphiti.ui.platform.AbstractImageProvider;
        
        public class «className» extends AbstractImageProvider {
        
            // The prefix for all identifiers of this image provider
            public static final String PREFIX = "«diagram_package()».";
        
            «FOR icon : icons»
                // The image identifier for an EReference.
                public static final String «naming.getImageIdentifier(diagram, icon)»  = PREFIX + "«icon.imageBaseName»";
            «ENDFOR»
        
            @Override
            protected void addAvailableImages() {
                // register the path for each image identifier
            «FOR icon : icons»
                addImageFilePath(«naming.getImageIdentifier(diagram, icon)», "icons/«icon»");
            «ENDFOR»
            }
        }
    '''
    
}
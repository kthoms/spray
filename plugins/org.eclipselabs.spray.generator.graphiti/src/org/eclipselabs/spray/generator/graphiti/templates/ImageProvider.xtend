package org.eclipselabs.spray.generator.graphiti.templates

import java.util.*
import org.eclipselabs.spray.mm.spray.*
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.xtend2.lib.*
import static extension org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import static extension org.eclipselabs.spray.generator.graphiti.util.MetaModel.*
import static extension org.eclipselabs.spray.generator.graphiti.util.XtendProperties.*
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import com.google.inject.Inject

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
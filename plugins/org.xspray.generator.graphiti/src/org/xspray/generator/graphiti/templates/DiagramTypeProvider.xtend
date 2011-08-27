package org.xspray.generator.graphiti.templates

import java.util.List
import org.xspray.mm.xspray.*
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.xtend2.lib.*
import org.xspray.generator.graphiti.util.*
import org.eclipse.xtext.generator.IFileSystemAccess


class DiagramTypeProvider extends FileGenerator  {
	
	override StringConcatenation generateBaseFile(EObject modelElement) {
		mainFile( modelElement as Diagram, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtentionFile(EObject modelElement) {
		mainExtensionPointFile( modelElement as Diagram, javaGenFile.className)
    }
	
	def mainFile(Diagram diagram, String className) '''
		«header(this)»
		package  «GeneratorUtil::diagram_package()»;
		
		import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
		import org.eclipse.graphiti.tb.IToolBehaviorProvider;
		
		public class «className» extends AbstractDiagramTypeProvider {
		
		    private IToolBehaviorProvider[] toolBehaviorProviders;
		
		    public «className»() {
		        super();
		        setFeatureProvider(new «diagram.name»FeatureProvider(this));
		    }
		
		    @Override
		    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		        if (toolBehaviorProviders == null) {
		            toolBehaviorProviders =
		                new IToolBehaviorProvider[] { new «diagram.name»ToolBehaviourProvider(
		                    this) };
		        }
		        return toolBehaviorProviders;
		    }
		}
	'''

	def mainExtensionPointFile(Diagram diagram, String className) '''
		«extensionHeader(this)»
		package «GeneratorUtil::diagram_package()»;
		 
		public class «className» extends «className»Base {
		 
		 }
	'''

}
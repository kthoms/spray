package org.eclipselabs.spray.generator.graphiti.templates

import java.util.List
import org.eclipselabs.spray.mm.spray.*
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.xtend2.lib.*
import org.eclipselabs.spray.generator.graphiti.util.*
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import static extension org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*


class DiagramTypeProvider extends FileGenerator  {
	@Inject extension ImportUtil importUtil
	@Inject extension NamingExtensions naming
	
	override StringConcatenation generateBaseFile(EObject modelElement) {
		mainFile( modelElement as Diagram, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
		mainExtensionPointFile( modelElement as Diagram, javaGenFile.className)
    }
	
	def mainFile(Diagram diagram, String className) '''
		«importUtil.initImports(feature_package())»
		«header(this)»
		package «diagram_package()»;
		«val body = mainFileBody(diagram, className)»

		import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
		import org.eclipse.graphiti.tb.IToolBehaviorProvider;
		«importUtil.printImports()»

		«body»
	'''

	def mainFileBody(Diagram diagram, String className) '''
		public class «className» extends AbstractDiagramTypeProvider {
		
		    private IToolBehaviorProvider[] toolBehaviorProviders;
		
		    public «className»() {
		        super();
		        setFeatureProvider(new «diagram.name.toFirstUpper»FeatureProvider(this));
		    }
		
		    @Override
		    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		        if (toolBehaviorProviders == null) {
		            toolBehaviorProviders =
		                new IToolBehaviorProvider[] { new «diagram.name.toFirstUpper»ToolBehaviourProvider(
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
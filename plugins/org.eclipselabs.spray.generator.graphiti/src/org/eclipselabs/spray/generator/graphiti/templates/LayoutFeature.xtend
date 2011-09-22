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


class LayoutFeature extends FileGenerator  {
	@Inject extension org.eclipselabs.spray.mm.spray.extensions.SprayExtensions e1
	
	override StringConcatenation generateBaseFile(EObject modelElement) {
		mainFile( modelElement as Container, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtensionFile(EObject modelElement) {
		mainExtensionPointFile( modelElement as Container, javaGenFile.className)
    }
	
	def mainExtensionPointFile(Container container, String className) '''	
		«extensionHeader(this)»
		package «feature_package()»;
		
		import org.eclipse.graphiti.features.IFeatureProvider;
		
		public class «className» extends «className»Base {
		
		    public «className»(IFeatureProvider fp) {
		        super(fp);
		    }
		
		}
	'''

	def mainFile(Container container, String className) '''
		«var diagramName = container.represents.diagram.name »
		«var pack = container.represents.type.EPackage.name »
		«var fullPackage = fullPackageName(container.represents.type) »
		«var containerType = constainerClass(container)»
		«header(this)»
		package «feature_package()»;
		
		import java.util.Iterator;
		
		import «fullPackage».«container.represents.getName»;
		import org.eclipse.emf.common.util.EList;
		import org.eclipse.emf.ecore.EObject;
		import org.eclipse.graphiti.datatypes.IDimension;
		import org.eclipse.graphiti.features.IFeatureProvider;
		import org.eclipse.graphiti.features.context.ILayoutContext;
		import org.eclipse.graphiti.features.context.IContext;
		import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
		import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
		import org.eclipse.graphiti.mm.algorithms.Polyline;
		import org.eclipse.graphiti.mm.algorithms.Text;
		import org.eclipse.graphiti.mm.algorithms.styles.Point;
		import org.eclipse.graphiti.mm.pictograms.ContainerShape;
		import org.eclipse.graphiti.mm.pictograms.PictogramElement;
		import org.eclipse.graphiti.mm.pictograms.Shape;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.graphiti.services.IGaService;
		import «util_package()».«containerType»;
		
		public class «className» extends  AbstractLayoutFeature {
		
		    private static final int MIN_HEIGHT = 30;
		    private static final int MIN_WIDTH = 50;
		    protected «containerType» container = null;
		
		    public «className»(IFeatureProvider fp) {
		        super(fp);
		        container = new «containerType»();
		    «IF container.layout.figure.matches(".*Concept.*")»
		        container.setConcept(true);
		    «ENDIF»
		    }
		 
		    public boolean canLayout(ILayoutContext context) {
		       PictogramElement pe = context.getPictogramElement();
		       if (!(pe instanceof ContainerShape)) {
		           return false;
		       }
		       EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		       return (businessObjects.size() == 1) && (businessObjects.get(0) instanceof «container.represents.getName»);
		    }
		 
		    public boolean layout(ILayoutContext context) {
		        return container.layoutContainer(context);
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
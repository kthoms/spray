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
import org.eclipselabs.spray.generator.graphiti.util.ImportUtil
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions
import org.eclipse.graphiti.util.IColorConstant


class AddConnectionFeature extends FileGenerator  {
	@Inject extension ImportUtil importUtil
	@Inject extension org.eclipselabs.spray.mm.spray.extensions.SprayExtensions e1
	@Inject extension LayoutExtensions e2
	
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
	
	def mainFile(MetaClass metaClass, String className) '''
		«importUtil.initImports(feature_package())»
		«header(this)»
		package «feature_package()»;
		«val body = mainFileBody(metaClass, className)»
		«importUtil.printImports()»
		
		«body»
	'''
	
	def mainFileBody(MetaClass metaClass, String className) '''
		«var diagramName = metaClass.diagram.name »
		«var packge = metaClass.type.EPackage.name »
		«var fullPackage = fullPackageName(metaClass.type) »
		«var connection = metaClass.representedBy as Connection»
		
		import «fullPackage».«metaClass.getName»;
		import org.eclipse.graphiti.features.IFeatureProvider;
		import org.eclipse.graphiti.features.context.IAddConnectionContext;
		import org.eclipse.graphiti.features.context.IAddContext;
		import org.eclipse.graphiti.features.context.IContext;
		import org.eclipse.graphiti.features.impl.AbstractAddFeature;
		import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
		import org.eclipse.graphiti.mm.algorithms.Text;
		import org.eclipse.graphiti.mm.pictograms.Connection;
		import org.eclipse.graphiti.mm.pictograms.PictogramElement;
		import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
		import org.eclipse.graphiti.mm.algorithms.Polyline;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.graphiti.services.IGaService;
		import org.eclipse.graphiti.services.IPeCreateService;
		
		public class «className» extends  AbstractAddFeature {
		
		    public «className»(IFeatureProvider fp) {
		        super(fp);
		    }
		 
		    public PictogramElement add(IAddContext context) {
		        IAddConnectionContext addConContext = (IAddConnectionContext) context;
		        // TODO: Domain object
		        «metaClass.getName» addedDomainObject = («metaClass.getName») context.getNewObject();
		        IPeCreateService peCreateService = Graphiti.getPeCreateService();
		      
		        // CONNECTION WITH POLYLINE
		        Connection connection = peCreateService.createFreeFormConnection(getDiagram());
		        connection.setStart(addConContext.getSourceAnchor());
		        connection.setEnd(addConContext.getTargetAnchor());
		 
		        IGaService gaService = Graphiti.getGaService();
		        Polyline polyline = gaService.createPolyline(connection);
		        polyline.setLineWidth(«metaClass.representedBy.layout.lineWidth»);
		        polyline.setForeground(manageColor(«metaClass.lineColor»));
		     «IF connection.toLabel != null»
		        ConnectionDecorator toDecorator = peCreateService.createConnectionDecorator(connection, true, 1.0, true);
		        Text text = gaService.createDefaultText(getDiagram(), toDecorator);
		        text.setForeground(manageColor(«typeof(IColorConstant).shortName».BLACK));
		        
		        GraphicsAlgorithm ga = addConContext.getTargetAnchor().getParent().getGraphicsAlgorithm();
		        int targetHeight = ga.getHeight();
		        Graphiti.getGaLayoutService().setLocation(text, 10, -(targetHeight / 2) - 20);
		        «IF connection.toLabel instanceof StringLiteral»
//		        text.setValue("«(connection.toLabel as StringLiteral ).name»");
		        «ELSEIF connection.toLabel instanceof MetaAttribute»
//		        text.setValue(addedDomainObject.get«(connection.toLabel as MetaAttribute).attribute.name.toFirstUpper()»().toString());
		         «ENDIF»
		        text.setValue(«valueGenerator(connection.toLabel, "addedDomainObject")»);
		        Graphiti.getPeService().setPropertyValue(toDecorator, "MODEL_TYPE", "TO_LABEL");
		        link(toDecorator, addedDomainObject);
		     «ENDIF»
		     «IF connection.connectionLabel != null»
		        ConnectionDecorator connectionDecorator = peCreateService.createConnectionDecorator(connection, true, 0.5, true);
		        Text sourceText = gaService.createDefaultText(getDiagram(), connectionDecorator);
		        sourceText.setForeground(manageColor(«typeof(IColorConstant).shortName».BLACK));
		        Graphiti.getGaLayoutService().setLocation(sourceText, 10, 0);
		        sourceText.setValue(«valueGenerator(connection.connectionLabel, "addedDomainObject")»);
		        Graphiti.getPeService().setPropertyValue(connectionDecorator, "MODEL_TYPE", "CONNECTION_LABEL");
				link(connectionDecorator, addedDomainObject);
		    «ENDIF»
		     «IF connection.fromLabel != null»
		        ConnectionDecorator fromDecorator = peCreateService.createConnectionDecorator(connection, true, 0.0, true);
		        Text fromText = gaService.createDefaultText(getDiagram(), fromDecorator);
		        fromText.setForeground(manageColor(«typeof(IColorConstant).shortName».BLACK));
		        Graphiti.getGaLayoutService().setLocation(fromText, 10, 20);
		        fromText.setValue(«valueGenerator(connection.fromLabel, "addedDomainObject")»);
		        Graphiti.getPeService().setPropertyValue(fromDecorator, "MODEL_TYPE", "FROM_LABEL");
		        link(fromDecorator, addedDomainObject);
		     «ENDIF»
		 
		        // create link and wire it
		        Graphiti.getPeService().setPropertyValue(connection, "MODEL_TYPE", "«metaClass.getName»");
		        link(connection, addedDomainObject);
		
		        return connection;
		    }
		
		    public boolean canAdd(IAddContext context) {
		        // return true if given business object is an «metaClass.getName»
		        // note, that the context must be an instance of IAddConnectionContext
		        if (context instanceof IAddConnectionContext
		            && context.getNewObject() instanceof «metaClass.getName») {
		            return true;
		        }
		        return false;
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
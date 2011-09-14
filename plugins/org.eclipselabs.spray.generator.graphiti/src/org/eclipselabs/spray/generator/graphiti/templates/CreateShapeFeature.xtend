package org.eclipselabs.spray.generator.graphiti.templates

import java.util.List
import org.eclipselabs.spray.mm.xspray.*
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.xtend2.lib.*
import static extension org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import static extension org.eclipselabs.spray.generator.graphiti.util.MetaModel.*
import static extension org.eclipselabs.spray.generator.graphiti.util.XtendProperties.*
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import org.eclipselabs.spray.mm.xspray.extensions.XsprayExtensions


class CreateShapeFeature extends FileGenerator  {
	@Inject extension org.eclipselabs.spray.mm.xspray.extensions.SprayExtensions e1
	
	override StringConcatenation generateBaseFile(EObject modelElement) {
		mainFile( modelElement as MetaClass, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtentionFile(EObject modelElement) {
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

	def mainFile(MetaClass metaClass, String className) '''
		«var diagramName = metaClass.diagram.name »
		«var pack = metaClass.type.EPackage.name »
		«var fullPackage = fullPackageName(metaClass.type) »
		«header(this)»
		package «feature_package()»;
		
		import java.io.IOException;
		import «fullPackage».«metaClass.getName»;
		import «fullPackage».«pack.toFirstUpper()»Factory;
		import org.eclipse.graphiti.features.IFeatureProvider;
		import org.eclipse.graphiti.features.context.ICreateContext;
		import org.eclipse.graphiti.features.context.IContext;
		import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
		import org.eclipse.graphiti.mm.pictograms.Diagram;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.core.runtime.CoreException;
		import «util_package()».SampleUtil;
		import «diagram_package()».«metaClass.diagram.name»ImageProvider;
		import org.eclipse.graphiti.mm.pictograms.ContainerShape;
				
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
		
		    protected «metaClass.getName» newClass = null;
		
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
		    
		    protected «metaClass.getName» create«metaClass.visibleName()»(ICreateContext context) {
		        // ask user for «className» name
		        String newName = SampleUtil.askString(TITLE, USER_QUESTION, "");
		        if (newName == null || newName.trim().length() == 0) {
		            return null;
		        }
		         // create «metaClass.getName»
		        «metaClass.getName» newClass = «pack.toFirstUpper()»Factory.eINSTANCE.create«metaClass.getName»();	
		        newClass.setName(newName);	 
		        //  default is to add it to a file resource, which is created if it does not exist.
		        try {
		            SampleUtil.saveToModelFile(newClass, getDiagram(), "«metaClass.diagram.modelfileExtension.toLowerCase()»");
		        } catch (CoreException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        } catch (IOException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		 
		        return newClass;
		    }
		    
		    
		    «IF (metaClass.icon != null) && ! metaClass.icon.equalsIgnoreCase("")»
			    @Override
			    public String getCreateImageId() {
			        return «metaClass.diagram.name»ImageProvider.«metaClass.diagram.name»_«metaClass.icon.base()»;
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
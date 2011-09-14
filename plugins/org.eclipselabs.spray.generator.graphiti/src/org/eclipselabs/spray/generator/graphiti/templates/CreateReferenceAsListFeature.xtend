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
import org.eclipselabs.spray.mm.xspray.extensions.XsprayExtensions
import com.google.inject.Inject


class CreateReferenceAsListFeature extends FileGenerator  {
	@Inject extension org.eclipselabs.spray.mm.xspray.extensions.SprayExtensions e1
	
	EClass target 
	
	def setTarget(EClass m){
		target = m
	}
	
	override StringConcatenation generateBaseFile(EObject modelElement) {
		mainFile( modelElement as MetaReference, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtentionFile(EObject modelElement) {
		mainExtensionPointFile( modelElement as MetaReference, javaGenFile.className)
    }
	
	def mainExtensionPointFile(MetaReference metaReference, String className) '''	
		«extensionHeader(this)»
		package «feature_package()»;
		
		import org.eclipse.graphiti.features.IFeatureProvider;
		
		public class «className» extends «className»Base {
		
		    public «className»(IFeatureProvider fp) {
		        super(fp);
		    }
		}
	'''
//		«var target = metaClass.type.EAllReferences.findFirst(e|e.name == referenceName).EReferenceType » 

	def mainFile(MetaReference reference, String className) '''
		«var metaClass = (reference.eContainer as Container).represents»
		«var diagramName = metaClass.diagram.name »  
		«var eClass = metaClass.type »
		«var factory = eClass.EPackage.name + "Factory" »
		«val referenceName = reference.getName»
		«header(this)»
		package «feature_package()»;
		
		import «fullPackageName(eClass)».«metaClass.getName»;
		import «fullPackageName(target)».«target.name»;
		import «fullPackageName(target)».«factory»;
		import org.eclipse.graphiti.features.IFeatureProvider;
		import org.eclipse.graphiti.features.context.ICreateContext;
		import org.eclipse.graphiti.features.context.IContext;
		import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
		import org.eclipse.graphiti.mm.pictograms.Diagram;
		import org.eclipse.graphiti.mm.pictograms.Shape;
		import «util_package()».SampleUtil;
		
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
		        return domainObject instanceof «metaClass.getName»;
		    }
		    
		    public Object[] create(ICreateContext context) {
		        // ask user for «target.name» name
		        String newName = SampleUtil.askString(TITLE, USER_QUESTION, "");
		        if (newName == null || newName.trim().length() == 0) {
		            return EMPTY;
		        }
		 
		     	Shape target = context.getTargetContainer();
		    	Object domainObject = getBusinessObjectForPictogramElement(target);
		        «metaClass.getName» owner = («metaClass.getName»)domainObject;
		 
		        // create «target.name»
		        «target.name» newDomainObject = «factory».eINSTANCE.create«target.name»();
		        newDomainObject.set«reference.getLabelPropertyName.toFirstUpper()»(newName);
		        owner.get«reference.getName.toFirstUpper()»().add(newDomainObject);
		 
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
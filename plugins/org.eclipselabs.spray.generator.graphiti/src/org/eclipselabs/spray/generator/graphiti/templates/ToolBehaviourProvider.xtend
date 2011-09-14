package org.eclipselabs.spray.generator.graphiti.templates

import java.util.*
import org.eclipselabs.spray.mm.spray.*
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.xtend2.lib.*
import static extension org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import static extension org.eclipselabs.spray.generator.graphiti.util.MetaModel.*
import static extension org.eclipselabs.spray.generator.graphiti.util.XtendProperties.*
import org.eclipselabs.spray.mm.spray.*
import com.google.inject.Inject

class ToolBehaviourProvider extends FileGenerator {
	@Inject extension org.eclipselabs.spray.mm.spray.extensions.SprayExtensions e1
	
	override StringConcatenation generateBaseFile(EObject modelElement) {
		mainFile( modelElement as Diagram, javaGenFile.baseClassName)
    }

    override StringConcatenation generateExtentionFile(EObject modelElement) {
		mainExtensionPointFile( modelElement as Diagram, javaGenFile.className)
    }
	
	def mainExtensionPointFile(Diagram diagram, String className) '''
		«extensionHeader(this)»
		package «diagram_package()»;
		
		import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
		import org.eclipse.graphiti.dt.IDiagramTypeProvider;
		 
		 public class «className» extends «className»Base {
		    public «className»(IDiagramTypeProvider dtp) {
		        super(dtp);
		    }
		 
		 }
	'''
	
	def mainFile(Diagram diagram, String className) '''
		«header(this)»
		package  «diagram_package()»;
		
		import java.util.HashMap;
		import java.util.Map;
		
		import org.eclipse.graphiti.dt.IDiagramTypeProvider;
		import org.eclipse.graphiti.features.ICreateConnectionFeature;
		import org.eclipse.graphiti.features.ICreateFeature;
		import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
		import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
		import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;
		import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
		import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
		«FOR behaviours : diagram.metaClasses.map(m |m.behaviours)»
			«FOR behaviour : behaviours.filter(e |e.type == BehaviourType::CREATE_BEHAVIOUR) »
				«var target = behaviour.metaClass.type»
				«IF ! target.abstract»
					// «behaviour.metaClass.getName»
					import «feature_package()».«diagram.name»Create«behaviour.metaClass.visibleName()»Feature;
				«ELSE»
					// 	import «feature_package()».«diagram.name»Create«behaviour.metaClass.visibleName()»Feature;
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		
		// MARKER_IMPORT
		public class «className»  extends DefaultToolBehaviorProvider   {
		    public «className»(IDiagramTypeProvider dtp) {
		        super(dtp);
		    }
		
		
		    @Override
		    public IPaletteCompartmentEntry[] getPalette() {
		        Map<String, PaletteCompartmentEntry> compartments = new HashMap<String, PaletteCompartmentEntry>();
		
		«FOR metaClass : diagram.metaClasses.filter(m|m.representedBy instanceof Container)»
				«FOR behaviour : metaClass.behaviours.filter(e|e.type == BehaviourType::CREATE_BEHAVIOUR) »
				{
					ICreateFeature createFeature = new «addToImports(feature_package(), diagram.name + "Create" + behaviour.metaClass.visibleName() + "Feature")»(this.getFeatureProvider());
			        ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
			        PaletteCompartmentEntry compartment = compartments.get("«behaviour.paletteCompartment»");
			        if( compartment == null ){
		    	        compartment = new PaletteCompartmentEntry("«behaviour.paletteCompartment»", null);
		    	    }
			        compartments.put("«behaviour.paletteCompartment»", compartment);
		            compartment.addToolEntry(objectCreationToolEntry);
		        }
		        
		        «var container = metaClass.representedBy as Container»
				«FOR   reference : container.parts.filter(typeof(MetaReference))»
					«val referenceName = reference.getName»
					«var target = metaClass.type.EAllReferences.findFirst(e|e.name == referenceName) »  
					«IF ! target.EReferenceType.abstract»
					«objectCreationEntry(metaClass.diagram.name + "Create" + metaClass.getName + reference.getName + target.EReferenceType.name + "Feature(this)", "XXX")»
//					, new «metaClass.diagram.name»Create«metaClass.getName»«reference.getName»«target.EReferenceType.name»Feature(this)
					«ENDIF»
				    «FOR subclass : target.EReferenceType.getSubclasses() »
						«IF ! subclass.abstract »
							«objectCreationEntry(metaClass.diagram.name + "Create" + metaClass.getName + reference.getName + subclass.name + "Feature", "XXX")»
//					, new «metaClass.diagram.name»Create«metaClass.getName»«reference.getName»«subclass.name»Feature(this)
						«ENDIF»
					«ENDFOR»
				«ENDFOR»	
			    «ENDFOR»
		    «ENDFOR»

		    «FOR container : diagram.metaClasses.filter( m | m.representedBy instanceof Container).map(m | m.representedBy as Container) »
		        «FOR metaRef : container.parts.filter(typeof(MetaReference)) »
		        «val metaRefName = metaRef.getName»
			    «val target = container.represents.type.EAllReferences.findFirst(e|e.name == metaRefName) » 
		        «val createFeatureName = diagram.name + "Create" + container.represents.getName + metaRef.getName + target.EReferenceType.name + "Feature" »
			    // 00000 Embedded list of references «createFeatureName»
//		        {
//		            ICreateFeature createFeature = new !!!addToImports(feature_package(), createFeatureName)!!!(this.getFeatureProvider());
//		            ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
//		            PaletteCompartmentEntry compartment = compartments.get("Other");
//		            if( compartment == null ){
//		                compartment = new PaletteCompartmentEntry("Other", null);
//		            }
//		            compartments.put("Other", compartment);
//		            compartment.addToolEntry(objectCreationToolEntry);
//		        }
		        «ENDFOR»
		    «ENDFOR»
		
		    // do the same for connection creators
		    «FOR behaviours2 : diagram.metaClasses.filter(m|m.representedBy instanceof Connection).map(m | m.behaviours)»
		    	«FOR behaviour : behaviours2.filter(e|e.type == BehaviourType::CREATE_BEHAVIOUR) »
		        {
		            ICreateConnectionFeature createFeature = new «addToImports(feature_package(), diagram.name + "Create" + behaviour.metaClass.visibleName() + "Feature")»(this.getFeatureProvider());
		            ConnectionCreationToolEntry objectCreationToolEntry = new ConnectionCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId());
		            objectCreationToolEntry.addCreateConnectionFeature(createFeature);
		            PaletteCompartmentEntry compartment = compartments.get("«behaviour.paletteCompartment»");
		            if( compartment == null ){
		                compartment = new PaletteCompartmentEntry("«behaviour.paletteCompartment»", null);
		            }
		            compartments.put("«behaviour.paletteCompartment»", compartment);
		            compartment.addToolEntry(objectCreationToolEntry);
		        }
			    «ENDFOR»
		    «ENDFOR»
		    
		    «FOR metaClass: diagram.metaClasses»
			    «FOR metaReference : metaClass.references »
		        {
		            // «metaReference.getName»
		            ICreateConnectionFeature createFeature = new «addToImports(feature_package(), diagram.name + "Create" + metaReference.metaClass.getName + metaReference.getName + "Feature")»(this.getFeatureProvider());
		            ConnectionCreationToolEntry objectCreationToolEntry = new ConnectionCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId());
		            objectCreationToolEntry.addCreateConnectionFeature(createFeature);
		            PaletteCompartmentEntry compartment = compartments.get("Other");
		            if( compartment == null ){
		                compartment = new PaletteCompartmentEntry("Other", null);
		            }
		            compartments.put("Other", compartment);
		            compartment.addToolEntry(objectCreationToolEntry);
		        }
			    «ENDFOR»
		    «ENDFOR»
		        IPaletteCompartmentEntry[] res = compartments.values().toArray(new IPaletteCompartmentEntry[compartments.size()]);
		        return res;
		    }
		}
	'''
	
	def objectCreationEntry(String className, String paletteCompartment) '''
		{
			ICreateFeature createFeature = new «addToImports(feature_package(), className)»(this.getFeatureProvider());
	        ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
	        PaletteCompartmentEntry compartment = compartments.get("«paletteCompartment»");
	        if( compartment == null ){
    	        compartment = new PaletteCompartmentEntry("«paletteCompartment»", null);
    	    }
	        compartments.put("«paletteCompartment»", compartment);
            compartment.addToolEntry(objectCreationToolEntry);
        }
	'''
	
}
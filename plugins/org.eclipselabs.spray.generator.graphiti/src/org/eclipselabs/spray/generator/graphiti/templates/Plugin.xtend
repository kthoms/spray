package org.eclipselabs.spray.generator.graphiti.templates

import java.util.List
import org.eclipselabs.spray.mm.xspray.*
import org.eclipse.emf.ecore.*
import org.eclipselabs.spray.generator.graphiti.util.*
import org.eclipselabs.spray.mm.xspray.extensions.XsprayExtensions
import com.google.inject.Inject

class Plugin extends TemplateUtil {
	@Inject extension XsprayExtensions e1
	
	def generate(Diagram diagram) '''
		«var diagramName = diagram.name»
<?xml version="1.0" encoding="UTF-8"?>
		<?eclipse version="3.0"?>
		«pluginHeader(this)»
		<plugin>
		   <!-- Potentially redefine the EDITOR EXTENSION TO ALLOW FOR OUR OWN EDITOR SUBCLASS TO BE USED. 
		   <extension
		         point="org.eclipse.ui.editors">
		      <editor
		          class="«GeneratorUtil::diagram_package()».«diagramName»DiagramEditor"
		          contributorClass="org.eclipse.graphiti.ui.editor.DiagramEditorActionBarContributor"
		          default="true"
		          extensions="diagram"
		          icon="icons/diagram.gif"
		          id="«GeneratorUtil::diagram_package()».«diagramName»DiagramEditor"
		          matchingStrategy="org.eclipse.graphiti.ui.editor.DiagramEditorFactory$DiagramEditorMatchingStrategy"
		          name="%_diagram_editor_name">
		       <contentTypeBinding
		             contentTypeId="org.eclipse.graphiti.content.diagram">
		       </contentTypeBinding>
		      </editor>
		   </extension>
		   -->
		
		  <extension
		      point="org.eclipse.graphiti.ui.diagramTypes">
		    <diagramType
		      description="This is the diagram type for the «diagramName» diagram type"
		      id="«GeneratorUtil::diagram_package()».«diagramName»DiagramType"
		      name="«diagramName» Graphiti Diagram Type"
		      type="«diagramName»">
		    </diagramType>
		  </extension>
		
		  <extension
		      point="org.eclipse.graphiti.ui.diagramTypeProviders">
		    <diagramTypeProvider
		      class="«GeneratorUtil::diagram_package()».«diagramName»DiagramTypeProvider"
		      description="This is my editor for the «diagramName» diagram type"
		      id="«GeneratorUtil::diagram_package()».«diagramName»DiagramTypeProvider"
		      name="«diagramName» editor">
		      <diagramType
		            id="«GeneratorUtil::diagram_package()».«diagramName»DiagramType">
		      </diagramType>
		        <imageProvider
		               id="«GeneratorUtil::diagram_package()».«diagramName»ImageProvider">
		         </imageProvider>
		    </diagramTypeProvider>
		  </extension>
		
		   <extension
		         point="org.eclipse.graphiti.ui.imageProviders">
		      <imageProvider
		            class="«GeneratorUtil::diagram_package()».«diagramName»ImageProvider"
		               id="«GeneratorUtil::diagram_package()».«diagramName»ImageProvider">
		      </imageProvider>
		   </extension>
		
		  <extension
		      point="org.eclipse.ui.views.properties.tabbed.propertyContributor">
		      <propertyContributor contributorId="«diagramName».PropertyContributor">
		          <propertyCategory category="«diagramName»Category">
		          </propertyCategory>
		      </propertyContributor>
		  </extension>
		
		  <extension
		      point="org.eclipse.ui.views.properties.tabbed.propertyTabs">
		      <propertyTabs contributorId="«diagramName».PropertyContributor">
		          <propertyTab label="Main" category="«diagramName»Category"
		              id="«diagramName».main.tab">
		          </propertyTab>
		      </propertyTabs>
		  </extension>
		«FOR cls : diagram.metaClasses »   
		  «XtendProperties::setValue("PreviousSection", null)»
		  <extension
		      point="org.eclipse.ui.views.properties.tabbed.propertySections">
		      <propertySections contributorId="«diagramName».PropertyContributor">
		    «FOR property : cls.type.EAllAttributes»
		          <propertySection tab="«diagramName».main.tab"           
		           class="«GeneratorUtil::property_package()».«cls.name»«property.name.toFirstUpper()»Section"
		           filter="«GeneratorUtil::property_package()».«cls.name»Filter"
		         «IF XtendProperties::getValue("PreviousSection") != null»
		           afterSection="«XtendProperties::getValue("PreviousSection")»"
		         «ENDIF»
		           «XtendProperties::setValue("PreviousSection", diagramName + ".main.tab." + cls.name + "." + property.name)»
		           id="«XtendProperties::getValue("PreviousSection")»">
		          </propertySection>
		    «ENDFOR»
		      </propertySections>
		  </extension>
		«ENDFOR»
	
	
		// Find all clases that are shown as lists in the compartments
		«FOR cls :  diagram.metaClasses »
			«IF cls.representedBy instanceof Container»
				«var container = (cls.representedBy as Container) »
			    «FOR ref :  container.parts.filter(typeof(MetaReference)) »  
			    	«XtendProperties::setValue("refName", ref.name)» 
					«val references = cls.type.EAllReferences» 
					«val target = ref.reference»
			  		«XtendProperties::setValue("PreviousSection", null)»
				    <extension
				      point="org.eclipse.ui.views.properties.tabbed.propertySections">
				      <propertySections contributorId="«diagramName».PropertyContributor">
				    «FOR attribute : target.EReferenceType.EAllAttributes»
				          <propertySection tab="«diagramName».main.tab"           
				           class="«GeneratorUtil::property_package()».«target.EReferenceType.name»«attribute.name.toFirstUpper()»Section"
				           filter="«GeneratorUtil::property_package()».«target.EReferenceType.name»Filter"
				         «IF XtendProperties::getValue("PreviousSection") != null»
				           afterSection="«XtendProperties::getValue("PreviousSection")»"
				         «ENDIF»
				           «XtendProperties::setValue("PreviousSection", diagramName + ".main.tab." + target.EReferenceType.name + "." + attribute.name)»
				           id="«XtendProperties::getValue("PreviousSection")»">
				          </propertySection>
				    «ENDFOR»
				      </propertySections>
				  </extension>
				«ENDFOR»
			«ENDIF»
		«ENDFOR»
		</plugin>
	'''
	
	
}

/*

 */
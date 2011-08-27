/*************************************************************************************
 *
 * Generated on Sat Aug 27 20:37:44 CEST 2011 by XSpray ToolBehaviourProvider.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package  org.xspray.examples.mod4j.diagram;

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
// BusinessClass
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClassFeature;
// Association
import org.xspray.examples.mod4j.features.mod4jCreateAssociationFeature;

import org.xspray.examples.mod4j.features.mod4jCreateAssociationFeature;
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesBlobBinaryPropertyFeature;
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesStringPropertyFeature;
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesBoolPropertyFeature;
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesEnumerationPropertyFeature;
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesDateTimePropertyFeature;
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesIntegerPropertyFeature;
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClassbusinessRulesUniqueRuleFeature;
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesBlobTextPropertyFeature;
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClassFeature;
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasssuperclassFeature;
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesDecimalPropertyFeature;
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClassbusinessRulesBusinessRuleFeature;

public class mod4jToolBehaviourProviderBase  extends DefaultToolBehaviorProvider   {
    public mod4jToolBehaviourProviderBase(IDiagramTypeProvider dtp) {
        super(dtp);
    }


    @Override
    public IPaletteCompartmentEntry[] getPalette() {
        Map<String, PaletteCompartmentEntry> compartments = new HashMap<String, PaletteCompartmentEntry>();

{
	ICreateFeature createFeature = new mod4jCreateBusinessClassFeature(this.getFeatureProvider());
			        ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
			        PaletteCompartmentEntry compartment = compartments.get("Shapes");
			        if( compartment == null ){
		    	        compartment = new PaletteCompartmentEntry("Shapes", null);
		    	    }
			        compartments.put("Shapes", compartment);
		            compartment.addToolEntry(objectCreationToolEntry);
		        }
		        
							{
								ICreateFeature createFeature = new mod4jCreateBusinessClasspropertiesBoolPropertyFeature(this.getFeatureProvider());
								        ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
								        PaletteCompartmentEntry compartment = compartments.get("XXX");
								        if( compartment == null ){
							    	        compartment = new PaletteCompartmentEntry("XXX", null);
							    	    }
								        compartments.put("XXX", compartment);
							            compartment.addToolEntry(objectCreationToolEntry);
							        }
//					, new mod4jCreateBusinessClasspropertiesBoolPropertyFeature(this)
							{
								ICreateFeature createFeature = new mod4jCreateBusinessClasspropertiesDateTimePropertyFeature(this.getFeatureProvider());
								        ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
								        PaletteCompartmentEntry compartment = compartments.get("XXX");
								        if( compartment == null ){
							    	        compartment = new PaletteCompartmentEntry("XXX", null);
							    	    }
								        compartments.put("XXX", compartment);
							            compartment.addToolEntry(objectCreationToolEntry);
							        }
//					, new mod4jCreateBusinessClasspropertiesDateTimePropertyFeature(this)
							{
								ICreateFeature createFeature = new mod4jCreateBusinessClasspropertiesEnumerationPropertyFeature(this.getFeatureProvider());
								        ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
								        PaletteCompartmentEntry compartment = compartments.get("XXX");
								        if( compartment == null ){
							    	        compartment = new PaletteCompartmentEntry("XXX", null);
							    	    }
								        compartments.put("XXX", compartment);
							            compartment.addToolEntry(objectCreationToolEntry);
							        }
//					, new mod4jCreateBusinessClasspropertiesEnumerationPropertyFeature(this)
							{
								ICreateFeature createFeature = new mod4jCreateBusinessClasspropertiesIntegerPropertyFeature(this.getFeatureProvider());
								        ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
								        PaletteCompartmentEntry compartment = compartments.get("XXX");
								        if( compartment == null ){
							    	        compartment = new PaletteCompartmentEntry("XXX", null);
							    	    }
								        compartments.put("XXX", compartment);
							            compartment.addToolEntry(objectCreationToolEntry);
							        }
//					, new mod4jCreateBusinessClasspropertiesIntegerPropertyFeature(this)
							{
								ICreateFeature createFeature = new mod4jCreateBusinessClasspropertiesStringPropertyFeature(this.getFeatureProvider());
								        ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
								        PaletteCompartmentEntry compartment = compartments.get("XXX");
								        if( compartment == null ){
							    	        compartment = new PaletteCompartmentEntry("XXX", null);
							    	    }
								        compartments.put("XXX", compartment);
							            compartment.addToolEntry(objectCreationToolEntry);
							        }
//					, new mod4jCreateBusinessClasspropertiesStringPropertyFeature(this)
							{
								ICreateFeature createFeature = new mod4jCreateBusinessClasspropertiesBlobBinaryPropertyFeature(this.getFeatureProvider());
								        ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
								        PaletteCompartmentEntry compartment = compartments.get("XXX");
								        if( compartment == null ){
							    	        compartment = new PaletteCompartmentEntry("XXX", null);
							    	    }
								        compartments.put("XXX", compartment);
							            compartment.addToolEntry(objectCreationToolEntry);
							        }
//					, new mod4jCreateBusinessClasspropertiesBlobBinaryPropertyFeature(this)
							{
								ICreateFeature createFeature = new mod4jCreateBusinessClasspropertiesBlobTextPropertyFeature(this.getFeatureProvider());
								        ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
								        PaletteCompartmentEntry compartment = compartments.get("XXX");
								        if( compartment == null ){
							    	        compartment = new PaletteCompartmentEntry("XXX", null);
							    	    }
								        compartments.put("XXX", compartment);
							            compartment.addToolEntry(objectCreationToolEntry);
							        }
//					, new mod4jCreateBusinessClasspropertiesBlobTextPropertyFeature(this)
							{
								ICreateFeature createFeature = new mod4jCreateBusinessClasspropertiesDecimalPropertyFeature(this.getFeatureProvider());
								        ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
								        PaletteCompartmentEntry compartment = compartments.get("XXX");
								        if( compartment == null ){
							    	        compartment = new PaletteCompartmentEntry("XXX", null);
							    	    }
								        compartments.put("XXX", compartment);
							            compartment.addToolEntry(objectCreationToolEntry);
							        }
//					, new mod4jCreateBusinessClasspropertiesDecimalPropertyFeature(this)
							{
								ICreateFeature createFeature = new mod4jCreateBusinessClassbusinessRulesUniqueRuleFeature(this.getFeatureProvider());
								        ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
								        PaletteCompartmentEntry compartment = compartments.get("XXX");
								        if( compartment == null ){
							    	        compartment = new PaletteCompartmentEntry("XXX", null);
							    	    }
								        compartments.put("XXX", compartment);
							            compartment.addToolEntry(objectCreationToolEntry);
							        }
//					, new mod4jCreateBusinessClassbusinessRulesUniqueRuleFeature(this)
							{
								ICreateFeature createFeature = new mod4jCreateBusinessClassbusinessRulesBusinessRuleFeature(this.getFeatureProvider());
								        ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
								        PaletteCompartmentEntry compartment = compartments.get("XXX");
								        if( compartment == null ){
							    	        compartment = new PaletteCompartmentEntry("XXX", null);
							    	    }
								        compartments.put("XXX", compartment);
							            compartment.addToolEntry(objectCreationToolEntry);
							        }
//					, new mod4jCreateBusinessClassbusinessRulesBusinessRuleFeature(this)

			    // 00000 Embedded list of references mod4jCreateBusinessClasspropertiesPropertyFeature
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
			    // 00000 Embedded list of references mod4jCreateBusinessClassbusinessRulesAbstractBusinessRuleFeature
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

    // do the same for connection creators
{
    ICreateConnectionFeature createFeature = new mod4jCreateAssociationFeature(this.getFeatureProvider());
    ConnectionCreationToolEntry objectCreationToolEntry = new ConnectionCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId());
    objectCreationToolEntry.addCreateConnectionFeature(createFeature);
    PaletteCompartmentEntry compartment = compartments.get("Connections");
    if( compartment == null ){
        compartment = new PaletteCompartmentEntry("Connections", null);
    }
    compartments.put("Connections", compartment);
    compartment.addToolEntry(objectCreationToolEntry);
}
    
{
    // superclass
    ICreateConnectionFeature createFeature = new mod4jCreateBusinessClasssuperclassFeature(this.getFeatureProvider());
    ConnectionCreationToolEntry objectCreationToolEntry = new ConnectionCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId());
    objectCreationToolEntry.addCreateConnectionFeature(createFeature);
    PaletteCompartmentEntry compartment = compartments.get("Other");
    if( compartment == null ){
        compartment = new PaletteCompartmentEntry("Other", null);
    }
    compartments.put("Other", compartment);
    compartment.addToolEntry(objectCreationToolEntry);
}
        IPaletteCompartmentEntry[] res = compartments.values().toArray(new IPaletteCompartmentEntry[compartments.size()]);
        return res;
    }
}

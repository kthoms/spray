/*************************************************************************************
 *
 * Generated on Sat Aug 27 20:37:41 CEST 2011 by XSpray DiagramTypeProvider.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package  org.xspray.examples.mod4j.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class mod4jDiagramTypeProviderBase extends AbstractDiagramTypeProvider {

    private IToolBehaviorProvider[] toolBehaviorProviders;

    public mod4jDiagramTypeProviderBase() {
        super();
        setFeatureProvider(new mod4jFeatureProvider(this));
    }

    @Override
    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
        if (toolBehaviorProviders == null) {
            toolBehaviorProviders =
                new IToolBehaviorProvider[] { new mod4jToolBehaviourProvider(
                    this) };
        }
        return toolBehaviorProviders;
    }
}

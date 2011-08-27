/*************************************************************************************
 *
 * Generated on Sat Aug 27 19:33:29 CEST 2011 by XSpray ImageProvider.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package  org.xspray.examples.mod4j.diagram;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;

public class mod4jImageProviderBase extends AbstractImageProvider {

    // The prefix for all identifiers of this image provider
    public static final String PREFIX = "org.xspray.examples.mod4j.diagram.";

// The image identifier for an EReference.
public static final String mod4j_connection16  = PREFIX + "connection16";

    @Override
    protected void addAvailableImages() {
        // register the path for each image identifier
    addImageFilePath(mod4j_connection16, "icons/connection16.gif");
    }
}

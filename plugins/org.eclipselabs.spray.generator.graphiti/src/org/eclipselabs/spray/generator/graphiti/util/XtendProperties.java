package org.eclipselabs.spray.generator.graphiti.util;

import java.util.HashMap;
import java.util.Map;

public class XtendProperties {
    static protected Map<String, String> properties = new HashMap<String, String>();

    static public void setValue(String key, String value) {
        properties.put(key, value);
    }

    static public String getValue(String key) {
        return properties.get(key);
    }
}

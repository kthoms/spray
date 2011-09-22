package org.eclipselabs.spray.generator.graphiti.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class XtendProperties {

    static private class Import {
        String packageName;
        String className;   ;

        public Import(String pck, String name) {
            packageName = pck;
            className = name;
        }
    }

    static protected Set<Import> imports = new HashSet<Import>();

    static public void initializeImports() {
        imports.clear();
    }

    static public String addToImports(String pck, String cls) {
        imports.add(new Import(pck, cls));
        return cls;
    }

    static public Set<String> getImports() {
        Set<String> result = new HashSet<String>();
        for (Import i : imports) {
            result.add(i.packageName + "." + i.className);
        }
        return result;
    }

    static public String importsAsString() {
        StringBuilder result = new StringBuilder();
        for (Import i : imports) {
            result.append("import " + i.packageName + "." + i.className + ";\n");
        }
        return result.toString();
    }

    static protected Map<String, String> properties = new HashMap<String, String>();

    static public void setValue(String key, String value) {
        properties.put(key, value);
    }

    static public String getValue(String key) {
        return properties.get(key);
    }

    //    static public Resource getResource(EObject obj) {
    //        return obj.eResource();
    //    }
    //
    //    static public List<EClass> getSubclasses(EClass obj) {
    //        Resource res = obj.eResource();
    //        List<EClass> result = new ArrayList<EClass>();
    //
    //        for (Iterator iterator = res.getAllContents(); iterator.hasNext();) {
    //            EObject eObject = (EObject) iterator.next();
    //            if (eObject instanceof EClass) {
    //                EClass eClass = (EClass) eObject;
    //                if (eClass.getEAllSuperTypes().contains(obj)) {
    //                    result.add(eClass);
    //                }
    //            }
    //        }
    //        return result;
    //    }
}

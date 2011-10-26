package org.eclipselabs.spray.generator.graphiti.util;

import org.eclipse.core.runtime.Assert;
import org.eclipse.xtext.common.types.JvmTypeReference;

@SuppressWarnings("restriction")
public class ImportUtil {
    private org.eclipse.xtext.xbase.compiler.ImportManager xbaseImportManager;
    private org.eclipse.emf.codegen.util.ImportManager     emfImportManager;

    public void initImports(String compilationUnitPackage) {
        xbaseImportManager = new org.eclipse.xtext.xbase.compiler.ImportManager(/* organizeImports */true);
        emfImportManager = new org.eclipse.emf.codegen.util.ImportManager(compilationUnitPackage);
    }

    public String shortName(JvmTypeReference typeRef) {
        Assert.isNotNull(emfImportManager, "Call initImports() first");
        return emfImportManager.getImportedName(typeRef.getIdentifier(), true);
    }

    public String shortName(String qualifiedName) {
        Assert.isNotNull(emfImportManager, "Call initImports() first");
        return emfImportManager.getImportedName(qualifiedName, true);
    }

    public String shortName(Class<?> clazz) {
        Assert.isNotNull(emfImportManager, "Call initImports() first");
        return emfImportManager.getImportedName(clazz.getName(), true);
    }

    public String printImports() {
        Assert.isNotNull(emfImportManager, "Call initImports() first");
        StringBuilder builder = new StringBuilder();
        for (String i : emfImportManager.getImports()) {
            builder.append("import ").append(i).append(';').append(System.getProperty("line.separator"));
        }
        return builder.toString();
    }

    public org.eclipse.xtext.xbase.compiler.ImportManager getXbaseImportManager() {
        return xbaseImportManager;
    }

}

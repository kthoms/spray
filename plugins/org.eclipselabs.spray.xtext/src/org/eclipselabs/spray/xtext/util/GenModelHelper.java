package org.eclipselabs.spray.xtext.util;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

import com.google.inject.Inject;

public class GenModelHelper {
    @Inject
    private IQualifiedNameProvider qualifiedNameProvider;

    public String getInstanceClassName(EClass eClass) {
        if (eClass.eIsProxy()) {
            return null;
        }
        URI genModelUri = EcorePlugin.getEPackageNsURIToGenModelLocationMap().get(eClass.getEPackage().getNsURI());
        if (genModelUri == null) {
            throw new IllegalStateException("GenModel for EPackage '" + eClass.getEPackage().getNsURI() + "' must be registered.");
        }
        Resource res = eClass.eResource().getResourceSet().getResource(genModelUri, true);
        EcoreUtil.resolveAll(res);

        GenModel genModel = (GenModel) res.getContents().get(0);
        for (GenPackage pck : genModel.getAllGenPackagesWithClassifiers()) {
            for (GenClass genClass : pck.getGenClasses()) {
                EClass c = genClass.getEcoreClass();
                if (qualifiedNameProvider.getFullyQualifiedName(c).equals(qualifiedNameProvider.getFullyQualifiedName(eClass))) {
                    return pck.getInterfacePackageName() + "." + genClass.getInterfaceName();
                }
            }
        }
        return null;
    }
}

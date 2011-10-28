package org.eclipselabs.spray.xtext.ui.internal;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.utils.GenModelHelper;

public class MweGenModelHelperExt extends GenModelHelper {
    private Log log = LogFactory.getLog(getClass());

    public void unregisterGenModel(ResourceSet rs, URI genmodelURI) throws ConfigurationException {
        Resource res = rs.getResource(genmodelURI, true);
        if (res == null)
            throw new ConfigurationException("Couldn't find resource under  " + genmodelURI);
        for (EObject object : res.getContents())
            if (object instanceof GenModel)
                unregisterGenModel((GenModel) object);
    }

    public void unregisterGenModel(GenModel genModel) {
        Map<String, URI> registry = EcorePlugin.getEPackageNsURIToGenModelLocationMap();
        for (GenPackage pkg : collectGenPackages(genModel)) {
            String nsURI = pkg.getEcorePackage().getNsURI();
            if (nsURI != null) {
                if (log.isInfoEnabled())
                    log.info("Unregistered GenModel '" + nsURI + "' from '" + registry.get(nsURI) + "'");
                registry.remove(nsURI);
            }
        }
    }

}

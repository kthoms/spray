package org.xspray.generator.graphiti.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.xspray.mm.xspray.Diagram;
import org.xspray.mm.xspray.MetaAttribute;
import org.xspray.mm.xspray.MetaClass;
import org.xspray.mm.xspray.MetaReference;

import com.google.common.collect.Iterables;

public class MetaModel {

    public static String fullPackageName(EClassifier eClass) {
        EPackage pack = eClass.getEPackage();
        String result = pack.getName();

        while (pack.getESuperPackage() != null) {
            pack = pack.getESuperPackage();
            result = pack.getName() + "." + result;
        }
        if (getBasePackage(eClass) != null) {
            result = getBasePackage(eClass) + "." + result;
        }
        return result;
    }

    static public String fullyQualifiedPackageNameEClass(EClass cls) {
        return fullPackageName(cls);
    }

    static public String fullyQualifiedNameEClass(EClass cls) {
        return fullyQualifiedPackageNameEClass(cls) + "." + cls.getName();
    }

    static protected ResourceSet set                       = null;

    static protected String      metaURI                   = null;

    static protected Resource    metaModelEcoreResource    = null;
    static protected Resource    metaModelGenmodelResource = null;

    private static String        basePackage               = null;

    public static String getBasePackage(EClassifier eClassifier) {
        EPackage pack = eClassifier.getEPackage();
        URI genModelLoc = EcorePlugin.getEPackageNsURIToGenModelLocationMap().get(pack.getNsURI());
        if (genModelLoc == null) {
            throw new IllegalStateException("No genmodel found for package URI " + pack.getNsURI() + ". If you are running in stanalone mode make sure register the genmodel file.");
        }
        ResourceSet rs = new ResourceSetImpl();
        Resource genModelResource = rs.getResource(genModelLoc, true);
        for (GenModel g : Iterables.filter(genModelResource.getContents(), GenModel.class)) {
            for (GenPackage genPack : g.getGenPackages()) {
                if (genPack.getEcorePackage() == pack) {
                    return genPack.getBasePackage();
                }
            }
        }
        return null;
    }

    static public List<EClassifier> getClasifiers(EPackage p) {
        List<EClassifier> result = new ArrayList<EClassifier>();

        result.addAll(p.getEClassifiers());
        for (EPackage sub : p.getESubpackages()) {
            result.addAll(getClasifiers(sub));
        }

        return result;

    }

    static public EClass findEClass(Diagram diagram, String className) {
        for (MetaClass mc : diagram.getMetaClasses()) {
            if (className.equals(mc.getType().getName())) {
                return mc.getType();
            }
        }
        return null;
    }

    static public MetaClass findMetaClass(MetaReference ref) {
        if (ref.getMetaClass() != null) {
            return ref.getMetaClass();
        } else if (ref.getContainer() != null) {
            return ref.getContainer().getRepresents();
        }
        return null;
    }

    static public MetaClass findMetaClass(MetaAttribute ref) {
        if (ref.getContainer() != null) {
            return ref.getContainer().getRepresents();
        }
        return null;
    }

    static public List<EClassifier> getMetaClassesInResource(Resource res) {
        List<EClassifier> result = new ArrayList<EClassifier>();
        EcoreUtil.resolveAll(res);
        EList<EObject> c = res.getContents();
        for (EObject eObject : c) {
            if (eObject instanceof EClass) {
                EClass cls = (EClass) eObject;
                result.add(cls);
            } else if (eObject instanceof EPackage) {
                EPackage p = ((EPackage) eObject);
                result.addAll(getClasifiers(p));
            } else {
            }
        }
        return result;
    }

    static public Resource getResource(EObject obj) {
        return obj.eResource();
    }

    static public List<EClass> getSubclasses(EClass obj) {
        Resource res = obj.eResource();
        List<EClass> result = new ArrayList<EClass>();

        for (Iterator iterator = res.getAllContents(); iterator.hasNext();) {
            EObject eObject = (EObject) iterator.next();
            if (eObject instanceof EClass) {
                EClass eClass = (EClass) eObject;
                if (eClass.getEAllSuperTypes().contains(obj)) {
                    result.add(eClass);
                }
            }
        }
        return result;
    }

}

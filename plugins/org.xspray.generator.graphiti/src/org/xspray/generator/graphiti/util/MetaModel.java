package org.xspray.generator.graphiti.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.xspray.mm.xspray.Diagram;
import org.xspray.mm.xspray.MetaAttribute;
import org.xspray.mm.xspray.MetaClass;
import org.xspray.mm.xspray.MetaReference;

public class MetaModel {

    public static String fullPackageName(EClass eClass) {
        EPackage pack = eClass.getEPackage();
        String result = pack.getName();

        while (pack.getESuperPackage() != null) {
            pack = pack.getESuperPackage();
            result = pack.getName() + "." + result;
        }
        if( getBasePackage() != null ){
            result = getBasePackage() + "." + result;
        }
        return result;
    }

    public static String fullPackageName(EDataType eClass) {
        EPackage pack = eClass.getEPackage();
        String result = pack.getName();

        while (pack.getESuperPackage() != null) {
            pack = pack.getESuperPackage();
            result = pack.getName() + "." + result;
        }
        if( getBasePackage() != null ){
            result = getBasePackage() + "." + result;
        }
        return result;
    }

    static public String fullyQualifiedPackageNameEClass(EClass cls) {
        return fullPackageName(cls);
    }

    static public String fullyQualifiedNameEClass(EClass cls) {
        return fullyQualifiedPackageNameEClass(cls) + "." + cls.getName();
    }

    static protected ResourceSet set = null;

    static protected String metaURI = null;

    static protected Resource metaModelEcoreResource = null;
    static protected Resource metaModelGenmodelResource = null;

    /**
     * Read the .ecore and .genmodel of the metamodel 
     * @param d
     */
    static public void readResource(Diagram d) {
        if (d.getImport1().equals(metaURI)) {
            return;
        }
        
        GenModelPackage packageInstance = GenModelPackage.eINSTANCE;
        
        set = new ResourceSetImpl();
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());
        URI uri = URI.createFileURI(d.getImport1());
        metaModelEcoreResource = set.createResource(uri);
        try {
            metaModelEcoreResource.load(null);
        } catch (IOException e) {
            System.out.println("ERROR, Resource = " + metaModelEcoreResource.toString());
            e.printStackTrace();
        }
        String gemodelfile = d.getImport1().replace("Ecore.ecore", "Ecore.genmodel");
        metaModelGenmodelResource = set.createResource(URI.createURI(gemodelfile));
        try {
            metaModelGenmodelResource.load(null);
        } catch (IOException e) {
            System.out.println("ERROR, Resource = " + metaModelGenmodelResource.toString());
            e.printStackTrace();
        }
        metaURI = d.getImport1();
    }

    private static String basePackage = null;
    
    public static String getBasePackage() {
        if( basePackage != null ){
            return basePackage;
        }
        List<EObject> contents = metaModelGenmodelResource.getContents();
        for(EObject o : contents){
            if( o instanceof GenModel){
                GenModel g = (GenModel)o;
                for(GenPackage genPack : g.getGenPackages()){
                    basePackage = genPack.getBasePackage();
                }
            }
        }
        
        return basePackage;
    }

    static public List<EClassifier> getClasifiers(EPackage p) {
        List<EClassifier> result = new ArrayList<EClassifier>();

        result.addAll(p.getEClassifiers());
        for (EPackage sub : p.getESubpackages()) {
            result.addAll(getClasifiers(sub));
        }

        return result;

    }

    static public EClass findEClass(MetaClass meta) {
        if (meta == null) {
            return null;
        }
        List<EClassifier> all = getMetaClasses(meta.getDiagram());
        for (EClassifier eClassifier : all) {
            if (eClassifier.getName().equals(meta.getName())) {
                if (eClassifier instanceof EClass) {
                    return (EClass) eClassifier;
                }
            }
        }
        return null;
    }

    static public EClass findEClass(Diagram diagram, String className) {
        List<EClassifier> all = getMetaClasses(diagram);
        for (EClassifier eClassifier : all) {
            if (eClassifier.getName().equals(className)) {
                if (eClassifier instanceof EClass) {
                    return (EClass) eClassifier;
                }
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

    // static public List<EClassifier> getMetaClasses(Diagram d) {
    // List<EClassifier> result = new ArrayList<EClassifier>();
    // readResource(d);
    // EList<EObject> c = res.getContents();
    // for (EObject eObject : c) {
    // if (eObject instanceof EClass) {
    // EClass cls = (EClass) eObject;
    // result.add(cls);
    // } else if (eObject instanceof EPackage) {
    // EPackage p = ((EPackage) eObject);
    // result.addAll(getClasifiers(p));
    // } else {
    // }
    // }
    // return result;
    // }
    static public List<EClassifier> getMetaClasses(Diagram d) {
        List<EClassifier> result = new ArrayList<EClassifier>();
        readResource(d);
        ResourceSet set = new ResourceSetImpl();
        // set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
        // new XMIResourceFactoryImpl());
        Resource res = set.createResource(URI.createURI(d.getImport1()));
        try {
            res.load(null);
        } catch (IOException e) {
            System.out.println("ERROR, Resource = " + res.toString());
            e.printStackTrace();
        }
        EcoreUtil.resolveAll(res);
        for (Resource r : set.getResources()) {
            result.addAll(getMetaClassesInResource(r));
        }
        return result;
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

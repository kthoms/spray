package org.eclipselabs.spray.xtext.customizing;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipselabs.spray.mm.spray.MetaAttribute;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.Shape;
import org.eclipselabs.spray.mm.spray.SprayPackage;

import com.google.inject.Inject;

public class SprayQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
    @Inject
    private IQualifiedNameConverter converter;

    QualifiedName qualifiedName(JvmGenericType type) {
        return converter.toQualifiedName(type.getQualifiedName());
    }

    public QualifiedName qualifiedName(MetaClass element) {
        List<INode> nodes = NodeModelUtils.findNodesForFeature(element, SprayPackage.Literals.META_CLASS__TYPE);
        String eClassName = NodeModelUtils.getTokenText(nodes.get(0));
        return QualifiedName.create(element.getDiagram().getName(), eClassName);
    }

    /**
     * MetaAttribute has a name property, but we do not want to get it scoped
     */
    public QualifiedName qualifiedName(MetaAttribute element) {
        return null;
    }

    public QualifiedName qualifiedName(Shape element) {
        EObject parentObject = element.eContainer();
        QualifiedName parent = getFullyQualifiedName(parentObject);
        while (parent == null && parentObject != null) {
            parentObject = parentObject.eContainer();
            parent = parentObject != null ? getFullyQualifiedName(parentObject) : null;
        }
        String name = element.eClass().getName() + element.eContainer().eContents().indexOf(element);
        return parent.append(name);
    }
}

package org.eclipselabs.spray.xtext.customizing;

import java.util.List;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipselabs.spray.mm.spray.MetaAttribute;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.SprayPackage;

public class SprayQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
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
}

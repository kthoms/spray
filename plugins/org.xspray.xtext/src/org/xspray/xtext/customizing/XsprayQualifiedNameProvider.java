package org.xspray.xtext.customizing;

import java.util.List;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.xspray.mm.xspray.MetaAttribute;
import org.xspray.mm.xspray.MetaClass;
import org.xspray.mm.xspray.XsprayPackage;

public class XsprayQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
    public QualifiedName qualifiedName(MetaClass element) {
        List<INode> nodes = NodeModelUtils.findNodesForFeature(element, XsprayPackage.Literals.META_CLASS__TYPE);
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

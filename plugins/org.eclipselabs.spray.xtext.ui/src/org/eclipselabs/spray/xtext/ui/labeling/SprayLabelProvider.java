package org.eclipselabs.spray.xtext.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.eclipselabs.spray.mm.spray.Connection;
import org.eclipselabs.spray.mm.spray.Container;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.Import;
import org.eclipselabs.spray.mm.spray.Line;
import org.eclipselabs.spray.mm.spray.MetaAttribute;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.StandardBehaviour;
import org.eclipselabs.spray.mm.spray.Text;
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions;
import org.eclipselabs.spray.xtext.services.SprayGrammarAccess;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class SprayLabelProvider extends DefaultEObjectLabelProvider {
    @Inject
    private SprayExtensions    sprayExtensions;
    @Inject
    private SprayGrammarAccess grammar;

    @Inject
    public SprayLabelProvider(AdapterFactoryLabelProvider delegate) {
        super(delegate);
    }

    public String text(Connection element) {
        return String.format(" %s -> %s", element.getFrom().getName(), element.getTo().getName());
    }

    public String image(Connection element) {
        return "connection16.gif";
    }

    public String text(Container element) {
        return "";
    }

    public String image(Diagram element) {
        return "Diagram.gif";
    }

    public String image(Import element) {
        return "Import.gif";
    }

    public String text(Line element) {
        return "";
    }

    public String image(Line element) {
        return "Line.png";
    }

    public String image(MetaAttribute element) {
        return "EAttribute.gif";
    }

    public String text(MetaClass element) {
        if (element.getAlias() != null) {
            return String.format("%s (%s)", element.getType().getName(), element.getAlias());
        } else {
            return element.getType() != null ? element.getType().getName() : "";
        }
    }

    public String image(MetaClass element) {
        return "EClass.gif";
    }

    public String text(MetaReference element) {
        return String.format("%s/%s::%s", element.getReference().getName(), element.getReference().getEReferenceType().getName(), sprayExtensions.getLabelPropertyName(element));
    }

    public String image(MetaReference element) {
        return "EReference.gif";
    }

    public String text(StandardBehaviour element) {
        if (element.getPaletteCompartment() != null) {
            return element.getPaletteCompartment();
        } else if (element.getLabel() != null) {
            return element.getLabel();
        } else {
            return null;
        }
    }

    public String image(StandardBehaviour element) {
        if (element.getPaletteCompartment() != null) {
            return "Palette.gif";
        } else {
            return null;
        }
    }

    public String text(Text element) {
        StringBuilder b = new StringBuilder();
        ICompositeNode node = NodeModelUtils.getNode(element);
        for (INode child : node.getChildren()) {
            if (child.getGrammarElement() == grammar.getTextAccess().getValueXExpressionParserRuleCall_3_0()) {
                b.append(child.getText());
            }
        }
        return b.toString().trim();
    }

    public String image(Text element) {
        return "Text.gif";
    }
}

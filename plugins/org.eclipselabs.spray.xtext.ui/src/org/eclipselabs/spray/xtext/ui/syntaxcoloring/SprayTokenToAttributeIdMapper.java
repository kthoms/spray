package org.eclipselabs.spray.xtext.ui.syntaxcoloring;

import java.util.HashSet;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipselabs.spray.mm.xspray.Color;

public class SprayTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

    private HashSet<String> layoutKeywords = new HashSet<String>();

    public SprayTokenToAttributeIdMapper() {
        layoutKeywords.add("'text'");
        layoutKeywords.add("'container'");
        layoutKeywords.add("'width'");
        layoutKeywords.add("'connection'");
        layoutKeywords.add("'color'");
        layoutKeywords.add("'fill'");
        layoutKeywords.add("'line'");
        layoutKeywords.add("'bold'");
        layoutKeywords.add("'italic'");
        layoutKeywords.add("'icon'");
        for (Color color : Color.values()) {
            System.out.println(color.getLiteral() + "::" + color.getName());
            layoutKeywords.add("'" + color.getName().toLowerCase() + "'");
        }
    }

    @Override
    protected String calculateId(String tokenName, int tokenType) {
        System.out.println(tokenName);
        if (layoutKeywords.contains(tokenName)) {
            return SprayHighlightingConfiguration.LAYOUT_ID;
        }
        return super.calculateId(tokenName, tokenType);
    }

    public String getId(int tokenType) {
        return getMappedValue(tokenType);
    }

}

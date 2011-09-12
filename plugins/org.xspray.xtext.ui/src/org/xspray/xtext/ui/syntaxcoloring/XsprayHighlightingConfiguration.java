package org.xspray.xtext.ui.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class XsprayHighlightingConfiguration extends DefaultHighlightingConfiguration {

    private static final RGB   RGB_ORANGE = new RGB(255, 140, 000);
    public static final String LAYOUT_ID  = "name";

    @Override
    public void configure(IHighlightingConfigurationAcceptor acceptor) {
        super.configure(acceptor);
        acceptor.acceptDefaultHighlighting(LAYOUT_ID, "Name", layoutTextStyle());
    }

    public TextStyle layoutTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setStyle(SWT.BOLD);
        textStyle.setColor(RGB_ORANGE);
        return textStyle;

    }

}

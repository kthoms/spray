package org.eclipselabs.spray.xtext.customizing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider;

@SuppressWarnings("all")
public class SprayDocumentationProvider extends MultiLineCommentDocumentationProvider {
  public String getDocumentation(final EObject object) {
    String _xblockexpression = null;
    {
      String _documentation = super.getDocumentation(object);
      String doc = _documentation;
      _xblockexpression = (doc);
    }
    return _xblockexpression;
  }
}

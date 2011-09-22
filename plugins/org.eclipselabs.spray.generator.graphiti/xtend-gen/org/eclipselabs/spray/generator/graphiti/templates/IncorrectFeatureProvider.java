package org.eclipselabs.spray.generator.graphiti.templates;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.util.XtendProperties;

@SuppressWarnings("all")
public class IncorrectFeatureProvider {
  
  public StringConcatenation finalError(final EPackage pack, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EClassifier> _eClassifiers = pack.getEClassifiers();
      Iterable<EClass> _filter = IterableExtensions.<EClass>filter(_eClassifiers, org.eclipse.emf.ecore.EClass.class);
      for(final EClass cls : _filter) {
        String _name = cls.getName();
        XtendProperties.setValue("className", _name);
        _builder.newLineIfNotEmpty();
        {
          EList<EAttribute> _eAllAttributes = cls.getEAllAttributes();
          for(final EAttribute attribute : _eAllAttributes) {
            String _name_1 = attribute.getName();
            XtendProperties.setValue("attName", _name_1);
            _builder.newLineIfNotEmpty();
            EList<EReference> _eAllReferences = cls.getEAllReferences();
            final Function1<EReference,Boolean> _function = new Function1<EReference,Boolean>() {
                public Boolean apply(final EReference e) {
                  String _value = XtendProperties.getValue("className");
                  String _value_1 = XtendProperties.getValue("attName");
                  boolean _operator_equals = ObjectExtensions.operator_equals(_value, _value_1);
                  return ((Boolean)_operator_equals);
                }
              };
            EReference _findFirst = IterableExtensions.<EReference>findFirst(_eAllReferences, _function);
            EReference target = _findFirst;
            _builder.append(" ");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String eClassName(final EClass cls) {
    String _name = cls.getName();
    return _name;
  }
}
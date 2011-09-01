package org.xspray.generator.graphiti.templates;

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
import org.xspray.generator.graphiti.util.XtendProperties;

@SuppressWarnings("all")
public class IncorrectFeatureProvider {
  
  public StringConcatenation finalError(final EPackage pack, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EClassifier> _eClassifiers = pack.getEClassifiers();
      final Function1<EClassifier,Boolean> _function = new Function1<EClassifier,Boolean>() {
          public Boolean apply(final EClassifier c) {
            return ((Boolean)(c instanceof org.eclipse.emf.ecore.EClass));
          }
        };
      Iterable<EClassifier> _filter = IterableExtensions.<EClassifier>filter(_eClassifiers, _function);
      for(final EClassifier cls : _filter) {
        {
          if ((cls instanceof org.eclipse.emf.ecore.EClass)) {
            _builder.append("\t\t        ");
            EClass eClass = ((EClass) cls);
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t        ");
            String _name = eClass.getName();
            XtendProperties.setValue("className", _name);
            _builder.newLineIfNotEmpty();
            {
              EList<EAttribute> _eAllAttributes = eClass.getEAllAttributes();
              for(final EAttribute attribute : _eAllAttributes) {
                _builder.append("\t\t        \t");
                String _name_1 = attribute.getName();
                XtendProperties.setValue("attName", _name_1);
                _builder.newLineIfNotEmpty();
                EList<EReference> _eAllReferences = eClass.getEAllReferences();
                final Function1<EReference,Boolean> _function_1 = new Function1<EReference,Boolean>() {
                    public Boolean apply(final EReference e) {
                      String _value = XtendProperties.getValue("className");
                      String _value_1 = XtendProperties.getValue("attName");
                      boolean _operator_equals = ObjectExtensions.operator_equals(_value, _value_1);
                      return ((Boolean)_operator_equals);
                    }
                  };
                EReference _findFirst = IterableExtensions.<EReference>findFirst(_eAllReferences, _function_1);
                EReference target = _findFirst;
                _builder.append(" ");
                _builder.newLineIfNotEmpty();
              }
            }
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
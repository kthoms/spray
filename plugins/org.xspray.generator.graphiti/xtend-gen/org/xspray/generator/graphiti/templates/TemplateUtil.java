package org.xspray.generator.graphiti.templates;

import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.xspray.generator.graphiti.util.GeneratorUtil;
import org.xspray.mm.xspray.MetaAttribute;
import org.xspray.mm.xspray.SprayString;
import org.xspray.mm.xspray.StringLiteral;
import org.xspray.mm.xspray.Text;

@SuppressWarnings("all")
public class TemplateUtil extends Object {
  
  public StringConcatenation header(final Object templateClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Generated ");
    String _timestamp = GeneratorUtil.timestamp();
    _builder.append(_timestamp, " ");
    _builder.append("by Xspray ");
    Class<? extends Object> _class = templateClass.getClass();
    String _simpleName = _class.getSimpleName();
    _builder.append(_simpleName, " ");
    _builder.append(".xtend");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This file contains generated and should not be changed.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Use the extension point class (the direct subclass of this class) to add manual code");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*************************************************************************************/");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation extensionHeader(final Object templateClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Generated ");
    String _timestamp = GeneratorUtil.timestamp();
    _builder.append(_timestamp, " ");
    _builder.append("by Xspray ");
    Class<? extends Object> _class = templateClass.getClass();
    String _simpleName = _class.getSimpleName();
    _builder.append(_simpleName, " ");
    _builder.append(".xtend");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This file is an extension point: copy to \"src\" folder to manually add code to this");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* extension point.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*************************************************************************************/");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation pluginHeader(final Object templateClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!--");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("Generated ");
    String _timestamp = GeneratorUtil.timestamp();
    _builder.append(_timestamp, " ");
    _builder.append("by XSpray ");
    Class<? extends Object> _class = templateClass.getClass();
    String _simpleName = _class.getSimpleName();
    _builder.append(_simpleName, " ");
    _builder.append(".xtend");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("This file will be generated oinly once if it need to be regenerated, remove this file.");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("-->");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation valueGenerator(final Text text, final String metaClassVariable) {
    StringConcatenation _builder = new StringConcatenation();
    {
      SprayString[] _value = text.getValue();
      boolean hasAnyElements = false;
      for(final SprayString value : _value) {
        if (!hasAnyElements) {
          hasAnyElements = true;
        } else {
          _builder.appendImmediate(" + ", "");
        }
        {
          if ((value instanceof org.xspray.mm.xspray.StringLiteral)) {
            _builder.append("\"");
            String _name = ((StringLiteral) value).getName();
            _builder.append(_name, "");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();} else {
            if ((value instanceof org.xspray.mm.xspray.MetaAttribute)) {
              _builder.append(metaClassVariable, "");
              _builder.append(".");
              _builder.newLineIfNotEmpty();
              {
                String _path = ((MetaAttribute) value).getPath();
                boolean _contains = _path.contains(".");
                if (_contains) {
                  {
                    String _path_1 = ((MetaAttribute) value).getPath();
                    String[] _split = _path_1.split("\\.");
                    boolean hasAnyElements_1 = false;
                    for(final String id : _split) {
                      if (!hasAnyElements_1) {
                        hasAnyElements_1 = true;
                      } else {
                        _builder.appendImmediate(".", "	");
                      }
                      _builder.append("\t");
                      _builder.append("get");
                      String _firstUpper = StringExtensions.toFirstUpper(id);
                      _builder.append(_firstUpper, "	");
                      _builder.append("()");
                      _builder.newLineIfNotEmpty();
                    }
                  }} else {
                  _builder.append("get");
                  String _path_2 = ((MetaAttribute) value).getPath();
                  String _replaceFirst = _path_2.replaceFirst("\\^", "");
                  String _firstUpper_1 = StringExtensions.toFirstUpper(_replaceFirst);
                  _builder.append(_firstUpper_1, "");
                  _builder.append("()");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
        _builder.append("\t\t");
      }
    }
    _builder.append(".toString()");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation keyGenerator(final Text text) {
    StringConcatenation _builder = new StringConcatenation();
    {
      SprayString[] _value = text.getValue();
      boolean hasAnyElements = false;
      for(final SprayString value : _value) {
        if (!hasAnyElements) {
          hasAnyElements = true;
        } else {
          _builder.appendImmediate(" + ", "");
        }
        {
          if ((value instanceof org.xspray.mm.xspray.StringLiteral)) {
            _builder.append("\"");
            String _name = ((StringLiteral) value).getName();
            _builder.append(_name, "");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();} else {
            if ((value instanceof org.xspray.mm.xspray.MetaAttribute)) {
              _builder.append("\"");
              String _path = ((MetaAttribute) value).getPath();
              String _firstUpper = StringExtensions.toFirstUpper(_path);
              _builder.append(_firstUpper, "");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    return _builder;
  }
}
package org.xspray.generator.graphiti.templates;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.xspray.generator.graphiti.templates.FileGenerator;
import org.xspray.generator.graphiti.templates.JavaGenFile;
import org.xspray.generator.graphiti.util.GeneratorUtil;
import org.xspray.generator.graphiti.util.MetaModel;
import org.xspray.mm.xspray.Diagram;

@SuppressWarnings("all")
public class PropertySection extends FileGenerator {
  
  private Diagram diagram;
  
  public Diagram setDiagram(final Diagram d) {
    Diagram _diagram = this.diagram = d;
    return _diagram;
  }
  
  public StringConcatenation generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    StringConcatenation _mainFile = this.mainFile(((EAttribute) modelElement), _baseClassName);
    return _mainFile;
  }
  
  public StringConcatenation generateExtentionFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    StringConcatenation _mainExtensionPointFile = this.mainExtensionPointFile(((EAttribute) modelElement), _className);
    return _mainExtensionPointFile;
  }
  
  public StringConcatenation mainExtensionPointFile(final EAttribute eAttribute, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _property_package = GeneratorUtil.property_package();
    _builder.append(_property_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends ");
    _builder.append(className, "");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation mainFile(final EAttribute eAttribute, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = this.diagram.getName();
    final String diagramName = _name;
    _builder.newLineIfNotEmpty();
    EClass _eContainingClass = eAttribute.getEContainingClass();
    final EClass eClass = _eContainingClass;
    _builder.newLineIfNotEmpty();
    String _name_1 = eAttribute.getName();
    final String propertyName = _name_1;
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    EDataType _eAttributeType = eAttribute.getEAttributeType();
    final boolean isEnum = (_eAttributeType instanceof org.eclipse.emf.ecore.EEnum);
    _builder.append("        ");
    _builder.newLineIfNotEmpty();
    EDataType _eAttributeType_1 = eAttribute.getEAttributeType();
    String _name_2 = _eAttributeType_1.getName();
    boolean _operator_equals = ObjectExtensions.operator_equals(_name_2, "EBoolean");
    final boolean isBoolean = _operator_equals;
    _builder.append("        ");
    _builder.newLineIfNotEmpty();
    StringConcatenation _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _property_package = GeneratorUtil.property_package();
    _builder.append(_property_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.transaction.RecordingCommand;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.transaction.TransactionalEditingDomain;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.ui.platform.GFPropertySection;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal;");
    _builder.newLine();
    _builder.append("import org.eclipse.jface.action.IStatusLineManager;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.SWT;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.custom.CLabel;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.FocusEvent;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.FocusListener;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.ModifyEvent;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.ModifyListener;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.SelectionAdapter;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.SelectionEvent;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.SelectionListener;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.layout.FormAttachment;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.layout.FormData;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.Composite;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.Text;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.custom.CCombo;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    String _fullyQualifiedNameEClass = MetaModel.fullyQualifiedNameEClass(eClass);
    _builder.append(_fullyQualifiedNameEClass, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    {
      if (isEnum) {
        _builder.append("import ");
        EDataType _eAttributeType_2 = eAttribute.getEAttributeType();
        String _fullPackageName = MetaModel.fullPackageName(_eAttributeType_2);
        _builder.append(_fullPackageName, "");
        _builder.append(".");
        EDataType _eAttributeType_3 = eAttribute.getEAttributeType();
        String _name_3 = _eAttributeType_3.getName();
        _builder.append(_name_3, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends GFPropertySection implements ITabbedPropertyConstants {");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected ");
    String _name_4 = eClass.getName();
    _builder.append(_name_4, "    ");
    _builder.append(" bc = null;");
    _builder.newLineIfNotEmpty();
    {
      boolean _operator_or = false;
      if (isEnum) {
        _operator_or = true;
      } else {
        _operator_or = BooleanExtensions.operator_or(isEnum, isBoolean);
      }
      if (_operator_or) {
        _builder.append("protected CCombo ");
        _builder.append(propertyName, "");
        _builder.append("Widget;");
        _builder.newLineIfNotEmpty();} else {
        _builder.append("protected Text ");
        _builder.append(propertyName, "");
        _builder.append("Widget;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(" ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super.createControls(parent, tabbedPropertySheetPage);");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("TabbedPropertySheetWidgetFactory factory = getWidgetFactory();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Composite composite = factory.createFlatFormComposite(parent);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("FormData data;");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _operator_or_1 = false;
      if (isEnum) {
        _operator_or_1 = true;
      } else {
        _operator_or_1 = BooleanExtensions.operator_or(isEnum, isBoolean);
      }
      if (_operator_or_1) {
        _builder.append(propertyName, "");
        _builder.append("Widget = factory.createCCombo(composite);");
        _builder.newLineIfNotEmpty();} else {
        _builder.append(propertyName, "");
        _builder.append("Widget = factory.createText(composite, \"\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.append("data = new FormData();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.right = new FormAttachment(100, 0);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.top = new FormAttachment(0, VSPACE);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(propertyName, "        ");
    _builder.append("Widget.setLayoutData(data);");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("CLabel valueLabel = factory.createCLabel(composite, \"");
    String _firstUpper = StringExtensions.toFirstUpper(propertyName);
    _builder.append(_firstUpper, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("data = new FormData();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.left = new FormAttachment(0, 0);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.right = new FormAttachment(");
    _builder.append(propertyName, "        ");
    _builder.append("Widget, -HSPACE);");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("data.top = new FormAttachment(");
    _builder.append(propertyName, "        ");
    _builder.append("Widget, 0, SWT.CENTER);");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("valueLabel.setLayoutData(data);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    {
      boolean _operator_or_2 = false;
      if (isEnum) {
        _operator_or_2 = true;
      } else {
        _operator_or_2 = BooleanExtensions.operator_or(isEnum, isBoolean);
      }
      boolean _operator_not = BooleanExtensions.operator_not(_operator_or_2);
      if (_operator_not) {
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("public void refresh() {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(propertyName, "    ");
        _builder.append("Widget.removeModifyListener(nameListener);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("PictogramElement pe = getSelectedPictogramElement();");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("if (pe != null) {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);");
        _builder.newLine();
        _builder.append("       ");
        _builder.append("// the filter assured, that it is a ");
        String _name_5 = eClass.getName();
        _builder.append(_name_5, "       ");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("if (bo == null)");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("return;");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("bc = (");
        String _name_6 = eClass.getName();
        _builder.append(_name_6, "        ");
        _builder.append(")bo;");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("String value = \"\";");
        _builder.newLine();
        {
          EDataType _eAttributeType_4 = eAttribute.getEAttributeType();
          String _name_7 = _eAttributeType_4.getName();
          boolean _operator_equals_1 = ObjectExtensions.operator_equals(_name_7, "EString");
          if (_operator_equals_1) {
            _builder.append("value = bc.get");
            String _firstUpper_1 = StringExtensions.toFirstUpper(propertyName);
            _builder.append(_firstUpper_1, "");
            _builder.append("();");
            _builder.newLineIfNotEmpty();} else {
            EDataType _eAttributeType_5 = eAttribute.getEAttributeType();
            String _name_8 = _eAttributeType_5.getName();
            boolean _operator_equals_2 = ObjectExtensions.operator_equals(_name_8, "EInt");
            if (_operator_equals_2) {
              _builder.append("value = Integer.toString( bc.get");
              String _firstUpper_2 = StringExtensions.toFirstUpper(propertyName);
              _builder.append(_firstUpper_2, "");
              _builder.append("() );");
              _builder.newLineIfNotEmpty();} else {
              _builder.append("value = \"unknown\";");
              _builder.newLine();
            }
          }
        }
        _builder.append("        ");
        _builder.append(propertyName, "        ");
        _builder.append("Widget.setText(value == null ? \"\" : value);");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append(propertyName, "        ");
        _builder.append("Widget.addModifyListener(nameListener);");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("private ModifyListener nameListener = new ModifyListener() {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("public void modifyText(ModifyEvent arg0) {");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("TransactionalEditingDomain editingDomain = getDiagramEditor().getEditingDomain();");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("protected void doExecute() {");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t\t");
        _builder.append("changePropertyValue();");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("});");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("};");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      boolean _operator_or_3 = false;
      if (isEnum) {
        _operator_or_3 = true;
      } else {
        _operator_or_3 = BooleanExtensions.operator_or(isEnum, isBoolean);
      }
      boolean _operator_not_1 = BooleanExtensions.operator_not(_operator_or_3);
      if (_operator_not_1) {
        _builder.append("protected void changePropertyValue(){");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("String newValue = ");
        _builder.append(propertyName, "	");
        _builder.append("Widget.getText();");
        _builder.newLineIfNotEmpty();
        {
          boolean _operator_and = false;
          boolean _isDerived = eAttribute.isDerived();
          boolean _operator_not_2 = BooleanExtensions.operator_not(_isDerived);
          if (!_operator_not_2) {
            _operator_and = false;
          } else {
            boolean _isChangeable = eAttribute.isChangeable();
            _operator_and = BooleanExtensions.operator_and(_operator_not_2, _isChangeable);
          }
          if (_operator_and) {
            {
              EDataType _eAttributeType_6 = eAttribute.getEAttributeType();
              String _name_9 = _eAttributeType_6.getName();
              boolean _operator_equals_3 = ObjectExtensions.operator_equals(_name_9, "EBoolean");
              if (_operator_equals_3) {
                _builder.append("\t\t\t");
                _builder.append("String oldValue = ( bc.is");
                String _firstUpper_3 = StringExtensions.toFirstUpper(propertyName);
                _builder.append(_firstUpper_3, "			");
                _builder.append("() ? \"true\" : \"false\" );");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t\t");
                _builder.append("if( ! newValue.equals(oldValue) ) { ");
                _builder.newLine();
                _builder.append("\t\t\t\t    \t");
                _builder.append("bc.set");
                String _firstUpper_4 = StringExtensions.toFirstUpper(propertyName);
                _builder.append(_firstUpper_4, "				    	");
                _builder.append("(! bc.is");
                String _firstUpper_5 = StringExtensions.toFirstUpper(propertyName);
                _builder.append(_firstUpper_5, "				    	");
                _builder.append("() );");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t\t");
                _builder.append("}");
                _builder.newLine();} else {
                EDataType _eAttributeType_7 = eAttribute.getEAttributeType();
                String _name_10 = _eAttributeType_7.getName();
                boolean _operator_equals_4 = ObjectExtensions.operator_equals(_name_10, "EString");
                if (_operator_equals_4) {
                  _builder.append("\t\t\t");
                  _builder.append("if( ! newValue.equals(bc.get");
                  String _firstUpper_6 = StringExtensions.toFirstUpper(propertyName);
                  _builder.append(_firstUpper_6, "			");
                  _builder.append("() ) ) { ");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t\t    \t");
                  _builder.append("bc.set");
                  String _firstUpper_7 = StringExtensions.toFirstUpper(propertyName);
                  _builder.append(_firstUpper_7, "				    	");
                  _builder.append("(newValue);");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t");
                  _builder.append("}");
                  _builder.newLine();} else {
                  EDataType _eAttributeType_8 = eAttribute.getEAttributeType();
                  String _name_11 = _eAttributeType_8.getName();
                  boolean _operator_equals_5 = ObjectExtensions.operator_equals(_name_11, "EInt");
                  if (_operator_equals_5) {
                    _builder.append("\t\t\t        ");
                    _builder.append("try {");
                    _builder.newLine();
                    _builder.append("int newIntValue = Integer.parseInt(newValue);");
                    _builder.newLine();
                    _builder.append("bc.set");
                    String _firstUpper_8 = StringExtensions.toFirstUpper(propertyName);
                    _builder.append(_firstUpper_8, "");
                    _builder.append("( newIntValue );");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t\t    ");
                    _builder.append("} catch(Exception e) {");
                    _builder.newLine();
                    _builder.append("\t\t\t   \t    \t");
                    _builder.append("IStatusLineManager mgr = GraphitiUiInternal.getWorkbenchService().getActiveStatusLineManager();");
                    _builder.newLine();
                    _builder.append("mgr.setErrorMessage(e.getMessage() + \" should be a number\");");
                    _builder.newLine();
                    _builder.append("\t\t\t\t    ");
                    _builder.append("}");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    {
      boolean _operator_or_4 = false;
      if (isEnum) {
        _operator_or_4 = true;
      } else {
        _operator_or_4 = BooleanExtensions.operator_or(isEnum, isBoolean);
      }
      if (_operator_or_4) {
        _builder.append("    ");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("public void refresh() {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append(propertyName, "		");
        _builder.append("Widget.removeSelectionListener(nameListener);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append(propertyName, "		");
        _builder.append("Widget.setItems(getEnumerationFeatureValues());");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append(propertyName, "		");
        _builder.append("Widget.setText(getFeatureAsText());");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append(propertyName, "		");
        _builder.append("Widget.addSelectionListener(nameListener);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("   ");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* @return An Array of all the String representations of Multiplicity enumeration values");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("protected String[] getEnumerationFeatureValues() {");
        _builder.newLine();
        {
          if (isEnum) {
            _builder.append("List<");
            EDataType _eAttributeType_9 = eAttribute.getEAttributeType();
            String _name_12 = _eAttributeType_9.getName();
            _builder.append(_name_12, "");
            _builder.append("> values = ");
            EDataType _eAttributeType_10 = eAttribute.getEAttributeType();
            String _name_13 = _eAttributeType_10.getName();
            _builder.append(_name_13, "");
            _builder.append(".VALUES;");
            _builder.newLineIfNotEmpty();
            _builder.append("String[] ret = new String[values.size()];");
            _builder.newLine();
            _builder.append("for (int i = 0; i < values.size(); i++) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("ret[i] = ((");
            EDataType _eAttributeType_11 = eAttribute.getEAttributeType();
            String _name_14 = _eAttributeType_11.getName();
            _builder.append(_name_14, "	");
            _builder.append(") values.get(i)).getName();");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();} else {
            EDataType _eAttributeType_12 = eAttribute.getEAttributeType();
            String _name_15 = _eAttributeType_12.getName();
            boolean _operator_equals_6 = ObjectExtensions.operator_equals(_name_15, "EBoolean");
            if (_operator_equals_6) {
              _builder.append("String[] ret = new String[] {\"false\", \"true\"};");
              _builder.newLine();
            }
          }
        }
        _builder.append("\t\t");
        _builder.append("return ret;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("//        value = ( bc.is");
        String _firstUpper_9 = StringExtensions.toFirstUpper(propertyName);
        _builder.append(_firstUpper_9, "");
        _builder.append("() ? \"true\" : \"false\" );");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* @return The string representation of the current value of \'sourceMultiplicity\' of the selected Association");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("protected String getFeatureAsText() {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("PictogramElement pe = getSelectedPictogramElement();");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("if (pe != null) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("// the filter assured, that it is a ");
        String _name_16 = eClass.getName();
        _builder.append(_name_16, "			");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("if (bo == null) {");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("return \"unknown \";");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("bc = (");
        String _name_17 = eClass.getName();
        _builder.append(_name_17, "			");
        _builder.append(") bo;");
        _builder.newLineIfNotEmpty();
        {
          if (isEnum) {
            _builder.append("\t");
            _builder.append("if( bc.get");
            String _name_18 = eAttribute.getName();
            String _firstUpper_10 = StringExtensions.toFirstUpper(_name_18);
            _builder.append(_firstUpper_10, "	");
            _builder.append("() == null ){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("    ");
            _builder.append("return \"Null value for ");
            String _name_19 = eAttribute.getName();
            _builder.append(_name_19, "	    ");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("return bc.get");
            String _name_20 = eAttribute.getName();
            String _firstUpper_11 = StringExtensions.toFirstUpper(_name_20);
            _builder.append(_firstUpper_11, "	");
            _builder.append("().getName();");
            _builder.newLineIfNotEmpty();} else {
            if (isBoolean) {
              _builder.append("\t\t\t   \t\t");
              String _xifexpression = null;
              String _name_21 = eAttribute.getName();
              boolean _startsWith = _name_21.startsWith("is");
              if (_startsWith) {
                String _name_22 = eAttribute.getName();
                _xifexpression = _name_22;
              } else {
                String _name_23 = eAttribute.getName();
                String _firstUpper_12 = StringExtensions.toFirstUpper(_name_23);
                String _operator_plus = StringExtensions.operator_plus("is", _firstUpper_12);
                _xifexpression = _operator_plus;
              }
              final String name = _xifexpression;
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("return ( bc.");
              _builder.append(name, "	");
              _builder.append("() ? \"true\" : \"false\" );");
              _builder.newLineIfNotEmpty();
            }
          }
        }
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("return \"unknown \";");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("private SelectionListener nameListener = new SelectionAdapter() {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("public void widgetSelected(SelectionEvent event) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("TransactionalEditingDomain editingDomain = getDiagramEditor().getEditingDomain();");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("protected void doExecute() {");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("changePropertyValue();");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("});");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("};");
        _builder.newLine();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("protected void changePropertyValue(){");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("int index = ");
        _builder.append(propertyName, "		");
        _builder.append("Widget.getSelectionIndex();");
        _builder.newLineIfNotEmpty();
        {
          boolean _operator_and_1 = false;
          boolean _isDerived_1 = eAttribute.isDerived();
          boolean _operator_not_3 = BooleanExtensions.operator_not(_isDerived_1);
          if (!_operator_not_3) {
            _operator_and_1 = false;
          } else {
            boolean _isChangeable_1 = eAttribute.isChangeable();
            _operator_and_1 = BooleanExtensions.operator_and(_operator_not_3, _isChangeable_1);
          }
          if (_operator_and_1) {
            {
              if (isEnum) {
                _builder.append("\t");
                EDataType _eAttributeType_13 = eAttribute.getEAttributeType();
                String _name_24 = _eAttributeType_13.getName();
                _builder.append(_name_24, "	");
                _builder.append(" value = ");
                EDataType _eAttributeType_14 = eAttribute.getEAttributeType();
                String _name_25 = _eAttributeType_14.getName();
                _builder.append(_name_25, "	");
                _builder.append(".VALUES.get(index);");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("bc.set");
                String _name_26 = eAttribute.getName();
                String _firstUpper_13 = StringExtensions.toFirstUpper(_name_26);
                _builder.append(_firstUpper_13, "	");
                _builder.append("(value);");
                _builder.newLineIfNotEmpty();} else {
                if (isBoolean) {
                  _builder.append("boolean newValue = (index == 0 ? false : true);");
                  _builder.newLine();
                  String _xifexpression_1 = null;
                  String _name_27 = eAttribute.getName();
                  boolean _startsWith_1 = _name_27.startsWith("is");
                  if (_startsWith_1) {
                    String _name_28 = eAttribute.getName();
                    _xifexpression_1 = _name_28;
                  } else {
                    String _name_29 = eAttribute.getName();
                    String _firstUpper_14 = StringExtensions.toFirstUpper(_name_29);
                    String _operator_plus_1 = StringExtensions.operator_plus("is", _firstUpper_14);
                    _xifexpression_1 = _operator_plus_1;
                  }
                  final String name_1 = _xifexpression_1;
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t    \t");
                  _builder.append("if( newValue != bc.");
                  _builder.append(name_1, "			    	");
                  _builder.append("() ) { ");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t\t    \t");
                  _builder.append("bc.set");
                  String _name_30 = eAttribute.getName();
                  String _firstUpper_15 = StringExtensions.toFirstUpper(_name_30);
                  _builder.append(_firstUpper_15, "				    	");
                  _builder.append("(newValue );");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t    \t");
                  _builder.append("}");
                  _builder.newLine();
                }
              }
            }
          }
        }
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}\t");
    return _builder;
  }
}
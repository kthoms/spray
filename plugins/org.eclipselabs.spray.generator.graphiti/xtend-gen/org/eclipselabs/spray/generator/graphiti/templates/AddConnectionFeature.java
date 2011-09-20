package org.eclipselabs.spray.generator.graphiti.templates;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.ImportUtil;
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions;
import org.eclipselabs.spray.generator.graphiti.util.MetaModel;
import org.eclipselabs.spray.mm.spray.Connection;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.Layout;
import org.eclipselabs.spray.mm.spray.MetaAttribute;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.Shape;
import org.eclipselabs.spray.mm.spray.StringLiteral;
import org.eclipselabs.spray.mm.spray.Text;
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions;

@SuppressWarnings("all")
public class AddConnectionFeature extends FileGenerator {
  
  @Inject
  private ImportUtil importUtil;
  
  @Inject
  private SprayExtensions e1;
  
  @Inject
  private LayoutExtensions e2;
  
  public StringConcatenation generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    StringConcatenation _mainFile = this.mainFile(((MetaClass) modelElement), _baseClassName);
    return _mainFile;
  }
  
  public StringConcatenation generateExtensionFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    StringConcatenation _mainExtensionPointFile = this.mainExtensionPointFile(((MetaClass) modelElement), _className);
    return _mainExtensionPointFile;
  }
  
  public StringConcatenation mainExtensionPointFile(final MetaClass metaClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
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
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean hasDoneChanges() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation mainFile(final MetaClass metaClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    String _feature_package = GeneratorUtil.feature_package();
    this.importUtil.initImports(_feature_package);
    _builder.newLineIfNotEmpty();
    StringConcatenation _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package_1 = GeneratorUtil.feature_package();
    _builder.append(_feature_package_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    StringConcatenation _mainFileBody = this.mainFileBody(metaClass, className);
    final StringConcatenation body = _mainFileBody;
    _builder.newLineIfNotEmpty();
    String _printImports = this.importUtil.printImports();
    _builder.append(_printImports, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation mainFileBody(final MetaClass metaClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    Diagram _diagram = metaClass.getDiagram();
    String _name = _diagram.getName();
    String diagramName = _name;
    _builder.newLineIfNotEmpty();
    EClass _type = metaClass.getType();
    EPackage _ePackage = _type.getEPackage();
    String _name_1 = _ePackage.getName();
    String packge = _name_1;
    _builder.newLineIfNotEmpty();
    EClass _type_1 = metaClass.getType();
    String _fullPackageName = MetaModel.fullPackageName(_type_1);
    String fullPackage = _fullPackageName;
    _builder.newLineIfNotEmpty();
    Shape _representedBy = metaClass.getRepresentedBy();
    Connection connection = ((Connection) _representedBy);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(fullPackage, "");
    _builder.append(".");
    String _name_2 = this.e1.getName(metaClass);
    _builder.append(_name_2, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAddConnectionContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.impl.AbstractAddFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.Text;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Connection;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.Polyline;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IPeCreateService;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends  AbstractAddFeature {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public PictogramElement add(IAddContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("IAddConnectionContext addConContext = (IAddConnectionContext) context;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// TODO: Domain object");
    _builder.newLine();
    _builder.append("        ");
    String _name_3 = this.e1.getName(metaClass);
    _builder.append(_name_3, "        ");
    _builder.append(" addedDomainObject = (");
    String _name_4 = this.e1.getName(metaClass);
    _builder.append(_name_4, "        ");
    _builder.append(") context.getNewObject();");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("IPeCreateService peCreateService = Graphiti.getPeCreateService();");
    _builder.newLine();
    _builder.append("      ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// CONNECTION WITH POLYLINE");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Connection connection = peCreateService.createFreeFormConnection(getDiagram());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("connection.setStart(addConContext.getSourceAnchor());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("connection.setEnd(addConContext.getTargetAnchor());");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("IGaService gaService = Graphiti.getGaService();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Polyline polyline = gaService.createPolyline(connection);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("polyline.setLineWidth(");
    Shape _representedBy_1 = metaClass.getRepresentedBy();
    Layout _layout = _representedBy_1.getLayout();
    int _lineWidth = _layout.getLineWidth();
    _builder.append(_lineWidth, "        ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("polyline.setForeground(manageColor(");
    String _lineColor = this.e2.lineColor(metaClass);
    _builder.append(_lineColor, "        ");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    {
      Text _label = connection.getToLabel();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_label, null);
      if (_operator_notEquals) {
        _builder.append("     ");
        _builder.append("ConnectionDecorator toDecorator = peCreateService.createConnectionDecorator(connection, true, 1.0, true);");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("Text text = gaService.createDefaultText(getDiagram(), toDecorator);");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("text.setForeground(manageColor(");
        String _shortName = this.importUtil.shortName(org.eclipse.graphiti.util.IColorConstant.class);
        _builder.append(_shortName, "     ");
        _builder.append(".BLACK));");
        _builder.newLineIfNotEmpty();
        _builder.append("     ");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("GraphicsAlgorithm ga = addConContext.getTargetAnchor().getParent().getGraphicsAlgorithm();");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("int targetHeight = ga.getHeight();");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("Graphiti.getGaLayoutService().setLocation(text, 10, -(targetHeight / 2) - 20);");
        _builder.newLine();
        {
          Text _label_1 = connection.getToLabel();
          if ((_label_1 instanceof org.eclipselabs.spray.mm.spray.StringLiteral)) {
            _builder.append("//\t\t        text.setValue(\"");
            Text _label_2 = connection.getToLabel();
            String _name_5 = ((StringLiteral) _label_2).getName();
            _builder.append(_name_5, "");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();} else {
            Text _label_3 = connection.getToLabel();
            if ((_label_3 instanceof org.eclipselabs.spray.mm.spray.MetaAttribute)) {
              _builder.append("//\t\t        text.setValue(addedDomainObject.get");
              Text _label_4 = connection.getToLabel();
              EAttribute _attribute = ((MetaAttribute) _label_4).getAttribute();
              String _name_6 = _attribute.getName();
              String _firstUpper = StringExtensions.toFirstUpper(_name_6);
              _builder.append(_firstUpper, "");
              _builder.append("().toString());");
              _builder.newLineIfNotEmpty();
            }
          }
        }
        _builder.append("     ");
        _builder.append("text.setValue(getToLabel(addedDomainObject));");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("Graphiti.getPeService().setPropertyValue(toDecorator, \"MODEL_TYPE\", \"TO_LABEL\");");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("link(toDecorator, addedDomainObject);");
        _builder.newLine();
      }
    }
    {
      Text _connectionLabel = connection.getConnectionLabel();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_connectionLabel, null);
      if (_operator_notEquals_1) {
        _builder.append("     ");
        _builder.append("ConnectionDecorator connectionDecorator = peCreateService.createConnectionDecorator(connection, true, 0.5, true);");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("Text sourceText = gaService.createDefaultText(getDiagram(), connectionDecorator);");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("sourceText.setForeground(manageColor(");
        String _shortName_1 = this.importUtil.shortName(org.eclipse.graphiti.util.IColorConstant.class);
        _builder.append(_shortName_1, "     ");
        _builder.append(".BLACK));");
        _builder.newLineIfNotEmpty();
        _builder.append("     ");
        _builder.append("Graphiti.getGaLayoutService().setLocation(sourceText, 10, 0);");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("sourceText.setValue(getConnectionLabel(addedDomainObject));");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("Graphiti.getPeService().setPropertyValue(connectionDecorator, \"MODEL_TYPE\", \"CONNECTION_LABEL\");");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("link(connectionDecorator, addedDomainObject);");
        _builder.newLine();
      }
    }
    {
      Text _fromLabel = connection.getFromLabel();
      boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(_fromLabel, null);
      if (_operator_notEquals_2) {
        _builder.append("     ");
        _builder.append("ConnectionDecorator fromDecorator = peCreateService.createConnectionDecorator(connection, true, 0.0, true);");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("Text fromText = gaService.createDefaultText(getDiagram(), fromDecorator);");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("fromText.setForeground(manageColor(");
        String _shortName_2 = this.importUtil.shortName(org.eclipse.graphiti.util.IColorConstant.class);
        _builder.append(_shortName_2, "     ");
        _builder.append(".BLACK));");
        _builder.newLineIfNotEmpty();
        _builder.append("     ");
        _builder.append("Graphiti.getGaLayoutService().setLocation(fromText, 10, 20);");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("fromText.setValue(getFromLabel(addedDomainObject));");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("Graphiti.getPeService().setPropertyValue(fromDecorator, \"MODEL_TYPE\", \"FROM_LABEL\");");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("link(fromDecorator, addedDomainObject);");
        _builder.newLine();
      }
    }
    _builder.append(" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// create link and wire it");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Graphiti.getPeService().setPropertyValue(connection, \"MODEL_TYPE\", \"");
    String _name_7 = this.e1.getName(metaClass);
    _builder.append(_name_7, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("link(connection, addedDomainObject);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return connection;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      Text _label_5 = connection.getToLabel();
      boolean _operator_notEquals_3 = ObjectExtensions.operator_notEquals(_label_5, null);
      if (_operator_notEquals_3) {
        _builder.append("\t");
        _builder.append("private String getToLabel (");
        String _name_8 = this.e1.getName(metaClass);
        _builder.append(_name_8, "	");
        _builder.append(" addedDomainObject) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        Text _label_6 = connection.getToLabel();
        StringConcatenation _valueGenerator = this.valueGenerator(_label_6, "addedDomainObject");
        _builder.append(_valueGenerator, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      Text _connectionLabel_1 = connection.getConnectionLabel();
      boolean _operator_notEquals_4 = ObjectExtensions.operator_notEquals(_connectionLabel_1, null);
      if (_operator_notEquals_4) {
        _builder.append("\t");
        _builder.append("private String getConnectionLabel (");
        String _name_9 = this.e1.getName(metaClass);
        _builder.append(_name_9, "	");
        _builder.append(" addedDomainObject) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        Text _connectionLabel_2 = connection.getConnectionLabel();
        StringConcatenation _valueGenerator_1 = this.valueGenerator(_connectionLabel_2, "addedDomainObject");
        _builder.append(_valueGenerator_1, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      Text _fromLabel_1 = connection.getFromLabel();
      boolean _operator_notEquals_5 = ObjectExtensions.operator_notEquals(_fromLabel_1, null);
      if (_operator_notEquals_5) {
        _builder.append("\t");
        _builder.append("private String getFromLabel (");
        String _name_10 = this.e1.getName(metaClass);
        _builder.append(_name_10, "	");
        _builder.append(" addedDomainObject) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        Text _fromLabel_2 = connection.getFromLabel();
        StringConcatenation _valueGenerator_2 = this.valueGenerator(_fromLabel_2, "addedDomainObject");
        _builder.append(_valueGenerator_2, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean canAdd(IAddContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// return true if given business object is an ");
    String _name_11 = this.e1.getName(metaClass);
    _builder.append(_name_11, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("// note, that the context must be an instance of IAddConnectionContext");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (context instanceof IAddConnectionContext");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("&& context.getNewObject() instanceof ");
    String _name_12 = this.e1.getName(metaClass);
    _builder.append(_name_12, "            ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean hasDoneChanges() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean canUndo(IContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
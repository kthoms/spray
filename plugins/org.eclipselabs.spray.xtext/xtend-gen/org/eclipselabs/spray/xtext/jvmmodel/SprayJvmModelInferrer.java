package org.eclipselabs.spray.xtext.jvmmodel;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipselabs.spray.generator.graphiti.util.ProjectProperties;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.xtext.jvmmodel.EcoreJvmModelInferrer;

@SuppressWarnings("all")
public class SprayJvmModelInferrer implements IJvmModelInferrer {
  
  @Inject
  private TypesFactory typesFactory;
  
  @Inject
  private IJvmModelAssociator jvmModelAssociator;
  
  @Inject
  private EcoreJvmModelInferrer ecoreJvmModelInferrer;
  
  public List<? extends JvmDeclaredType> inferJvmModel(final EObject sourceObject) {
    List<JvmDeclaredType> _xblockexpression = null;
    {
      this.jvmModelAssociator.disassociate(sourceObject);
      Iterable<JvmDeclaredType> _transform = this.transform(sourceObject);
      List<JvmDeclaredType> _list = IterableExtensions.<JvmDeclaredType>toList(_transform);
      _xblockexpression = (_list);
    }
    return _xblockexpression;
  }
  
  protected Iterable<JvmDeclaredType> _transform(final EObject object) {
    List<JvmDeclaredType> _emptyList = CollectionLiterals.<JvmDeclaredType>emptyList();
    return _emptyList;
  }
  
  protected Iterable<JvmDeclaredType> _transform(final Diagram model) {
    {
      MetaClass[] _metaClasses = model.getMetaClasses();
      final Function1<MetaClass,Iterable<JvmDeclaredType>> _function = new Function1<MetaClass,Iterable<JvmDeclaredType>>() {
          public Iterable<JvmDeclaredType> apply(final MetaClass e) {
            EClass _type = e.getType();
            Iterable<JvmDeclaredType> _transform = SprayJvmModelInferrer.this.ecoreJvmModelInferrer.transform(_type);
            return _transform;
          }
        };
      List<Iterable<JvmDeclaredType>> _map = ListExtensions.<MetaClass, Iterable<JvmDeclaredType>>map(((List<MetaClass>)Conversions.doWrapArray(_metaClasses)), _function);
      Iterable<JvmDeclaredType> _flatten = IterableExtensions.<JvmDeclaredType>flatten(_map);
      final Iterable<JvmDeclaredType> types2 = _flatten;
      return types2;
    }
  }
  
  protected Iterable<JvmDeclaredType> _transform(final MetaClass clazz) {
    ArrayList<JvmDeclaredType> _xblockexpression = null;
    {
      int i = 1;
      JvmGenericType _createJvmGenericType = this.typesFactory.createJvmGenericType();
      final JvmGenericType jvmClass = _createJvmGenericType;
      EClass _type = clazz.getType();
      String _name = _type.getName();
      jvmClass.setSimpleName(_name);
      String _diagramPackage = ProjectProperties.getDiagramPackage();
      jvmClass.setPackageName(_diagramPackage);
      this.jvmModelAssociator.associatePrimary(clazz, jvmClass);
      jvmClass.setVisibility(JvmVisibility.PUBLIC);
      ArrayList<JvmDeclaredType> _newArrayList = CollectionLiterals.<JvmDeclaredType>newArrayList(((JvmDeclaredType) jvmClass));
      _xblockexpression = (_newArrayList);
    }
    return _xblockexpression;
  }
  
  public Iterable<JvmDeclaredType> transform(final EObject model) {
    if ((model instanceof Diagram)) {
      return _transform((Diagram)model);
    } else if ((model instanceof MetaClass)) {
      return _transform((MetaClass)model);
    } else if ((model instanceof EObject)) {
      return _transform((EObject)model);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(model).toString());
    }
  }
}
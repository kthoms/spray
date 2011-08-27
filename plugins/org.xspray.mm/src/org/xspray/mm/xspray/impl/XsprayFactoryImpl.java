/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xspray.mm.xspray.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XsprayFactoryImpl extends EFactoryImpl implements XsprayFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static XsprayFactory init() {
        try {
            XsprayFactory theXsprayFactory = (XsprayFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xspray.org/xspray"); 
            if (theXsprayFactory != null) {
                return theXsprayFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new XsprayFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XsprayFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case XsprayPackage.DIAGRAM: return createDiagram();
            case XsprayPackage.META_CLASS: return createMetaClass();
            case XsprayPackage.LAYOUT: return createLayout();
            case XsprayPackage.RECTANGLE: return createRectangle();
            case XsprayPackage.CONTAINER: return createContainer();
            case XsprayPackage.TEXT: return createText();
            case XsprayPackage.CONNECTION: return createConnection();
            case XsprayPackage.META_REFERENCE: return createMetaReference();
            case XsprayPackage.META_ATTRIBUTE: return createMetaAttribute();
            case XsprayPackage.LINE: return createLine();
            case XsprayPackage.VISIBLE_ELEMENT: return createVisibleElement();
            case XsprayPackage.STRING_LITERAL: return createStringLiteral();
            case XsprayPackage.STANDARD_BEHAVIOUR: return createStandardBehaviour();
            case XsprayPackage.CUSTOM_BEHAVIOUR: return createCustomBehaviour();
            case XsprayPackage.BEHAVIOUR_GROUP: return createBehaviourGroup();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case XsprayPackage.COLOR:
                return createColorFromString(eDataType, initialValue);
            case XsprayPackage.FIGURE:
                return createFigureFromString(eDataType, initialValue);
            case XsprayPackage.BEHAVIOUR_TYPE:
                return createBehaviourTypeFromString(eDataType, initialValue);
            case XsprayPackage.QUALIFIED_NAME:
                return createQualifiedNameFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case XsprayPackage.COLOR:
                return convertColorToString(eDataType, instanceValue);
            case XsprayPackage.FIGURE:
                return convertFigureToString(eDataType, instanceValue);
            case XsprayPackage.BEHAVIOUR_TYPE:
                return convertBehaviourTypeToString(eDataType, instanceValue);
            case XsprayPackage.QUALIFIED_NAME:
                return convertQualifiedNameToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Diagram createDiagram() {
        DiagramImpl diagram = new DiagramImpl();
        return diagram;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MetaClass createMetaClass() {
        MetaClassImpl metaClass = new MetaClassImpl();
        return metaClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Layout createLayout() {
        LayoutImpl layout = new LayoutImpl();
        return layout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Rectangle createRectangle() {
        RectangleImpl rectangle = new RectangleImpl();
        return rectangle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public org.xspray.mm.xspray.Container createContainer() {
        ContainerImpl container = new ContainerImpl();
        return container;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Text createText() {
        TextImpl text = new TextImpl();
        return text;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Connection createConnection() {
        ConnectionImpl connection = new ConnectionImpl();
        return connection;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MetaReference createMetaReference() {
        MetaReferenceImpl metaReference = new MetaReferenceImpl();
        return metaReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MetaAttribute createMetaAttribute() {
        MetaAttributeImpl metaAttribute = new MetaAttributeImpl();
        return metaAttribute;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Line createLine() {
        LineImpl line = new LineImpl();
        return line;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public VisibleElement createVisibleElement() {
        VisibleElementImpl visibleElement = new VisibleElementImpl();
        return visibleElement;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StringLiteral createStringLiteral() {
        StringLiteralImpl stringLiteral = new StringLiteralImpl();
        return stringLiteral;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StandardBehaviour createStandardBehaviour() {
        StandardBehaviourImpl standardBehaviour = new StandardBehaviourImpl();
        return standardBehaviour;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CustomBehaviour createCustomBehaviour() {
        CustomBehaviourImpl customBehaviour = new CustomBehaviourImpl();
        return customBehaviour;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BehaviourGroup createBehaviourGroup() {
        BehaviourGroupImpl behaviourGroup = new BehaviourGroupImpl();
        return behaviourGroup;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
        Color result = Color.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Figure createFigureFromString(EDataType eDataType, String initialValue) {
        Figure result = Figure.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertFigureToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BehaviourType createBehaviourTypeFromString(EDataType eDataType, String initialValue) {
        BehaviourType result = BehaviourType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertBehaviourTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Object createQualifiedNameFromString(EDataType eDataType, String initialValue) {
        return super.createFromString(eDataType, initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertQualifiedNameToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XsprayPackage getXsprayPackage() {
        return (XsprayPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static XsprayPackage getPackage() {
        return XsprayPackage.eINSTANCE;
    }

} //XsprayFactoryImpl

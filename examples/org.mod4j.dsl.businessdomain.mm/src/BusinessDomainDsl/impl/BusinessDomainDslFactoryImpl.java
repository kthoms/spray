/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessDomainDslFactoryImpl extends EFactoryImpl implements BusinessDomainDslFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static BusinessDomainDslFactory init() {
        try {
            BusinessDomainDslFactory theBusinessDomainDslFactory = (BusinessDomainDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mod4j.org/busmod"); 
            if (theBusinessDomainDslFactory != null) {
                return theBusinessDomainDslFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new BusinessDomainDslFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BusinessDomainDslFactoryImpl() {
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
            case BusinessDomainDslPackage.MODEL_ELEMENT: return createModelElement();
            case BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL: return createBusinessDomainModel();
            case BusinessDomainDslPackage.BUSINESS_CLASS: return createBusinessClass();
            case BusinessDomainDslPackage.ENUMERATION: return createEnumeration();
            case BusinessDomainDslPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
            case BusinessDomainDslPackage.BOOL_PROPERTY: return createBoolProperty();
            case BusinessDomainDslPackage.DATE_TIME_PROPERTY: return createDateTimeProperty();
            case BusinessDomainDslPackage.ENUMERATION_PROPERTY: return createEnumerationProperty();
            case BusinessDomainDslPackage.INTEGER_PROPERTY: return createIntegerProperty();
            case BusinessDomainDslPackage.STRING_PROPERTY: return createStringProperty();
            case BusinessDomainDslPackage.BLOB_BINARY_PROPERTY: return createBlobBinaryProperty();
            case BusinessDomainDslPackage.BLOB_TEXT_PROPERTY: return createBlobTextProperty();
            case BusinessDomainDslPackage.ASSOCIATION: return createAssociation();
            case BusinessDomainDslPackage.DECIMAL_PROPERTY: return createDecimalProperty();
            case BusinessDomainDslPackage.BUSINESS_CLASS_REFERENCE: return createBusinessClassReference();
            case BusinessDomainDslPackage.UNIQUE_RULE: return createUniqueRule();
            case BusinessDomainDslPackage.BUSINESS_RULE: return createBusinessRule();
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
            case BusinessDomainDslPackage.MULTIPLICITY:
                return createMultiplicityFromString(eDataType, initialValue);
            case BusinessDomainDslPackage.DATE_TIME_ACCURACY:
                return createDateTimeAccuracyFromString(eDataType, initialValue);
            case BusinessDomainDslPackage.PERSISTENCY_MODE:
                return createPersistencyModeFromString(eDataType, initialValue);
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
            case BusinessDomainDslPackage.MULTIPLICITY:
                return convertMultiplicityToString(eDataType, instanceValue);
            case BusinessDomainDslPackage.DATE_TIME_ACCURACY:
                return convertDateTimeAccuracyToString(eDataType, instanceValue);
            case BusinessDomainDslPackage.PERSISTENCY_MODE:
                return convertPersistencyModeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ModelElement createModelElement() {
        ModelElementImpl modelElement = new ModelElementImpl();
        return modelElement;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BusinessDomainModel createBusinessDomainModel() {
        BusinessDomainModelImpl businessDomainModel = new BusinessDomainModelImpl();
        return businessDomainModel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BusinessClass createBusinessClass() {
        BusinessClassImpl businessClass = new BusinessClassImpl();
        return businessClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Enumeration createEnumeration() {
        EnumerationImpl enumeration = new EnumerationImpl();
        return enumeration;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EnumerationLiteral createEnumerationLiteral() {
        EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
        return enumerationLiteral;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BoolProperty createBoolProperty() {
        BoolPropertyImpl boolProperty = new BoolPropertyImpl();
        return boolProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DateTimeProperty createDateTimeProperty() {
        DateTimePropertyImpl dateTimeProperty = new DateTimePropertyImpl();
        return dateTimeProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EnumerationProperty createEnumerationProperty() {
        EnumerationPropertyImpl enumerationProperty = new EnumerationPropertyImpl();
        return enumerationProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public IntegerProperty createIntegerProperty() {
        IntegerPropertyImpl integerProperty = new IntegerPropertyImpl();
        return integerProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StringProperty createStringProperty() {
        StringPropertyImpl stringProperty = new StringPropertyImpl();
        return stringProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BlobBinaryProperty createBlobBinaryProperty() {
        BlobBinaryPropertyImpl blobBinaryProperty = new BlobBinaryPropertyImpl();
        return blobBinaryProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BlobTextProperty createBlobTextProperty() {
        BlobTextPropertyImpl blobTextProperty = new BlobTextPropertyImpl();
        return blobTextProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Association createAssociation() {
        AssociationImpl association = new AssociationImpl();
        return association;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DecimalProperty createDecimalProperty() {
        DecimalPropertyImpl decimalProperty = new DecimalPropertyImpl();
        return decimalProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BusinessClassReference createBusinessClassReference() {
        BusinessClassReferenceImpl businessClassReference = new BusinessClassReferenceImpl();
        return businessClassReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public UniqueRule createUniqueRule() {
        UniqueRuleImpl uniqueRule = new UniqueRuleImpl();
        return uniqueRule;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BusinessRule createBusinessRule() {
        BusinessRuleImpl businessRule = new BusinessRuleImpl();
        return businessRule;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Multiplicity createMultiplicityFromString(EDataType eDataType, String initialValue) {
        Multiplicity result = Multiplicity.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertMultiplicityToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DateTimeAccuracy createDateTimeAccuracyFromString(EDataType eDataType, String initialValue) {
        DateTimeAccuracy result = DateTimeAccuracy.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertDateTimeAccuracyToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PersistencyMode createPersistencyModeFromString(EDataType eDataType, String initialValue) {
        PersistencyMode result = PersistencyMode.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertPersistencyModeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BusinessDomainDslPackage getBusinessDomainDslPackage() {
        return (BusinessDomainDslPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static BusinessDomainDslPackage getPackage() {
        return BusinessDomainDslPackage.eINSTANCE;
    }

} //BusinessDomainDslFactoryImpl

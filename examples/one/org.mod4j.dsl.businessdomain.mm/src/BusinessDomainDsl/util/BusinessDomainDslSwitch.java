/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.util;

import BusinessDomainDsl.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see BusinessDomainDsl.BusinessDomainDslPackage
 * @generated
 */
public class BusinessDomainDslSwitch<T> extends Switch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static BusinessDomainDslPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BusinessDomainDslSwitch() {
        if (modelPackage == null) {
            modelPackage = BusinessDomainDslPackage.eINSTANCE;
        }
    }

	/**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	@Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case BusinessDomainDslPackage.MODEL_ELEMENT: {
                ModelElement modelElement = (ModelElement)theEObject;
                T result = caseModelElement(modelElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL: {
                BusinessDomainModel businessDomainModel = (BusinessDomainModel)theEObject;
                T result = caseBusinessDomainModel(businessDomainModel);
                if (result == null) result = caseModelElement(businessDomainModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.BUSINESS_CLASS: {
                BusinessClass businessClass = (BusinessClass)theEObject;
                T result = caseBusinessClass(businessClass);
                if (result == null) result = caseAbstractBusinessClass(businessClass);
                if (result == null) result = caseAbstractType(businessClass);
                if (result == null) result = caseModelElement(businessClass);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.PROPERTY: {
                Property property = (Property)theEObject;
                T result = caseProperty(property);
                if (result == null) result = caseModelElement(property);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.ENUMERATION: {
                Enumeration enumeration = (Enumeration)theEObject;
                T result = caseEnumeration(enumeration);
                if (result == null) result = caseModelElement(enumeration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.ENUMERATION_LITERAL: {
                EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
                T result = caseEnumerationLiteral(enumerationLiteral);
                if (result == null) result = caseModelElement(enumerationLiteral);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.ABSTRACT_BUSINESS_RULE: {
                AbstractBusinessRule abstractBusinessRule = (AbstractBusinessRule)theEObject;
                T result = caseAbstractBusinessRule(abstractBusinessRule);
                if (result == null) result = caseModelElement(abstractBusinessRule);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.BOOL_PROPERTY: {
                BoolProperty boolProperty = (BoolProperty)theEObject;
                T result = caseBoolProperty(boolProperty);
                if (result == null) result = caseProperty(boolProperty);
                if (result == null) result = caseModelElement(boolProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.DATE_TIME_PROPERTY: {
                DateTimeProperty dateTimeProperty = (DateTimeProperty)theEObject;
                T result = caseDateTimeProperty(dateTimeProperty);
                if (result == null) result = caseProperty(dateTimeProperty);
                if (result == null) result = caseModelElement(dateTimeProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.ENUMERATION_PROPERTY: {
                EnumerationProperty enumerationProperty = (EnumerationProperty)theEObject;
                T result = caseEnumerationProperty(enumerationProperty);
                if (result == null) result = caseProperty(enumerationProperty);
                if (result == null) result = caseModelElement(enumerationProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.INTEGER_PROPERTY: {
                IntegerProperty integerProperty = (IntegerProperty)theEObject;
                T result = caseIntegerProperty(integerProperty);
                if (result == null) result = caseProperty(integerProperty);
                if (result == null) result = caseModelElement(integerProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.STRING_PROPERTY: {
                StringProperty stringProperty = (StringProperty)theEObject;
                T result = caseStringProperty(stringProperty);
                if (result == null) result = caseProperty(stringProperty);
                if (result == null) result = caseModelElement(stringProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.ABSTRACT_TYPE: {
                AbstractType abstractType = (AbstractType)theEObject;
                T result = caseAbstractType(abstractType);
                if (result == null) result = caseModelElement(abstractType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.BLOB_BINARY_PROPERTY: {
                BlobBinaryProperty blobBinaryProperty = (BlobBinaryProperty)theEObject;
                T result = caseBlobBinaryProperty(blobBinaryProperty);
                if (result == null) result = caseProperty(blobBinaryProperty);
                if (result == null) result = caseModelElement(blobBinaryProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.BLOB_TEXT_PROPERTY: {
                BlobTextProperty blobTextProperty = (BlobTextProperty)theEObject;
                T result = caseBlobTextProperty(blobTextProperty);
                if (result == null) result = caseProperty(blobTextProperty);
                if (result == null) result = caseModelElement(blobTextProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.ASSOCIATION: {
                Association association = (Association)theEObject;
                T result = caseAssociation(association);
                if (result == null) result = caseModelElement(association);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.DECIMAL_PROPERTY: {
                DecimalProperty decimalProperty = (DecimalProperty)theEObject;
                T result = caseDecimalProperty(decimalProperty);
                if (result == null) result = caseProperty(decimalProperty);
                if (result == null) result = caseModelElement(decimalProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.ABSTRACT_BUSINESS_CLASS: {
                AbstractBusinessClass abstractBusinessClass = (AbstractBusinessClass)theEObject;
                T result = caseAbstractBusinessClass(abstractBusinessClass);
                if (result == null) result = caseAbstractType(abstractBusinessClass);
                if (result == null) result = caseModelElement(abstractBusinessClass);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.BUSINESS_CLASS_REFERENCE: {
                BusinessClassReference businessClassReference = (BusinessClassReference)theEObject;
                T result = caseBusinessClassReference(businessClassReference);
                if (result == null) result = caseAbstractBusinessClass(businessClassReference);
                if (result == null) result = caseAbstractType(businessClassReference);
                if (result == null) result = caseModelElement(businessClassReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.UNIQUE_RULE: {
                UniqueRule uniqueRule = (UniqueRule)theEObject;
                T result = caseUniqueRule(uniqueRule);
                if (result == null) result = caseAbstractBusinessRule(uniqueRule);
                if (result == null) result = caseModelElement(uniqueRule);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessDomainDslPackage.BUSINESS_RULE: {
                BusinessRule businessRule = (BusinessRule)theEObject;
                T result = caseBusinessRule(businessRule);
                if (result == null) result = caseAbstractBusinessRule(businessRule);
                if (result == null) result = caseModelElement(businessRule);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseModelElement(ModelElement object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Business Domain Model</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Domain Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBusinessDomainModel(BusinessDomainModel object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Business Class</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBusinessClass(BusinessClass object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseProperty(Property object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseEnumeration(Enumeration object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Business Rule</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Business Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractBusinessRule(AbstractBusinessRule object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Bool Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bool Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBoolProperty(BoolProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Date Time Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Date Time Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDateTimeProperty(DateTimeProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseEnumerationProperty(EnumerationProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Integer Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Integer Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseIntegerProperty(IntegerProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>String Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseStringProperty(StringProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractType(AbstractType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Blob Binary Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Blob Binary Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBlobBinaryProperty(BlobBinaryProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Blob Text Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Blob Text Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBlobTextProperty(BlobTextProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Association</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAssociation(Association object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Decimal Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Decimal Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDecimalProperty(DecimalProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Business Class</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Business Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractBusinessClass(AbstractBusinessClass object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Business Class Reference</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Class Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBusinessClassReference(BusinessClassReference object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Unique Rule</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unique Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseUniqueRule(UniqueRule object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Business Rule</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBusinessRule(BusinessRule object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
	@Override
    public T defaultCase(EObject object) {
        return null;
    }

} //BusinessDomainDslSwitch

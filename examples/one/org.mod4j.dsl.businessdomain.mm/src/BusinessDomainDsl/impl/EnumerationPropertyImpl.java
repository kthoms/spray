/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.Enumeration;
import BusinessDomainDsl.EnumerationProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.EnumerationPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.EnumerationPropertyImpl#getDefaultValueAsString <em>Default Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationPropertyImpl extends PropertyImpl implements EnumerationProperty {
	/**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected Enumeration type;

	/**
     * The default value of the '{@link #getDefaultValueAsString() <em>Default Value As String</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDefaultValueAsString()
     * @generated
     * @ordered
     */
	protected static final String DEFAULT_VALUE_AS_STRING_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDefaultValueAsString() <em>Default Value As String</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDefaultValueAsString()
     * @generated
     * @ordered
     */
	protected String defaultValueAsString = DEFAULT_VALUE_AS_STRING_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EnumerationPropertyImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return BusinessDomainDslPackage.Literals.ENUMERATION_PROPERTY;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Enumeration getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (Enumeration)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessDomainDslPackage.ENUMERATION_PROPERTY__TYPE, oldType, type));
            }
        }
        return type;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Enumeration basicGetType() {
        return type;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setType(Enumeration newType) {
        Enumeration oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ENUMERATION_PROPERTY__TYPE, oldType, type));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDefaultValueAsString() {
        return defaultValueAsString;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDefaultValueAsString(String newDefaultValueAsString) {
        String oldDefaultValueAsString = defaultValueAsString;
        defaultValueAsString = newDefaultValueAsString;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ENUMERATION_PROPERTY__DEFAULT_VALUE_AS_STRING, oldDefaultValueAsString, defaultValueAsString));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BusinessDomainDslPackage.ENUMERATION_PROPERTY__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case BusinessDomainDslPackage.ENUMERATION_PROPERTY__DEFAULT_VALUE_AS_STRING:
                return getDefaultValueAsString();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BusinessDomainDslPackage.ENUMERATION_PROPERTY__TYPE:
                setType((Enumeration)newValue);
                return;
            case BusinessDomainDslPackage.ENUMERATION_PROPERTY__DEFAULT_VALUE_AS_STRING:
                setDefaultValueAsString((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case BusinessDomainDslPackage.ENUMERATION_PROPERTY__TYPE:
                setType((Enumeration)null);
                return;
            case BusinessDomainDslPackage.ENUMERATION_PROPERTY__DEFAULT_VALUE_AS_STRING:
                setDefaultValueAsString(DEFAULT_VALUE_AS_STRING_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case BusinessDomainDslPackage.ENUMERATION_PROPERTY__TYPE:
                return type != null;
            case BusinessDomainDslPackage.ENUMERATION_PROPERTY__DEFAULT_VALUE_AS_STRING:
                return DEFAULT_VALUE_AS_STRING_EDEFAULT == null ? defaultValueAsString != null : !DEFAULT_VALUE_AS_STRING_EDEFAULT.equals(defaultValueAsString);
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (defaultValueAsString: ");
        result.append(defaultValueAsString);
        result.append(')');
        return result.toString();
    }

} //EnumerationPropertyImpl

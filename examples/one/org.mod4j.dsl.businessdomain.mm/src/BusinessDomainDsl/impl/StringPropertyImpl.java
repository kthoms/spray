/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.StringProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.StringPropertyImpl#getRegularExpression <em>Regular Expression</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.StringPropertyImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.StringPropertyImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.StringPropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringPropertyImpl extends PropertyImpl implements StringProperty {
	/**
     * The default value of the '{@link #getRegularExpression() <em>Regular Expression</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRegularExpression()
     * @generated
     * @ordered
     */
	protected static final String REGULAR_EXPRESSION_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRegularExpression() <em>Regular Expression</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRegularExpression()
     * @generated
     * @ordered
     */
	protected String regularExpression = REGULAR_EXPRESSION_EDEFAULT;

	/**
     * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMinLength()
     * @generated
     * @ordered
     */
	protected static final int MIN_LENGTH_EDEFAULT = -1;

	/**
     * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMinLength()
     * @generated
     * @ordered
     */
	protected int minLength = MIN_LENGTH_EDEFAULT;

	/**
     * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxLength()
     * @generated
     * @ordered
     */
	protected static final int MAX_LENGTH_EDEFAULT = -1;

	/**
     * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxLength()
     * @generated
     * @ordered
     */
	protected int maxLength = MAX_LENGTH_EDEFAULT;

	/**
     * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected StringPropertyImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return BusinessDomainDslPackage.Literals.STRING_PROPERTY;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getRegularExpression() {
        return regularExpression;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRegularExpression(String newRegularExpression) {
        String oldRegularExpression = regularExpression;
        regularExpression = newRegularExpression;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.STRING_PROPERTY__REGULAR_EXPRESSION, oldRegularExpression, regularExpression));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getMinLength() {
        return minLength;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMinLength(int newMinLength) {
        int oldMinLength = minLength;
        minLength = newMinLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.STRING_PROPERTY__MIN_LENGTH, oldMinLength, minLength));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getMaxLength() {
        return maxLength;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaxLength(int newMaxLength) {
        int oldMaxLength = maxLength;
        maxLength = newMaxLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.STRING_PROPERTY__MAX_LENGTH, oldMaxLength, maxLength));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDefaultValue() {
        return defaultValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDefaultValue(String newDefaultValue) {
        String oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.STRING_PROPERTY__DEFAULT_VALUE, oldDefaultValue, defaultValue));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BusinessDomainDslPackage.STRING_PROPERTY__REGULAR_EXPRESSION:
                return getRegularExpression();
            case BusinessDomainDslPackage.STRING_PROPERTY__MIN_LENGTH:
                return getMinLength();
            case BusinessDomainDslPackage.STRING_PROPERTY__MAX_LENGTH:
                return getMaxLength();
            case BusinessDomainDslPackage.STRING_PROPERTY__DEFAULT_VALUE:
                return getDefaultValue();
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
            case BusinessDomainDslPackage.STRING_PROPERTY__REGULAR_EXPRESSION:
                setRegularExpression((String)newValue);
                return;
            case BusinessDomainDslPackage.STRING_PROPERTY__MIN_LENGTH:
                setMinLength((Integer)newValue);
                return;
            case BusinessDomainDslPackage.STRING_PROPERTY__MAX_LENGTH:
                setMaxLength((Integer)newValue);
                return;
            case BusinessDomainDslPackage.STRING_PROPERTY__DEFAULT_VALUE:
                setDefaultValue((String)newValue);
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
            case BusinessDomainDslPackage.STRING_PROPERTY__REGULAR_EXPRESSION:
                setRegularExpression(REGULAR_EXPRESSION_EDEFAULT);
                return;
            case BusinessDomainDslPackage.STRING_PROPERTY__MIN_LENGTH:
                setMinLength(MIN_LENGTH_EDEFAULT);
                return;
            case BusinessDomainDslPackage.STRING_PROPERTY__MAX_LENGTH:
                setMaxLength(MAX_LENGTH_EDEFAULT);
                return;
            case BusinessDomainDslPackage.STRING_PROPERTY__DEFAULT_VALUE:
                setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
            case BusinessDomainDslPackage.STRING_PROPERTY__REGULAR_EXPRESSION:
                return REGULAR_EXPRESSION_EDEFAULT == null ? regularExpression != null : !REGULAR_EXPRESSION_EDEFAULT.equals(regularExpression);
            case BusinessDomainDslPackage.STRING_PROPERTY__MIN_LENGTH:
                return minLength != MIN_LENGTH_EDEFAULT;
            case BusinessDomainDslPackage.STRING_PROPERTY__MAX_LENGTH:
                return maxLength != MAX_LENGTH_EDEFAULT;
            case BusinessDomainDslPackage.STRING_PROPERTY__DEFAULT_VALUE:
                return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
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
        result.append(" (regularExpression: ");
        result.append(regularExpression);
        result.append(", minLength: ");
        result.append(minLength);
        result.append(", maxLength: ");
        result.append(maxLength);
        result.append(", defaultValue: ");
        result.append(defaultValue);
        result.append(')');
        return result.toString();
    }

} //StringPropertyImpl

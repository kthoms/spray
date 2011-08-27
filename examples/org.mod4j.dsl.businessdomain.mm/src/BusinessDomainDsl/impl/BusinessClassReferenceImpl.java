/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessClassReference;
import BusinessDomainDsl.BusinessDomainDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Class Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassReferenceImpl#getReferredModel <em>Referred Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessClassReferenceImpl extends AbstractBusinessClassImpl implements BusinessClassReference {
	/**
     * The default value of the '{@link #getReferredModel() <em>Referred Model</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReferredModel()
     * @generated
     * @ordered
     */
	protected static final String REFERRED_MODEL_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getReferredModel() <em>Referred Model</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReferredModel()
     * @generated
     * @ordered
     */
	protected String referredModel = REFERRED_MODEL_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BusinessClassReferenceImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return BusinessDomainDslPackage.Literals.BUSINESS_CLASS_REFERENCE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getReferredModel() {
        return referredModel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReferredModel(String newReferredModel) {
        String oldReferredModel = referredModel;
        referredModel = newReferredModel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.BUSINESS_CLASS_REFERENCE__REFERRED_MODEL, oldReferredModel, referredModel));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BusinessDomainDslPackage.BUSINESS_CLASS_REFERENCE__REFERRED_MODEL:
                return getReferredModel();
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
            case BusinessDomainDslPackage.BUSINESS_CLASS_REFERENCE__REFERRED_MODEL:
                setReferredModel((String)newValue);
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
            case BusinessDomainDslPackage.BUSINESS_CLASS_REFERENCE__REFERRED_MODEL:
                setReferredModel(REFERRED_MODEL_EDEFAULT);
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
            case BusinessDomainDslPackage.BUSINESS_CLASS_REFERENCE__REFERRED_MODEL:
                return REFERRED_MODEL_EDEFAULT == null ? referredModel != null : !REFERRED_MODEL_EDEFAULT.equals(referredModel);
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
        result.append(" (referredModel: ");
        result.append(referredModel);
        result.append(')');
        return result.toString();
    }

} //BusinessClassReferenceImpl

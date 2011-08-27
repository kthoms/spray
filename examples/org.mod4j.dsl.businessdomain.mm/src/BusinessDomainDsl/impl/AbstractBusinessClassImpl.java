/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.AbstractBusinessClass;
import BusinessDomainDsl.Association;
import BusinessDomainDsl.BusinessDomainDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Business Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.AbstractBusinessClassImpl#getAssociationsFrom <em>Associations From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractBusinessClassImpl extends AbstractTypeImpl implements AbstractBusinessClass {
	/**
     * The cached value of the '{@link #getAssociationsFrom() <em>Associations From</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAssociationsFrom()
     * @generated
     * @ordered
     */
	protected EList<Association> associationsFrom;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AbstractBusinessClassImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return BusinessDomainDslPackage.Literals.ABSTRACT_BUSINESS_CLASS;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Association> getAssociationsFrom() {
        if (associationsFrom == null) {
            associationsFrom = new EObjectWithInverseResolvingEList<Association>(Association.class, this, BusinessDomainDslPackage.ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM, BusinessDomainDslPackage.ASSOCIATION__TARGET);
        }
        return associationsFrom;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessDomainDslPackage.ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociationsFrom()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessDomainDslPackage.ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM:
                return ((InternalEList<?>)getAssociationsFrom()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BusinessDomainDslPackage.ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM:
                return getAssociationsFrom();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BusinessDomainDslPackage.ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM:
                getAssociationsFrom().clear();
                getAssociationsFrom().addAll((Collection<? extends Association>)newValue);
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
            case BusinessDomainDslPackage.ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM:
                getAssociationsFrom().clear();
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
            case BusinessDomainDslPackage.ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM:
                return associationsFrom != null && !associationsFrom.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //AbstractBusinessClassImpl

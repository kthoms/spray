/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xspray.mm.xspray.Behaviour;
import org.xspray.mm.xspray.BehaviourGroup;
import org.xspray.mm.xspray.XsprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviour Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.impl.BehaviourGroupImpl#getBehavioursList <em>Behaviours</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviourGroupImpl extends SprayElementImpl implements BehaviourGroup {
	/**
     * The cached value of the '{@link #getBehavioursList() <em>Behaviours</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBehavioursList()
     * @generated
     * @ordered
     */
	protected EList<Behaviour> behaviours;

	/**
     * The empty value for the '{@link #getBehaviours() <em>Behaviours</em>}' array accessor.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBehaviours()
     * @generated
     * @ordered
     */
	protected static final Behaviour[] BEHAVIOURS_EEMPTY_ARRAY = new Behaviour [0];

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BehaviourGroupImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return XsprayPackage.Literals.BEHAVIOUR_GROUP;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Behaviour[] getBehaviours() {
        if (behaviours == null || behaviours.isEmpty()) return BEHAVIOURS_EEMPTY_ARRAY;
        BasicEList<Behaviour> list = (BasicEList<Behaviour>)behaviours;
        list.shrink();
        return (Behaviour[])list.data();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Behaviour getBehaviours(int index) {
        return getBehavioursList().get(index);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getBehavioursLength() {
        return behaviours == null ? 0 : behaviours.size();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBehaviours(Behaviour[] newBehaviours) {
        ((BasicEList<Behaviour>)getBehavioursList()).setData(newBehaviours.length, newBehaviours);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBehaviours(int index, Behaviour element) {
        getBehavioursList().set(index, element);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Behaviour> getBehavioursList() {
        if (behaviours == null) {
            behaviours = new EObjectContainmentEList<Behaviour>(Behaviour.class, this, XsprayPackage.BEHAVIOUR_GROUP__BEHAVIOURS);
        }
        return behaviours;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XsprayPackage.BEHAVIOUR_GROUP__BEHAVIOURS:
                return ((InternalEList<?>)getBehavioursList()).basicRemove(otherEnd, msgs);
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
            case XsprayPackage.BEHAVIOUR_GROUP__BEHAVIOURS:
                return getBehavioursList();
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
            case XsprayPackage.BEHAVIOUR_GROUP__BEHAVIOURS:
                getBehavioursList().clear();
                getBehavioursList().addAll((Collection<? extends Behaviour>)newValue);
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
            case XsprayPackage.BEHAVIOUR_GROUP__BEHAVIOURS:
                getBehavioursList().clear();
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
            case XsprayPackage.BEHAVIOUR_GROUP__BEHAVIOURS:
                return behaviours != null && !behaviours.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //BehaviourGroupImpl

/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.BehaviourGroup#getBehavioursList <em>Behaviours</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xspray.mm.xspray.XsprayPackage#getBehaviourGroup()
 * @model
 * @generated
 */
public interface BehaviourGroup extends SprayElement {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	Behaviour[] getBehaviours();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	Behaviour getBehaviours(int index);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	int getBehavioursLength();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	void setBehaviours(Behaviour[] newBehaviours);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	void setBehaviours(int index, Behaviour element);

	/**
     * Returns the value of the '<em><b>Behaviours</b></em>' containment reference list.
     * The list contents are of type {@link org.xspray.mm.xspray.Behaviour}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviours</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Behaviours</em>' containment reference list.
     * @see org.xspray.mm.xspray.XsprayPackage#getBehaviourGroup_Behaviours()
     * @model containment="true"
     * @generated
     */
	EList<Behaviour> getBehavioursList();

} // BehaviourGroup

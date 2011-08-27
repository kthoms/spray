/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.Container#getPartsList <em>Parts</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Container#isList <em>List</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Container#isHorizontal <em>Horizontal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xspray.mm.xspray.XsprayPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends Shape {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	SprayElement[] getParts();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	SprayElement getParts(int index);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	int getPartsLength();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	void setParts(SprayElement[] newParts);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	void setParts(int index, SprayElement element);

	/**
     * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
     * The list contents are of type {@link org.xspray.mm.xspray.SprayElement}.
     * It is bidirectional and its opposite is '{@link org.xspray.mm.xspray.SprayElement#getContainer <em>Container</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Parts</em>' containment reference list.
     * @see org.xspray.mm.xspray.XsprayPackage#getContainer_Parts()
     * @see org.xspray.mm.xspray.SprayElement#getContainer
     * @model opposite="container" containment="true"
     * @generated
     */
	EList<SprayElement> getPartsList();

	/**
     * Returns the value of the '<em><b>List</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>List</em>' attribute.
     * @see #setList(boolean)
     * @see org.xspray.mm.xspray.XsprayPackage#getContainer_List()
     * @model
     * @generated
     */
	boolean isList();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Container#isList <em>List</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>List</em>' attribute.
     * @see #isList()
     * @generated
     */
	void setList(boolean value);

	/**
     * Returns the value of the '<em><b>Horizontal</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Horizontal</em>' attribute.
     * @see #setHorizontal(boolean)
     * @see org.xspray.mm.xspray.XsprayPackage#getContainer_Horizontal()
     * @model
     * @generated
     */
	boolean isHorizontal();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Container#isHorizontal <em>Horizontal</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Horizontal</em>' attribute.
     * @see #isHorizontal()
     * @generated
     */
	void setHorizontal(boolean value);

} // Container

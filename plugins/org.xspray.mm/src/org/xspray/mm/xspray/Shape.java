/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.Shape#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Shape#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xspray.mm.xspray.XsprayPackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends SprayElement {
	/**
     * Returns the value of the '<em><b>Represents</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.xspray.mm.xspray.MetaClass#getRepresentedBy <em>Represented By</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Represents</em>' container reference.
     * @see #setRepresents(MetaClass)
     * @see org.xspray.mm.xspray.XsprayPackage#getShape_Represents()
     * @see org.xspray.mm.xspray.MetaClass#getRepresentedBy
     * @model opposite="representedBy" transient="false"
     * @generated
     */
	MetaClass getRepresents();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Shape#getRepresents <em>Represents</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Represents</em>' container reference.
     * @see #getRepresents()
     * @generated
     */
	void setRepresents(MetaClass value);

	/**
     * Returns the value of the '<em><b>Layout</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Layout</em>' containment reference.
     * @see #setLayout(Layout)
     * @see org.xspray.mm.xspray.XsprayPackage#getShape_Layout()
     * @model containment="true"
     * @generated
     */
	Layout getLayout();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Shape#getLayout <em>Layout</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Layout</em>' containment reference.
     * @see #getLayout()
     * @generated
     */
	void setLayout(Layout value);

} // Shape

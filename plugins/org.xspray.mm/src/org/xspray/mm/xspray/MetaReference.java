/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.MetaReference#getRepresentedBy <em>Represented By</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.MetaReference#getMetaClass <em>Meta Class</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.MetaReference#getLabelProperty <em>Label Property</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.MetaReference#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xspray.mm.xspray.XsprayPackage#getMetaReference()
 * @model
 * @generated
 */
public interface MetaReference extends SprayElement {
	/**
	 * Returns the value of the '<em><b>Represented By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented By</em>' containment reference.
	 * @see #setRepresentedBy(Connection)
	 * @see org.xspray.mm.xspray.XsprayPackage#getMetaReference_RepresentedBy()
	 * @model containment="true"
	 * @generated
	 */
	Connection getRepresentedBy();

	/**
	 * Sets the value of the '{@link org.xspray.mm.xspray.MetaReference#getRepresentedBy <em>Represented By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented By</em>' containment reference.
	 * @see #getRepresentedBy()
	 * @generated
	 */
	void setRepresentedBy(Connection value);

	/**
	 * Returns the value of the '<em><b>Meta Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xspray.mm.xspray.MetaClass#getReferencesList <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Class</em>' container reference.
	 * @see #setMetaClass(MetaClass)
	 * @see org.xspray.mm.xspray.XsprayPackage#getMetaReference_MetaClass()
	 * @see org.xspray.mm.xspray.MetaClass#getReferencesList
	 * @model opposite="references" transient="false"
	 * @generated
	 */
	MetaClass getMetaClass();

	/**
	 * Sets the value of the '{@link org.xspray.mm.xspray.MetaReference#getMetaClass <em>Meta Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Class</em>' container reference.
	 * @see #getMetaClass()
	 * @generated
	 */
	void setMetaClass(MetaClass value);

	/**
	 * Returns the value of the '<em><b>Label Property</b></em>' attribute.
	 * The default value is <code>"name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Property</em>' attribute.
	 * @see #setLabelProperty(String)
	 * @see org.xspray.mm.xspray.XsprayPackage#getMetaReference_LabelProperty()
	 * @model default="name"
	 * @generated
	 */
	String getLabelProperty();

	/**
	 * Sets the value of the '{@link org.xspray.mm.xspray.MetaReference#getLabelProperty <em>Label Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Property</em>' attribute.
	 * @see #getLabelProperty()
	 * @generated
	 */
	void setLabelProperty(String value);

    /**
	 * Returns the value of the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference.
	 * @see #setText(Text)
	 * @see org.xspray.mm.xspray.XsprayPackage#getMetaReference_Text()
	 * @model
	 * @generated
	 */
    Text getText();

    /**
	 * Sets the value of the '{@link org.xspray.mm.xspray.MetaReference#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
    void setText(Text value);

} // MetaReference

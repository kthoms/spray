/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.Behaviour#getName <em>Name</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Behaviour#getMetaClass <em>Meta Class</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Behaviour#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Behaviour#getType <em>Type</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Behaviour#getPaletteCompartment <em>Palette Compartment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xspray.mm.xspray.XsprayPackage#getBehaviour()
 * @model abstract="true"
 * @generated
 */
public interface Behaviour extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xspray.mm.xspray.XsprayPackage#getBehaviour_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xspray.mm.xspray.Behaviour#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Meta Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xspray.mm.xspray.MetaClass#getBehavioursList <em>Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Class</em>' container reference.
	 * @see #setMetaClass(MetaClass)
	 * @see org.xspray.mm.xspray.XsprayPackage#getBehaviour_MetaClass()
	 * @see org.xspray.mm.xspray.MetaClass#getBehavioursList
	 * @model opposite="behaviours" transient="false"
	 * @generated
	 */
	MetaClass getMetaClass();

	/**
	 * Sets the value of the '{@link org.xspray.mm.xspray.Behaviour#getMetaClass <em>Meta Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Class</em>' container reference.
	 * @see #getMetaClass()
	 * @generated
	 */
	void setMetaClass(MetaClass value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.xspray.mm.xspray.XsprayPackage#getBehaviour_Label()
	 * @model default=""
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.xspray.mm.xspray.Behaviour#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.xspray.mm.xspray.BehaviourType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.xspray.mm.xspray.BehaviourType
	 * @see #setType(BehaviourType)
	 * @see org.xspray.mm.xspray.XsprayPackage#getBehaviour_Type()
	 * @model
	 * @generated
	 */
	BehaviourType getType();

	/**
	 * Sets the value of the '{@link org.xspray.mm.xspray.Behaviour#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.xspray.mm.xspray.BehaviourType
	 * @see #getType()
	 * @generated
	 */
	void setType(BehaviourType value);

	/**
	 * Returns the value of the '<em><b>Palette Compartment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palette Compartment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palette Compartment</em>' attribute.
	 * @see #setPaletteCompartment(String)
	 * @see org.xspray.mm.xspray.XsprayPackage#getBehaviour_PaletteCompartment()
	 * @model
	 * @generated
	 */
	String getPaletteCompartment();

	/**
	 * Sets the value of the '{@link org.xspray.mm.xspray.Behaviour#getPaletteCompartment <em>Palette Compartment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palette Compartment</em>' attribute.
	 * @see #getPaletteCompartment()
	 * @generated
	 */
	void setPaletteCompartment(String value);

} // Behaviour

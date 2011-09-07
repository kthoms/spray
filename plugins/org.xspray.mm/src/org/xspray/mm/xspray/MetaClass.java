/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.MetaClass#getRepresentedBy <em>Represented By</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.MetaClass#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.MetaClass#getReferencesList <em>References</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.MetaClass#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.MetaClass#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.MetaClass#getBehavioursList <em>Behaviours</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.MetaClass#getBehaviourGroupsList <em>Behaviour Groups</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.MetaClass#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xspray.mm.xspray.XsprayPackage#getMetaClass()
 * @model
 * @generated
 */
public interface MetaClass extends SprayElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Represented By</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.xspray.mm.xspray.Shape#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented By</em>' containment reference.
	 * @see #setRepresentedBy(Shape)
	 * @see org.xspray.mm.xspray.XsprayPackage#getMetaClass_RepresentedBy()
	 * @see org.xspray.mm.xspray.Shape#getRepresents
	 * @model opposite="represents" containment="true"
	 * @generated
	 */
	Shape getRepresentedBy();

	/**
	 * Sets the value of the '{@link org.xspray.mm.xspray.MetaClass#getRepresentedBy <em>Represented By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented By</em>' containment reference.
	 * @see #getRepresentedBy()
	 * @generated
	 */
	void setRepresentedBy(Shape value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xspray.mm.xspray.Diagram#getMetaClassesList <em>Meta Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(Diagram)
	 * @see org.xspray.mm.xspray.XsprayPackage#getMetaClass_Diagram()
	 * @see org.xspray.mm.xspray.Diagram#getMetaClassesList
	 * @model opposite="metaClasses" transient="false"
	 * @generated
	 */
	Diagram getDiagram();

	/**
	 * Sets the value of the '{@link org.xspray.mm.xspray.MetaClass#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(Diagram value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaReference[] getReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaReference getReferences(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getReferencesLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setReferences(MetaReference[] newReferences);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setReferences(int index, MetaReference element);

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.xspray.mm.xspray.MetaReference}.
	 * It is bidirectional and its opposite is '{@link org.xspray.mm.xspray.MetaReference#getMetaClass <em>Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.xspray.mm.xspray.XsprayPackage#getMetaClass_References()
	 * @see org.xspray.mm.xspray.MetaReference#getMetaClass
	 * @model opposite="metaClass" containment="true"
	 * @generated
	 */
	EList<MetaReference> getReferencesList();

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.xspray.mm.xspray.XsprayPackage#getMetaClass_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.xspray.mm.xspray.MetaClass#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.xspray.mm.xspray.XsprayPackage#getMetaClass_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.xspray.mm.xspray.MetaClass#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

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
	 * It is bidirectional and its opposite is '{@link org.xspray.mm.xspray.Behaviour#getMetaClass <em>Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviours</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviours</em>' containment reference list.
	 * @see org.xspray.mm.xspray.XsprayPackage#getMetaClass_Behaviours()
	 * @see org.xspray.mm.xspray.Behaviour#getMetaClass
	 * @model opposite="metaClass" containment="true"
	 * @generated
	 */
	EList<Behaviour> getBehavioursList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourGroup[] getBehaviourGroups();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourGroup getBehaviourGroups(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getBehaviourGroupsLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setBehaviourGroups(BehaviourGroup[] newBehaviourGroups);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setBehaviourGroups(int index, BehaviourGroup element);

	/**
	 * Returns the value of the '<em><b>Behaviour Groups</b></em>' reference list.
	 * The list contents are of type {@link org.xspray.mm.xspray.BehaviourGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviour Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour Groups</em>' reference list.
	 * @see org.xspray.mm.xspray.XsprayPackage#getMetaClass_BehaviourGroups()
	 * @model
	 * @generated
	 */
	EList<BehaviourGroup> getBehaviourGroupsList();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClass)
	 * @see org.xspray.mm.xspray.XsprayPackage#getMetaClass_Type()
	 * @model required="true"
	 * @generated
	 */
	EClass getType();

	/**
	 * Sets the value of the '{@link org.xspray.mm.xspray.MetaClass#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClass value);

} // MetaClass

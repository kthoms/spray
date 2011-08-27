/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.Diagram#getMetaClassesList <em>Meta Classes</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Diagram#getImport1 <em>Import1</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Diagram#getImportPackage <em>Import Package</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Diagram#getModelfileExtension <em>Modelfile Extension</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Diagram#getBehaviourGroupsList <em>Behaviour Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xspray.mm.xspray.XsprayPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends SprayElement {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	MetaClass[] getMetaClasses();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	MetaClass getMetaClasses(int index);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	int getMetaClassesLength();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	void setMetaClasses(MetaClass[] newMetaClasses);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	void setMetaClasses(int index, MetaClass element);

	/**
     * Returns the value of the '<em><b>Meta Classes</b></em>' containment reference list.
     * The list contents are of type {@link org.xspray.mm.xspray.MetaClass}.
     * It is bidirectional and its opposite is '{@link org.xspray.mm.xspray.MetaClass#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Meta Classes</em>' containment reference list.
     * @see org.xspray.mm.xspray.XsprayPackage#getDiagram_MetaClasses()
     * @see org.xspray.mm.xspray.MetaClass#getDiagram
     * @model opposite="diagram" containment="true"
     * @generated
     */
	EList<MetaClass> getMetaClassesList();

	/**
     * Returns the value of the '<em><b>Import1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Import1</em>' attribute.
     * @see #setImport1(String)
     * @see org.xspray.mm.xspray.XsprayPackage#getDiagram_Import1()
     * @model
     * @generated
     */
	String getImport1();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Diagram#getImport1 <em>Import1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Import1</em>' attribute.
     * @see #getImport1()
     * @generated
     */
	void setImport1(String value);

	/**
     * Returns the value of the '<em><b>Import Package</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Import Package</em>' attribute.
     * @see #setImportPackage(String)
     * @see org.xspray.mm.xspray.XsprayPackage#getDiagram_ImportPackage()
     * @model
     * @generated
     */
	String getImportPackage();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Diagram#getImportPackage <em>Import Package</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Import Package</em>' attribute.
     * @see #getImportPackage()
     * @generated
     */
	void setImportPackage(String value);

	/**
     * Returns the value of the '<em><b>Modelfile Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelfile Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Modelfile Extension</em>' attribute.
     * @see #setModelfileExtension(String)
     * @see org.xspray.mm.xspray.XsprayPackage#getDiagram_ModelfileExtension()
     * @model
     * @generated
     */
	String getModelfileExtension();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Diagram#getModelfileExtension <em>Modelfile Extension</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modelfile Extension</em>' attribute.
     * @see #getModelfileExtension()
     * @generated
     */
	void setModelfileExtension(String value);

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
     * Returns the value of the '<em><b>Behaviour Groups</b></em>' containment reference list.
     * The list contents are of type {@link org.xspray.mm.xspray.BehaviourGroup}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviour Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Behaviour Groups</em>' containment reference list.
     * @see org.xspray.mm.xspray.XsprayPackage#getDiagram_BehaviourGroups()
     * @model containment="true"
     * @generated
     */
	EList<BehaviourGroup> getBehaviourGroupsList();

} // Diagram

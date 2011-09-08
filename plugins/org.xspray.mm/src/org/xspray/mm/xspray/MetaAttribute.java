/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.MetaAttribute#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.MetaAttribute#getPathsegmentsList <em>Pathsegments</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.MetaAttribute#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xspray.mm.xspray.XsprayPackage#getMetaAttribute()
 * @model
 * @generated
 */
public interface MetaAttribute extends SprayElement, SprayString {

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(EAttribute)
	 * @see org.xspray.mm.xspray.XsprayPackage#getMetaAttribute_Attribute()
	 * @model required="true"
	 * @generated
	 */
	EAttribute getAttribute();

	/**
	 * Sets the value of the '{@link org.xspray.mm.xspray.MetaAttribute#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(EAttribute value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaAttributePathSegment[] getPathsegments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaAttributePathSegment getPathsegments(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getPathsegmentsLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setPathsegments(MetaAttributePathSegment[] newPathsegments);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setPathsegments(int index, MetaAttributePathSegment element);

	/**
	 * Returns the value of the '<em><b>Pathsegments</b></em>' containment reference list.
	 * The list contents are of type {@link org.xspray.mm.xspray.MetaAttributePathSegment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pathsegments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathsegments</em>' containment reference list.
	 * @see org.xspray.mm.xspray.XsprayPackage#getMetaAttribute_Pathsegments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaAttributePathSegment> getPathsegmentsList();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see org.xspray.mm.xspray.XsprayPackage#getMetaAttribute_Path()
	 * @model default="" changeable="false" derived="true"
	 * @generated
	 */
	String getPath();
} // MetaAttribute

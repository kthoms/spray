/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.xspray.mm.xspray.MetaAttribute;
import org.xspray.mm.xspray.XsprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.impl.MetaAttributeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.MetaAttributeImpl#getPathsegmentsList <em>Pathsegments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaAttributeImpl extends SprayElementImpl implements MetaAttribute {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute attribute;

	/**
	 * The cached value of the '{@link #getPathsegmentsList() <em>Pathsegments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathsegmentsList()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> pathsegments;
	/**
	 * The empty value for the '{@link #getPathsegments() <em>Pathsegments</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathsegments()
	 * @generated
	 * @ordered
	 */
	protected static final EReference[] PATHSEGMENTS_EEMPTY_ARRAY = new EReference [0];

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsprayPackage.Literals.META_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (EAttribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XsprayPackage.META_ATTRIBUTE__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(EAttribute newAttribute) {
		EAttribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.META_ATTRIBUTE__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference[] getPathsegments() {
		if (pathsegments == null || pathsegments.isEmpty()) return PATHSEGMENTS_EEMPTY_ARRAY;
		BasicEList<EReference> list = (BasicEList<EReference>)pathsegments;
		list.shrink();
		return (EReference[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathsegments(int index) {
		return getPathsegmentsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPathsegmentsLength() {
		return pathsegments == null ? 0 : pathsegments.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathsegments(EReference[] newPathsegments) {
		((BasicEList<EReference>)getPathsegmentsList()).setData(newPathsegments.length, newPathsegments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathsegments(int index, EReference element) {
		getPathsegmentsList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getPathsegmentsList() {
		if (pathsegments == null) {
			pathsegments = new EObjectResolvingEList<EReference>(EReference.class, this, XsprayPackage.META_ATTRIBUTE__PATHSEGMENTS);
		}
		return pathsegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XsprayPackage.META_ATTRIBUTE__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case XsprayPackage.META_ATTRIBUTE__PATHSEGMENTS:
				return getPathsegmentsList();
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
			case XsprayPackage.META_ATTRIBUTE__ATTRIBUTE:
				setAttribute((EAttribute)newValue);
				return;
			case XsprayPackage.META_ATTRIBUTE__PATHSEGMENTS:
				getPathsegmentsList().clear();
				getPathsegmentsList().addAll((Collection<? extends EReference>)newValue);
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
			case XsprayPackage.META_ATTRIBUTE__ATTRIBUTE:
				setAttribute((EAttribute)null);
				return;
			case XsprayPackage.META_ATTRIBUTE__PATHSEGMENTS:
				getPathsegmentsList().clear();
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
			case XsprayPackage.META_ATTRIBUTE__ATTRIBUTE:
				return attribute != null;
			case XsprayPackage.META_ATTRIBUTE__PATHSEGMENTS:
				return pathsegments != null && !pathsegments.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public String getName() {
		return attribute==null || attribute.eIsProxy() ? null : attribute.getName();
	}

} //MetaAttributeImpl

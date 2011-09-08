/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.xspray.mm.xspray.MetaAttribute;
import org.xspray.mm.xspray.MetaAttributePathSegment;
import org.xspray.mm.xspray.NamedElement;
import org.xspray.mm.xspray.SprayString;
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
 *   <li>{@link org.xspray.mm.xspray.impl.MetaAttributeImpl#getPath <em>Path</em>}</li>
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
	 * The cached value of the '{@link #getPathsegmentsList() <em>Pathsegments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathsegmentsList()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaAttributePathSegment> pathsegments;
	/**
	 * The empty value for the '{@link #getPathsegments() <em>Pathsegments</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathsegments()
	 * @generated
	 * @ordered
	 */
	protected static final MetaAttributePathSegment[] PATHSEGMENTS_EEMPTY_ARRAY = new MetaAttributePathSegment [0];

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

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
	public String getName() {
		throw new UnsupportedOperationException();
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
	public MetaAttributePathSegment[] getPathsegments() {
		if (pathsegments == null || pathsegments.isEmpty()) return PATHSEGMENTS_EEMPTY_ARRAY;
		BasicEList<MetaAttributePathSegment> list = (BasicEList<MetaAttributePathSegment>)pathsegments;
		list.shrink();
		return (MetaAttributePathSegment[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaAttributePathSegment getPathsegments(int index) {
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
	public void setPathsegments(MetaAttributePathSegment[] newPathsegments) {
		((BasicEList<MetaAttributePathSegment>)getPathsegmentsList()).setData(newPathsegments.length, newPathsegments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathsegments(int index, MetaAttributePathSegment element) {
		getPathsegmentsList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaAttributePathSegment> getPathsegmentsList() {
		if (pathsegments == null) {
			pathsegments = new EObjectContainmentEList<MetaAttributePathSegment>(MetaAttributePathSegment.class, this, XsprayPackage.META_ATTRIBUTE__PATHSEGMENTS);
		}
		return pathsegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getPath() {
		StringBuilder b = new StringBuilder();
		for (MetaAttributePathSegment r : getPathsegments()) {
			b.append(r.getRef().getName()).append(".");
		}
		b.append(getAttribute().getName());
		return b.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsprayPackage.META_ATTRIBUTE__PATHSEGMENTS:
				return ((InternalEList<?>)getPathsegmentsList()).basicRemove(otherEnd, msgs);
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
			case XsprayPackage.META_ATTRIBUTE__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case XsprayPackage.META_ATTRIBUTE__PATHSEGMENTS:
				return getPathsegmentsList();
			case XsprayPackage.META_ATTRIBUTE__PATH:
				return getPath();
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
				getPathsegmentsList().addAll((Collection<? extends MetaAttributePathSegment>)newValue);
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
			case XsprayPackage.META_ATTRIBUTE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //MetaAttributeImpl

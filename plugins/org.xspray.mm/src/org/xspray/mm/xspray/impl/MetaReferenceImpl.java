/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.xspray.mm.xspray.Connection;
import org.xspray.mm.xspray.MetaClass;
import org.xspray.mm.xspray.MetaReference;
import org.xspray.mm.xspray.Text;
import org.xspray.mm.xspray.XsprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.impl.MetaReferenceImpl#getRepresentedBy <em>Represented By</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.MetaReferenceImpl#getMetaClass <em>Meta Class</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.MetaReferenceImpl#getLabelProperty <em>Label Property</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.MetaReferenceImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaReferenceImpl extends SprayElementImpl implements MetaReference {
	/**
	 * The cached value of the '{@link #getRepresentedBy() <em>Represented By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedBy()
	 * @generated
	 * @ordered
	 */
	protected Connection representedBy;

	/**
	 * The default value of the '{@link #getLabelProperty() <em>Label Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_PROPERTY_EDEFAULT = "name";

	/**
	 * The cached value of the '{@link #getLabelProperty() <em>Label Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelProperty()
	 * @generated
	 * @ordered
	 */
	protected String labelProperty = LABEL_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
    protected Text text;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsprayPackage.Literals.META_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getRepresentedBy() {
		return representedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentedBy(Connection newRepresentedBy, NotificationChain msgs) {
		Connection oldRepresentedBy = representedBy;
		representedBy = newRepresentedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsprayPackage.META_REFERENCE__REPRESENTED_BY, oldRepresentedBy, newRepresentedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedBy(Connection newRepresentedBy) {
		if (newRepresentedBy != representedBy) {
			NotificationChain msgs = null;
			if (representedBy != null)
				msgs = ((InternalEObject)representedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsprayPackage.META_REFERENCE__REPRESENTED_BY, null, msgs);
			if (newRepresentedBy != null)
				msgs = ((InternalEObject)newRepresentedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsprayPackage.META_REFERENCE__REPRESENTED_BY, null, msgs);
			msgs = basicSetRepresentedBy(newRepresentedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.META_REFERENCE__REPRESENTED_BY, newRepresentedBy, newRepresentedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaClass getMetaClass() {
		if (eContainerFeatureID() != XsprayPackage.META_REFERENCE__META_CLASS) return null;
		return (MetaClass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaClass(MetaClass newMetaClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMetaClass, XsprayPackage.META_REFERENCE__META_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaClass(MetaClass newMetaClass) {
		if (newMetaClass != eInternalContainer() || (eContainerFeatureID() != XsprayPackage.META_REFERENCE__META_CLASS && newMetaClass != null)) {
			if (EcoreUtil.isAncestor(this, newMetaClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMetaClass != null)
				msgs = ((InternalEObject)newMetaClass).eInverseAdd(this, XsprayPackage.META_CLASS__REFERENCES, MetaClass.class, msgs);
			msgs = basicSetMetaClass(newMetaClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.META_REFERENCE__META_CLASS, newMetaClass, newMetaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelProperty() {
		return labelProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelProperty(String newLabelProperty) {
		String oldLabelProperty = labelProperty;
		labelProperty = newLabelProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.META_REFERENCE__LABEL_PROPERTY, oldLabelProperty, labelProperty));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Text getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (Text)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XsprayPackage.META_REFERENCE__TEXT, oldText, text));
			}
		}
		return text;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Text basicGetText() {
		return text;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setText(Text newText) {
		Text oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.META_REFERENCE__TEXT, oldText, text));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsprayPackage.META_REFERENCE__META_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMetaClass((MetaClass)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsprayPackage.META_REFERENCE__REPRESENTED_BY:
				return basicSetRepresentedBy(null, msgs);
			case XsprayPackage.META_REFERENCE__META_CLASS:
				return basicSetMetaClass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case XsprayPackage.META_REFERENCE__META_CLASS:
				return eInternalContainer().eInverseRemove(this, XsprayPackage.META_CLASS__REFERENCES, MetaClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XsprayPackage.META_REFERENCE__REPRESENTED_BY:
				return getRepresentedBy();
			case XsprayPackage.META_REFERENCE__META_CLASS:
				return getMetaClass();
			case XsprayPackage.META_REFERENCE__LABEL_PROPERTY:
				return getLabelProperty();
			case XsprayPackage.META_REFERENCE__TEXT:
				if (resolve) return getText();
				return basicGetText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XsprayPackage.META_REFERENCE__REPRESENTED_BY:
				setRepresentedBy((Connection)newValue);
				return;
			case XsprayPackage.META_REFERENCE__META_CLASS:
				setMetaClass((MetaClass)newValue);
				return;
			case XsprayPackage.META_REFERENCE__LABEL_PROPERTY:
				setLabelProperty((String)newValue);
				return;
			case XsprayPackage.META_REFERENCE__TEXT:
				setText((Text)newValue);
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
			case XsprayPackage.META_REFERENCE__REPRESENTED_BY:
				setRepresentedBy((Connection)null);
				return;
			case XsprayPackage.META_REFERENCE__META_CLASS:
				setMetaClass((MetaClass)null);
				return;
			case XsprayPackage.META_REFERENCE__LABEL_PROPERTY:
				setLabelProperty(LABEL_PROPERTY_EDEFAULT);
				return;
			case XsprayPackage.META_REFERENCE__TEXT:
				setText((Text)null);
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
			case XsprayPackage.META_REFERENCE__REPRESENTED_BY:
				return representedBy != null;
			case XsprayPackage.META_REFERENCE__META_CLASS:
				return getMetaClass() != null;
			case XsprayPackage.META_REFERENCE__LABEL_PROPERTY:
				return LABEL_PROPERTY_EDEFAULT == null ? labelProperty != null : !LABEL_PROPERTY_EDEFAULT.equals(labelProperty);
			case XsprayPackage.META_REFERENCE__TEXT:
				return text != null;
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
		result.append(" (labelProperty: ");
		result.append(labelProperty);
		result.append(')');
		return result.toString();
	}

} //MetaReferenceImpl

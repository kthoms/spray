/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xspray.mm.xspray.Connection;
import org.xspray.mm.xspray.Text;
import org.xspray.mm.xspray.XsprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.impl.ConnectionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.ConnectionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.ConnectionImpl#getFromLabel <em>From Label</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.ConnectionImpl#getToLabel <em>To Label</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.ConnectionImpl#getConnectionLabel <em>Connection Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends ShapeImpl implements Connection {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EReference from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected EReference to;

	/**
	 * The cached value of the '{@link #getFromLabel() <em>From Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromLabel()
	 * @generated
	 * @ordered
	 */
	protected Text fromLabel;

	/**
	 * The cached value of the '{@link #getToLabel() <em>To Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToLabel()
	 * @generated
	 * @ordered
	 */
	protected Text toLabel;

	/**
	 * The cached value of the '{@link #getConnectionLabel() <em>Connection Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionLabel()
	 * @generated
	 * @ordered
	 */
	protected Text connectionLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsprayPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (EReference)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XsprayPackage.CONNECTION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(EReference newFrom) {
		EReference oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.CONNECTION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (EReference)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XsprayPackage.CONNECTION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(EReference newTo) {
		EReference oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.CONNECTION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getFromLabel() {
		return fromLabel;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetFromLabel(Text newFromLabel, NotificationChain msgs) {
		Text oldFromLabel = fromLabel;
		fromLabel = newFromLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsprayPackage.CONNECTION__FROM_LABEL, oldFromLabel, newFromLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFromLabel(Text newFromLabel) {
		if (newFromLabel != fromLabel) {
			NotificationChain msgs = null;
			if (fromLabel != null)
				msgs = ((InternalEObject)fromLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsprayPackage.CONNECTION__FROM_LABEL, null, msgs);
			if (newFromLabel != null)
				msgs = ((InternalEObject)newFromLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsprayPackage.CONNECTION__FROM_LABEL, null, msgs);
			msgs = basicSetFromLabel(newFromLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.CONNECTION__FROM_LABEL, newFromLabel, newFromLabel));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getToLabel() {
		return toLabel;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetToLabel(Text newToLabel, NotificationChain msgs) {
		Text oldToLabel = toLabel;
		toLabel = newToLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsprayPackage.CONNECTION__TO_LABEL, oldToLabel, newToLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setToLabel(Text newToLabel) {
		if (newToLabel != toLabel) {
			NotificationChain msgs = null;
			if (toLabel != null)
				msgs = ((InternalEObject)toLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsprayPackage.CONNECTION__TO_LABEL, null, msgs);
			if (newToLabel != null)
				msgs = ((InternalEObject)newToLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsprayPackage.CONNECTION__TO_LABEL, null, msgs);
			msgs = basicSetToLabel(newToLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.CONNECTION__TO_LABEL, newToLabel, newToLabel));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getConnectionLabel() {
		return connectionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetConnectionLabel(Text newConnectionLabel, NotificationChain msgs) {
		Text oldConnectionLabel = connectionLabel;
		connectionLabel = newConnectionLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsprayPackage.CONNECTION__CONNECTION_LABEL, oldConnectionLabel, newConnectionLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConnectionLabel(Text newConnectionLabel) {
		if (newConnectionLabel != connectionLabel) {
			NotificationChain msgs = null;
			if (connectionLabel != null)
				msgs = ((InternalEObject)connectionLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsprayPackage.CONNECTION__CONNECTION_LABEL, null, msgs);
			if (newConnectionLabel != null)
				msgs = ((InternalEObject)newConnectionLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsprayPackage.CONNECTION__CONNECTION_LABEL, null, msgs);
			msgs = basicSetConnectionLabel(newConnectionLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.CONNECTION__CONNECTION_LABEL, newConnectionLabel, newConnectionLabel));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsprayPackage.CONNECTION__FROM_LABEL:
				return basicSetFromLabel(null, msgs);
			case XsprayPackage.CONNECTION__TO_LABEL:
				return basicSetToLabel(null, msgs);
			case XsprayPackage.CONNECTION__CONNECTION_LABEL:
				return basicSetConnectionLabel(null, msgs);
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
			case XsprayPackage.CONNECTION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case XsprayPackage.CONNECTION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case XsprayPackage.CONNECTION__FROM_LABEL:
				return getFromLabel();
			case XsprayPackage.CONNECTION__TO_LABEL:
				return getToLabel();
			case XsprayPackage.CONNECTION__CONNECTION_LABEL:
				return getConnectionLabel();
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
			case XsprayPackage.CONNECTION__FROM:
				setFrom((EReference)newValue);
				return;
			case XsprayPackage.CONNECTION__TO:
				setTo((EReference)newValue);
				return;
			case XsprayPackage.CONNECTION__FROM_LABEL:
				setFromLabel((Text)newValue);
				return;
			case XsprayPackage.CONNECTION__TO_LABEL:
				setToLabel((Text)newValue);
				return;
			case XsprayPackage.CONNECTION__CONNECTION_LABEL:
				setConnectionLabel((Text)newValue);
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
			case XsprayPackage.CONNECTION__FROM:
				setFrom((EReference)null);
				return;
			case XsprayPackage.CONNECTION__TO:
				setTo((EReference)null);
				return;
			case XsprayPackage.CONNECTION__FROM_LABEL:
				setFromLabel((Text)null);
				return;
			case XsprayPackage.CONNECTION__TO_LABEL:
				setToLabel((Text)null);
				return;
			case XsprayPackage.CONNECTION__CONNECTION_LABEL:
				setConnectionLabel((Text)null);
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
			case XsprayPackage.CONNECTION__FROM:
				return from != null;
			case XsprayPackage.CONNECTION__TO:
				return to != null;
			case XsprayPackage.CONNECTION__FROM_LABEL:
				return fromLabel != null;
			case XsprayPackage.CONNECTION__TO_LABEL:
				return toLabel != null;
			case XsprayPackage.CONNECTION__CONNECTION_LABEL:
				return connectionLabel != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl

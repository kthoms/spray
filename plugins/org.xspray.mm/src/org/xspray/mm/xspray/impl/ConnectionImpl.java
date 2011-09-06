/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
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
     * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
	protected static final String FROM_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
	protected String from = FROM_EDEFAULT;

	/**
     * The default value of the '{@link #getTo() <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
	protected static final String TO_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
	protected String to = TO_EDEFAULT;

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
	public String getFrom() {
        return from;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFrom(String newFrom) {
        String oldFrom = from;
        from = newFrom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.CONNECTION__FROM, oldFrom, from));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getTo() {
        return to;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTo(String newTo) {
        String oldTo = to;
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
                return getFrom();
            case XsprayPackage.CONNECTION__TO:
                return getTo();
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
                setFrom((String)newValue);
                return;
            case XsprayPackage.CONNECTION__TO:
                setTo((String)newValue);
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
                setFrom(FROM_EDEFAULT);
                return;
            case XsprayPackage.CONNECTION__TO:
                setTo(TO_EDEFAULT);
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
                return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
            case XsprayPackage.CONNECTION__TO:
                return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
            case XsprayPackage.CONNECTION__FROM_LABEL:
                return fromLabel != null;
            case XsprayPackage.CONNECTION__TO_LABEL:
                return toLabel != null;
            case XsprayPackage.CONNECTION__CONNECTION_LABEL:
                return connectionLabel != null;
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
        result.append(" (from: ");
        result.append(from);
        result.append(", to: ");
        result.append(to);
        result.append(')');
        return result.toString();
    }

} //ConnectionImpl

/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.xspray.mm.xspray.Behaviour;
import org.xspray.mm.xspray.BehaviourType;
import org.xspray.mm.xspray.MetaClass;
import org.xspray.mm.xspray.XsprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.impl.BehaviourImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.BehaviourImpl#getMetaClass <em>Meta Class</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.BehaviourImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.BehaviourImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.BehaviourImpl#getPaletteCompartment <em>Palette Compartment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehaviourImpl extends EObjectImpl implements Behaviour {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BehaviourType TYPE_EDEFAULT = BehaviourType.EMPTY_BEHAVIOUR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BehaviourType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaletteCompartment() <em>Palette Compartment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaletteCompartment()
	 * @generated
	 * @ordered
	 */
	protected static final String PALETTE_COMPARTMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaletteCompartment() <em>Palette Compartment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaletteCompartment()
	 * @generated
	 * @ordered
	 */
	protected String paletteCompartment = PALETTE_COMPARTMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsprayPackage.Literals.BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.BEHAVIOUR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaClass getMetaClass() {
		if (eContainerFeatureID() != XsprayPackage.BEHAVIOUR__META_CLASS) return null;
		return (MetaClass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaClass(MetaClass newMetaClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMetaClass, XsprayPackage.BEHAVIOUR__META_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaClass(MetaClass newMetaClass) {
		if (newMetaClass != eInternalContainer() || (eContainerFeatureID() != XsprayPackage.BEHAVIOUR__META_CLASS && newMetaClass != null)) {
			if (EcoreUtil.isAncestor(this, newMetaClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMetaClass != null)
				msgs = ((InternalEObject)newMetaClass).eInverseAdd(this, XsprayPackage.META_CLASS__BEHAVIOURS, MetaClass.class, msgs);
			msgs = basicSetMetaClass(newMetaClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.BEHAVIOUR__META_CLASS, newMetaClass, newMetaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.BEHAVIOUR__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BehaviourType newType) {
		BehaviourType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.BEHAVIOUR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaletteCompartment() {
		return paletteCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaletteCompartment(String newPaletteCompartment) {
		String oldPaletteCompartment = paletteCompartment;
		paletteCompartment = newPaletteCompartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.BEHAVIOUR__PALETTE_COMPARTMENT, oldPaletteCompartment, paletteCompartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsprayPackage.BEHAVIOUR__META_CLASS:
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
			case XsprayPackage.BEHAVIOUR__META_CLASS:
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
			case XsprayPackage.BEHAVIOUR__META_CLASS:
				return eInternalContainer().eInverseRemove(this, XsprayPackage.META_CLASS__BEHAVIOURS, MetaClass.class, msgs);
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
			case XsprayPackage.BEHAVIOUR__NAME:
				return getName();
			case XsprayPackage.BEHAVIOUR__META_CLASS:
				return getMetaClass();
			case XsprayPackage.BEHAVIOUR__LABEL:
				return getLabel();
			case XsprayPackage.BEHAVIOUR__TYPE:
				return getType();
			case XsprayPackage.BEHAVIOUR__PALETTE_COMPARTMENT:
				return getPaletteCompartment();
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
			case XsprayPackage.BEHAVIOUR__NAME:
				setName((String)newValue);
				return;
			case XsprayPackage.BEHAVIOUR__META_CLASS:
				setMetaClass((MetaClass)newValue);
				return;
			case XsprayPackage.BEHAVIOUR__LABEL:
				setLabel((String)newValue);
				return;
			case XsprayPackage.BEHAVIOUR__TYPE:
				setType((BehaviourType)newValue);
				return;
			case XsprayPackage.BEHAVIOUR__PALETTE_COMPARTMENT:
				setPaletteCompartment((String)newValue);
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
			case XsprayPackage.BEHAVIOUR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XsprayPackage.BEHAVIOUR__META_CLASS:
				setMetaClass((MetaClass)null);
				return;
			case XsprayPackage.BEHAVIOUR__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case XsprayPackage.BEHAVIOUR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XsprayPackage.BEHAVIOUR__PALETTE_COMPARTMENT:
				setPaletteCompartment(PALETTE_COMPARTMENT_EDEFAULT);
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
			case XsprayPackage.BEHAVIOUR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XsprayPackage.BEHAVIOUR__META_CLASS:
				return getMetaClass() != null;
			case XsprayPackage.BEHAVIOUR__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case XsprayPackage.BEHAVIOUR__TYPE:
				return type != TYPE_EDEFAULT;
			case XsprayPackage.BEHAVIOUR__PALETTE_COMPARTMENT:
				return PALETTE_COMPARTMENT_EDEFAULT == null ? paletteCompartment != null : !PALETTE_COMPARTMENT_EDEFAULT.equals(paletteCompartment);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", label: ");
		result.append(label);
		result.append(", type: ");
		result.append(type);
		result.append(", paletteCompartment: ");
		result.append(paletteCompartment);
		result.append(')');
		return result.toString();
	}

} //BehaviourImpl

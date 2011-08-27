/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xspray.mm.xspray.Behaviour;
import org.xspray.mm.xspray.BehaviourGroup;
import org.xspray.mm.xspray.Diagram;
import org.xspray.mm.xspray.MetaClass;
import org.xspray.mm.xspray.MetaReference;
import org.xspray.mm.xspray.Shape;
import org.xspray.mm.xspray.XsprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.impl.MetaClassImpl#getRepresentedBy <em>Represented By</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.MetaClassImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.MetaClassImpl#getReferencesList <em>References</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.MetaClassImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.MetaClassImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.MetaClassImpl#getBehavioursList <em>Behaviours</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.MetaClassImpl#getBehaviourGroupsList <em>Behaviour Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaClassImpl extends SprayElementImpl implements MetaClass {
	/**
     * The cached value of the '{@link #getRepresentedBy() <em>Represented By</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRepresentedBy()
     * @generated
     * @ordered
     */
	protected Shape representedBy;

	/**
     * The cached value of the '{@link #getReferencesList() <em>References</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReferencesList()
     * @generated
     * @ordered
     */
	protected EList<MetaReference> references;

	/**
     * The empty value for the '{@link #getReferences() <em>References</em>}' array accessor.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReferences()
     * @generated
     * @ordered
     */
	protected static final MetaReference[] REFERENCES_EEMPTY_ARRAY = new MetaReference [0];

	/**
     * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
	protected static final String ALIAS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
	protected String alias = ALIAS_EDEFAULT;

	/**
     * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIcon()
     * @generated
     * @ordered
     */
	protected static final String ICON_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIcon()
     * @generated
     * @ordered
     */
	protected String icon = ICON_EDEFAULT;

	/**
     * The cached value of the '{@link #getBehavioursList() <em>Behaviours</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBehavioursList()
     * @generated
     * @ordered
     */
	protected EList<Behaviour> behaviours;

	/**
     * The empty value for the '{@link #getBehaviours() <em>Behaviours</em>}' array accessor.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBehaviours()
     * @generated
     * @ordered
     */
	protected static final Behaviour[] BEHAVIOURS_EEMPTY_ARRAY = new Behaviour [0];

	/**
     * The cached value of the '{@link #getBehaviourGroupsList() <em>Behaviour Groups</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBehaviourGroupsList()
     * @generated
     * @ordered
     */
	protected EList<BehaviourGroup> behaviourGroups;

	/**
     * The empty value for the '{@link #getBehaviourGroups() <em>Behaviour Groups</em>}' array accessor.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBehaviourGroups()
     * @generated
     * @ordered
     */
	protected static final BehaviourGroup[] BEHAVIOUR_GROUPS_EEMPTY_ARRAY = new BehaviourGroup [0];

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MetaClassImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return XsprayPackage.Literals.META_CLASS;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shape getRepresentedBy() {
        return representedBy;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetRepresentedBy(Shape newRepresentedBy, NotificationChain msgs) {
        Shape oldRepresentedBy = representedBy;
        representedBy = newRepresentedBy;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsprayPackage.META_CLASS__REPRESENTED_BY, oldRepresentedBy, newRepresentedBy);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRepresentedBy(Shape newRepresentedBy) {
        if (newRepresentedBy != representedBy) {
            NotificationChain msgs = null;
            if (representedBy != null)
                msgs = ((InternalEObject)representedBy).eInverseRemove(this, XsprayPackage.SHAPE__REPRESENTS, Shape.class, msgs);
            if (newRepresentedBy != null)
                msgs = ((InternalEObject)newRepresentedBy).eInverseAdd(this, XsprayPackage.SHAPE__REPRESENTS, Shape.class, msgs);
            msgs = basicSetRepresentedBy(newRepresentedBy, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.META_CLASS__REPRESENTED_BY, newRepresentedBy, newRepresentedBy));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Diagram getDiagram() {
        if (eContainerFeatureID() != XsprayPackage.META_CLASS__DIAGRAM) return null;
        return (Diagram)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newDiagram, XsprayPackage.META_CLASS__DIAGRAM, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDiagram(Diagram newDiagram) {
        if (newDiagram != eInternalContainer() || (eContainerFeatureID() != XsprayPackage.META_CLASS__DIAGRAM && newDiagram != null)) {
            if (EcoreUtil.isAncestor(this, newDiagram))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDiagram != null)
                msgs = ((InternalEObject)newDiagram).eInverseAdd(this, XsprayPackage.DIAGRAM__META_CLASSES, Diagram.class, msgs);
            msgs = basicSetDiagram(newDiagram, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.META_CLASS__DIAGRAM, newDiagram, newDiagram));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MetaReference[] getReferences() {
        if (references == null || references.isEmpty()) return REFERENCES_EEMPTY_ARRAY;
        BasicEList<MetaReference> list = (BasicEList<MetaReference>)references;
        list.shrink();
        return (MetaReference[])list.data();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MetaReference getReferences(int index) {
        return getReferencesList().get(index);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getReferencesLength() {
        return references == null ? 0 : references.size();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReferences(MetaReference[] newReferences) {
        ((BasicEList<MetaReference>)getReferencesList()).setData(newReferences.length, newReferences);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReferences(int index, MetaReference element) {
        getReferencesList().set(index, element);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<MetaReference> getReferencesList() {
        if (references == null) {
            references = new EObjectContainmentWithInverseEList<MetaReference>(MetaReference.class, this, XsprayPackage.META_CLASS__REFERENCES, XsprayPackage.META_REFERENCE__META_CLASS);
        }
        return references;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getAlias() {
        return alias;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAlias(String newAlias) {
        String oldAlias = alias;
        alias = newAlias;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.META_CLASS__ALIAS, oldAlias, alias));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getIcon() {
        return icon;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIcon(String newIcon) {
        String oldIcon = icon;
        icon = newIcon;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.META_CLASS__ICON, oldIcon, icon));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Behaviour[] getBehaviours() {
        if (behaviours == null || behaviours.isEmpty()) return BEHAVIOURS_EEMPTY_ARRAY;
        BasicEList<Behaviour> list = (BasicEList<Behaviour>)behaviours;
        list.shrink();
        return (Behaviour[])list.data();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Behaviour getBehaviours(int index) {
        return getBehavioursList().get(index);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getBehavioursLength() {
        return behaviours == null ? 0 : behaviours.size();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBehaviours(Behaviour[] newBehaviours) {
        ((BasicEList<Behaviour>)getBehavioursList()).setData(newBehaviours.length, newBehaviours);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBehaviours(int index, Behaviour element) {
        getBehavioursList().set(index, element);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Behaviour> getBehavioursList() {
        if (behaviours == null) {
            behaviours = new EObjectContainmentWithInverseEList<Behaviour>(Behaviour.class, this, XsprayPackage.META_CLASS__BEHAVIOURS, XsprayPackage.BEHAVIOUR__META_CLASS);
        }
        return behaviours;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BehaviourGroup[] getBehaviourGroups() {
        if (behaviourGroups == null || behaviourGroups.isEmpty()) return BEHAVIOUR_GROUPS_EEMPTY_ARRAY;
        BasicEList<BehaviourGroup> list = (BasicEList<BehaviourGroup>)behaviourGroups;
        list.shrink();
        return (BehaviourGroup[])list.data();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BehaviourGroup getBehaviourGroups(int index) {
        return getBehaviourGroupsList().get(index);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getBehaviourGroupsLength() {
        return behaviourGroups == null ? 0 : behaviourGroups.size();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBehaviourGroups(BehaviourGroup[] newBehaviourGroups) {
        ((BasicEList<BehaviourGroup>)getBehaviourGroupsList()).setData(newBehaviourGroups.length, newBehaviourGroups);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBehaviourGroups(int index, BehaviourGroup element) {
        getBehaviourGroupsList().set(index, element);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<BehaviourGroup> getBehaviourGroupsList() {
        if (behaviourGroups == null) {
            behaviourGroups = new EObjectResolvingEList<BehaviourGroup>(BehaviourGroup.class, this, XsprayPackage.META_CLASS__BEHAVIOUR_GROUPS);
        }
        return behaviourGroups;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XsprayPackage.META_CLASS__REPRESENTED_BY:
                if (representedBy != null)
                    msgs = ((InternalEObject)representedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsprayPackage.META_CLASS__REPRESENTED_BY, null, msgs);
                return basicSetRepresentedBy((Shape)otherEnd, msgs);
            case XsprayPackage.META_CLASS__DIAGRAM:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDiagram((Diagram)otherEnd, msgs);
            case XsprayPackage.META_CLASS__REFERENCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencesList()).basicAdd(otherEnd, msgs);
            case XsprayPackage.META_CLASS__BEHAVIOURS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getBehavioursList()).basicAdd(otherEnd, msgs);
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
            case XsprayPackage.META_CLASS__REPRESENTED_BY:
                return basicSetRepresentedBy(null, msgs);
            case XsprayPackage.META_CLASS__DIAGRAM:
                return basicSetDiagram(null, msgs);
            case XsprayPackage.META_CLASS__REFERENCES:
                return ((InternalEList<?>)getReferencesList()).basicRemove(otherEnd, msgs);
            case XsprayPackage.META_CLASS__BEHAVIOURS:
                return ((InternalEList<?>)getBehavioursList()).basicRemove(otherEnd, msgs);
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
            case XsprayPackage.META_CLASS__DIAGRAM:
                return eInternalContainer().eInverseRemove(this, XsprayPackage.DIAGRAM__META_CLASSES, Diagram.class, msgs);
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
            case XsprayPackage.META_CLASS__REPRESENTED_BY:
                return getRepresentedBy();
            case XsprayPackage.META_CLASS__DIAGRAM:
                return getDiagram();
            case XsprayPackage.META_CLASS__REFERENCES:
                return getReferencesList();
            case XsprayPackage.META_CLASS__ALIAS:
                return getAlias();
            case XsprayPackage.META_CLASS__ICON:
                return getIcon();
            case XsprayPackage.META_CLASS__BEHAVIOURS:
                return getBehavioursList();
            case XsprayPackage.META_CLASS__BEHAVIOUR_GROUPS:
                return getBehaviourGroupsList();
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
            case XsprayPackage.META_CLASS__REPRESENTED_BY:
                setRepresentedBy((Shape)newValue);
                return;
            case XsprayPackage.META_CLASS__DIAGRAM:
                setDiagram((Diagram)newValue);
                return;
            case XsprayPackage.META_CLASS__REFERENCES:
                getReferencesList().clear();
                getReferencesList().addAll((Collection<? extends MetaReference>)newValue);
                return;
            case XsprayPackage.META_CLASS__ALIAS:
                setAlias((String)newValue);
                return;
            case XsprayPackage.META_CLASS__ICON:
                setIcon((String)newValue);
                return;
            case XsprayPackage.META_CLASS__BEHAVIOURS:
                getBehavioursList().clear();
                getBehavioursList().addAll((Collection<? extends Behaviour>)newValue);
                return;
            case XsprayPackage.META_CLASS__BEHAVIOUR_GROUPS:
                getBehaviourGroupsList().clear();
                getBehaviourGroupsList().addAll((Collection<? extends BehaviourGroup>)newValue);
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
            case XsprayPackage.META_CLASS__REPRESENTED_BY:
                setRepresentedBy((Shape)null);
                return;
            case XsprayPackage.META_CLASS__DIAGRAM:
                setDiagram((Diagram)null);
                return;
            case XsprayPackage.META_CLASS__REFERENCES:
                getReferencesList().clear();
                return;
            case XsprayPackage.META_CLASS__ALIAS:
                setAlias(ALIAS_EDEFAULT);
                return;
            case XsprayPackage.META_CLASS__ICON:
                setIcon(ICON_EDEFAULT);
                return;
            case XsprayPackage.META_CLASS__BEHAVIOURS:
                getBehavioursList().clear();
                return;
            case XsprayPackage.META_CLASS__BEHAVIOUR_GROUPS:
                getBehaviourGroupsList().clear();
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
            case XsprayPackage.META_CLASS__REPRESENTED_BY:
                return representedBy != null;
            case XsprayPackage.META_CLASS__DIAGRAM:
                return getDiagram() != null;
            case XsprayPackage.META_CLASS__REFERENCES:
                return references != null && !references.isEmpty();
            case XsprayPackage.META_CLASS__ALIAS:
                return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
            case XsprayPackage.META_CLASS__ICON:
                return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
            case XsprayPackage.META_CLASS__BEHAVIOURS:
                return behaviours != null && !behaviours.isEmpty();
            case XsprayPackage.META_CLASS__BEHAVIOUR_GROUPS:
                return behaviourGroups != null && !behaviourGroups.isEmpty();
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
        result.append(" (alias: ");
        result.append(alias);
        result.append(", icon: ");
        result.append(icon);
        result.append(')');
        return result.toString();
    }

} //MetaClassImpl

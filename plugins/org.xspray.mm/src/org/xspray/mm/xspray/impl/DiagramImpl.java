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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xspray.mm.xspray.BehaviourGroup;
import org.xspray.mm.xspray.Diagram;
import org.xspray.mm.xspray.MetaClass;
import org.xspray.mm.xspray.XsprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.impl.DiagramImpl#getMetaClassesList <em>Meta Classes</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.DiagramImpl#getImport1 <em>Import1</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.DiagramImpl#getImportPackage <em>Import Package</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.DiagramImpl#getModelfileExtension <em>Modelfile Extension</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.DiagramImpl#getBehaviourGroupsList <em>Behaviour Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramImpl extends SprayElementImpl implements Diagram {
	/**
     * The cached value of the '{@link #getMetaClassesList() <em>Meta Classes</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMetaClassesList()
     * @generated
     * @ordered
     */
	protected EList<MetaClass> metaClasses;

	/**
     * The empty value for the '{@link #getMetaClasses() <em>Meta Classes</em>}' array accessor.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMetaClasses()
     * @generated
     * @ordered
     */
	protected static final MetaClass[] META_CLASSES_EEMPTY_ARRAY = new MetaClass [0];

	/**
     * The default value of the '{@link #getImport1() <em>Import1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getImport1()
     * @generated
     * @ordered
     */
	protected static final String IMPORT1_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getImport1() <em>Import1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getImport1()
     * @generated
     * @ordered
     */
	protected String import1 = IMPORT1_EDEFAULT;

	/**
     * The default value of the '{@link #getImportPackage() <em>Import Package</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getImportPackage()
     * @generated
     * @ordered
     */
	protected static final String IMPORT_PACKAGE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getImportPackage() <em>Import Package</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getImportPackage()
     * @generated
     * @ordered
     */
	protected String importPackage = IMPORT_PACKAGE_EDEFAULT;

	/**
     * The default value of the '{@link #getModelfileExtension() <em>Modelfile Extension</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getModelfileExtension()
     * @generated
     * @ordered
     */
	protected static final String MODELFILE_EXTENSION_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getModelfileExtension() <em>Modelfile Extension</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getModelfileExtension()
     * @generated
     * @ordered
     */
	protected String modelfileExtension = MODELFILE_EXTENSION_EDEFAULT;

	/**
     * The cached value of the '{@link #getBehaviourGroupsList() <em>Behaviour Groups</em>}' containment reference list.
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
	protected DiagramImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return XsprayPackage.Literals.DIAGRAM;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MetaClass[] getMetaClasses() {
        if (metaClasses == null || metaClasses.isEmpty()) return META_CLASSES_EEMPTY_ARRAY;
        BasicEList<MetaClass> list = (BasicEList<MetaClass>)metaClasses;
        list.shrink();
        return (MetaClass[])list.data();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MetaClass getMetaClasses(int index) {
        return getMetaClassesList().get(index);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getMetaClassesLength() {
        return metaClasses == null ? 0 : metaClasses.size();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMetaClasses(MetaClass[] newMetaClasses) {
        ((BasicEList<MetaClass>)getMetaClassesList()).setData(newMetaClasses.length, newMetaClasses);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMetaClasses(int index, MetaClass element) {
        getMetaClassesList().set(index, element);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<MetaClass> getMetaClassesList() {
        if (metaClasses == null) {
            metaClasses = new EObjectContainmentWithInverseEList<MetaClass>(MetaClass.class, this, XsprayPackage.DIAGRAM__META_CLASSES, XsprayPackage.META_CLASS__DIAGRAM);
        }
        return metaClasses;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getImport1() {
        return import1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImport1(String newImport1) {
        String oldImport1 = import1;
        import1 = newImport1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.DIAGRAM__IMPORT1, oldImport1, import1));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getImportPackage() {
        return importPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImportPackage(String newImportPackage) {
        String oldImportPackage = importPackage;
        importPackage = newImportPackage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.DIAGRAM__IMPORT_PACKAGE, oldImportPackage, importPackage));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getModelfileExtension() {
        return modelfileExtension;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setModelfileExtension(String newModelfileExtension) {
        String oldModelfileExtension = modelfileExtension;
        modelfileExtension = newModelfileExtension;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.DIAGRAM__MODELFILE_EXTENSION, oldModelfileExtension, modelfileExtension));
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
            behaviourGroups = new EObjectContainmentEList<BehaviourGroup>(BehaviourGroup.class, this, XsprayPackage.DIAGRAM__BEHAVIOUR_GROUPS);
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
            case XsprayPackage.DIAGRAM__META_CLASSES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetaClassesList()).basicAdd(otherEnd, msgs);
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
            case XsprayPackage.DIAGRAM__META_CLASSES:
                return ((InternalEList<?>)getMetaClassesList()).basicRemove(otherEnd, msgs);
            case XsprayPackage.DIAGRAM__BEHAVIOUR_GROUPS:
                return ((InternalEList<?>)getBehaviourGroupsList()).basicRemove(otherEnd, msgs);
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
            case XsprayPackage.DIAGRAM__META_CLASSES:
                return getMetaClassesList();
            case XsprayPackage.DIAGRAM__IMPORT1:
                return getImport1();
            case XsprayPackage.DIAGRAM__IMPORT_PACKAGE:
                return getImportPackage();
            case XsprayPackage.DIAGRAM__MODELFILE_EXTENSION:
                return getModelfileExtension();
            case XsprayPackage.DIAGRAM__BEHAVIOUR_GROUPS:
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
            case XsprayPackage.DIAGRAM__META_CLASSES:
                getMetaClassesList().clear();
                getMetaClassesList().addAll((Collection<? extends MetaClass>)newValue);
                return;
            case XsprayPackage.DIAGRAM__IMPORT1:
                setImport1((String)newValue);
                return;
            case XsprayPackage.DIAGRAM__IMPORT_PACKAGE:
                setImportPackage((String)newValue);
                return;
            case XsprayPackage.DIAGRAM__MODELFILE_EXTENSION:
                setModelfileExtension((String)newValue);
                return;
            case XsprayPackage.DIAGRAM__BEHAVIOUR_GROUPS:
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
            case XsprayPackage.DIAGRAM__META_CLASSES:
                getMetaClassesList().clear();
                return;
            case XsprayPackage.DIAGRAM__IMPORT1:
                setImport1(IMPORT1_EDEFAULT);
                return;
            case XsprayPackage.DIAGRAM__IMPORT_PACKAGE:
                setImportPackage(IMPORT_PACKAGE_EDEFAULT);
                return;
            case XsprayPackage.DIAGRAM__MODELFILE_EXTENSION:
                setModelfileExtension(MODELFILE_EXTENSION_EDEFAULT);
                return;
            case XsprayPackage.DIAGRAM__BEHAVIOUR_GROUPS:
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
            case XsprayPackage.DIAGRAM__META_CLASSES:
                return metaClasses != null && !metaClasses.isEmpty();
            case XsprayPackage.DIAGRAM__IMPORT1:
                return IMPORT1_EDEFAULT == null ? import1 != null : !IMPORT1_EDEFAULT.equals(import1);
            case XsprayPackage.DIAGRAM__IMPORT_PACKAGE:
                return IMPORT_PACKAGE_EDEFAULT == null ? importPackage != null : !IMPORT_PACKAGE_EDEFAULT.equals(importPackage);
            case XsprayPackage.DIAGRAM__MODELFILE_EXTENSION:
                return MODELFILE_EXTENSION_EDEFAULT == null ? modelfileExtension != null : !MODELFILE_EXTENSION_EDEFAULT.equals(modelfileExtension);
            case XsprayPackage.DIAGRAM__BEHAVIOUR_GROUPS:
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
        result.append(" (import1: ");
        result.append(import1);
        result.append(", importPackage: ");
        result.append(importPackage);
        result.append(", modelfileExtension: ");
        result.append(modelfileExtension);
        result.append(')');
        return result.toString();
    }

} //DiagramImpl

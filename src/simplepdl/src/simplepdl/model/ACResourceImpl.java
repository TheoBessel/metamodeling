/**
 */
package simplepdl.model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import simplepdl.ACResource;
import simplepdl.Resource;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AC Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.model.ACResourceImpl#getResourceQuantity <em>Resource Quantity</em>}</li>
 *   <li>{@link simplepdl.model.ACResourceImpl#getWorkDefinition <em>Work Definition</em>}</li>
 *   <li>{@link simplepdl.model.ACResourceImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ACResourceImpl extends EObjectImpl implements ACResource {
	/**
	 * The default value of the '{@link #getResourceQuantity() <em>Resource Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOURCE_QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResourceQuantity() <em>Resource Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceQuantity()
	 * @generated
	 * @ordered
	 */
	protected int resourceQuantity = RESOURCE_QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.AC_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getResourceQuantity() {
		return resourceQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceQuantity(int newResourceQuantity) {
		int oldResourceQuantity = resourceQuantity;
		resourceQuantity = newResourceQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.AC_RESOURCE__RESOURCE_QUANTITY, oldResourceQuantity, resourceQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkDefinition getWorkDefinition() {
		if (eContainerFeatureID() != SimplepdlPackage.AC_RESOURCE__WORK_DEFINITION) return null;
		return (WorkDefinition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkDefinition(WorkDefinition newWorkDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWorkDefinition, SimplepdlPackage.AC_RESOURCE__WORK_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkDefinition(WorkDefinition newWorkDefinition) {
		if (newWorkDefinition != eInternalContainer() || (eContainerFeatureID() != SimplepdlPackage.AC_RESOURCE__WORK_DEFINITION && newWorkDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newWorkDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorkDefinition != null)
				msgs = ((InternalEObject)newWorkDefinition).eInverseAdd(this, SimplepdlPackage.WORK_DEFINITION__RESOURCES, WorkDefinition.class, msgs);
			msgs = basicSetWorkDefinition(newWorkDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.AC_RESOURCE__WORK_DEFINITION, newWorkDefinition, newWorkDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.AC_RESOURCE__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResource(Resource newResource) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.AC_RESOURCE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.AC_RESOURCE__WORK_DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWorkDefinition((WorkDefinition)otherEnd, msgs);
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
			case SimplepdlPackage.AC_RESOURCE__WORK_DEFINITION:
				return basicSetWorkDefinition(null, msgs);
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
			case SimplepdlPackage.AC_RESOURCE__WORK_DEFINITION:
				return eInternalContainer().eInverseRemove(this, SimplepdlPackage.WORK_DEFINITION__RESOURCES, WorkDefinition.class, msgs);
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
			case SimplepdlPackage.AC_RESOURCE__RESOURCE_QUANTITY:
				return getResourceQuantity();
			case SimplepdlPackage.AC_RESOURCE__WORK_DEFINITION:
				return getWorkDefinition();
			case SimplepdlPackage.AC_RESOURCE__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
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
			case SimplepdlPackage.AC_RESOURCE__RESOURCE_QUANTITY:
				setResourceQuantity((Integer)newValue);
				return;
			case SimplepdlPackage.AC_RESOURCE__WORK_DEFINITION:
				setWorkDefinition((WorkDefinition)newValue);
				return;
			case SimplepdlPackage.AC_RESOURCE__RESOURCE:
				setResource((Resource)newValue);
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
			case SimplepdlPackage.AC_RESOURCE__RESOURCE_QUANTITY:
				setResourceQuantity(RESOURCE_QUANTITY_EDEFAULT);
				return;
			case SimplepdlPackage.AC_RESOURCE__WORK_DEFINITION:
				setWorkDefinition((WorkDefinition)null);
				return;
			case SimplepdlPackage.AC_RESOURCE__RESOURCE:
				setResource((Resource)null);
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
			case SimplepdlPackage.AC_RESOURCE__RESOURCE_QUANTITY:
				return resourceQuantity != RESOURCE_QUANTITY_EDEFAULT;
			case SimplepdlPackage.AC_RESOURCE__WORK_DEFINITION:
				return getWorkDefinition() != null;
			case SimplepdlPackage.AC_RESOURCE__RESOURCE:
				return resource != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (resourceQuantity: ");
		result.append(resourceQuantity);
		result.append(')');
		return result.toString();
	}

} //ACResourceImpl

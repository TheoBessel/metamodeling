/**
 */
package simplepdl.model;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplepdl.ACResource;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.model.WorkDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.model.WorkDefinitionImpl#getLinksToSuccessors <em>Links To Successors</em>}</li>
 *   <li>{@link simplepdl.model.WorkDefinitionImpl#getLinksToPredecessors <em>Links To Predecessors</em>}</li>
 *   <li>{@link simplepdl.model.WorkDefinitionImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkDefinitionImpl extends ProcessElementImpl implements WorkDefinition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "workDefinition";

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
	 * The cached value of the '{@link #getLinksToSuccessors() <em>Links To Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> linksToSuccessors;

	/**
	 * The cached value of the '{@link #getLinksToPredecessors() <em>Links To Predecessors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToPredecessors()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> linksToPredecessors;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ACResource> resources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.WORK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.WORK_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkSequence> getLinksToSuccessors() {
		if (linksToSuccessors == null) {
			linksToSuccessors = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this, SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS, SimplepdlPackage.WORK_SEQUENCE__PREDECESSOR);
		}
		return linksToSuccessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkSequence> getLinksToPredecessors() {
		if (linksToPredecessors == null) {
			linksToPredecessors = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this, SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS, SimplepdlPackage.WORK_SEQUENCE__SUCCESSOR);
		}
		return linksToPredecessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ACResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<ACResource>(ACResource.class, this, SimplepdlPackage.WORK_DEFINITION__RESOURCES, SimplepdlPackage.AC_RESOURCE__WORK_DEFINITION);
		}
		return resources;
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
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinksToSuccessors()).basicAdd(otherEnd, msgs);
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinksToPredecessors()).basicAdd(otherEnd, msgs);
			case SimplepdlPackage.WORK_DEFINITION__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
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
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
				return ((InternalEList<?>)getLinksToSuccessors()).basicRemove(otherEnd, msgs);
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
				return ((InternalEList<?>)getLinksToPredecessors()).basicRemove(otherEnd, msgs);
			case SimplepdlPackage.WORK_DEFINITION__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case SimplepdlPackage.WORK_DEFINITION__NAME:
				return getName();
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
				return getLinksToSuccessors();
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
				return getLinksToPredecessors();
			case SimplepdlPackage.WORK_DEFINITION__RESOURCES:
				return getResources();
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
			case SimplepdlPackage.WORK_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
				getLinksToSuccessors().clear();
				getLinksToSuccessors().addAll((Collection<? extends WorkSequence>)newValue);
				return;
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
				getLinksToPredecessors().clear();
				getLinksToPredecessors().addAll((Collection<? extends WorkSequence>)newValue);
				return;
			case SimplepdlPackage.WORK_DEFINITION__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends ACResource>)newValue);
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
			case SimplepdlPackage.WORK_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
				getLinksToSuccessors().clear();
				return;
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
				getLinksToPredecessors().clear();
				return;
			case SimplepdlPackage.WORK_DEFINITION__RESOURCES:
				getResources().clear();
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
			case SimplepdlPackage.WORK_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
				return linksToSuccessors != null && !linksToSuccessors.isEmpty();
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
				return linksToPredecessors != null && !linksToPredecessors.isEmpty();
			case SimplepdlPackage.WORK_DEFINITION__RESOURCES:
				return resources != null && !resources.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WorkDefinitionImpl

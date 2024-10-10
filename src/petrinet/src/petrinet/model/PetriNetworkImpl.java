/**
 */
package petrinet.model;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet.Arc;
import petrinet.PetriNetwork;
import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petri Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.model.PetriNetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.model.PetriNetworkImpl#getArcs <em>Arcs</em>}</li>
 *   <li>{@link petrinet.model.PetriNetworkImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link petrinet.model.PetriNetworkImpl#getPlaces <em>Places</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PetriNetworkImpl extends EObjectImpl implements PetriNetwork {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.PETRI_NETWORK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.PETRI_NETWORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Arc> getArcs() {
		if (arcs == null) {
			arcs = new EObjectContainmentWithInverseEList<Arc>(Arc.class, this, PetrinetPackage.PETRI_NETWORK__ARCS,
					PetrinetPackage.ARC__PETRI_NET);
		}
		return arcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this,
					PetrinetPackage.PETRI_NETWORK__TRANSITIONS, PetrinetPackage.TRANSITION__PETRI_NET);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Place> getPlaces() {
		if (places == null) {
			places = new EObjectContainmentWithInverseEList<Place>(Place.class, this,
					PetrinetPackage.PETRI_NETWORK__PLACES, PetrinetPackage.PLACE__PETRI_NET);
		}
		return places;
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
		case PetrinetPackage.PETRI_NETWORK__ARCS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getArcs()).basicAdd(otherEnd, msgs);
		case PetrinetPackage.PETRI_NETWORK__TRANSITIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTransitions()).basicAdd(otherEnd, msgs);
		case PetrinetPackage.PETRI_NETWORK__PLACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPlaces()).basicAdd(otherEnd, msgs);
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
		case PetrinetPackage.PETRI_NETWORK__ARCS:
			return ((InternalEList<?>) getArcs()).basicRemove(otherEnd, msgs);
		case PetrinetPackage.PETRI_NETWORK__TRANSITIONS:
			return ((InternalEList<?>) getTransitions()).basicRemove(otherEnd, msgs);
		case PetrinetPackage.PETRI_NETWORK__PLACES:
			return ((InternalEList<?>) getPlaces()).basicRemove(otherEnd, msgs);
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
		case PetrinetPackage.PETRI_NETWORK__NAME:
			return getName();
		case PetrinetPackage.PETRI_NETWORK__ARCS:
			return getArcs();
		case PetrinetPackage.PETRI_NETWORK__TRANSITIONS:
			return getTransitions();
		case PetrinetPackage.PETRI_NETWORK__PLACES:
			return getPlaces();
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
		case PetrinetPackage.PETRI_NETWORK__NAME:
			setName((String) newValue);
			return;
		case PetrinetPackage.PETRI_NETWORK__ARCS:
			getArcs().clear();
			getArcs().addAll((Collection<? extends Arc>) newValue);
			return;
		case PetrinetPackage.PETRI_NETWORK__TRANSITIONS:
			getTransitions().clear();
			getTransitions().addAll((Collection<? extends Transition>) newValue);
			return;
		case PetrinetPackage.PETRI_NETWORK__PLACES:
			getPlaces().clear();
			getPlaces().addAll((Collection<? extends Place>) newValue);
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
		case PetrinetPackage.PETRI_NETWORK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PetrinetPackage.PETRI_NETWORK__ARCS:
			getArcs().clear();
			return;
		case PetrinetPackage.PETRI_NETWORK__TRANSITIONS:
			getTransitions().clear();
			return;
		case PetrinetPackage.PETRI_NETWORK__PLACES:
			getPlaces().clear();
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
		case PetrinetPackage.PETRI_NETWORK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PetrinetPackage.PETRI_NETWORK__ARCS:
			return arcs != null && !arcs.isEmpty();
		case PetrinetPackage.PETRI_NETWORK__TRANSITIONS:
			return transitions != null && !transitions.isEmpty();
		case PetrinetPackage.PETRI_NETWORK__PLACES:
			return places != null && !places.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PetriNetworkImpl

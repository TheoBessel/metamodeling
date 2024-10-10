/**
 */
package petrinet.model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import petrinet.PetriNetwork;
import petrinet.PetrinetPackage;
import petrinet.Place;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.model.PlaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.model.PlaceImpl#getMarking <em>Marking</em>}</li>
 *   <li>{@link petrinet.model.PlaceImpl#getPetriNet <em>Petri Net</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends EObjectImpl implements Place {
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
	 * The default value of the '{@link #getMarking() <em>Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarking()
	 * @generated
	 * @ordered
	 */
	protected static final int MARKING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMarking() <em>Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarking()
	 * @generated
	 * @ordered
	 */
	protected int marking = MARKING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.PLACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.PLACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMarking() {
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarking(int newMarking) {
		int oldMarking = marking;
		marking = newMarking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.PLACE__MARKING, oldMarking, marking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PetriNetwork getPetriNet() {
		if (eContainerFeatureID() != PetrinetPackage.PLACE__PETRI_NET)
			return null;
		return (PetriNetwork) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPetriNet(PetriNetwork newPetriNet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPetriNet, PetrinetPackage.PLACE__PETRI_NET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPetriNet(PetriNetwork newPetriNet) {
		if (newPetriNet != eInternalContainer()
				|| (eContainerFeatureID() != PetrinetPackage.PLACE__PETRI_NET && newPetriNet != null)) {
			if (EcoreUtil.isAncestor(this, newPetriNet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPetriNet != null)
				msgs = ((InternalEObject) newPetriNet).eInverseAdd(this, PetrinetPackage.PETRI_NETWORK__PLACES,
						PetriNetwork.class, msgs);
			msgs = basicSetPetriNet(newPetriNet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.PLACE__PETRI_NET, newPetriNet,
					newPetriNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PetrinetPackage.PLACE__PETRI_NET:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPetriNet((PetriNetwork) otherEnd, msgs);
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
		case PetrinetPackage.PLACE__PETRI_NET:
			return basicSetPetriNet(null, msgs);
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
		case PetrinetPackage.PLACE__PETRI_NET:
			return eInternalContainer().eInverseRemove(this, PetrinetPackage.PETRI_NETWORK__PLACES, PetriNetwork.class,
					msgs);
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
		case PetrinetPackage.PLACE__NAME:
			return getName();
		case PetrinetPackage.PLACE__MARKING:
			return getMarking();
		case PetrinetPackage.PLACE__PETRI_NET:
			return getPetriNet();
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
		case PetrinetPackage.PLACE__NAME:
			setName((String) newValue);
			return;
		case PetrinetPackage.PLACE__MARKING:
			setMarking((Integer) newValue);
			return;
		case PetrinetPackage.PLACE__PETRI_NET:
			setPetriNet((PetriNetwork) newValue);
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
		case PetrinetPackage.PLACE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PetrinetPackage.PLACE__MARKING:
			setMarking(MARKING_EDEFAULT);
			return;
		case PetrinetPackage.PLACE__PETRI_NET:
			setPetriNet((PetriNetwork) null);
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
		case PetrinetPackage.PLACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PetrinetPackage.PLACE__MARKING:
			return marking != MARKING_EDEFAULT;
		case PetrinetPackage.PLACE__PETRI_NET:
			return getPetriNet() != null;
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
		result.append(", marking: ");
		result.append(marking);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl

/**
 */
package petrinet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see petrinet.PetrinetFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/petrinet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetPackage eINSTANCE = petrinet.model.PetrinetPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinet.model.PetriNetworkImpl <em>Petri Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet.model.PetriNetworkImpl
	 * @see petrinet.model.PetrinetPackageImpl#getPetriNetwork()
	 * @generated
	 */
	int PETRI_NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NETWORK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NETWORK__ARCS = 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NETWORK__TRANSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NETWORK__PLACES = 3;

	/**
	 * The number of structural features of the '<em>Petri Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NETWORK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Petri Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinet.model.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet.model.TransitionImpl
	 * @see petrinet.model.PetrinetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PETRI_NET = 0;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinet.model.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet.model.ArcImpl
	 * @see petrinet.model.PetrinetPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__WEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__KIND = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__DIRECTION = 2;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__PLACE = 4;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__PETRI_NET = 5;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinet.model.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet.model.PlaceImpl
	 * @see petrinet.model.PetrinetPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__MARKING = 1;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__PETRI_NET = 2;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinet.ArcKind <em>Arc Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet.ArcKind
	 * @see petrinet.model.PetrinetPackageImpl#getArcKind()
	 * @generated
	 */
	int ARC_KIND = 4;

	/**
	 * The meta object id for the '{@link petrinet.ArcDirection <em>Arc Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet.ArcDirection
	 * @see petrinet.model.PetrinetPackageImpl#getArcDirection()
	 * @generated
	 */
	int ARC_DIRECTION = 5;

	/**
	 * Returns the meta object for class '{@link petrinet.PetriNetwork <em>Petri Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Network</em>'.
	 * @see petrinet.PetriNetwork
	 * @generated
	 */
	EClass getPetriNetwork();

	/**
	 * Returns the meta object for the attribute '{@link petrinet.PetriNetwork#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petrinet.PetriNetwork#getName()
	 * @see #getPetriNetwork()
	 * @generated
	 */
	EAttribute getPetriNetwork_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinet.PetriNetwork#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see petrinet.PetriNetwork#getArcs()
	 * @see #getPetriNetwork()
	 * @generated
	 */
	EReference getPetriNetwork_Arcs();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinet.PetriNetwork#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see petrinet.PetriNetwork#getTransitions()
	 * @see #getPetriNetwork()
	 * @generated
	 */
	EReference getPetriNetwork_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinet.PetriNetwork#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see petrinet.PetriNetwork#getPlaces()
	 * @see #getPetriNetwork()
	 * @generated
	 */
	EReference getPetriNetwork_Places();

	/**
	 * Returns the meta object for class '{@link petrinet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see petrinet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the container reference '{@link petrinet.Transition#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Petri Net</em>'.
	 * @see petrinet.Transition#getPetriNet()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_PetriNet();

	/**
	 * Returns the meta object for class '{@link petrinet.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see petrinet.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the attribute '{@link petrinet.Arc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see petrinet.Arc#getWeight()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Weight();

	/**
	 * Returns the meta object for the attribute '{@link petrinet.Arc#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see petrinet.Arc#getKind()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Kind();

	/**
	 * Returns the meta object for the attribute '{@link petrinet.Arc#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see petrinet.Arc#getDirection()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Direction();

	/**
	 * Returns the meta object for the reference '{@link petrinet.Arc#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see petrinet.Arc#getTransition()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Transition();

	/**
	 * Returns the meta object for the reference '{@link petrinet.Arc#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see petrinet.Arc#getPlace()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Place();

	/**
	 * Returns the meta object for the container reference '{@link petrinet.Arc#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Petri Net</em>'.
	 * @see petrinet.Arc#getPetriNet()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_PetriNet();

	/**
	 * Returns the meta object for class '{@link petrinet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see petrinet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link petrinet.Place#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petrinet.Place#getName()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Name();

	/**
	 * Returns the meta object for the attribute '{@link petrinet.Place#getMarking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marking</em>'.
	 * @see petrinet.Place#getMarking()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Marking();

	/**
	 * Returns the meta object for the container reference '{@link petrinet.Place#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Petri Net</em>'.
	 * @see petrinet.Place#getPetriNet()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_PetriNet();

	/**
	 * Returns the meta object for enum '{@link petrinet.ArcKind <em>Arc Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arc Kind</em>'.
	 * @see petrinet.ArcKind
	 * @generated
	 */
	EEnum getArcKind();

	/**
	 * Returns the meta object for enum '{@link petrinet.ArcDirection <em>Arc Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arc Direction</em>'.
	 * @see petrinet.ArcDirection
	 * @generated
	 */
	EEnum getArcDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetrinetFactory getPetrinetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link petrinet.model.PetriNetworkImpl <em>Petri Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet.model.PetriNetworkImpl
		 * @see petrinet.model.PetrinetPackageImpl#getPetriNetwork()
		 * @generated
		 */
		EClass PETRI_NETWORK = eINSTANCE.getPetriNetwork();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRI_NETWORK__NAME = eINSTANCE.getPetriNetwork_Name();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NETWORK__ARCS = eINSTANCE.getPetriNetwork_Arcs();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NETWORK__TRANSITIONS = eINSTANCE.getPetriNetwork_Transitions();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NETWORK__PLACES = eINSTANCE.getPetriNetwork_Places();

		/**
		 * The meta object literal for the '{@link petrinet.model.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet.model.TransitionImpl
		 * @see petrinet.model.PetrinetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Petri Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__PETRI_NET = eINSTANCE.getTransition_PetriNet();

		/**
		 * The meta object literal for the '{@link petrinet.model.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet.model.ArcImpl
		 * @see petrinet.model.PetrinetPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__KIND = eINSTANCE.getArc_Kind();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__DIRECTION = eINSTANCE.getArc_Direction();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TRANSITION = eINSTANCE.getArc_Transition();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__PLACE = eINSTANCE.getArc_Place();

		/**
		 * The meta object literal for the '<em><b>Petri Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__PETRI_NET = eINSTANCE.getArc_PetriNet();

		/**
		 * The meta object literal for the '{@link petrinet.model.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet.model.PlaceImpl
		 * @see petrinet.model.PetrinetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NAME = eINSTANCE.getPlace_Name();

		/**
		 * The meta object literal for the '<em><b>Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__MARKING = eINSTANCE.getPlace_Marking();

		/**
		 * The meta object literal for the '<em><b>Petri Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__PETRI_NET = eINSTANCE.getPlace_PetriNet();

		/**
		 * The meta object literal for the '{@link petrinet.ArcKind <em>Arc Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet.ArcKind
		 * @see petrinet.model.PetrinetPackageImpl#getArcKind()
		 * @generated
		 */
		EEnum ARC_KIND = eINSTANCE.getArcKind();

		/**
		 * The meta object literal for the '{@link petrinet.ArcDirection <em>Arc Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet.ArcDirection
		 * @see petrinet.model.PetrinetPackageImpl#getArcDirection()
		 * @generated
		 */
		EEnum ARC_DIRECTION = eINSTANCE.getArcDirection();

	}

} //PetrinetPackage

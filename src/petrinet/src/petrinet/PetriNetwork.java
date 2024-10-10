/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.PetriNetwork#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.PetriNetwork#getArcs <em>Arcs</em>}</li>
 *   <li>{@link petrinet.PetriNetwork#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link petrinet.PetriNetwork#getPlaces <em>Places</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getPetriNetwork()
 * @model
 * @generated
 */
public interface PetriNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getPetriNetwork_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.PetriNetwork#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinet.Arc#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getPetriNetwork_Arcs()
	 * @see petrinet.Arc#getPetriNet
	 * @model opposite="petriNet" containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Transition}.
	 * It is bidirectional and its opposite is '{@link petrinet.Transition#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getPetriNetwork_Transitions()
	 * @see petrinet.Transition#getPetriNet
	 * @model opposite="petriNet" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Place}.
	 * It is bidirectional and its opposite is '{@link petrinet.Place#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getPetriNetwork_Places()
	 * @see petrinet.Place#getPetriNet
	 * @model opposite="petriNet" containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

} // PetriNetwork

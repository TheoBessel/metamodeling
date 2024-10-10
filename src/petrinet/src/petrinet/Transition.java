/**
 */
package petrinet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Transition#getPetriNet <em>Petri Net</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Petri Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinet.PetriNetwork#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri Net</em>' container reference.
	 * @see #setPetriNet(PetriNetwork)
	 * @see petrinet.PetrinetPackage#getTransition_PetriNet()
	 * @see petrinet.PetriNetwork#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	PetriNetwork getPetriNet();

	/**
	 * Sets the value of the '{@link petrinet.Transition#getPetriNet <em>Petri Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petri Net</em>' container reference.
	 * @see #getPetriNet()
	 * @generated
	 */
	void setPetriNet(PetriNetwork value);

} // Transition

/**
 */
package simplepdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AC Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.ACResource#getResourceQuantity <em>Resource Quantity</em>}</li>
 *   <li>{@link simplepdl.ACResource#getWorkDefinition <em>Work Definition</em>}</li>
 *   <li>{@link simplepdl.ACResource#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getACResource()
 * @model
 * @generated
 */
public interface ACResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Quantity</em>' attribute.
	 * @see #setResourceQuantity(int)
	 * @see simplepdl.SimplepdlPackage#getACResource_ResourceQuantity()
	 * @model required="true"
	 * @generated
	 */
	int getResourceQuantity();

	/**
	 * Sets the value of the '{@link simplepdl.ACResource#getResourceQuantity <em>Resource Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Quantity</em>' attribute.
	 * @see #getResourceQuantity()
	 * @generated
	 */
	void setResourceQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Work Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Definition</em>' container reference.
	 * @see #setWorkDefinition(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getACResource_WorkDefinition()
	 * @see simplepdl.WorkDefinition#getResources
	 * @model opposite="resources" required="true" transient="false"
	 * @generated
	 */
	WorkDefinition getWorkDefinition();

	/**
	 * Sets the value of the '{@link simplepdl.ACResource#getWorkDefinition <em>Work Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Definition</em>' container reference.
	 * @see #getWorkDefinition()
	 * @generated
	 */
	void setWorkDefinition(WorkDefinition value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see simplepdl.SimplepdlPackage#getACResource_Resource()
	 * @model required="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link simplepdl.ACResource#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // ACResource

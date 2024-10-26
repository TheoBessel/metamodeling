/**
 * generated by Xtext 2.36.0
 */
package simplepdl.xtext.simplePDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.xtext.simplePDL.WorkDefinition#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.xtext.simplePDL.WorkDefinition#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see simplepdl.xtext.simplePDL.SimplePDLPackage#getWorkDefinition()
 * @model
 * @generated
 */
public interface WorkDefinition extends ProcessElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see simplepdl.xtext.simplePDL.SimplePDLPackage#getWorkDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link simplepdl.xtext.simplePDL.WorkDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link simplepdl.xtext.simplePDL.ACResource}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see simplepdl.xtext.simplePDL.SimplePDLPackage#getWorkDefinition_Resources()
   * @model containment="true"
   * @generated
   */
  EList<ACResource> getResources();

} // WorkDefinition
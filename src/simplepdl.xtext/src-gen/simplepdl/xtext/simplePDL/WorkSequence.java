/**
 * generated by Xtext 2.36.0
 */
package simplepdl.xtext.simplePDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.xtext.simplePDL.WorkSequence#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link simplepdl.xtext.simplePDL.WorkSequence#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link simplepdl.xtext.simplePDL.WorkSequence#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @see simplepdl.xtext.simplePDL.SimplePDLPackage#getWorkSequence()
 * @model
 * @generated
 */
public interface WorkSequence extends ProcessElement
{
  /**
   * Returns the value of the '<em><b>Link Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link Type</em>' containment reference.
   * @see #setLinkType(WorkSequenceType)
   * @see simplepdl.xtext.simplePDL.SimplePDLPackage#getWorkSequence_LinkType()
   * @model containment="true"
   * @generated
   */
  WorkSequenceType getLinkType();

  /**
   * Sets the value of the '{@link simplepdl.xtext.simplePDL.WorkSequence#getLinkType <em>Link Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link Type</em>' containment reference.
   * @see #getLinkType()
   * @generated
   */
  void setLinkType(WorkSequenceType value);

  /**
   * Returns the value of the '<em><b>Predecessor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predecessor</em>' reference.
   * @see #setPredecessor(WorkDefinition)
   * @see simplepdl.xtext.simplePDL.SimplePDLPackage#getWorkSequence_Predecessor()
   * @model
   * @generated
   */
  WorkDefinition getPredecessor();

  /**
   * Sets the value of the '{@link simplepdl.xtext.simplePDL.WorkSequence#getPredecessor <em>Predecessor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predecessor</em>' reference.
   * @see #getPredecessor()
   * @generated
   */
  void setPredecessor(WorkDefinition value);

  /**
   * Returns the value of the '<em><b>Successor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Successor</em>' reference.
   * @see #setSuccessor(WorkDefinition)
   * @see simplepdl.xtext.simplePDL.SimplePDLPackage#getWorkSequence_Successor()
   * @model
   * @generated
   */
  WorkDefinition getSuccessor();

  /**
   * Sets the value of the '{@link simplepdl.xtext.simplePDL.WorkSequence#getSuccessor <em>Successor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Successor</em>' reference.
   * @see #getSuccessor()
   * @generated
   */
  void setSuccessor(WorkDefinition value);

} // WorkSequence

/**
 * generated by Xtext 2.36.0
 */
package simplepdl.xtext.simplePDL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import simplepdl.xtext.simplePDL.SimplePDLPackage;
import simplepdl.xtext.simplePDL.WorkSequenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.xtext.simplePDL.impl.WorkSequenceTypeImpl#getStartToStart <em>Start To Start</em>}</li>
 *   <li>{@link simplepdl.xtext.simplePDL.impl.WorkSequenceTypeImpl#getFinishToStart <em>Finish To Start</em>}</li>
 *   <li>{@link simplepdl.xtext.simplePDL.impl.WorkSequenceTypeImpl#getStartToFinish <em>Start To Finish</em>}</li>
 *   <li>{@link simplepdl.xtext.simplePDL.impl.WorkSequenceTypeImpl#getFinishToFinish <em>Finish To Finish</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkSequenceTypeImpl extends MinimalEObjectImpl.Container implements WorkSequenceType
{
  /**
   * The default value of the '{@link #getStartToStart() <em>Start To Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartToStart()
   * @generated
   * @ordered
   */
  protected static final String START_TO_START_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStartToStart() <em>Start To Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartToStart()
   * @generated
   * @ordered
   */
  protected String startToStart = START_TO_START_EDEFAULT;

  /**
   * The default value of the '{@link #getFinishToStart() <em>Finish To Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinishToStart()
   * @generated
   * @ordered
   */
  protected static final String FINISH_TO_START_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFinishToStart() <em>Finish To Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinishToStart()
   * @generated
   * @ordered
   */
  protected String finishToStart = FINISH_TO_START_EDEFAULT;

  /**
   * The default value of the '{@link #getStartToFinish() <em>Start To Finish</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartToFinish()
   * @generated
   * @ordered
   */
  protected static final String START_TO_FINISH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStartToFinish() <em>Start To Finish</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartToFinish()
   * @generated
   * @ordered
   */
  protected String startToFinish = START_TO_FINISH_EDEFAULT;

  /**
   * The default value of the '{@link #getFinishToFinish() <em>Finish To Finish</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinishToFinish()
   * @generated
   * @ordered
   */
  protected static final String FINISH_TO_FINISH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFinishToFinish() <em>Finish To Finish</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinishToFinish()
   * @generated
   * @ordered
   */
  protected String finishToFinish = FINISH_TO_FINISH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkSequenceTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SimplePDLPackage.Literals.WORK_SEQUENCE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStartToStart()
  {
    return startToStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStartToStart(String newStartToStart)
  {
    String oldStartToStart = startToStart;
    startToStart = newStartToStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.WORK_SEQUENCE_TYPE__START_TO_START, oldStartToStart, startToStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFinishToStart()
  {
    return finishToStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFinishToStart(String newFinishToStart)
  {
    String oldFinishToStart = finishToStart;
    finishToStart = newFinishToStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.WORK_SEQUENCE_TYPE__FINISH_TO_START, oldFinishToStart, finishToStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStartToFinish()
  {
    return startToFinish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStartToFinish(String newStartToFinish)
  {
    String oldStartToFinish = startToFinish;
    startToFinish = newStartToFinish;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.WORK_SEQUENCE_TYPE__START_TO_FINISH, oldStartToFinish, startToFinish));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFinishToFinish()
  {
    return finishToFinish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFinishToFinish(String newFinishToFinish)
  {
    String oldFinishToFinish = finishToFinish;
    finishToFinish = newFinishToFinish;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.WORK_SEQUENCE_TYPE__FINISH_TO_FINISH, oldFinishToFinish, finishToFinish));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__START_TO_START:
        return getStartToStart();
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__FINISH_TO_START:
        return getFinishToStart();
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__START_TO_FINISH:
        return getStartToFinish();
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__FINISH_TO_FINISH:
        return getFinishToFinish();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__START_TO_START:
        setStartToStart((String)newValue);
        return;
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__FINISH_TO_START:
        setFinishToStart((String)newValue);
        return;
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__START_TO_FINISH:
        setStartToFinish((String)newValue);
        return;
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__FINISH_TO_FINISH:
        setFinishToFinish((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__START_TO_START:
        setStartToStart(START_TO_START_EDEFAULT);
        return;
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__FINISH_TO_START:
        setFinishToStart(FINISH_TO_START_EDEFAULT);
        return;
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__START_TO_FINISH:
        setStartToFinish(START_TO_FINISH_EDEFAULT);
        return;
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__FINISH_TO_FINISH:
        setFinishToFinish(FINISH_TO_FINISH_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__START_TO_START:
        return START_TO_START_EDEFAULT == null ? startToStart != null : !START_TO_START_EDEFAULT.equals(startToStart);
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__FINISH_TO_START:
        return FINISH_TO_START_EDEFAULT == null ? finishToStart != null : !FINISH_TO_START_EDEFAULT.equals(finishToStart);
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__START_TO_FINISH:
        return START_TO_FINISH_EDEFAULT == null ? startToFinish != null : !START_TO_FINISH_EDEFAULT.equals(startToFinish);
      case SimplePDLPackage.WORK_SEQUENCE_TYPE__FINISH_TO_FINISH:
        return FINISH_TO_FINISH_EDEFAULT == null ? finishToFinish != null : !FINISH_TO_FINISH_EDEFAULT.equals(finishToFinish);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (startToStart: ");
    result.append(startToStart);
    result.append(", finishToStart: ");
    result.append(finishToStart);
    result.append(", startToFinish: ");
    result.append(startToFinish);
    result.append(", finishToFinish: ");
    result.append(finishToFinish);
    result.append(')');
    return result.toString();
  }

} //WorkSequenceTypeImpl
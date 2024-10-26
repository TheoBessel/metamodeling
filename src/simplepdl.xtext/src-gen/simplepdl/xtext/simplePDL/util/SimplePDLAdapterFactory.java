/**
 * generated by Xtext 2.36.0
 */
package simplepdl.xtext.simplePDL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import simplepdl.xtext.simplePDL.ACResource;
import simplepdl.xtext.simplePDL.Guidance;
import simplepdl.xtext.simplePDL.ProcessElement;
import simplepdl.xtext.simplePDL.Resource;
import simplepdl.xtext.simplePDL.SimplePDLPackage;
import simplepdl.xtext.simplePDL.WorkDefinition;
import simplepdl.xtext.simplePDL.WorkSequence;
import simplepdl.xtext.simplePDL.WorkSequenceType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see simplepdl.xtext.simplePDL.SimplePDLPackage
 * @generated
 */
public class SimplePDLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SimplePDLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimplePDLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SimplePDLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimplePDLSwitch<Adapter> modelSwitch =
    new SimplePDLSwitch<Adapter>()
    {
      @Override
      public Adapter caseProcess(simplepdl.xtext.simplePDL.Process object)
      {
        return createProcessAdapter();
      }
      @Override
      public Adapter caseProcessElement(ProcessElement object)
      {
        return createProcessElementAdapter();
      }
      @Override
      public Adapter caseGuidance(Guidance object)
      {
        return createGuidanceAdapter();
      }
      @Override
      public Adapter caseWorkDefinition(WorkDefinition object)
      {
        return createWorkDefinitionAdapter();
      }
      @Override
      public Adapter caseWorkSequence(WorkSequence object)
      {
        return createWorkSequenceAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter caseACResource(ACResource object)
      {
        return createACResourceAdapter();
      }
      @Override
      public Adapter caseWorkSequenceType(WorkSequenceType object)
      {
        return createWorkSequenceTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link simplepdl.xtext.simplePDL.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see simplepdl.xtext.simplePDL.Process
   * @generated
   */
  public Adapter createProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link simplepdl.xtext.simplePDL.ProcessElement <em>Process Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see simplepdl.xtext.simplePDL.ProcessElement
   * @generated
   */
  public Adapter createProcessElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link simplepdl.xtext.simplePDL.Guidance <em>Guidance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see simplepdl.xtext.simplePDL.Guidance
   * @generated
   */
  public Adapter createGuidanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link simplepdl.xtext.simplePDL.WorkDefinition <em>Work Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see simplepdl.xtext.simplePDL.WorkDefinition
   * @generated
   */
  public Adapter createWorkDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link simplepdl.xtext.simplePDL.WorkSequence <em>Work Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see simplepdl.xtext.simplePDL.WorkSequence
   * @generated
   */
  public Adapter createWorkSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link simplepdl.xtext.simplePDL.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see simplepdl.xtext.simplePDL.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link simplepdl.xtext.simplePDL.ACResource <em>AC Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see simplepdl.xtext.simplePDL.ACResource
   * @generated
   */
  public Adapter createACResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link simplepdl.xtext.simplePDL.WorkSequenceType <em>Work Sequence Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see simplepdl.xtext.simplePDL.WorkSequenceType
   * @generated
   */
  public Adapter createWorkSequenceTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SimplePDLAdapterFactory

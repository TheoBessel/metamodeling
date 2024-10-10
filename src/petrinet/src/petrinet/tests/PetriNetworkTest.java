/**
 */
package petrinet.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import petrinet.PetriNetwork;
import petrinet.PetrinetFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Petri Network</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetriNetworkTest extends TestCase {

	/**
	 * The fixture for this Petri Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetwork fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PetriNetworkTest.class);
	}

	/**
	 * Constructs a new Petri Network test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetworkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Petri Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PetriNetwork fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Petri Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetwork getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PetrinetFactory.eINSTANCE.createPetriNetwork());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PetriNetworkTest

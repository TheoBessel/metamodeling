/**
 */
package simplepdl.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import simplepdl.ACResource;
import simplepdl.SimplepdlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>AC Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ACResourceTest extends TestCase {

	/**
	 * The fixture for this AC Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ACResource fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ACResourceTest.class);
	}

	/**
	 * Constructs a new AC Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACResourceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this AC Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ACResource fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this AC Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ACResource getFixture() {
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
		setFixture(SimplepdlFactory.eINSTANCE.createACResource());
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

} //ACResourceTest

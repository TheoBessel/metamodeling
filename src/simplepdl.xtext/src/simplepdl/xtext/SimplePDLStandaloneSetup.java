/*
 * generated by Xtext 2.36.0
 */
package simplepdl.xtext;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SimplePDLStandaloneSetup extends SimplePDLStandaloneSetupGenerated {

	public static void doSetup() {
		new SimplePDLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

package org.dslengineering.p3demo;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class P3DemoDslStandaloneSetup extends P3DemoDslStandaloneSetupGenerated{

	public static void doSetup() {
		new P3DemoDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.cep


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class CepStandaloneSetup extends CepStandaloneSetupGenerated {

	def static void doSetup() {
		new CepStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}

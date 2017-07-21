/*
 * generated by Xtext 2.12.0
 */
package be.unamur.iot.ide

import be.unamur.iot.IoTDSLRuntimeModule
import be.unamur.iot.IoTDSLStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class IoTDSLIdeSetup extends IoTDSLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new IoTDSLRuntimeModule, new IoTDSLIdeModule))
	}
	
}
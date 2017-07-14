/**
 * generated by Xtext 2.10.0
 */
package be.unamur.iotdsl.xtext;

import be.unamur.iotdsl.xtext.IoTDSLStandaloneSetupGenerated;
import com.google.inject.Injector;
import iotdsl.IoTDSLPackage;
import org.eclipse.emf.ecore.EPackage;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class IoTDSLStandaloneSetup extends IoTDSLStandaloneSetupGenerated {
  public static void doSetup() {
    IoTDSLStandaloneSetup _ioTDSLStandaloneSetup = new IoTDSLStandaloneSetup();
    _ioTDSLStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
  
  @Override
  public void register(final Injector injector) {
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey(IoTDSLPackage.eNS_URI);
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put(IoTDSLPackage.eNS_URI, IoTDSLPackage.eINSTANCE);
    }
    super.register(injector);
  }
}
package be.unamur.iotdsl.xtext.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import iotdsl.DeclaredType;
import iotdsl.Device;
import iotdsl.Enumeration;
import iotdsl.EnumerationLiteral;
import iotdsl.Event;
import iotdsl.Feature;
import iotdsl.Gateway;
import iotdsl.IoTModel;
import iotdsl.Parameter;
import iotdsl.PrimitiveType;
import iotdsl.Property;
import iotdsl.Type;
import iotdsl.TypeReference;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

@SuppressWarnings("all")
public class IoTDSLUtil {
  public static Iterable<Device> devices(final IoTModel MM) {
    EList<Type> _types = MM.getTypes();
    return Iterables.<Device>filter(_types, Device.class);
  }
  
  public static Iterable<Gateway> gateways(final IoTModel MM) {
    EList<Type> _types = MM.getTypes();
    return Iterables.<Gateway>filter(_types, Gateway.class);
  }
  
  public static Iterable<Enumeration> enumerations(final IoTModel MM) {
    EList<Type> _types = MM.getTypes();
    return Iterables.<Enumeration>filter(_types, Enumeration.class);
  }
  
  public static Iterable<Event> events(final Device device) {
    EList<Feature> _features = device.getFeatures();
    return Iterables.<Event>filter(_features, Event.class);
  }
  
  public static Iterable<Property> properties(final Device device) {
    EList<Feature> _features = device.getFeatures();
    return Iterables.<Property>filter(_features, Property.class);
  }
  
  public static Enumeration containingEnumeration(final EnumerationLiteral literal) {
    return EcoreUtil2.<Enumeration>getContainerOfType(literal, Enumeration.class);
  }
  
  public static IoTModel containingMetamodel(final EObject e) {
    return EcoreUtil2.<IoTModel>getContainerOfType(e, IoTModel.class);
  }
  
  public static Device containingDevice(final EObject e) {
    return EcoreUtil2.<Device>getContainerOfType(e, Device.class);
  }
  
  public static Event containingEvent(final Parameter param) {
    return EcoreUtil2.<Event>getContainerOfType(param, Event.class);
  }
  
  public static boolean isPrimitiveType(final TypeReference typeref) {
    PrimitiveType _ptype = typeref.getPtype();
    return (!Objects.equal(_ptype, null));
  }
  
  public static boolean isDeclaredType(final TypeReference typeref) {
    DeclaredType _dtype = typeref.getDtype();
    return (!Objects.equal(_dtype, null));
  }
}

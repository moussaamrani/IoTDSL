/**
 * generated by Xtext 2.10.0
 */
package be.unamur.iotdsl.xtext.tests.parsing;

import be.unamur.iotdsl.xtext.tests.IoTDSLInjectorProvider;
import be.unamur.iotdsl.xtext.util.IoTDSLUtil;
import com.google.inject.Inject;
import iotdsl.Device;
import iotdsl.Enumeration;
import iotdsl.EnumerationLiteral;
import iotdsl.Event;
import iotdsl.EventType;
import iotdsl.IoTModel;
import iotdsl.Parameter;
import iotdsl.Property;
import iotdsl.Type;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(IoTDSLInjectorProvider.class)
@SuppressWarnings("all")
public class IoTDSLDeclarationParsingTest {
  @Inject
  @Extension
  private ParseHelper<IoTModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t\t");
      _builder.newLine();
      final IoTModel result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void EnumerationWithoutLiterals() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("enumeration E {}");
      _builder.newLine();
      final IoTModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
      final Iterable<Enumeration> enum_ = IoTDSLUtil.enumerations(model);
      int _size = IterableExtensions.size(enum_);
      Assert.assertEquals(1, _size);
      Enumeration _get = ((Enumeration[])Conversions.unwrapArray(enum_, Enumeration.class))[0];
      String _name = _get.getName();
      Assert.assertEquals("E", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void EnumerationWithOneLiterals() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("enumeration E {VAL;}");
      _builder.newLine();
      final IoTModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
      Iterable<Enumeration> _enumerations = IoTDSLUtil.enumerations(model);
      final Enumeration enum_ = ((Enumeration[])Conversions.unwrapArray(_enumerations, Enumeration.class))[0];
      final EList<EnumerationLiteral> literals = enum_.getLiterals();
      int _size = literals.size();
      Assert.assertEquals(1, _size);
      EnumerationLiteral _get = literals.get(0);
      String _name = _get.getName();
      Assert.assertEquals("VAL", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void EnumerationWithMultipleLiterals() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("enumeration E {VAL; LAV;}");
      _builder.newLine();
      final IoTModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
      Iterable<Enumeration> _enumerations = IoTDSLUtil.enumerations(model);
      Enumeration _get = ((Enumeration[])Conversions.unwrapArray(_enumerations, Enumeration.class))[0];
      EList<EnumerationLiteral> _literals = _get.getLiterals();
      int _size = _literals.size();
      Assert.assertEquals(2, _size);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void GatewayDeclaration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("gateway gw");
      _builder.newLine();
      final IoTModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
      EList<Type> _types = model.getTypes();
      int _size = _types.size();
      Assert.assertEquals(1, _size);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void DeviceDeclarationWithoutFeatures() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device dev{}");
      _builder.newLine();
      final IoTModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
      Iterable<Device> _devices = IoTDSLUtil.devices(model);
      int _size = IterableExtensions.size(_devices);
      Assert.assertEquals(1, _size);
      Iterable<Device> _devices_1 = IoTDSLUtil.devices(model);
      Device _get = ((Device[])Conversions.unwrapArray(_devices_1, Device.class))[0];
      String _name = _get.getName();
      Assert.assertEquals("dev", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void DeviceDeclarationWithOneProperty() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device dev{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("property memory : integer");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IoTModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
      Iterable<Device> _devices = IoTDSLUtil.devices(model);
      Device _get = ((Device[])Conversions.unwrapArray(_devices, Device.class))[0];
      final Iterable<Property> properties = IoTDSLUtil.properties(_get);
      int _size = IterableExtensions.size(properties);
      Assert.assertEquals(1, _size);
      final Property prop = ((Property[])Conversions.unwrapArray(properties, Property.class))[0];
      String _name = prop.getName();
      Assert.assertEquals("memory", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void DeviceDeclarationWithOneSensingEvent() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device dev{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sensing E()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IoTModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
      Iterable<Device> _devices = IoTDSLUtil.devices(model);
      Device _get = ((Device[])Conversions.unwrapArray(_devices, Device.class))[0];
      final Iterable<Event> events = IoTDSLUtil.events(_get);
      int _size = IterableExtensions.size(events);
      Assert.assertEquals(1, _size);
      final Event event = ((Event[])Conversions.unwrapArray(events, Event.class))[0];
      String _name = event.getName();
      Assert.assertEquals("E", _name);
      EventType _kind = event.getKind();
      Assert.assertEquals(_kind, EventType.SENSING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void DeviceDeclarationWithOneActuatingEvent() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device dev{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actuating F()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IoTModel model = this._parseHelper.parse(_builder);
      Iterable<Device> _devices = IoTDSLUtil.devices(model);
      Device _get = ((Device[])Conversions.unwrapArray(_devices, Device.class))[0];
      Iterable<Event> _events = IoTDSLUtil.events(_get);
      Event _get_1 = ((Event[])Conversions.unwrapArray(_events, Event.class))[0];
      EventType _kind = _get_1.getKind();
      Assert.assertEquals(_kind, EventType.ACTUATING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void DeviceDeclarationWithMixedEvent() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device dev{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sensing   E()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actuating F()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IoTModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
      Iterable<Device> _devices = IoTDSLUtil.devices(model);
      Device _get = ((Device[])Conversions.unwrapArray(_devices, Device.class))[0];
      Iterable<Event> _events = IoTDSLUtil.events(_get);
      int _size = IterableExtensions.size(_events);
      Assert.assertEquals(2, _size);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void DeviceDeclarationWithOneParameterEvent() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device dev{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sensing   E(a : integer)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IoTModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
      Iterable<Device> _devices = IoTDSLUtil.devices(model);
      Device _get = ((Device[])Conversions.unwrapArray(_devices, Device.class))[0];
      Iterable<Event> _events = IoTDSLUtil.events(_get);
      Event _get_1 = ((Event[])Conversions.unwrapArray(_events, Event.class))[0];
      final EList<Parameter> params = _get_1.getParameters();
      int _size = params.size();
      Assert.assertEquals(1, _size);
      Parameter _get_2 = params.get(0);
      String _name = _get_2.getName();
      Assert.assertEquals("a", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void DeviceDeclarationWithManyParameterEvent() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device dev{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sensing   E(a : integer, b : integer)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IoTModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
      Iterable<Device> _devices = IoTDSLUtil.devices(model);
      Device _get = ((Device[])Conversions.unwrapArray(_devices, Device.class))[0];
      Iterable<Event> _events = IoTDSLUtil.events(_get);
      Event _get_1 = ((Event[])Conversions.unwrapArray(_events, Event.class))[0];
      final EList<Parameter> params = _get_1.getParameters();
      int _size = params.size();
      Assert.assertEquals(2, _size);
      Parameter _get_2 = params.get(0);
      String _name = _get_2.getName();
      Assert.assertEquals("a", _name);
      Parameter _get_3 = params.get(1);
      String _name_1 = _get_3.getName();
      Assert.assertEquals("b", _name_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void DeviceDeclarationWithMixedFeatures() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device dev{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("property a : integer");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("property b : boolean");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("property c : string");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("property d : real");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sensing   E()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actuating F(a : integer, b : integer)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IoTModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
      Iterable<Device> _devices = IoTDSLUtil.devices(model);
      final Device device = ((Device[])Conversions.unwrapArray(_devices, Device.class))[0];
      final Iterable<Property> props = IoTDSLUtil.properties(device);
      final Iterable<Event> events = IoTDSLUtil.events(device);
      int _size = IterableExtensions.size(props);
      Assert.assertEquals(4, _size);
      int _size_1 = IterableExtensions.size(events);
      Assert.assertEquals(2, _size_1);
      Event _get = ((Event[])Conversions.unwrapArray(events, Event.class))[1];
      EList<Parameter> _parameters = _get.getParameters();
      int _size_2 = _parameters.size();
      Assert.assertEquals(2, _size_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

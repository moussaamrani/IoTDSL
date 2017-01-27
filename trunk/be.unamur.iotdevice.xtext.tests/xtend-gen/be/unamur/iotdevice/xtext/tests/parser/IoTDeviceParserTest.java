package be.unamur.iotdevice.xtext.tests.parser;

import IoTDevice.IoTModel;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class IoTDeviceParserTest {
  @Inject
  @Extension
  private ParseHelper<IoTModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testParsingSimpleGatewayCloud() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("gateway GW");
      _builder.newLine();
      _builder.append("cloud myCloud");
      _builder.newLine();
      IoTModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingSimpleEnumeration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("enumeration Volume {V1; V2; V3;}");
      _builder.newLine();
      IoTModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingSimpleDevice() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device Timer{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actuating reset()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      IoTModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingSimpleDevice2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device Timer{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actuating reset()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sensing   timeout()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      IoTModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingSimpleDeviceWithEnumParameter() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("enumeration Volume {V1; V2; V3;}");
      _builder.newLine();
      _builder.append("device VolumeSetter{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actuating set(delay : Volume)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      IoTModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingSimpleDeviceWithPrimitiveParameter() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device Timer{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actuating reset()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sensing   timeout(delay : integer)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      IoTModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingSimpleConfiguration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device Phone{}");
      _builder.newLine();
      _builder.append("gateway Central");
      _builder.newLine();
      _builder.newLine();
      _builder.append("configuration MyHome{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node gw : Central");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node ipPhone : Phone");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("from ipPhone to gw via IP");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      IoTModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingSimpleConfigurationWithVarDecls() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device Phone{}");
      _builder.newLine();
      _builder.append("gateway Central");
      _builder.newLine();
      _builder.newLine();
      _builder.append("configuration MyHome{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node gw : Central");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node ipPhone : Phone");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node aPhone  : Phone");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("from ipPhone to gw via IP");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var phones = [ipPhone, aPhone]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      IoTModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingSimpleRuleWithOnlyReactionAndTrue() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device Phone{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sensing receivedCall()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actuating ring()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("gateway Central");
      _builder.newLine();
      _builder.newLine();
      _builder.append("configuration MyHome{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node gw : Central");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node ipPhone : Phone");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("from ipPhone to gw via IP");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("rule RingWhenReceivedCall:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("when (true) do {ipPhone.ring()}");
      _builder.newLine();
      _builder.newLine();
      IoTModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingSimpleRuleWithTriggerAndReaction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device Phone{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sensing receivedCall()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actuating ring()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("gateway Central");
      _builder.newLine();
      _builder.newLine();
      _builder.append("configuration MyHome{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node gw : Central");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node ipPhone : Phone");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("from ipPhone to gw via IP");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("rule RingWhenReceivedCall:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("when (ipPhone.receivedCall()) do {ipPhone.ring()}");
      _builder.newLine();
      _builder.newLine();
      IoTModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingSimpleRuleWithCompositeTrigger() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device Phone{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sensing receivedCall()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actuating ring()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("gateway Central");
      _builder.newLine();
      _builder.newLine();
      _builder.append("configuration MyHome{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node gw : Central");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node ipPhone : Phone");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("from ipPhone to gw via IP");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("rule RingWhenReceivedCallAnd:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("when (ipPhone.receivedCall() and ipPhone.receivedCall()) do {ipPhone.ring()}");
      _builder.newLine();
      _builder.append("rule RingWhenReceivedCallOr:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("when (ipPhone.receivedCall() or ipPhone.receivedCall()) do {ipPhone.ring()}");
      _builder.newLine();
      _builder.newLine();
      IoTModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingSimpleRuleWithCompositeReactionSeq() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device Phone{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sensing receivedCall()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actuating ring()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("gateway Central");
      _builder.newLine();
      _builder.newLine();
      _builder.append("configuration MyHome{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node gw : Central");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node ipPhone : Phone");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("from ipPhone to gw via IP");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("rule RingWhenReceivedCallAnd:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("when (ipPhone.receivedCall()) do {ipPhone.ring() ; ipPhone.receivedCall()}");
      _builder.newLine();
      IoTModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingSimpleRuleWithCompositeReactionPar() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device Phone{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sensing receivedCall()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actuating ring()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("gateway Central");
      _builder.newLine();
      _builder.newLine();
      _builder.append("configuration MyHome{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node gw : Central");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node ipPhone : Phone");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("from ipPhone to gw via IP");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("rule RingWhenReceivedCallAnd:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("when (ipPhone.receivedCall()) do {ipPhone.ring() || ipPhone.receivedCall()}");
      _builder.newLine();
      IoTModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingSimpleRuleWithElaborateCompositeReaction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device Phone{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sensing receivedCall()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actuating ring()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("gateway Central");
      _builder.newLine();
      _builder.newLine();
      _builder.append("configuration MyHome{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node gw : Central");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node ipPhone : Phone");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("from ipPhone to gw via IP");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("rule RingWhenReceivedCallAnd:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("when (ipPhone.receivedCall()) do {ipPhone.ring() ; ipPhone.receivedCall() || ipPhone.receivedCall()}");
      _builder.newLine();
      IoTModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingSimpleRuleWithElaborateTriggerAndReaction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("device Phone{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sensing receivedCall()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actuating ring()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("gateway Central");
      _builder.newLine();
      _builder.newLine();
      _builder.append("configuration MyHome{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node gw : Central");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node ipPhone : Phone");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("from ipPhone to gw via IP");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("rule RingWhenReceivedCallAnd:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("when (ipPhone.receivedCall() and ipPhone.receivedCall()) do {ipPhone.ring() ; ipPhone.receivedCall() || ipPhone.receivedCall()}");
      _builder.newLine();
      IoTModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

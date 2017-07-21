/**
 * generated by Xtext 2.10.0
 */
package be.unamur.iotdsl.xtext.tests;

import be.unamur.iotdsl.xtext.tests.IoTDSLInjectorProvider;
import com.google.inject.Inject;
import iotdsl.IoTModel;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(IoTDSLInjectorProvider.class)
@SuppressWarnings("all")
public class IoTDSLParsingTest {
  @Inject
  private ParseHelper<IoTModel> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final IoTModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

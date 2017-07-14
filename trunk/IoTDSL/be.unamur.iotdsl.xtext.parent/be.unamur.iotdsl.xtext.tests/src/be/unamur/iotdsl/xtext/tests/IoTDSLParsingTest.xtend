/*
 * generated by Xtext 2.10.0
 */
package be.unamur.iotdsl.xtext.tests

import com.google.inject.Inject
import iotdsl.IoTModel
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(IoTDSLInjectorProvider)
class IoTDSLParsingTest{

	@Inject
	ParseHelper<IoTModel> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
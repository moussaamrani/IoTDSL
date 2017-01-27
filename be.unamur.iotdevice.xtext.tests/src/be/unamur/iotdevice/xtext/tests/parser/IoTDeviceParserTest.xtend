package be.unamur.iotdevice.xtext.tests.parser

import IoTDevice.IoTModel
//import be.unamur.iotdevice.IoTDeviceInjectorProvider
import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
//@InjectWith(typeof(IoTDeviceInjectorProvider))
class IoTDeviceParserTest {
	@Inject extension ParseHelper<IoTModel>
//	@Inject extension IoTDeviceTypeProvider
	@Inject extension ValidationTestHelper
	
	@Test
	def void testParsingSimpleGatewayCloud() {
		'''
			gateway GW
			cloud myCloud
		'''.parse.assertNoErrors
	}
	
	
	@Test
	def void testParsingSimpleEnumeration() {
		'''
			enumeration Volume {V1; V2; V3;}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParsingSimpleDevice() {
		'''
			device Timer{
				actuating reset()
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParsingSimpleDevice2() {
		'''
			device Timer{
				actuating reset()
				sensing   timeout()
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParsingSimpleDeviceWithEnumParameter() {
		'''
			enumeration Volume {V1; V2; V3;}
			device VolumeSetter{
				actuating set(delay : Volume)
			}
		'''.parse.assertNoErrors
	}

	@Test
	def void testParsingSimpleDeviceWithPrimitiveParameter() {
		'''
			device Timer{
				actuating reset()
				sensing   timeout(delay : integer)
			}
		'''.parse.assertNoErrors
	}

	@Test
	def void testParsingSimpleConfiguration(){
		'''
			device Phone{}
			gateway Central

			configuration MyHome{
				node gw : Central
				node ipPhone : Phone
				from ipPhone to gw via IP
			}
			
		'''.parse.assertNoErrors	
	}

	@Test
	def void testParsingSimpleConfigurationWithVarDecls(){
		'''
			device Phone{}
			gateway Central

			configuration MyHome{
				node gw : Central
				node ipPhone : Phone
				node aPhone  : Phone
				from ipPhone to gw via IP
				
				var phones = [ipPhone, aPhone]
			}
			
		'''.parse.assertNoErrors	
	}


	@Test
	def void testParsingSimpleRuleWithOnlyReactionAndTrue(){
		'''
			device Phone{
				sensing receivedCall()
				actuating ring()
			}

			gateway Central
			
			configuration MyHome{
				node gw : Central
				node ipPhone : Phone

				from ipPhone to gw via IP
			}
			rule RingWhenReceivedCall:
				when (true) do {ipPhone.ring()}
			
		'''.parse.assertNoErrors	
	}

	@Test
	def void testParsingSimpleRuleWithTriggerAndReaction(){
		'''
			device Phone{
				sensing receivedCall()
				actuating ring()
			}

			gateway Central
			
			configuration MyHome{
				node gw : Central
				node ipPhone : Phone

				from ipPhone to gw via IP
			}
			rule RingWhenReceivedCall:
				when (ipPhone.receivedCall()) do {ipPhone.ring()}
			
		'''.parse.assertNoErrors	
	}
	
	@Test
	def void testParsingSimpleRuleWithCompositeTrigger(){
		'''
			device Phone{
				sensing receivedCall()
				actuating ring()
			}

			gateway Central
			
			configuration MyHome{
				node gw : Central
				node ipPhone : Phone

				from ipPhone to gw via IP
			}
			rule RingWhenReceivedCallAnd:
				when (ipPhone.receivedCall() and ipPhone.receivedCall()) do {ipPhone.ring()}
			rule RingWhenReceivedCallOr:
				when (ipPhone.receivedCall() or ipPhone.receivedCall()) do {ipPhone.ring()}
			
		'''.parse.assertNoErrors	
	}
	
	@Test
	def void testParsingSimpleRuleWithCompositeReactionSeq(){
		'''
			device Phone{
				sensing receivedCall()
				actuating ring()
			}

			gateway Central
			
			configuration MyHome{
				node gw : Central
				node ipPhone : Phone

				from ipPhone to gw via IP
			}
			rule RingWhenReceivedCallAnd:
				when (ipPhone.receivedCall()) do {ipPhone.ring() ; ipPhone.receivedCall()}
		'''.parse.assertNoErrors	
	}
	
	@Test
	def void testParsingSimpleRuleWithCompositeReactionPar(){
		'''
			device Phone{
				sensing receivedCall()
				actuating ring()
			}

			gateway Central
			
			configuration MyHome{
				node gw : Central
				node ipPhone : Phone

				from ipPhone to gw via IP
			}
			rule RingWhenReceivedCallAnd:
				when (ipPhone.receivedCall()) do {ipPhone.ring() || ipPhone.receivedCall()}
		'''.parse.assertNoErrors	
	}

	@Test
	def void testParsingSimpleRuleWithElaborateCompositeReaction(){
		'''
			device Phone{
				sensing receivedCall()
				actuating ring()
			}

			gateway Central
			
			configuration MyHome{
				node gw : Central
				node ipPhone : Phone

				from ipPhone to gw via IP
			}
			rule RingWhenReceivedCallAnd:
				when (ipPhone.receivedCall()) do {ipPhone.ring() ; ipPhone.receivedCall() || ipPhone.receivedCall()}
		'''.parse.assertNoErrors	
	}

	@Test
	def void testParsingSimpleRuleWithElaborateTriggerAndReaction(){
		'''
			device Phone{
				sensing receivedCall()
				actuating ring()
			}

			gateway Central
			
			configuration MyHome{
				node gw : Central
				node ipPhone : Phone

				from ipPhone to gw via IP
			}
			rule RingWhenReceivedCallAnd:
				when (ipPhone.receivedCall() and ipPhone.receivedCall()) do {ipPhone.ring() ; ipPhone.receivedCall() || ipPhone.receivedCall()}
		'''.parse.assertNoErrors	
	}

}
/*
 * generated by Xtext
 */
package be.unamur.iotdevice.validation

import IoTDevice.Capability
import IoTDevice.Cloud
import IoTDevice.Device
import IoTDevice.Enumeration
import IoTDevice.EnumerationLiteral
import IoTDevice.Gateway
import IoTDevice.IoTDevicePackage
import IoTDevice.Parameter
import IoTDevice.Property
import IoTDevice.Rule
import IoTDevice.Target
import IoTDevice.VariableDeclaration
import org.eclipse.xtext.validation.Check

import static extension be.unamur.iotdevice.util.IoTDeviceUtil.*

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class IoTDeviceDuplicateValidator extends AbstractIoTDeviceValidator {

	public static val DUPLICATE_NAME        = "DUPLICATE_NAME" 

	@Check
	def void checkNoDuplicateDevice(Device device){
		if(device.containingMetamodel.types.exists[it != device && it.name == device.name])
			error("Duplicate device '" + device.name + "'",
				IoTDevicePackage::eINSTANCE.namedElement_Name,
				DUPLICATE_NAME)
	}
	@Check
	def void checkNoDuplicateGateway(Gateway gateway){
		if(gateway.containingMetamodel.types.exists[it != gateway && it.name == gateway.name])
			error("Duplicate device '" + gateway.name + "'",
				IoTDevicePackage::eINSTANCE.namedElement_Name,
				DUPLICATE_NAME)
	}
	@Check
	def void checkNoDuplicateCloud(Cloud cloud){
		if(cloud.containingMetamodel.types.exists[it != cloud && it.name == cloud.name])
			error("Duplicate device '" + cloud.name + "'",
				IoTDevicePackage::eINSTANCE.namedElement_Name,
				DUPLICATE_NAME)
	}

	@Check
	def void checkNoDuplicateCapability(Capability cap){ 
		if(cap.containingDevice.capabilities.exists[ 
			it != cap && 
			it.name == cap.name])
			error("Duplicate structural property '" + cap.name + "'",
				IoTDevicePackage::eINSTANCE.namedElement_Name,
				DUPLICATE_NAME)
	}

	@Check
	def void checkNoDuplicateEnumeration(Enumeration e){
		if(e.containingMetamodel.enumerations.exists[it != e && it.name == e.name])
			error("Duplicate enumeration '" + e.name + "'",
				IoTDevicePackage::eINSTANCE.namedElement_Name,
				DUPLICATE_NAME
			)
	}
	
	@Check
	def void checkNoDuplicateEnumerationLiteral(EnumerationLiteral lit) {
		if (lit.containingEnumeration.literals.exists[it != lit && it.name == lit.name])
			error("Duplicate enumeration literal '" + lit.name + "'",
					IoTDevicePackage::eINSTANCE.namedElement_Name,
					DUPLICATE_NAME)
	}

	@Check
	def void checkNoDuplicateProperty(Property prop){
		val duplicate = prop.containingDevice.properties.findFirst[it != prop && it.name == prop.name]
		if(duplicate != null)
			error("Duplicate parameter declaration '" + prop.name + "'",
				IoTDevicePackage::eINSTANCE.namedElement_Name,
				DUPLICATE_NAME)
	}

	@Check
	def void checkNoDuplicateParameter(Parameter param){
		val duplicate = param.containingCapability.parameters.findFirst[it != param && it.name == param.name]
		if(duplicate != null)
			error("Duplicate parameter declaration '" + param.name + "'",
				IoTDevicePackage::eINSTANCE.namedElement_Name,
				DUPLICATE_NAME)
	}

	@Check
	def void checkNoDuplicateVariable(VariableDeclaration variable){
		val duplicate = variable.containingConfiguration.variables.findFirst[it != variable && it.name == variable.name]
		if(duplicate != null)
			error("Duplicate variable declaration '" + variable.name + "'",
				IoTDevicePackage::eINSTANCE.namedElement_Name,
				DUPLICATE_NAME)
	}

	@Check
	def void checkNoDuplicateVariableLiteral(Target target){
		val duplicate = target.containingCollectionLiteral.value.findFirst[it != target && it.ref.name == target.ref.name]
		if(duplicate != null)
			error("Duplicate parameter declaration '" + target.ref.name + "'",
				IoTDevicePackage::eINSTANCE.namedElement_Name,
				DUPLICATE_NAME)
	}


	@Check
	def void checkNoDuplicateRule(Rule rule){
		if(rule.containingMetamodel.rules.exists[it != rule && it.name == rule.name])
			error("Duplicate rule declaration '" + rule.name + "'",
				IoTDevicePackage::eINSTANCE.namedElement_Name,
				DUPLICATE_NAME)
	}
}
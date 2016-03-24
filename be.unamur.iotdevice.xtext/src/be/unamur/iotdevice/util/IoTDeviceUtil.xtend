package be.unamur.iotdevice.util

import IoTDevice.Actuating
import IoTDevice.Capability
import IoTDevice.CommunicationPath
import IoTDevice.Device
import IoTDevice.Enumeration
import IoTDevice.EnumerationLiteral
import IoTDevice.EqualityExpression
import IoTDevice.Expression
import IoTDevice.IoTModel
import IoTDevice.NetworkConfiguration
import IoTDevice.NodeInstance
import IoTDevice.Parameter
import IoTDevice.Rule
import IoTDevice.Sensing
import IoTDevice.UnaryExpression
import org.eclipse.emf.ecore.EObject

import static extension org.eclipse.xtext.EcoreUtil2.*

class IoTDeviceUtil {
	def static devices(IoTModel MM){
		MM.types.filter(typeof(Device))
	}
	
	def static enumerations(IoTModel MM){
		MM.types.filter(typeof(Enumeration))
	}
	
	def static sensing(Device device){
		device.capabilities.filter(typeof(Sensing))
	}

	def static actuating(Device device){
		device.capabilities.filter(typeof(Actuating))
	}
	
	def static devices(NetworkConfiguration config){
		config.nodes.filter[type instanceof Device]
	}

	def static containingMetamodel(EObject e) {
		e.getContainerOfType(typeof(IoTModel))
	}
	
	def static containingEnumeration(EnumerationLiteral literal){
		literal.getContainerOfType(typeof(Enumeration))	
	}

	def static containingDevice(Capability cap){
		cap.getContainerOfType(typeof(Device))	
	}

	def static containingCapability(Parameter param){
		param.getContainerOfType(typeof(Capability))	
	}

	def static containingConfiguration(NodeInstance node){
		node.getContainerOfType(typeof(NetworkConfiguration))
	}
	
	def static containingConfiguration(CommunicationPath path){
		path.getContainerOfType(typeof(NetworkConfiguration))
	}
	
	def static containingRule(Expression exp){
		exp.getContainerOfType(typeof(Rule))
	}
	
	def static isTriggerExpression(Expression exp){
		exp.containingRule.trigger == exp
	}

	def static isReactionExpression(Expression exp){
		exp.containingRule.reaction == exp
	}

	
	def static in(NodeInstance node){
		node.containingConfiguration.paths.filter[tgt == node]	
	}

	def static out(NodeInstance node){
		node.containingConfiguration.paths.filter[src == node]	
	}
	
	def static isBooleanOperator(UnaryExpression exp){
		exp.op == '!'
	}
	
	def static isEqual(EqualityExpression exp){
		exp.op == '=='
	}
}
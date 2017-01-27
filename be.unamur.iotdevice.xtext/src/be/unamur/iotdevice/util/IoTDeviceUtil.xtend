package be.unamur.iotdevice.util

import IoTDevice.Actuating
import IoTDevice.Capability
import IoTDevice.CollectionLiteral
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
import IoTDevice.Property
import IoTDevice.Rule
import IoTDevice.Sensing
import IoTDevice.Target
import IoTDevice.TypeReference
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
	
	def static capabilities(Device device){
		device.features.filter(typeof(Capability))
	}
	
	def static properties(Device device){
		device.features.filter(typeof(Property))
	}
	
	def static sensing(Device device){
		device.features.filter(typeof(Sensing))
	}

	def static actuating(Device device){
		device.features.filter(typeof(Actuating))
	}
	
	def static devices(NetworkConfiguration config){
		config.nodes.filter(typeof(Device))
	}

	def static containingMetamodel(EObject e) {
		e.getContainerOfType(typeof(IoTModel))
	}
	
	def static containingEnumeration(EnumerationLiteral literal){
		literal.getContainerOfType(typeof(Enumeration))	
	}

	def static containingDevice(EObject e){
		e.getContainerOfType(typeof(Device))	
	}

	def static containingCapability(Parameter param){
		param.getContainerOfType(typeof(Capability))	
	}

	def static containingConfiguration(EObject object){
		object.getContainerOfType(typeof(NetworkConfiguration))
	}
	
	def static containingCollectionLiteral(Target target){
		target.getContainerOfType(typeof(CollectionLiteral))
	}

	def static containingLiteralExpression(CollectionLiteral literal){
		literal.getContainerOfType(typeof(Expression))
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
	
	def static isPrimitiveType(TypeReference typeref){
		typeref.ptype != null
	}
	
	def static isDeclaredType(TypeReference typeref){
		typeref.dtype != null
	}
}
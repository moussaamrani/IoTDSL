/*
 * generated by Xtext 2.12.0
 */
package be.unamur.iot.formatting2

import be.unamur.iot.iotdsl.Content
import be.unamur.iot.iotdsl.EnumLiteral
import be.unamur.iot.iotdsl.Enumeration
import be.unamur.iot.iotdsl.Import
import be.unamur.iot.iotdsl.IotModel
import be.unamur.iot.services.IoTDSLGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class IoTDSLFormatter extends AbstractFormatter2 {
	
	@Inject extension IoTDSLGrammarAccess

	def dispatch void format(IotModel iotModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Import _import : iotModel.getImports()) {
			_import.format;
		}
		for (Content content : iotModel.getContent()) {
			content.format;
		}
	}

	def dispatch void format(Enumeration enumeration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (EnumLiteral enumLiteral : enumeration.getLiterals()) {
			enumLiteral.format;
		}
	}
	
	// TODO: implement for Device, Property, Actuating, Sensing, Configuration, Rule, AndExpression, WithinExpression, AfterExpression, NotExpression, EventOccurrence, Reaction
}

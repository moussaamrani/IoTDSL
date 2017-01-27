package org.xtext.example.cep.tests

import com.google.inject.Inject

import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.cep.cep.CepPackage
import org.xtext.example.cep.cep.Model
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.xtext.example.cep.validation.CepValidator

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CepInjectorProvider))



class CepValidatorTest {
	
	@Inject extension ParseHelper<Model>
    @Inject extension ValidationTestHelper
    
    
    
     @Test
      def void testNoDuplicateEvent() {	
      '''
			Event Temp{}
			Event Temp1{}
		'''.parse.assertNoErrors	
      }
    
    
    
     @Test
      def void testDuplicateEvent() {	
      '''
			Event Temp{}
			Event Temp{}
		'''.parse.assertError(CepPackage::eINSTANCE.event,
			CepValidator::DUPLICATE_EVENEMENT,
			"Duplicate Evenement '" + "Temp" + "'")		
      }
    
        
   
   @Test
      def void testNoDuplicateAttribut() {	
      '''
			Event Temp{
				temp : integer
				temp1 : integer
			}
		'''.parse.assertNoErrors		
      }
   
   
   
   
   
    @Test
      def void testDuplicateAttribut() {	
      '''
			Event Temp{
				temp : integer
				temp : integer
			}
		'''.parse.assertError(CepPackage::eINSTANCE.attributEvent,
				CepValidator::DUPLICATE_ATTRIBUT_EVENT,
				"Duplicate attribut evenement '" + "temp" + "'")		
      }
      
      
      @Test
      def void testExistedAttributInstance() {	
      '''
			Event Temp{
				temp : integer
				
			}
			Temp@15{temp=15};
		'''.parse.assertNoErrors
      } 
     
     
     
     
     
      @Test
      def void testNotExistedAttributInstance() {	
      '''
			Event Temp{
				temp : integer
				
			}
			Temp@15{t=15};
		'''.parse.assertError(CepPackage::eINSTANCE.attributInstance,
				CepValidator::NOTEXISTED_ATTRIBUT_EVENT,
				"NonExisted attribute'" + "t"+ "'")		
      }
      
     
     
     
      @Test
      def void NotConformTypeDeclaredAttributEventInstance() {	
      '''
			Event Temp{
				temp : integer
				
			}
			Temp@15{temp="room"};
		'''.parse.assertError(CepPackage::eINSTANCE.attributInstance,
				CepValidator::CONFORM_ATTRIBUT_EVENT,
				" Type Declaration TYPE'" + "temp" + "'")		
      }
      
      
       @Test
      def void ConformTypeDeclaredAttributEventInstance() {	
      '''
			Event Temp{
				temp : integer
				
			}
			Temp@15{temp=5};
		'''.parse.assertNoErrors	
      }
      
     
     
      
      }
      

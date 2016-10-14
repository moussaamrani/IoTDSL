package step3;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;

public class Lampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   CoapClient client = new CoapClient("coap://localhost/Alarme");
	        
	       
	        CoapResponse response = client.put("Lampe alumée", 0);
	        
	       
	        
	        if (response!=null) {
	        
	        	System.out.println( response.getCode() );
	        	System.out.println( response.getOptions() );
	        	System.out.println( response.getResponseText() );
	        	
	        } else {
	        	
	        	System.out.println("Request failed");
	        	
	        }
	    }

	

}

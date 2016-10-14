package step3;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.coap.MediaTypeRegistry;

public class ALARME {

    public static void main(String[] args) {

        CoapClient client = new CoapClient("coap://localhost/Alarme");
        
       
        CoapResponse response = client.get();
        
       
        
        if (response!=null) {
        
        	System.out.println( response.getCode() );
        	System.out.println( response.getOptions() );
        	System.out.println( response.getResponseText() );
        	
        } else {
        	
        	System.out.println("Request failed");
        	
        }
    }

}

package step2;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.coap.CoAP.ResponseCode;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class Server {

    public static void main(String[] args) {

        // binds on UDP port 5683
        CoapServer server = new CoapServer();

        // "hello"
        server.add(new HelloResource());

        // TODO "subpath/Another"
        
        server.add(new AlarmeResource());


        // TODO "removeme!, "time", "writeme!"

        server.start();
    }

    public static class HelloResource extends CoapResource {
        public HelloResource() {

            // resource identifier
            super("Hello");

            // set display name
            getAttributes().setTitle("Hello-World Resource");
        }

        @Override
        public void handleGET(CoapExchange exchange) {
            exchange.respond("Hello world!");
        }
    }

    public static class AlarmeResource extends CoapResource {
        public AlarmeResource() {

            // resource identifier
            super("Alarme");

            // set display name
            getAttributes().setTitle("Another Hello-World Resource");
        }

        @Override
        public void handleGET(CoapExchange exchange) {
            exchange.respond("Declencher Alarme");
        }
        
        @Override
        public void handlePOST(CoapExchange exchange) {
        
        
        exchange.respond("changement d'eta d'alarme"); // reply with response code only (shortcut)
        }
        
        
        @Override
        public void handlePUT(CoapExchange exchange) {
        
        
        exchange.respond("changement d'eta d'alarme"); // reply with response code only (shortcut)
        }
       
    }

    public static class RemovableResource extends CoapResource {
        public RemovableResource() {
            super("removeme!");
        }
        // TODO
    }

    public static class TimeResource extends CoapResource {

        public TimeResource() {
            super("time");
        }
        // TODO
    }

    public static class WritableResource extends CoapResource {

        public String value = "to be replaced";

        public WritableResource() {
            super("writeme!");
        }

        @Override
        public void handleGET(CoapExchange exchange) {
            exchange.respond(value);
        }

        // TODO

    }

}
package de.dcsquare.paho.client.subscriber;

import org.eclipse.paho.client.mqttv3.*;

/**
 * @author Dominik Obermaier
 * @author Christian Götz
 */
public class SubscribeCallback implements MqttCallback {

    public void connectionLost(Throwable cause) {
        //This is called when the connection is lost. We could reconnect here.
    }

   
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        System.out.println("Message arrived. Topic: " + topic + "  Message: " + message.toString());

        if ("home/LWT".equals(topic)) {
            System.err.println("Sensor gone!");
        }
     
    }
    
    
   

   
    public void deliveryComplete(IMqttDeliveryToken token) {
        //no-op
    }
}

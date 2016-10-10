package de.dcsquare.paho.client.subscriber;

import de.dcsquare.paho.client.util.Utils;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * @author Dominik Obermaier
 * @author Christian Götz
 */
public class LampeSubscriber {

    public static final String BROKER_URL = "tcp://broker.mqttdashboard.com:1883";

    //We have to generate a unique Client id.
    String clientId = Utils.getMacAddress() + "-sub";
    private MqttClient mqttClient;

    public LampeSubscriber() {

        try {
            mqttClient = new MqttClient(BROKER_URL, clientId);


        } catch (MqttException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void start() {
        try {
        	
            mqttClient.setCallback(new SubscribeCallback());
            mqttClient.connect();

            //Subscribe to all subtopics of home
            final String topic = "home/door";
            mqttClient.subscribe(topic);

            System.out.println("Subscriber is now listening to "+topic);
           
            
            
            
           

        } catch (MqttException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

   
    
    public static void main(String... args) {
    	 System.out.println("Subscriber is now listening to ");
        final LampeSubscriber lampesubscriber = new LampeSubscriber();
        System.out.println("Subscriber is now listening to ");
        lampesubscriber.start();
        System.out.println("Subscriber is now listening to ");
        
    }

}

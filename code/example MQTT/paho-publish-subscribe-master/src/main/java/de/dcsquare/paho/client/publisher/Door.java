package de.dcsquare.paho.client.publisher;

import de.dcsquare.paho.client.util.Utils;

import java.util.Scanner;

import org.eclipse.paho.client.mqttv3.*;

/**
 * @author Dominik Obermaier
 * @author Christian Götz
 */
public class Door {

    public static final String BROKER_URL = "tcp://broker.mqttdashboard.com:1883";

    public static final String TOPIC_DOOR = "home/door";
   

    private MqttClient client;


    public Door() {

        //We have to generate a unique Client id.
        String clientId = Utils.getMacAddress() + "-pub";


        try {

            client = new MqttClient(BROKER_URL, clientId);

        } catch (MqttException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private void start() {

        try {
        	
            MqttConnectOptions options = new MqttConnectOptions();
            options.setCleanSession(false);
            options.setWill(client.getTopic("home/LWT"), "I'm gone :(".getBytes(), 0, false);
           
            client.connect(options);
           
            //Publish data forever
            while (true) {
            	
            	
            	Scanner sc = new Scanner(System.in);
            	System.out.println("Veuillez saisir l'etat de la porte :");
            	String str = sc.nextLine();
            	
            	
            	if(str.equals("ouvert"))
            		{
            		publishDoor(str);
            		System.out.println("Vous avez saisi : " + str);
            		}

            	

                Thread.sleep(500);

               
            }
        } catch (MqttException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

   
    

    private void publishDoor(String etat) throws MqttException {
       
    	final MqttTopic doorTopic = client.getTopic(TOPIC_DOOR);

       
        final String stateDoor = etat ;

        doorTopic.publish(new MqttMessage(stateDoor.getBytes()));

        System.out.println("Published data. Topic: " + doorTopic.getName() + "   Message: " + stateDoor);
    }

    public static void main(String... args) {
        final Door DoorPublisher = new Door();
        DoorPublisher.start();
    }
}

package com.webcode.kafkaconsumerdemo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerDemo {

    @KafkaListener(topics = "audits")
    public void recieveMessage(String message){
        System.out.println("Received Message: " + message);
    }
}


package com.genie.KafkaConsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic",groupId="test-group")
    public void consumeMsg(String msg){
        System.out.println("msg : "+msg);
    }
}

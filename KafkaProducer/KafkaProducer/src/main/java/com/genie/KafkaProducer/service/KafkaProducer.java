package com.genie.KafkaProducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    KafkaTemplate kafkaTemplate;

    public String topic_name="test-topic";

    public void sendMessage(String msg){
        kafkaTemplate.send(topic_name,msg);
    }
}

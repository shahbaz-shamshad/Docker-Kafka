package com.genie.KafkaProducer.controller;

import com.genie.KafkaProducer.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    KafkaProducer kafkaProducer;

    @GetMapping("/send")
    public void produceMsg(@RequestParam String msg){
        kafkaProducer.sendMessage(msg);
    }
}

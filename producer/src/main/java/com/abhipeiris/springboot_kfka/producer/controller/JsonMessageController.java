package com.abhipeiris.springboot_kfka.producer.controller;

import com.abhipeiris.springboot_kfka.producer.payload.MessagePayload;
import com.abhipeiris.springboot_kfka.producer.service.KafkaJsonProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 05/07/2023
 * Time: 14:46
 */
@RestController
@RequestMapping("/api/send-message/json")
public class JsonMessageController {

    @Autowired
    private KafkaJsonProducer kafkaJsonProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody MessagePayload messagePayload){
        kafkaJsonProducer.sendMessage(messagePayload);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }

}

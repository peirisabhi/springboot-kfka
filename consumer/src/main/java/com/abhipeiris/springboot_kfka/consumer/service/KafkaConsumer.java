package com.abhipeiris.springboot_kfka.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 05/07/2023
 * Time: 23:41
 */
@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

//    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    @KafkaListener(topics = "${spring.kafka.topic.name}")
    public void consume(String message){
        LOGGER.info(String.format("Message received -> %s", message));
    }
}

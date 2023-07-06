package com.abhipeiris.springboot_kfka.producer.service;


import com.abhipeiris.springboot_kfka.producer.payload.MessagePayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 05/07/2023
 * Time: 14:30
 */
@Service
public class KafkaJsonProducer {

    @Value("${spring.kafka.topic-json.name}")
    private String topicJsonName;

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonProducer.class);

    private KafkaTemplate<String, MessagePayload> kafkaTemplate;

    public KafkaJsonProducer(KafkaTemplate<String, MessagePayload> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(MessagePayload data){
        LOGGER.info(String.format("Message sent -> %s", data.toString()));

        Message<MessagePayload> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, topicJsonName)
                .build();

        kafkaTemplate.send(message);
    }
}

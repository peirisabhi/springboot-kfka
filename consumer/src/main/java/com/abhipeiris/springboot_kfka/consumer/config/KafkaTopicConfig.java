package com.abhipeiris.springboot_kfka.consumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 05/07/2023
 * Time: 13:12
 */
@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Value("${spring.kafka.topic-json.name}")
    private String topicJsonName;

    @Bean
    public NewTopic kafkaTopic(){
        return TopicBuilder.name(topicName)
                .build();
    }

    @Bean
    public NewTopic kafkaJsonTopic(){
        return TopicBuilder.name(topicJsonName)
                .build();
    }
}

package com.learn.kafka.producer;

import com.learn.kafka.model.Status;
import com.learn.kafka.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class JsonKafkaProducer {

    @Value("${spring.kafka.topic-json.name}")
    private String jsonTopicName;

    private final KafkaTemplate<String, Status> kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, Status> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

//    public void sendMessage(User user) {
//        log.info(String.format("Message sent :: %s", user));
//
//        Message<User> message = MessageBuilder
//                .withPayload(user)
//                .setHeader(KafkaHeaders.TOPIC, jsonTopicName)
//                .build();
//
//        this.kafkaTemplate.send(message);
//    }

    public void sendMessage(Status status) {
        log.info(String.format("Message sent :: %s", status));

        Message<Status> message = MessageBuilder
                .withPayload(status)
                .setHeader(KafkaHeaders.TOPIC, jsonTopicName)
                .build();

        this.kafkaTemplate.send(message);
    }

}

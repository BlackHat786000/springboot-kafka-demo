package com.learn.kafka.rest.controller;

import com.learn.kafka.model.Status;
import com.learn.kafka.model.User;
import com.learn.kafka.producer.JsonKafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/kafka")
@RestController
public class JsonMessageController {

    private final JsonKafkaProducer jsonKafkaProducer;

    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

//    @PostMapping("/publish")
//    public ResponseEntity<String> publish(@RequestBody User user) {
//        this.jsonKafkaProducer.sendMessage(user);
//        return ResponseEntity.ok("Message sent to kafka topic");
//    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody Status status) {
        this.jsonKafkaProducer.sendMessage(status);
        return ResponseEntity.ok("Message sent to kafka topic");
    }

}

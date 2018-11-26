package ru.knyazev.ivan.rcr.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaService(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    String kafkaTopic = "java_topic";

    public void send(String message) {
        kafkaTemplate.send(kafkaTopic, message);
    }
}

package com.zimsys.kafkaexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ReceiverService {

    private final Logger LOG = LoggerFactory.getLogger(ReceiverService.class);

    @KafkaListener(topics = "${spring.kafka.topic}")
    private synchronized void consumeKafkaQueue(@Payload String message, Acknowledgment acknowledgment) {
        LOG.info("Received message from kafka queue: {}", message);
        //TODO Do your code here...
        acknowledgment.acknowledge();
        //Note if the "acknowledgment" parameter is left out Kafka will be acknowledged as soon as the method finishes.
    }
}

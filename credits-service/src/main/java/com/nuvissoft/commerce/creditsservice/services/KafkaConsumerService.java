package com.nuvissoft.commerce.creditsservice.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics="credits", groupId="group_id")
    public String consumeMessage(String message) {

        return new StringBuilder("new message: ")
                .append(message)
                .toString();
    }
}

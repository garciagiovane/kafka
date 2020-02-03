package com.garciagiovane.kafka.impl.kafka.service;

import com.garciagiovane.kafka.impl.kafka.binders.KafkaStream;
import com.garciagiovane.kafka.impl.kafka.model.StreamModel;
import lombok.AllArgsConstructor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StreamService {

    private KafkaStream kafkaStream;

    public void writeStreamToTopic(StreamModel streamModel) {

        kafkaStream.outboundStream().send(MessageBuilder
                .withPayload(streamModel)
                .setHeader("content-type", "application/json")
                .build());
    }
}

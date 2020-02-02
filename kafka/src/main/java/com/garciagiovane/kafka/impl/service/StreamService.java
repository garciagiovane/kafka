package com.garciagiovane.kafka.impl.service;

import com.garciagiovane.kafka.impl.kafka.KafkaStream;
import com.garciagiovane.kafka.impl.model.StreamModel;
import lombok.AllArgsConstructor;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StreamService {

    private KafkaStream kafkaStream;

    public void writeStreamToTopic(StreamModel streamModel) {

        MessageChannel messageChannel = kafkaStream.outboundStream();
        messageChannel.send(MessageBuilder
                .withPayload(streamModel)
                .setHeader("content-type", "application/json")
                .build());
    }
}

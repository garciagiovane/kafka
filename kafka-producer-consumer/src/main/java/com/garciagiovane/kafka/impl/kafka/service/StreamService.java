package com.garciagiovane.kafka.impl.kafka.service;

import com.garciagiovane.kafka.impl.kafka.binders.KafkaStream;
import com.garciagiovane.kafka.impl.kafka.model.StreamModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class StreamService {

    private KafkaStream kafkaStream;

    /**
     * Escreve para o tópico email-topic
     * @param streamModel modelo que será escrito no tópico
     */
    public void writeStreamToTopic(StreamModel streamModel) {

        kafkaStream.output().send(
                MessageBuilder
                        .withPayload(streamModel)
                        .setHeader("content-type", "application/json")
                        .build());
    }

    /**
     * Lê o tópico success-topic
     * @param streamModel modelo recebido do tópico
     */
    @StreamListener(KafkaStream.INPUT_CHANNEL)
    public void sendEmail(StreamModel streamModel) {
        log.info(String.format("Email sent to client %s", streamModel.getName()));
    }
}

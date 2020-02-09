package com.garciagiovane.kafkaconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;

@SpringBootApplication
@EnableBinding(Processor.class)
@Slf4j
public class KafkaConsumerApplication {

    /**
     * Lê o tópico email-topic para receber um cliente, converter seu nome para uppercase e enviar para outro tópico
     * @param streamMessage body recebido do tópico
     * @return o mesmo body mas com o nome em uppercase
     */
    @StreamListener("input")
    @SendTo("output")
    public StreamMessage listen(@Payload StreamMessage streamMessage) {
        streamMessage.setName(streamMessage.getName().toUpperCase());
        return streamMessage;
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerApplication.class, args);
    }

}

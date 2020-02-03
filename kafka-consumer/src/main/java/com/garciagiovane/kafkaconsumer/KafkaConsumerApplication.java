package com.garciagiovane.kafkaconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.Payload;

@SpringBootApplication
@EnableBinding(Sink.class)
@Slf4j
public class KafkaConsumerApplication {

    @StreamListener("input")
    public void listen(@Payload StreamMessage streamMessage) {
        log.info(streamMessage.toString());
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerApplication.class, args);
    }

}

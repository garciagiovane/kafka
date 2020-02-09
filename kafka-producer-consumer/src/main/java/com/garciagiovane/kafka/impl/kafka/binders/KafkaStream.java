package com.garciagiovane.kafka.impl.kafka.binders;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface KafkaStream {

    String INPUT_CHANNEL = "input";
    String OUTPUT_CHANNEL = "output";

    @Output(OUTPUT_CHANNEL)
    MessageChannel output();

    @Input(INPUT_CHANNEL)
    SubscribableChannel input();
}

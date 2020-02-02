package com.garciagiovane.kafka.impl.kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface KafkaStream {

//    @Input("stream-in")
//    SubscribableChannel inboundStream();
    @Output("stream-out")
    MessageChannel outboundStream();
}

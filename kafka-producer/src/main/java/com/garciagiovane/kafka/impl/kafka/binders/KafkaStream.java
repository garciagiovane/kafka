package com.garciagiovane.kafka.impl.kafka.binders;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface KafkaStream {

    @Output("streamOut")
    MessageChannel outboundStream();
}

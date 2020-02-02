package com.garciagiovane.kafka.impl.config;

import com.garciagiovane.kafka.impl.kafka.KafkaStream;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(KafkaStream.class)
public class KafkaConfig {
}

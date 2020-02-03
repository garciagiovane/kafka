package com.garciagiovane.kafka;

import com.garciagiovane.kafka.impl.kafka.binders.KafkaStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(KafkaStream.class)
@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

}

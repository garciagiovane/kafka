package com.garciagiovane.kafka.impl.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StreamModel {

    private String name;
    private long timestamp;
}

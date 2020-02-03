package com.garciagiovane.kafkaconsumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StreamMessage {

    private String name;
    private long timestamp;
}

package com.garciagiovane.kafka.impl.kafka.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class StreamModel {

    @NotNull(message = "Name is required")
    private String name;
    @NotNull(message = "Email is required")
    private String email;
}

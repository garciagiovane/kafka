package com.garciagiovane.kafka.contract;

import com.garciagiovane.kafka.impl.kafka.model.StreamModel;
import com.garciagiovane.kafka.impl.kafka.service.StreamService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
@AllArgsConstructor
public class KafkaRestController {

    private StreamService streamService;

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void writeMessage(@RequestBody StreamModel streamModel) {
        streamService.writeStreamToTopic(streamModel);
    }
}

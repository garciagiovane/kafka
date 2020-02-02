package com.garciagiovane.kafka.contract;

import com.garciagiovane.kafka.impl.model.StreamModel;
import com.garciagiovane.kafka.impl.service.StreamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
@AllArgsConstructor
public class KafkaRestController {

    private StreamService streamService;

    @PostMapping
    public void writeMessage(@RequestBody StreamModel streamModel) {
        streamModel.setTimestamp(System.currentTimeMillis());
        streamService.writeStreamToTopic(streamModel);
    }
}

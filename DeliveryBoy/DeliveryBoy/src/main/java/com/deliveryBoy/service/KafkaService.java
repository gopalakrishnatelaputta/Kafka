package com.deliveryBoy.service;

import com.deliveryBoy.config.AplicationConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private  Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public void updateLocation(String location) {

        this.kafkaTemplate.send(AplicationConstants.LOCATION_TOPIC_NAME,location);
        this.logger.info("location Updated");
        System.out.println("Gopala Krisha");
    }

}

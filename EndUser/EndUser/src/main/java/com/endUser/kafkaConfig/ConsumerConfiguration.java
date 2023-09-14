package com.endUser.kafkaConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class ConsumerConfiguration
{
    @KafkaListener(topics= ApplicationConstants.LOCATION_UPDATE_TOPIC,groupId=ApplicationConstants.GROUP_ID)
    public void updatedLocation(String value)
    {
        System.out.println(value);
    }
}



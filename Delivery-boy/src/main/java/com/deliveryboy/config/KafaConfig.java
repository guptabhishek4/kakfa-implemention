package com.deliveryboy.config;

import com.deliveryboy.constants.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafaConfig {
    public NewTopic topic() {
        return TopicBuilder.name(AppConstants.LOCATION_TOPIC_NAME).build();
    }
}

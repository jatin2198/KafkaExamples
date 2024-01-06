package com.food_deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.food_deliveryboy.constants.AppConstants;

@Configuration
public class KafkaConfigs {
	
	@Bean
	public NewTopic newTopic() {
		return TopicBuilder.name(AppConstants.LOCATION_UPDATE).
				//partitions(0)
				//.replicas(0).
				build();
		
		
	}

}

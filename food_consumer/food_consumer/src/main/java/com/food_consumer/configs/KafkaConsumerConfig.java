package com.food_consumer.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.food_consumer.constants.AppConstants;


@Configuration
public class KafkaConsumerConfig {
	private Logger logger=LoggerFactory.getLogger(KafkaConsumerConfig.class);
	@KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC,groupId = AppConstants.Group_ID)
	public void updateLocation(String location) {
		logger.info("message consumed= "+location);
	}

}

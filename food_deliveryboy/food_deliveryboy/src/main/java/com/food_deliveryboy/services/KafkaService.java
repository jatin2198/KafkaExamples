package com.food_deliveryboy.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.food_deliveryboy.config.KafkaConfigs;
import com.food_deliveryboy.constants.AppConstants;

@Service
public class KafkaService {
	
	private Logger logger=LoggerFactory.getLogger(KafkaService.class);
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	@Autowired
	KafkaConfigs configs;
	
	public boolean updateLocation(String location) {
		this.kafkaTemplate.send(AppConstants.LOCATION_UPDATE, location);
		logger.info("message produced= "+location);
		return true;
		
		
	}

}

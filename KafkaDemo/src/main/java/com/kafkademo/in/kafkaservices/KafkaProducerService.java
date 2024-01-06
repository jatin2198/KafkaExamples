package com.kafkademo.in.kafkaservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

//import com.userService.co.controller.UserController;

@Service
public class KafkaProducerService {
	
	 Logger logger = LoggerFactory.getLogger(KafkaProducerService.class);

	private KafkaTemplate<String, String> kafkaTemplate;

	/*
	 * public KafkaTemplate<String, String> getKafkaTemplate() { return
	 * kafkaTemplate; }
	 * 
	 * public void setKafkaTemplate(KafkaTemplate<String, String> kafkaTemplate) {
	 * this.kafkaTemplate = kafkaTemplate; }
	 */

	public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}

	/*
	 * public KafkaProducerService() { super(); // TODO Auto-generated constructor
	 * stub }
	 */
	
	public void SendMsg(String msg) {
		logger.info("Message sent --->"+msg);
		kafkaTemplate.send("javaGuideTopics", msg);
	}

}

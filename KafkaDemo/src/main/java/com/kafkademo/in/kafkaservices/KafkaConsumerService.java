package com.kafkademo.in.kafkaservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafkademo.in.payload.User;

@Service
public class KafkaConsumerService {
	
	Logger log=LoggerFactory.getLogger(KafkaConsumerService.class);
	@KafkaListener(topics = "javaGuideTopics" , groupId = "MyTestGroup")
	public void consumeMsg(String msg) {
		log.info(String.format("Message Consumed-->%s", msg));
	}

	@KafkaListener(topics = "javaGuidesJsonTopic" , groupId = "MyTestGroup")
	public void consumeJsonMsg(User msg) {
		log.info(String.format("Json Message Consumed-->%s", msg));
	}
}

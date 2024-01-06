package org.kafa.consumer.database.wikimedia.services;

import org.kafa.consumer.database.wikimedia.documents.WikiMediaData;
import org.kafa.consumer.database.wikimedia.repositories.ConsumerRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//import com.kafkademo.in.kafkaservices.KafkaConsumerService;

//import com.kafkademo.in.payload.User;

@Service
public class WikiConsumer{
	
	Logger log=LoggerFactory.getLogger(WikiConsumer.class);
	
	@Autowired
private ConsumerRepo repo;
	
	//@Autowired
	///private WikiMediaData data;
	@KafkaListener(topics = "wikimedia_recentChange" , groupId = "MyWikimedia")
	public void consumeMsg(String msg) {
		WikiMediaData data=new WikiMediaData();
		data.setEvent_data(msg);
		repo.save(data);
		
		log.info(String.format("Message Consumed-->%s", msg));
		
	}
}

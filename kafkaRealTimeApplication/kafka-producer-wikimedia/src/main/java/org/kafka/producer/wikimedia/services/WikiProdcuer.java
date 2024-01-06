package org.kafka.producer.wikimedia.services;

import java.net.URI;
import java.util.concurrent.TimeUnit;

//import org.kafka.producer.wikimedia.handlers.WikiMediaChangeHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.EventSource;

//import com.kafkademo.in.kafkaservices.KafkaProducerService;

@Service
public class WikiProdcuer {
	
	Logger logger = LoggerFactory.getLogger(WikiProdcuer.class);

	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void SendMsg(String msg) {
		logger.info("Message sent --->"+msg);
		kafkaTemplate.send("javaGuideTopics", msg);
	}

	public WikiProdcuer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
//String topic_name="wikimedia_recentChange";


public void sendMessage() throws InterruptedException {
	String topic_name="wikimedia_recentChange";
	
	EventHandler eventHandler=new WikiMediaChangeHandler(kafkaTemplate,topic_name);
	
	String url="https://stream.wikimedia.org/v2/stream/recentchange";
	
	EventSource.Builder builder=new EventSource.Builder(eventHandler,URI.create(url));
	
	EventSource eventSource=builder.build();
	
	eventSource.start();
	TimeUnit.MINUTES.sleep(10);
	
}

}

package org.kafka.producer.wikimedia;

import org.kafka.producer.wikimedia.services.WikiProdcuer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.kafkaRealTimeApplication.kafkaRealTimeApplication.KafkaRealTimeApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class KafkaProducerWiki implements CommandLineRunner
{
	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerWiki.class, args);
	}

	@Autowired
	private WikiProdcuer prodcuer;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		prodcuer.sendMessage();
		
	}

}
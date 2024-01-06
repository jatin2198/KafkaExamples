package com.kafkademo.in.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafkademo.in.kafkaservices.JsonKafkaProducer;
import com.kafkademo.in.kafkaservices.KafkaProducerService;
import com.kafkademo.in.payload.User;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaController {
	
	private KafkaProducerService producerService;
	
	@Autowired
	private JsonKafkaProducer jsonKafkaProducer;

	public KafkaController(KafkaProducerService producerService) {
		super();
		this.producerService = producerService;
	}
	
	//http:localhost:8080/api/v1/kafka/publish?message=hello world
	@GetMapping("/publish")
	public ResponseEntity<String> getMessage(@RequestParam("message") String msg){
		producerService.SendMsg(msg);
		return ResponseEntity.ok("Message sent to topic");
		
	}
	
	@PostMapping("/publishJsonMsg")
	public ResponseEntity<User> getMessageJson(@RequestBody User user){
		jsonKafkaProducer.sendMessage(user);
		return ResponseEntity.ok(user);
	}

}

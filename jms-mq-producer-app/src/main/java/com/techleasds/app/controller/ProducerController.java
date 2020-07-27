package com.techleasds.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.techleasds.app.producer.MessageProducer;
@RestController
public class ProducerController {
	@Autowired
	private MessageProducer sender;

	@GetMapping("/send/{msg}")
	public String sendMessagetoMom(@PathVariable("msg")String msg) {
		sender.send(msg);
		return "SENT";
	}
}

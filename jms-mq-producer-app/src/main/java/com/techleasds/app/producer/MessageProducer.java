package com.techleasds.app.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {
	@Value("${my.app.producer.destination-name}")
	private String destination;
	@Autowired
	private JmsTemplate template;
	boolean flag;

	public boolean send(String message) {
		boolean status;
		try {
			//Lambda Style code
			//***Create MOM Message
			MessageCreator messageCreator =  (session) -> {
				return  session.createTextMessage(message);
			};
			//****send message to MOM with a destination
			template.send(destination,messageCreator);
			status = true;
		} catch (JmsException e) {
			status = false;
			e.printStackTrace();
		}
		return status;
	}

}

package com.techleasds.app.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
/** when message comes to MOM,
* MOM calls this code-using 
* Spring container objects.
*/
@Component
public class MessageConsumer {
	@JmsListener(destination = "${my.app.producer.destination-name}")
	public void readMessage(String message) {
		try {
			System.out.println("MESSAGE RECEIVED AT CONSUMER::");
			System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

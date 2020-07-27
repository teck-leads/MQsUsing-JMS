package com.techleasds.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
@EnableJms //only for consumer
@SpringBootApplication
public class JmsMqConsumerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsMqConsumerAppApplication.class, args);
	}

}

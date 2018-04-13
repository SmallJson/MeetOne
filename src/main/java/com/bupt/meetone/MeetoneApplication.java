package com.bupt.meetone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MeetoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetoneApplication.class, args);
	}
}

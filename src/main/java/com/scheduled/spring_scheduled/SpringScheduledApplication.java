package com.scheduled.spring_scheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringScheduledApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringScheduledApplication.class, args);
	}

}

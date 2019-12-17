package com.mindtree.tickettracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mindtree")
public class TicketTrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketTrackingApplication.class, args);
	}

}

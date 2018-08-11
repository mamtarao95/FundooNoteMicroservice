package com.bridgelabz.microservice.fundoonote.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FundooNoteEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundooNoteEurekaServerApplication.class, args);
	}
}

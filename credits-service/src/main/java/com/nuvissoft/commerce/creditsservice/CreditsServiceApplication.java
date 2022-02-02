package com.nuvissoft.commerce.creditsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CreditsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditsServiceApplication.class, args);
	}

}

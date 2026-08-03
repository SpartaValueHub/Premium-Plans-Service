package com.sparta.premium_plans_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PremiumPlansServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PremiumPlansServiceApplication.class, args);
	}

}

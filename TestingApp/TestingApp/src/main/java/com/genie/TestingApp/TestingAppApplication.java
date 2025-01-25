package com.genie.TestingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TestingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingAppApplication.class, args);
	}

	@Bean
	public RestTemplate getInstance(){
		return new RestTemplate();
	}

}

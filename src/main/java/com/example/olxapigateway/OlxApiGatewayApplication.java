package com.example.olxapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OlxApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxApiGatewayApplication.class, args);
	}

}

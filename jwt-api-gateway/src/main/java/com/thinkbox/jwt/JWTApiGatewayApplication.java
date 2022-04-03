package com.thinkbox.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class JWTApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(JWTApiGatewayApplication.class, args);
	}

}

package com.thinkbox.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JWTRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JWTRegistryApplication.class, args);
	}

}

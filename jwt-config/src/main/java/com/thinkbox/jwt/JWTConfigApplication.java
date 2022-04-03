package com.thinkbox.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class JWTConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(JWTConfigApplication.class, args);
	}

}

package com.thinkbox.jwt.controller;

import java.util.Map;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@RequestMapping("")
public class JWTEndpoint1Controller {
	

	@PostMapping(path = "echo", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> parse(@RequestBody Map<String, Object> map) {
        System.out.println("Map: " + map.toString());
        map.put("endpoint", "endpoint-1");
        return ResponseEntity.ok(map);    
    }
	
}

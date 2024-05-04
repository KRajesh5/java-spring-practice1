package com.example.zipkin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	Logger logger =LoggerFactory.getLogger(HelloController.class);

	@GetMapping("/welcome")
	public String getMethodName(@RequestParam("name") String param) {
		logger.info("getMethodName");
		return "Welcome to " + param;
	}
	
}

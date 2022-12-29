package com.cs871.microservices.issues;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	String index() {
		return "Hello JSR !";
	}
	
}

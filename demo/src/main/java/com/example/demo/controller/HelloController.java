package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
    public String home() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/index")
	public String index() {
		return "Hello World! You are at index !!";
	}
}

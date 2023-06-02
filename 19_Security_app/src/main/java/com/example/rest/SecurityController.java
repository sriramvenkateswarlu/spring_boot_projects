package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
     
	@GetMapping("/hello")
	public String hello() {
		return "hello , venkateswarlu";
	}
	
	@GetMapping("/hi")
	public String hi() {
		return "hi , venkateswarlu";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "hello ,+ 99 51 49 46 09 ";
	}
}

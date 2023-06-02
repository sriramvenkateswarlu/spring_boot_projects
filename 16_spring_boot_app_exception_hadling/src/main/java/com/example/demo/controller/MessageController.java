package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {


	
	@GetMapping("/")
	   public String messageWithView() {
		String msg="welcome my restApi";
		
		int i=10/0;
		return msg;
	   }
	
	   
	
}

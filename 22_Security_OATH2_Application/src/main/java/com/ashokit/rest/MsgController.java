package com.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
  
	@GetMapping("/")
	public String msg() {
		
		return "hi , how are u";
	}
}

package com.example.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
        
	@GetMapping("/msg/{userid}")
	  public String getuserName(@PathVariable Integer Userid) throws Exception {
		  
		  if(Userid==100) {
			  return "john";
		  }
		  else if(Userid==200){
			  return "venky";
		  }else {
			  throw new Exception("user not found");
		  }
	  }
	  
}

package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.BindingClass.User;

@RestController
public class UserController {
    
	@GetMapping(value="/user",produces = {"application/xml","application/json"})
	public User getUser() {
		User user=new User();
		user.setId(1);
		user.setName("venky");
		user.setPrice(100.00);
		return user;
	}
	
	
	@PostMapping(value="/user",consumes = {"application/xml","application/json"})
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		
	System.out.println(user);
	String msg="record saved";
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
}

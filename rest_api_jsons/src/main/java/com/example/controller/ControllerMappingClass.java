package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Customer.Customer;

@Controller
public class ControllerMappingClass {
	@GetMapping("/")
	public String message() {
    Customer obj=new Customer();
    obj.setId(101);
    obj.setName("venky");
    obj.setLocation("hyd");
    obj.setPhno("9951494609");
    return "";
}
}
package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.fienClint.FienclientClass;

@RestController
public class WelcomeController {
	@Autowired
	private FienclientClass client;
	

	
	@GetMapping("/welcome")
	public String welcome() {
		
		
		String invokGreetApi = client.invokGreetApi();
		
		/*RestTemplate template=new RestTemplate();
		String forObject = template.getForObject("http://localhost:8080/greet",String.class);
		*/
		
		return invokGreetApi+",welcome to ashokit";
	}

}

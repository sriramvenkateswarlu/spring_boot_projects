package com.example.demo.fienClint;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="GREET-API")
public interface FienclientClass {
	@GetMapping("/greet")
	public String invokGreetApi();
}

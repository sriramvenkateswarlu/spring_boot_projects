package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.InterestRate;
import com.example.demo.service.LoanService;

@RestController
public class LoanRestController {
	
	@Autowired
	private LoanService service;
      
	@GetMapping(value ="/loans" 
			)
	public ResponseEntity<InterestRate> getLoansData(@RequestParam("type") String type){
		
		 InterestRate detailsByType = service.getDetailsByType(type);
		return new ResponseEntity<>(detailsByType,HttpStatus.ACCEPTED);
	}
	
	
	@PostMapping(value ="/saveloan", 
			consumes = { "application/json" },
			produces =  { "application/json" })
	public ResponseEntity<String> ge(@RequestBody InterestRate interestRate){
		
		 String saveLoan = service.saveLoan(interestRate);
		return new ResponseEntity<>(saveLoan,HttpStatus.OK);
	}
}

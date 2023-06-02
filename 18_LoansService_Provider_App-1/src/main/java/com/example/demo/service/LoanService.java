package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.InterestRate;
@Service
public interface LoanService {
	
	public InterestRate getDetailsByType(String type);
	
	//public InterestRate getDetailsById(Integer id);
	
	public String saveLoan(InterestRate interestRate);


}

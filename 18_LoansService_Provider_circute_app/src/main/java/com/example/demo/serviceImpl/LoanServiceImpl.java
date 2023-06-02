package com.example.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.InterestRate;
import com.example.demo.repo.LoanRepository;
import com.example.demo.service.LoanService;
@Service
public class LoanServiceImpl implements LoanService{

	@Autowired
	private LoanRepository repo;

	@Override
	public InterestRate getDetailsByType(String type) {
		return  repo.findByType(type);
		
		
		
	}

	@Override
	public String saveLoan(InterestRate interestRate) {
		 repo.save(interestRate);
		return "success";
	}

	



}

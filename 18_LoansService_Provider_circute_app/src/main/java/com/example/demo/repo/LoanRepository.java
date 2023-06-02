package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.entity.InterestRate;

public interface LoanRepository extends JpaRepository<InterestRate, Integer>{

 InterestRate findByType(String type);

}

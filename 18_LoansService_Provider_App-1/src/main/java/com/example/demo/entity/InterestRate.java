package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class InterestRate {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id	
	   private Integer id;
	   private String type;
	  private  Double rateValue;
	
}

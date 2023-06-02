package com.example.demo.Request;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="contact_tbls")
public class ContactDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
      private Integer id;
      private String name;
      private Long contactNum;
      
}
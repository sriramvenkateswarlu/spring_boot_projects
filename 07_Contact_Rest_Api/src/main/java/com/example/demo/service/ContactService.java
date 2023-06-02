package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Request.ContactDetails;

@Service
public interface ContactService {
     
	public String upsert(ContactDetails contact);
	
	public ContactDetails getById(Integer id);
	
	public List<ContactDetails> getAllCourse();
	
	public String deleteById(Integer id);
	
	
	
}

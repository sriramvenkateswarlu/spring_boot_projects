package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Request.ContactDetails;
import com.example.demo.repository.ContactRepository;
import com.example.demo.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{
       
	@Autowired
	private ContactRepository repo;

	
	@Override
	public String upsert(ContactDetails contact) {
		 	ContactDetails save = repo.save(contact);
		 	
		return "record inserted";
	}

	@Override
	public ContactDetails getById(Integer id) {
		 Optional<ContactDetails> findById = repo.findById(id);
		 if(findById.isPresent()) {
			 return findById.get();
		 }
		 return null;
	}

	@Override
	public List<ContactDetails> getAllCourse() {
		  
		return	repo.findAll();
		 
	}

	@Override
	public String deleteById(Integer id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "delete success";
		}else {
			return "no record found";
		}
			
		
	}
	
	

}

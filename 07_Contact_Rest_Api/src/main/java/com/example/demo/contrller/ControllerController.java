package com.example.demo.contrller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Request.ContactDetails;
import com.example.demo.service.ContactService;


@RestController
public class ControllerController {
      
	@Autowired
	private ContactService service;
	
	 @PostMapping("/cantact")
	 public ResponseEntity<String> saveProduct(@RequestBody ContactDetails details){
		String upsert = service.upsert(details);
		
		return new ResponseEntity<String>(upsert,HttpStatus.CREATED);
	 }
	 
	 @GetMapping("/getContact/{id}")
	 public ResponseEntity<ContactDetails> getcontact(@PathVariable Integer id){
		
		 ContactDetails contactdetails = service.getById(id);
		
		return new ResponseEntity<>(contactdetails,HttpStatus.OK);
	 }
	 
	 @GetMapping("/getAll")
	 public ResponseEntity<List<ContactDetails>> getAllContact(){
		
		List<ContactDetails> allCourse = service.getAllCourse();
		
		return new ResponseEntity<>(allCourse,HttpStatus.OK);
	 }
	 
	 @PutMapping("/update")
	 public ResponseEntity<String> updateContact(@RequestBody ContactDetails details){
		 String upsert = service.upsert(details);
		
		return new ResponseEntity<>(upsert,HttpStatus.OK);
	 }
	 
	 
	 
	 
	 @GetMapping("/deleteContact/{id}")
	 public ResponseEntity<String> deletecontact(@PathVariable Integer id){
		
	String deleteById = service.deleteById(id);
		
		return new ResponseEntity<>(deleteById,HttpStatus.OK);
	 }
	 
}


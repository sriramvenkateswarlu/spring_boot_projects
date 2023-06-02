package com.example.demo.contoller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.Product;

@RestController
public class Productcontroller {

	 private  Map<Integer,Product> map=new HashMap<>();
	  
	 @PostMapping("/product")
	 public ResponseEntity<String> saveProduct(@RequestBody Product product){
		 
		System.out.println(product);
		map.put(product.getId(), product);
		
		return new ResponseEntity<String>("productsaved",HttpStatus.CREATED);
	 }
}

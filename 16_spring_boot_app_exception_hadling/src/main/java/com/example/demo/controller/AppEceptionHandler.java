package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.binding.ErrorInfo;

@RestControllerAdvice
public class AppEceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	  public ResponseEntity< ErrorInfo> handlExceptin(Exception e){
		  
		  String message = e.getMessage();
		  
		  ErrorInfo info = new ErrorInfo();
		  
		  info.setCode("SBI3076");
		  
		  info.setMsg(message);
		  
		  info.setWhen(LocalDate.now());
		  return new  ResponseEntity<  ErrorInfo>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	  }

}

package com.example.demo.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ErrorInfo {
    
	private String code;
	
	private String msg;
	
	private LocalDate when;
	
}

package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.StudentEntity;
import com.example.repo.StudentRepo;

@Controller
public class StudentController {

	@Autowired
	private StudentRepo repo;
	
	  @GetMapping("/")
	public String message(Model modle) {
		
		modle.addAttribute("student", new StudentEntity() );
		return "index";
	}
	
	  @GetMapping("/Student")
		public String directMessag(@ModelAttribute("student")StudentEntity s,Model model) {
			
				 repo.save(s);
				model.addAttribute("msg","record saved");
			
			
			return "data";
		}
	 
}

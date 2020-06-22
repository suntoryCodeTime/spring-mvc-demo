package com.suntorycodetime.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		//Create a student object
		Student student = new Student();
		
		//Add student object to the model
		model.addAttribute("student", student);
		
		//Add the country options to the model
		model.addAttribute("countryOptions", countryOptions);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		//log the input data
		System.out.println("Student: " + student.getFirstName() 
			+ " " + student.getLastName());
		
		return "student-confirmation";
	}
}

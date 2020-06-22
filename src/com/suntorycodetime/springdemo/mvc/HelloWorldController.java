package com.suntorycodetime.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	/**Controller method to show the initial HTML form**/
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	/**Controller method to process the HTML form**/
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// Controller method to read form data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		//Read the request parameter from the HTML form
		String name = request.getParameter("studentName");
		
		//Uppercase the data
		name = name.toUpperCase();
		
		//Create the message
		String result = "Yo! " + name;
		
		//Add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	// Controller method to read form data and add data to the model
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String name , Model model) {
		
		//Uppercase the data
		name = name.toUpperCase();
		
		//Create the message
		String result = "Hey My Friend from V3! " + name;
		
		//Add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}

}

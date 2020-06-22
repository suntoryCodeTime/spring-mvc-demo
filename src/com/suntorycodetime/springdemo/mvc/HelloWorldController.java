package com.suntorycodetime.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	/**Controller method to show the inital HTML form**/
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	/**Controller method to process the HTML form**/
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

}

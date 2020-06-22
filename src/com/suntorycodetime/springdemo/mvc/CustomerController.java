package com.suntorycodetime.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		
		//Debugging Messages
		System.out.println("Last name: |" + customer.getLastName() + "|" );
		System.out.println("Binding result: " + bindingResult);		
		System.out.println("\n\n\n\n");
		
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}
		
		return "customer-confirmation";
	}
	
	/**
	 * To trim Input string, remove leading and trailing whitespace.
	 * Resolves validation issues.
	 * */
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	
}

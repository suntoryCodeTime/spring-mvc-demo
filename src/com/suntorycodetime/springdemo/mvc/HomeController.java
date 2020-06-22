package com.suntorycodetime.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Extends off @Component so will get pickedup off component scan
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}

}

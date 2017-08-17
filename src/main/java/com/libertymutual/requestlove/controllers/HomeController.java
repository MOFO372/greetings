package com.libertymutual.requestlove.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/")	//the part in the URL
	public String showHomePage() {
		//System.out.println("showing the homepage");
		return "home/homepage"; //path to a file under the templates folder
		
	}
	
	@GetMapping("/where-is-home")
	public String redirectToHomePage() {
		return "redirect:/"; //returning a redirect to the path "/" (another URL)
	}

}

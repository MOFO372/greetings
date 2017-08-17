package com.libertymutual.requestlove.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/greeting")
public class GreetingController {
		
	@GetMapping("/new") //can leave / off if desired
	public String greetTheVisitor() {
		return "greeting/new";
	}

	@GetMapping("")
		public String toNewPath() {
			return "redirect:/greeting/new";
		}
	
	@GetMapping("/new/{personsName}")
	public String sayHelloToAPerson(@PathVariable String personsName, Model model) { //relying on Spring to provide a Model so we can return a String 
		model.addAttribute("personsName", personsName);
		
		return "greeting/new-name";
	}
	
	/* THIS DOES THE SAME AS ABOVE
	 @GetMapping("/new/{personsName}")
	    public ModelAndView sayHelloToAPerson(@PathVariable String personsName) { //creating our own model instead of relying on Spring
	        ModelAndView modelAndView = new ModelAndView("greeting/new-name"); //denotes the file path (within templates)
	        modelAndView.addObject("personsName", personsName); //denotes the view and the parameter
	        return modelAndView;
	  } */

		
}

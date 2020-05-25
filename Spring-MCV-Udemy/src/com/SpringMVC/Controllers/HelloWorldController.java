package com.SpringMVC.Controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // Parent mapping // high level mapping // this remove mapping abiguity (if the controller method of two or more controller has the same mapping)
public class HelloWorldController {
	
	//need a controller method to show the initial html form
	@RequestMapping("/showform")  // sub mapping ,, these all are relative to / hellow
	public String showForm()
	{
		return "helloword-form";
	}
	
	//need a controller method to process the html form
	@RequestMapping("/processform")
	public String processForm(HttpServletRequest request, Model model)
	{
		String name = request.getParameter("sname");
		model.addAttribute("sname", name);
		return "hello-world";
	}
	
	
	//new method to get data and process it and return it with page name
	@RequestMapping("/processform2")
	public String letsShout(HttpServletRequest request, Model model)
	{
		//Read the request parameter from html form
		String name = request.getParameter("sname2");
		
		//process the data
		name = name.toUpperCase();
		String result = "Yo!!!  " + name; 
		
		//add the data to Model object
		model.addAttribute("message", result);
		
		
		return "hello-world2";
	}

	//Using @RequestParam Annotation binding for controller methods
	@RequestMapping("/processform3")
	public String letsShout3(@RequestParam("sname3") String name, Model model)
	{
		
		//process the data
		name = name.toUpperCase();
		String result = "using @RequestParam()!!!  : " + name; 
		
		//add the data to Model object
		model.addAttribute("message", result);
		
		
		return "hello-world3";
	}
	
}

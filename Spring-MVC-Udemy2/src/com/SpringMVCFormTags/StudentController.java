package com.SpringMVCFormTags;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{cityOptions}")  //reading values from a properties file
	private Map<String, String> cityOptions;
	
	@RequestMapping("/showform")
	public String showForm(Model theModel)
	{
		//Create a new Student object
		Student theStudent = new Student();
		
		//add the Student object to model attribute
		theModel.addAttribute("student", theStudent);
		theModel.addAttribute("cityOptions", cityOptions);
		
		return "student-form";
	}
	
	
	//Method to handle /processForm
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent)
	{
		System.out.println("theStudent: "+ theStudent.getFirstName() +" "+theStudent.getLastName());
		
		return "student-confirmation";
	}
	
	

}

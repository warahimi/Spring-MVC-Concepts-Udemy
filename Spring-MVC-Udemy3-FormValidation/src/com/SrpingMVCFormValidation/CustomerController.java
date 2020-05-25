package com.SrpingMVCFormValidation;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/customer/")
@Controller
public class CustomerController {
	
	@RequestMapping("/showform")
	public String showForm(Model theModel)
	{
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) //Tell Spring to validate the Customer object
	{																				//Spring will store the resutlt of the validation in the BindingResult object, we can query this BindingResult object	
		//these binding will happend behind the Scene by Spring 
		
		
		//check the BindingResult object to check if it has error
		if(theBindingResult.hasErrors())
		{
			return "customer-form"; // if it has error send it back to the form
		}
		else 
		{
			return "customer-confirmation"; // if it is success
		}
		
	}
}

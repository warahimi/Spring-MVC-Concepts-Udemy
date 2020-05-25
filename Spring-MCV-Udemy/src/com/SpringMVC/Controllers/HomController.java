package com.SpringMVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomController {
	
	@RequestMapping("/")
	public String showPage() // this method can hanle any type of http request , get / post request
	{
		return "main-menu";
	}

}

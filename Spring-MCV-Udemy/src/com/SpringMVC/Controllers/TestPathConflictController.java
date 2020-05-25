package com.SpringMVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestPathConflictController {
	@RequestMapping("/showform")
	public String show() {
		return "xxx";
	}

}

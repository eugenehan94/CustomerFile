package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Spring MVC controller class for the index page

@Controller
public class Index {
	@RequestMapping("/signUpLink")
	public String signUpPage() {
		return "signUp";
	}
	
	@RequestMapping("/adminLoginSelection")
	public String adminLogin() {
		return "adminLoginPage";
	}
}

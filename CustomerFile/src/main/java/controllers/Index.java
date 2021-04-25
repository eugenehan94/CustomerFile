package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Spring MVC controller class for the index page

@Controller
public class Index {
	@RequestMapping("/signUpLink")
	public ModelAndView signUpPage() {
		
		ModelAndView mav = new ModelAndView();
		
		List<String> monthList = new ArrayList<String>();
		monthList.add("January");
		monthList.add("February");
		monthList.add("March");
		monthList.add("April");
		monthList.add("May");
		monthList.add("June");
		monthList.add("July");
		monthList.add("August");
		monthList.add("September");
		monthList.add("October");
		monthList.add("November");
		monthList.add("December");
		
		List<Integer> dayList = new ArrayList<Integer>();
		for(int i =1; i<=31; i++) {
			dayList.add(i);
		}
		
		List<Integer> yearList = new ArrayList<Integer>();
		for (int i = 1900; i<= 2021; i++) {
			yearList.add(i);
		}
		
		
		mav.addObject("monthList", monthList);
		mav.addObject("dayList",dayList);
		mav.addObject("yearList", yearList);
		mav.setViewName("signUp");
		return mav;
	
	
	}
	
	@RequestMapping("/adminLoginSelection")
	public String adminLogin() {
		return "adminLoginPage";
	}
}

package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import CustomerInfo.Customer;
import DAOfolder.DAO;

@Controller
public class AdminController {

	@RequestMapping("/clientSearch")
	public String searchClient() {
		return"adminMain";
	}
	
	@RequestMapping("/searchByName")
	public ModelAndView getByName(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DAO dao = new DAO();
		ModelAndView mav = new ModelAndView();
		String firstName = request.getParameter("firstName");
		String lastName= request.getParameter("lastName");
		
		//Returns back to search page if no first name, last name is provided
		if (firstName.equals("") && lastName.equals("")) {
			mav.setViewName("adminMain");
			return mav;
		}
		
		Customer cust = dao.getCustomer(firstName, lastName);
		mav.addObject("cust", cust);
		mav.setViewName("adminResults");
		return mav;
	}

	@RequestMapping("/adminSearch")
	public String adminSearch() {
		return"adminMain";
	}
	
	@RequestMapping("/searchByPhoneNumber")
	public ModelAndView getByPhoneNumber(HttpServletRequest request) {
		DAO dao = new DAO();
		ModelAndView mav = new ModelAndView();
		String phoneAreaCode = request.getParameter("phoneAreaCode");
		String phoneNumberRest = request.getParameter("phoneNumber");
		
		if (phoneAreaCode.equals("") || phoneNumberRest.equals("")) {
			
			mav.setViewName("adminMain");
			return mav;
		}
		
		Customer cust = dao.getCustomerByPhoneNumber(phoneAreaCode, phoneNumberRest);
		
		System.out.println("Return from exception block, cust is: " + cust);
		
		if(cust == null) {
			mav.addObject("custNotFound", "*The client not found");
			mav.setViewName("adminMain");
			return mav;
		}
		
		mav.addObject("cust", cust);
		mav.setViewName("adminResults");
		return mav;
	}
	
}

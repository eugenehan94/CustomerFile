package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import CustomerInfo.Customer;
import DAOfolder.DAO;

//Fill in the return statements to appropriate pages to edit customer information

@Controller
public class AdminEdits {

	//Leads users to the page to edit their personal information
	@RequestMapping("/editPersonalInfo")
	public ModelAndView editPersonal(HttpServletRequest request) {
		DAO dao = new DAO();
		ModelAndView mav = new ModelAndView();
		String firstName = request.getParameter("targetClient");
		Customer cust = dao.getCustomer(firstName);
		
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
		
		mav.addObject("cust", cust);
		mav.setViewName("editPersonalInfoPage");
		return mav;
	}
	
	//The new provided date of birth is updated to database
	@RequestMapping("/saveNewPersonalInfo")
	public ModelAndView savePersonal(HttpServletRequest request) {
		DAO dao = new DAO();
		ModelAndView mav = new ModelAndView();
		String firstName = request.getParameter("targetedClient");
		String newDayOfBirth = request.getParameter("newDayOfBirth");
		String newMonthOfBirth = request.getParameter("newMonthOfBirth");
		String newYearOfBirth = request.getParameter("newYearOfBirth");
		Customer cust = dao.editPersonInfo(newDayOfBirth, newMonthOfBirth, newYearOfBirth, firstName);
		mav.addObject("cust", cust);
		mav.setViewName("adminResults");
		return mav;
		
	}

	@RequestMapping(value = "/editHomeInfo")
	public ModelAndView editHome(HttpServletRequest request) {
		DAO dao = new DAO();
		ModelAndView mav = new ModelAndView();
		String firstName = request.getParameter("targetClient");
		
		Customer cust = dao.getCustomer(firstName);
		mav.addObject("cust", cust);
		mav.setViewName("editHomeInfoPage");
		return mav;
	}

	@RequestMapping(value = "/saveNewHomeInfo")
	public ModelAndView saveHome(HttpServletRequest request) {
		
		DAO dao = new DAO();
		ModelAndView mav = new ModelAndView();
		String firstName = request.getParameter("targetedClient");
		String address = request.getParameter("newHomeAddress");
		Customer cust = dao.editHomeAddress(address, firstName);
		mav.addObject("cust", cust);
		mav.setViewName("adminResults");
		return mav;
		
	}

	@RequestMapping("/editContactInfo")
	public ModelAndView editContact(HttpServletRequest request) {
		DAO dao = new DAO();
		ModelAndView mav = new ModelAndView();
		String firstName = request.getParameter("targetClient");
		Customer cust = dao.getCustomer(firstName);
		mav.addObject("cust", cust);
		mav.setViewName("editContactInfoPage");
		return mav;

	}
	
	@RequestMapping("/saveNewContactInfo")
	public ModelAndView saveContactInfo(HttpServletRequest request) {
		DAO dao = new DAO();
		ModelAndView mav = new ModelAndView();
		String firstName = request.getParameter("targetedClient");
		String phoneAreaCode = request.getParameter("newPhoneAreaCode");
		String phoneNumber = request.getParameter("newPhoneNumber");
		String email = request.getParameter("newEmail");
		Customer cust = dao.editContactInfo(phoneAreaCode, phoneNumber, email, firstName);
		mav.addObject("cust", cust);
		mav.setViewName("adminResults");
		return mav;	
	}

	@RequestMapping("/editTaxResidency")
	public ModelAndView editTaxRes(HttpServletRequest request) {
		DAO dao = new DAO();
		ModelAndView mav = new ModelAndView();
		String firstName = request.getParameter("targetClient");
		Customer cust = dao.getCustomer(firstName);
		mav.addObject("cust", cust);
		mav.setViewName("editTaxResidencyPage");
		return mav;
	}
	
	@RequestMapping("/saveNewTaxRes")
	public ModelAndView saveNewTaxRes(HttpServletRequest request) {
		DAO dao = new DAO();
		ModelAndView mav = new ModelAndView();

		String firstName = request.getParameter("targetedClient");
		String newCanadianTaxRes = request.getParameter("newCanadianTaxRes");
		String newUSTaxRes = request.getParameter("newUSTaxRes");
		String newOtherTaxRes = request.getParameter("newOtherTaxRes");
		Customer cust = dao.editTaxResidency(newCanadianTaxRes, newUSTaxRes, newOtherTaxRes, firstName);
		mav.addObject("cust", cust);
		mav.setViewName("adminResults");
		return mav;	
	}
	
	
	@RequestMapping("/cancelEdit")
	public ModelAndView cancelEdits(HttpServletRequest request) {
		
		DAO dao = new DAO();
		ModelAndView mav = new ModelAndView();
		String firstName = request.getParameter("targetedClient");
		Customer cust = dao.getCustomer(firstName);
		mav.setViewName("adminResults");
		mav.addObject("cust", cust);
		return mav;
	}
	

}

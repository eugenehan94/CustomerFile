package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import DAOfolder.DAO;
import services.AreaCodeCheck;

@Controller
public class SignUp {
	
	@RequestMapping("/SignUp")
	public String signUp(HttpServletRequest request, HttpServletResponse response, Model model, RedirectAttributes ra)
			throws ServletException, IOException {
		DAO dao = new DAO();
		
		AreaCodeCheck acc = new AreaCodeCheck();
		
		//Return all input values to view 
		//Display message for incorrect fields ONLY - correct fields fine
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String dayOfBirth = request.getParameter("day");
		String yearOfBirth = request.getParameter("year");
		String monthOfBirth = request.getParameter("month");
		String homeAddress = request.getParameter("address");
		
		String phoneAreaCode = request.getParameter("phoneAreaCode");
		
		Boolean checkingAreaCode = acc.checkAreaCode(phoneAreaCode);
		
	
		
		String phoneNumber = request.getParameter("phoneNumber");
		String email = request.getParameter("email");
		String canadianTaxRes = request.getParameter("canadianTaxResident");
		String usTaxRes = request.getParameter("USTaxResident");
		String otherTaxRes = request.getParameter("OtherTaxResident");

		
		if (checkingAreaCode) {
			model.addAttribute("AreaCodeResult", checkingAreaCode);
			
		}else {
			ra.addFlashAttribute("AreaCodeResult", "*Please enter valid phone number");
			ra.addFlashAttribute("phoneAreaCode", phoneAreaCode);
			return "redirect:/signUpLink";
		}
		
		
		/*
		dao.addCustomer(firstName, lastName, dayOfBirth, yearOfBirth, monthOfBirth, homeAddress, phoneAreaCode,
				phoneNumber, email, canadianTaxRes, usTaxRes, otherTaxRes);

		*/
		
		return "redirect:/signUpLink";
	}

	@RequestMapping("/cancelSignUp")
	public String cancelSignUp() {
		return "index";
	}
}

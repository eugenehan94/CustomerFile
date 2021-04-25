package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import DAOfolder.DAO;

@Controller
public class SignUp {
	
	@RequestMapping("/SignUp")
	public String signUp(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DAO dao = new DAO();
		
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String dayOfBirth = request.getParameter("day");
		String yearOfBirth = request.getParameter("year");
		String monthOfBirth = request.getParameter("month");
		String homeAddress = request.getParameter("address");
		
		String phoneAreaCode = request.getParameter("phoneAreaCode");
		String phoneNumber = request.getParameter("phoneNumber");
		
		String email = request.getParameter("email");
		String canadianTaxRes = request.getParameter("canadianTaxResident");
		String usTaxRes = request.getParameter("USTaxResident");
		String otherTaxRes = request.getParameter("OtherTaxResident");

		dao.addCustomer(firstName, lastName, dayOfBirth, yearOfBirth, monthOfBirth, homeAddress, phoneAreaCode,
				phoneNumber, email, canadianTaxRes, usTaxRes, otherTaxRes);

		return "redirect:/signUpLink";
	}

	@RequestMapping("/cancelSignUp")
	public String cancelSignUp() {
		return "index";
	}
}

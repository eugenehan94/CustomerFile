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
import services.SignUpInputChecker;

@Controller
public class SignUp {

	@RequestMapping("/SignUp")
	public String signUp(HttpServletRequest request, HttpServletResponse response, Model model, RedirectAttributes ra)
			throws ServletException, IOException {
		DAO dao = new DAO();

		SignUpInputChecker acc = new SignUpInputChecker();

		// If error occurs turn this to true and have it redirected to sign on page
		// Check each input and only the incorrect input will display message -
		boolean error = false;

		// Return all input values to view
		// Display message for incorrect fields ONLY - correct fields fine

		String firstName = request.getParameter("firstName");
		Boolean checkingFirstName = acc.firstNameChecker(firstName);

		String lastName = request.getParameter("lastName");
		Boolean checkingLastName = acc.lastNameChecker(lastName);

		String dayOfBirth = request.getParameter("day");
		String yearOfBirth = request.getParameter("year");
		String monthOfBirth = request.getParameter("month");

		String homeAddress = request.getParameter("address");
		Boolean checkingAddress = acc.addressChecker(homeAddress);
		
		String phoneAreaCode = request.getParameter("phoneAreaCode");
		String phoneNumber = request.getParameter("phoneNumber");		
		Boolean checkingAreaCode = acc.checkAreaCode(phoneAreaCode, phoneNumber);

		
		String email = request.getParameter("email");
		Boolean checkingEmail = acc.emailChecker(email);
		
		String canadianTaxRes = request.getParameter("canadianTaxResident");
		String usTaxRes = request.getParameter("USTaxResident");
		String otherTaxRes = request.getParameter("OtherTaxResident");
		Boolean checkingTaxRes = acc.taxResChecker(canadianTaxRes, usTaxRes, otherTaxRes);
		
		if (checkingFirstName == false) {
			ra.addFlashAttribute("FirstNameResult", "*Please enter valid first name");
			
			error = true;
		}

		if (checkingLastName == false) {
			ra.addFlashAttribute("LastNameResult", "*Please enter valid last name");
			
			error = true;
		}
		
		
		if(checkingAddress == false) {
			ra.addFlashAttribute("AddressResult", "*Please enter valid home address");
		}
		
		
		if (checkingAreaCode == false) {
			ra.addFlashAttribute("AreaCodeResult", "*Please enter valid phone number");
			
			error = true;

		}
		if (checkingEmail == false) {
			ra.addFlashAttribute("EmailResult", "*Please enter valid email address");
			
			error = true;

		}
		if(checkingTaxRes == false) {
			ra.addFlashAttribute("TaxResResult", "*Please choose valid tax residency");
			error = true;
		}

		/*
		 * dao.addCustomer(firstName, lastName, dayOfBirth, yearOfBirth, monthOfBirth,
		 * homeAddress, phoneAreaCode, phoneNumber, email, canadianTaxRes, usTaxRes,
		 * otherTaxRes);
		 * 
		 */

		if (error) {
			ra.addFlashAttribute("firstName", firstName);
			ra.addFlashAttribute("lastName", lastName);
			
			
			ra.addFlashAttribute("dayOfBirth", dayOfBirth);
			
			ra.addFlashAttribute("yearOfBirth", yearOfBirth);
			ra.addFlashAttribute("monthOfBirth", monthOfBirth);
			
			ra.addFlashAttribute("homeAddress", homeAddress);
			ra.addFlashAttribute("phoneNumber", phoneNumber);
			ra.addFlashAttribute("email", email);
			
			ra.addFlashAttribute("phoneAreaCode", phoneAreaCode);
			return "redirect:/signUpLink";
		} else {
			System.out.println("No errors at all");
			ra.addFlashAttribute("sucessMessage", "Client has been successfully added");
			return "redirect:/signUpLink";
		}
	}

	@RequestMapping("/cancelSignUp")
	public String cancelSignUp() {
		return "index";
	}
}

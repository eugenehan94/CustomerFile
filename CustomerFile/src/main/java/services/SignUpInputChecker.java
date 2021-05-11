package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Check Canada Area Code - See if client giving correct number*/

public class SignUpInputChecker {

	public Boolean firstNameChecker(String firstName) {
		if(firstName.length() < 1) {
			return false;
		}
		return true;
	}
	
	public Boolean lastNameChecker(String lastName) {
		if(lastName.length() < 1) {
			return false;
		}
		return true;
	}
	
	String[] Alberta = { "368", "403", "587", "780", "825" };
	String[] BritishColumbia = { "236", "250", "604", "672", "778" };
	String[] Manitoba = { "204", "431" };
	String[] NewBrunswick = { "428", "506" };
	String[] Newfoundland = { "709", "879" };
	String[] NorthwestTerritories = { "867" };
	String[] NovaScotia = { "782", "902" };
	String[] Nunavut = { "867" };
	String[] Ontario = { "226", "249", "289", "343", "365", "416", "437", "519", "548", "613", "647", "705", "742",
			"807", "905" };
	String[] PEI = { "782", "902" };
	String[] Quebec = { "354", "367", "418", "438", "450", "514", "579", "581", "819", "873" };
	String[] Saskatchewan = { "306", "474", "639" };
	String[] Yukon = { "867" };

	String[] CanadaAreaCode = { "368", "403", "587", "780", "825", "236", "250", "604", "672", "778", "204", "431",
			"428", "506", "709", "879", "867", "782", "902", "867", "226", "249", "289", "343", "365", "416", "437",
			"519", "548", "613", "647", "705", "742", "807", "905", "782", "902", "354", "367", "418", "438", "450",
			"514", "579", "581", "819", "873", "306", "474", "639", "867" };

	//Returns true only if the area code matches the ones above
	public boolean checkAreaCode(String areaCode, String phoneNumber) {
		String regex = "^\\d{7}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoneNumber);
		boolean result = matcher.find();
		for (int i = 0; i < CanadaAreaCode.length; i++) {
			if (areaCode.equals(CanadaAreaCode[i]) && result == true) {
				return true;
			}
		}
		return false;
	}
	
	public boolean emailChecker(String email) {
		String regex = "^[A-Za-z0-9]+@[A-Za-z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.find();
		if (matchFound) {
			return true;
		}else {
			return false;
		}
	}
	
	//make sure an address is entered
	//check address - has to have number and letters like an address
	public boolean addressChecker(String homeAddress) {
		String regex = "^[0-9]+ [a-zA-Z0-9 ']+$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(homeAddress);
		boolean matchFound = matcher.find();
		if (matchFound) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean taxResChecker(String taxCanada, String taxUS, String taxOther) {
		if(taxCanada.equals("No") && taxUS.equals("No") && taxOther.equals("No")) {
			return false;
		}
		else if(taxCanada.equals("") || taxUS.equals("")|| taxOther.equals("")) {
			return false;
		}
		return true;
	}
}

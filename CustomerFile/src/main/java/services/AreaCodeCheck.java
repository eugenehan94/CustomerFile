package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Check Canada Area Code - See if client giving correct number*/

public class AreaCodeCheck {

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
	public boolean checkAreaCode(String areaCode) {
		
		for (int i = 0; i < CanadaAreaCode.length; i++) {
			if (areaCode.equals(CanadaAreaCode[i])) {
				return true;
			}
		}
		return false;
	}
	
}

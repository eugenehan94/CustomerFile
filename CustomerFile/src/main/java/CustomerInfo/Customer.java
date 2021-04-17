package CustomerInfo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer  {
	
	
	@Id
	private String firstName;
	private String lastName;
	private String dayOfBirth;
	private String yearOfBirth;
	private String monthOfBirth;
	private String homeAddress;
	private String phoneAreaCode;
	private String phoneNumber;
	private String email;
	private String canadianTaxRes;
	private String usTaxRes;
	private String otherTaxRes;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDayOfBirth() {
		return dayOfBirth;
	}
	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public String getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getMonthOfBirth() {
		return monthOfBirth;
	}
	public void setMonthOfBirth(String monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	public String getPhoneAreaCode() {
		return phoneAreaCode;
	}
	public void setPhoneAreaCode(String phoneAreaCode) {
		this.phoneAreaCode = phoneAreaCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCanadianTaxRes() {
		return canadianTaxRes;
	}
	public void setCanadianTaxRes(String canadianTaxRes) {
		this.canadianTaxRes = canadianTaxRes;
	}
	public String getUsTaxRes() {
		return usTaxRes;
	}
	public void setUsTaxRes(String usTaxRes) {
		this.usTaxRes = usTaxRes;
	}
	public String getOtherTaxRes() {
		return otherTaxRes;
	}
	public void setOtherTaxRes(String otherTaxRes) {
		this.otherTaxRes = otherTaxRes;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", dayOfBirth=" + dayOfBirth
				+ ", yearOfBirth=" + yearOfBirth + ", monthOfBirth=" + monthOfBirth + ", homeAddress=" + homeAddress
				+ ", phoneAreaCode=" + phoneAreaCode + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", canadianTaxRes=" + canadianTaxRes + ", usTaxRes=" + usTaxRes + ", otherTaxRes=" + otherTaxRes
				+ "]";
	}
	
	
	//using toString to test if functionality works
	
	
}

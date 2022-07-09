package com.wipro.velocity.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="institute")
public class InstituteModel 
{

	  private String institutionCategory;
	  private String name;
	  private String inststate;
	  private String instdistrict;
	  @Id
	  private String InstitutionCode;
	  private String email;
	  private String DISEcode;
	  private String Location;
	  private String InstitutionType;
	  private String affilatedUniversityState;
	  private String AffilatedUniversityBoardName;
	  private String YearFromWhichAdmissionStarted;
	  private String SetPassword;
	  private String ConfirmPassword;
	  private String AddressLine1;
	  private String AddressLine2;
	  private String City;
	  private String state;
	  private String district;
	  private String pincode;
	  private String PrincipleName;
	  private String Telephone;
	  
	
	  public String getInstitutionCategory() {
		return institutionCategory;
	}
	public void setInstitutionCategory(String institutionCategory) {
		this.institutionCategory = institutionCategory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInststate() {
		return inststate;
	}
	public void setInststate(String inststate) {
		this.inststate = inststate;
	}
	public String getInstdistrict() {
		return instdistrict;
	}
	public void setInstdistrict(String instdistrict) {
		this.instdistrict = instdistrict;
	}
	public String getInstitutionCode() {
		return InstitutionCode;
	}
	public void setInstitutionCode(String institutionCode) {
		InstitutionCode = institutionCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDISEcode() {
		return DISEcode;
	}
	public void setDISEcode(String dISEcode) {
		DISEcode = dISEcode;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getInstitutionType() {
		return InstitutionType;
	}
	public void setInstitutionType(String institutionType) {
		InstitutionType = institutionType;
	}
	public String getAffilatedUniversityState() {
		return affilatedUniversityState;
	}
	public void setAffilatedUniversityState(String affilatedUniversityState) {
		this.affilatedUniversityState = affilatedUniversityState;
	}
	public String getAffilatedUniversityBoardName() {
		return AffilatedUniversityBoardName;
	}
	public void setAffilatedUniversityBoardName(String affilatedUniversityBoardName) {
		AffilatedUniversityBoardName = affilatedUniversityBoardName;
	}
	public String getYearFromWhichAdmissionStarted() {
		return YearFromWhichAdmissionStarted;
	}
	public void setYearFromWhichAdmissionStarted(String yearFromWhichAdmissionStarted) {
		YearFromWhichAdmissionStarted = yearFromWhichAdmissionStarted;
	}
	public String getSetPassword() {
		return SetPassword;
	}
	public void setSetPassword(String setPassword) {
		SetPassword = setPassword;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPrincipleName() {
		return PrincipleName;
	}
	public void setPrincipleName(String principleName) {
		PrincipleName = principleName;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public InstituteModel(String institutionCategory, String name, String inststate, String instdistrict,
			String institutionCode, String email, String dISEcode, String location, String institutionType,
			String affilatedUniversityState, String affilatedUniversityBoardName, String yearFromWhichAdmissionStarted,
			String setPassword, String confirmPassword, String addressLine1, String addressLine2, String city,
			String state, String district, String pincode, String principleName, String telephone) {
		this.institutionCategory = institutionCategory;
		this.name = name;
		this.inststate = inststate;
		this.instdistrict = instdistrict;
		InstitutionCode = institutionCode;
		this.email = email;
		DISEcode = dISEcode;
		Location = location;
		InstitutionType = institutionType;
		this.affilatedUniversityState = affilatedUniversityState;
		AffilatedUniversityBoardName = affilatedUniversityBoardName;
		YearFromWhichAdmissionStarted = yearFromWhichAdmissionStarted;
		SetPassword = setPassword;
		ConfirmPassword = confirmPassword;
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
		City = city;
		this.state = state;
		this.district = district;
		this.pincode = pincode;
		PrincipleName = principleName;
		Telephone = telephone;
	}
	
}

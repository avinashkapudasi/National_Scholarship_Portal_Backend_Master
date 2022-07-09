package com.wipro.velocity.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
*/
@Document(collection="student")
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
public class StudentModel 
{
	@Id
	private String aadharNumber;
	private String stateofDomicile;
	private String dist;  
	private String name;
	private String dob;
	private String gender;
	private String mobileNumber;	private String email;
	private String bankName;
	private String accountNo;
	private String ifsc;
	private String community;
	private String institutionCode;
	private String password;
	
	
	@Override
	public String toString() {
		return "Studentregistration [aadharNumber=" + aadharNumber + ", stateofDomicile=" + stateofDomicile + ", dist="
				+ dist + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + ", bankName=" + bankName + ", accountNo=" + accountNo + ", ifsc=" + ifsc
				+ ", community=" + community + ", institutionCode=" + institutionCode + ", setPassword=" + password
				+ ", confirmPassword=" + "]";
	}


	public String getAadharNumber() {
		return aadharNumber;
	}


	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}


	public String getStateofDomicile() {
		return stateofDomicile;
	}


	public void setStateofDomicile(String stateofDomicile) {
		this.stateofDomicile = stateofDomicile;
	}


	public String getDist() {
		return dist;
	}


	public void setDist(String dist) {
		this.dist = dist;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public String getIfsc() {
		return ifsc;
	}


	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}


	public String getCommunity() {
		return community;
	}


	public void setCommunity(String community) {
		this.community = community;
	}


	public String getInstitutionCode() {
		return institutionCode;
	}


	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


}

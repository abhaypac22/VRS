package com.example.demo.entities;

public class OwnerReg 
{
   public OwnerReg() 
   {
		super();
	
   }
String Firstname,Lastname,GovernmentIdno,Emailid,Password,Contactno,Area,City,State,Country,pincode, role_name,apartmentno,gov_id_img;
public OwnerReg(String firstname, String lastname, String governmentIdno, String emailid, String password,
		String contactno, String area, String city, String state, String country, String pincode, String role_name,
		String apartmentno, String gov_id_img) {
	super();
	Firstname = firstname;
	Lastname = lastname;
	GovernmentIdno = governmentIdno;
	Emailid = emailid;
	Password = password;
	Contactno = contactno;
	Area = area;
	City = city;
	State = state;
	Country = country;
	this.pincode = pincode;
	this.role_name = role_name;
	this.apartmentno = apartmentno;
	this.gov_id_img = gov_id_img;
}
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public String getLastname() {
	return Lastname;
}
public void setLastname(String lastname) {
	Lastname = lastname;
}
public String getGovernmentIdno() {
	return GovernmentIdno;
}
public void setGovernmentIdno(String governmentIdno) {
	GovernmentIdno = governmentIdno;
}
public String getEmailid() {
	return Emailid;
}
public void setEmailid(String emailid) {
	Emailid = emailid;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getContactno() {
	return Contactno;
}
public void setContactno(String contactno) {
	Contactno = contactno;
}
public String getArea() {
	return Area;
}
public void setArea(String area) {
	Area = area;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String getRole_name() {
	return role_name;
}
public void setRole_name(String role_name) {
	this.role_name = role_name;
}
public String getApartmentno() {
	return apartmentno;
}
public void setApartmentno(String apartmentno) {
	this.apartmentno = apartmentno;
}
public String getGov_id_img() {
	return gov_id_img;
}
public void setGov_id_img(String gov_id_img) {
	this.gov_id_img = gov_id_img;
}
 


 
}

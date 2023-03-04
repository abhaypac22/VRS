package com.example.demo.entities;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Address 
{
  
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int a_id;
	String apartmentno;
	String area;
	String city;
	String state;
	String country;
	String pincode;
	
	public Address() 
	{
		super();
	
	}

	public Address(String apartmentno, String area, String city, String state, String country,
			String pincode) {
		this.apartmentno= apartmentno;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getApartmentno() {
		return apartmentno;
	}

	public void setApartmentno(String apartment_id) {
		this.apartmentno = apartment_id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	
	
	
	
}

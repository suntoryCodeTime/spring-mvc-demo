package com.suntorycodetime.springdemo.mvc;

//import java.util.LinkedHashMap;
//import java.util.Map;

public class Student {
	private String firstName;
	private String lastName;
	
	private String country;
	
	//private Map<String, String> countryOptions;
	
	public Student() {
//		countryOptions = new LinkedHashMap<>();
//		countryOptions.put("BR", "Brazil");
//		countryOptions.put("FR", "France");
//		countryOptions.put("DE", "Germany");
//		countryOptions.put("IN", "India");
//		countryOptions.put("MX", "Mexico");
	}
	
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

//	public Map<String, String> getCountryOptions() {
//		return countryOptions;
//	}
//
//	public void setCountryOptions(Map<String, String> countryOptions) {
//		this.countryOptions = countryOptions;
//	}
	
	
	
	

}

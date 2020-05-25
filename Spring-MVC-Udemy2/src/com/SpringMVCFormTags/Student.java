package com.SpringMVCFormTags;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String city;
	private String studentGender;
	private String[] os;  // the values come from checkboxes, the user may check multiple checkboxes, that is why we need a collection
	
	private String favoriteLanguage; // values are set from jsp radio buttong 
	private LinkedHashMap<String, String> gender;  // values are sent from Java class to jsp radio button  // populate its values inside the constructor 
	
	
	//to give the coutry list to the from from our class // make it generic 
	private LinkedHashMap<String, String> countryOptionsHashMap;
	

	
	
	//Constructor
	public Student() {
		//populate the country options used ISO country code when app runs/ we can read it from file system/DB..etc
		countryOptionsHashMap = new LinkedHashMap<>();
		countryOptionsHashMap.put("afg", "Afghanistan");
		countryOptionsHashMap.put("pak", "Pakistan");
		countryOptionsHashMap.put("usa", "USA");
		countryOptionsHashMap.put("ir", "Iran");
		countryOptionsHashMap.put("in", "India");
		countryOptionsHashMap.put("brzl", "Brazil");
		countryOptionsHashMap.put("ger", "Germany");
		
		
		//populate the date for radio button gender
		gender = new LinkedHashMap<String, String>();
		gender.put("Male", "Male");
		gender.put("Female", "Female");
		gender.put("SheMale", "SheMale");
		
	}

	//Getters and Setter
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

	public LinkedHashMap<String, String> getCountryOptionsHashMap() {
		return countryOptionsHashMap;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountryOptionsHashMap(LinkedHashMap<String, String> countryOptionsHashMap) {
		this.countryOptionsHashMap = countryOptionsHashMap;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getGender() {
		return gender;
	}

	public void setGender(LinkedHashMap<String, String> gender) {
		this.gender = gender;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}
	
	
	
	
	
	
	
	

}

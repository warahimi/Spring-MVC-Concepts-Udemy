package com.entities;

import com.CustomValidation.CourseCode;
import com.CustomValidation.MobileCode;

public class Customer {
	
	@CourseCode  // we dont pass any values here because it will use the defaults
	// same as : @CourseCode(Value ="LUV", message = "Must start with LUV")
	//@CourseCode(value = "Wahid", message = "Must start with Wahid..") // we can custimiz the values here if we want instead of the defaul value and message
	private String courseCode;
	
	@MobileCode(value = {"0799", "0786"}, message = "Must Start with 0799 or 0786")
	private String[] mobileCode;
	
	//Constructor
	public Customer() {
	}
	
	//Getter and Setters
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String[] getMobileCode() {
		return mobileCode;
	}

	public void setMobileCode(String[] mobileCode) {
		this.mobileCode = mobileCode;
	}
	
	

}

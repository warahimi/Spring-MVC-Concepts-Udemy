package com.SrpingMVCFormValidation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class Customer {

	private String firstName;
	
	@NotNull(message = "is required") // adding validation rule to our field
	@Size(min = 1, message = "is required")
	private String lastName;
	
	//Number range validation
	@Min(value = 0, message = "Must be greater of equal to zero")
	@Max(value = 10, message = "Must be less then or equal to 10")
	@NotNull(message = "is required") // to make a required field also//@NotNull doesnt work with primitive type (int) , that is why we change the type to non primitive (Integer) wrapper classes
	private Integer freepasses; //Adding number range validation
	
	//Regular Experession Validation
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 characters/digits") // the RE accepts only 5 char or digit
	private String postalCode;
	
	public Customer() {
		
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

	public Integer getFreepasses() {
		return freepasses;
	}

	public void setFreepasses(Integer freepasses) {
		this.freepasses = freepasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	

}

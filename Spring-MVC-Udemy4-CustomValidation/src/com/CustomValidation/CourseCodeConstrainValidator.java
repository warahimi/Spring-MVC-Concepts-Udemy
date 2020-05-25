package com.CustomValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstrainValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix; //
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value(); //@CourseCode(value="LUV", message="")
	}
	
	
	//we can implement our business logic to retuen true or false
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) { // theCode is the actual text the user enter in their html, the 2nd argument theConstraintValidatorContext is used to give additional error message
		//business logic // any business logic talk to DB, Call a server ...etc
		boolean result;
		if(theCode !=null)// to check if the user enters something in the box or are they sumiting and empty coursecode
		{
			result= theCode.startsWith(coursePrefix); // to check whatever the use enter in their htl does it start with our coursePrefix (LUV)
		}
		else
		{
			result = true;
		}
		return result;
	}

}

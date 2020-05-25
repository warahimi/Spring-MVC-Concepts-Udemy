package com.CustomValidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstrainValidator.class)  // CourseCodeConstrainValidator.class: is the Helper class contains business rules/ validation logic
@Target({ElementType.METHOD, ElementType.FIELD})  // where can you apply this new annotation we created , apply on method and fields
@Retention(RetentionPolicy.RUNTIME) // How long the marked annotation will be stored/used. .Runtime: retain this in the bytecode and used it at rune time by JVM
public @interface CourseCode {

	//1-Define the attributes that we can pass to our annotation
	//@CustomerCode(value="LUV", message="must start with LUV") // this have 2 attribute value and message
	//private String courseCode;
	public String value() default "LUV";
	
	
	//2-define default error message // default values for Value and message // if the user doesnt enter
	public String message() default "must start with LUV";
	
	
	//3- Define default payload and groups : groups : we can group validation constrains together, payload: we can give additional information about validation error
	public Class<?>[] groups() default{};
	public Class<? extends Payload>[] payload() default{};
}

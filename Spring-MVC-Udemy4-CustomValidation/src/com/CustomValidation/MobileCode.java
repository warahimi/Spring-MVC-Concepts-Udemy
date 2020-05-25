package com.CustomValidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = MobileCodeConstrainValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MobileCode {
	
	public String[] value() default {"0799", "0786"};
	public String message() default "Must start with 0799 or 0786";
	
	public Class<?>[] groups() default{};
	public Class<? extends Payload>[] payload() default{};

}

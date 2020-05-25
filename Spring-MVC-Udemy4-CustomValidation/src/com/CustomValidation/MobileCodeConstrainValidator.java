package com.CustomValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MobileCodeConstrainValidator implements ConstraintValidator<MobileCode, String[]> {
	
	private String[] mobilePrefix;

	@Override
	public void initialize(MobileCode theMobileCode) {
		
		mobilePrefix = theMobileCode.value();
	}
	
	@Override
	public boolean isValid(String[] theMobileCodes, ConstraintValidatorContext theConstraintValidatorContext) {
		String userEntry = theMobileCodes[0]; 
		boolean result = false;
		if(theMobileCodes != null)
		{
			// loop through the mobliePrefix, check to see theMobileCode entered by used matches any value of the mobilePrefix
			for(String tempMobCode : mobilePrefix) 
			{
				result = userEntry.startsWith(tempMobCode);
				if(result)
				{
					break;
				}
			}
		}
		else
		{
			result = true;
		}
		
		return result;
	}

}

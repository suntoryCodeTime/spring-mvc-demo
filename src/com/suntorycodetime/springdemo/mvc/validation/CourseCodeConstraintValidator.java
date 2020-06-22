package com.suntorycodetime.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}
	
	@Override
	public boolean isValid(String courseCode, ConstraintValidatorContext constraintValidatorContext) {
		
		boolean result = false;; 
		if(courseCode != null) {
			for(String prefix : coursePrefix) {
				result = courseCode.startsWith(prefix);
				if(result) {
					break;
				}
			}
		}
		else { 
			result = true;
		}
		
		return result;
	}

}

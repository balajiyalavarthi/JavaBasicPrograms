package com.codegnan.interfaces;

public class SimplePasswordChecker implements PasswordChecker {

	@Override
	public int checkLength(String password) {
		
		return password.length();
	}
	
	int passStrength;
	
	
	@Override
	public String checkComplexity(String password) {
		
		passStrength= checkLength(password);
		
		
		if(passStrength == 8) {
			return "Medium";
			
		}else {
			
			if(passStrength<8) {
				return "Weak";
				
			}
		}
		return "Strong";
		}
		
	}


package com.codegnan.interfaces;

public interface PasswordChecker {
	int checkLength(String password);
	String checkComplexity(String password);
}

package com.codegnan.interfaces;

import java.util.Scanner;

public class PasswordCheckerMain {

	public static void main(String[] args) {
		
		SimplePasswordChecker check =  new SimplePasswordChecker();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your password : ");
		String userPassword = input.next();
		

		String res = check.checkComplexity(userPassword);
		
		System.out.println("Your password is  "+res);
		
		input.close();
	}

}

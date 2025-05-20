package com.codegnan.controlstatements;

import java.util.Scanner;

public class passwordChecker {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int attempts = 0;
		String password = "admin";
		
		while(attempts < 3) {
			
			System.out.println("Enter your password : ");
			String userPass = input.next();
			input.close();
			
			if(password.equals(userPass)) {
				System.out.println("Login Successful");
				break;
			}else {
				System.out.println("Incorrect password");
				attempts++;
			}
			
		if(attempts == 3) {
			System.out.println("too many attempts, account locked");
			break;
		
		}
		}
		
	}

}

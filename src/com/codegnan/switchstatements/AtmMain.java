package com.codegnan.switchstatements;

import java.util.Scanner;

public class AtmMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pinNumber = 1234;
		System.out.println("Enter your pin number : ");
		int pin  = input.nextInt();
		if(pin != pinNumber) {
			System.out.println("Wrong pin");
			return;
		}
		double balance  = 5000;
		byte choice;
		
		
			
			
			System.out.println("====================ATM===========================");
			System.out.println("=================1.Deposit========================");
			System.out.println("================2.Withdraw========================");
			System.out.println("==============3.Check balance=====================");
			System.out.println("==================4.Exit==========================");
			System.out.println("==================================================");
			do {
			System.out.println("Enter Your choice : ");
			choice = input.nextByte();
			
			
			
			switch(choice) {
			case 1:
				System.out.println("Enter deposit amount : ");
				double depositAmount = input.nextDouble();
				if(depositAmount < 500) {
					System.out.println("Enter deposit amount more than 500rs");
				}else {
					if(depositAmount% 100 !=0) {
						System.out.println("deposit amount must be multiples of 100,Only 100,200,500,2000 notes are available.");
					}else {
						balance = balance + depositAmount;
						System.out.println("deposited successfully");
						System.out.println("Your new balance is  : "+balance);
					}
				}
				break;
			case 2:
				System.out.println("Enter withdrawl amount : ");
				double withDrawlAmount = input.nextDouble();
				if(withDrawlAmount < 500) {
					System.out.println("Withdrawl amount must be more than 500");
				}else {
					if(withDrawlAmount > balance) {
						System.out.println("Insufficient balance");
					}else {
						if(withDrawlAmount% 10 !=0) {
							System.out.println("withdrawl amount must be multiples of 100,Only 100,200,500,2000 notes are available.");
						}else {
							balance = balance - withDrawlAmount;
							System.out.println("Withdrawl Successful");
							System.out.println("Your new balance is : "+balance);
						}
					}
				}
				break;
			case 3:
				System.out.println("Your balance is : "+balance);
				break;
			case 4:
				System.out.println("Exit succesful");
				break;
			default :
				System.out.println("Invalid choice. choose a valid option from 1-4");
			}
			
		}while(choice !=4);
		input.close();
	}

}

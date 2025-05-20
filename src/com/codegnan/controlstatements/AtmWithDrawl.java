package com.codegnan.controlstatements;

import java.util.Scanner;

public class AtmWithDrawl {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Account Balance : ");
		double accountBalance = input.nextDouble();
		System.out.println("Enter your withdrawal amount : ");
		double withdrawlAmount = input.nextDouble();
		input.close();
		
		if(withdrawlAmount <= accountBalance) {
			accountBalance -= withdrawlAmount;
			System.out.println("Transaction Completed of rs"+withdrawlAmount+" remaining balance is :"+accountBalance);
		}else {
			System.out.println("Insufficient balance");
		}
	}

}

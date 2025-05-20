package com.codegnan.controlstatements;

import java.util.Scanner;

public class AtmWithdrawl2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Account Balance : ");//Asking end user to enter Account balance
		double AccBalance = input.nextDouble();
		System.out.println("Enter Withdrawl Amount : ");//Asking end user to enter Withdrawl Amount
		double WithdrawlAmount = input.nextDouble();
		input.close();
		/* Main condition if withdrawl amount > account balance and withdrawl
		 * amount >500 and withdrawl amount is perfectly divisible by 100(to satisfy notes availabilty)
		 * then only transaction will be processed.
		 */
		if(AccBalance >= WithdrawlAmount && WithdrawlAmount > 500 && WithdrawlAmount% 100 ==0) {
			AccBalance -= WithdrawlAmount;
			System.out.println("Transaction of "+WithdrawlAmount+" is Success! Your Account balance is : "+AccBalance);
		}else {
			/*
			 * checks account balance is greater than withdrawl amount
			 */
			if(AccBalance < WithdrawlAmount) {
				System.out.println("Insufficient Balance.Your Account Balance is "+AccBalance);
			}else {
				/*
				 * checks withdrawl amount is greater than 500
				 */
				if(AccBalance >= WithdrawlAmount && WithdrawlAmount < 500) {
					System.out.println("Transaction Failed! Enter Withdrawl amount more than 500rs");
				}else {
					/*
					 * Checks if Withdrawl amount is perfectly divisible by 100 
					 * for notes availability.
					 */
					if(AccBalance >= WithdrawlAmount && WithdrawlAmount > 500 && WithdrawlAmount% 100 !=0) {
						System.out.println("Transaction Failed! Machine has only 100,200, 500, 2000 rupee notes.Please enter a valid amount");
					}
				}
			}
		}
		
		

	}

}

package com.codegnan.oop;

import java.util.Scanner;

public class Deposit {

	double amount;
	
	public  Deposit(double amount) {
		this.amount= amount;
	}
	
	public void depositedAmount(double cash) {
		amount+= cash;
		System.out.println("Cash deposited through notes : ");
		System.out.println("New balance : "+amount);
	}
	
	public void depositedAmount(int checkNumber, double cash) {
		amount+=cash;
		System.out.println("Cash deposited through cheque");
		System.out.println("New balance : "+amount);
	}
	
	public void depositedAmount(long transactionId, String userName, double cash) {
		amount+=cash;
		System.out.println("Cash deposited through UPI with transaction Id :"+transactionId);
		System.out.println("By "+userName);
		System.out.println("New balance : "+amount);
		
	}
	
	Scanner input = new Scanner(System.in);
}

package com.codegnan.controlstatements;

import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter consumed units : ");
		double units = input.nextDouble();
		
		System.out.println("Enter your age : ");
		int age = input.nextInt();
		input.close();
		
		double bill = 0;
		double surchargeBill;
		double discountedBill;
		
		bill = units <=100? units*1.5: (units >100 && units <=200)?units*2.0:(units >200 && units <=300)?units*3.0:(units >300)?units*5.0:bill;
		
		if(bill >1000 && age >=60) {
			surchargeBill = (bill + bill* 0.1);
			discountedBill = surchargeBill - surchargeBill*0.05;
			
			System.out.println("Your Electricity bill is :"+discountedBill);
		}else {
			if(bill >1000 && age <60) {
				surchargeBill = (bill + bill* 0.1);
				System.out.println("Your Electricity bill is :"+surchargeBill);
			}else {
				if(bill <1000 && age >=60) {
					discountedBill = bill - bill*0.05;
					System.out.println("Your electricty bill is :"+discountedBill);
				}else {
					System.out.println("Your electricty bill is : "+bill);
				}
			}
		}
		
	}

}

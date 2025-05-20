package com.codegnan.fundamentals;

import java.util.Scanner;

public class CalculateRemainingAmount {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter the purchased amount : ");
		
		double purchasedAmount = input.nextDouble();
		input.close();
		double discount = purchasedAmount>=100?0.2:purchasedAmount>=50?0.1:0.0;
		
		double discountedPrice = purchasedAmount*discount;
		
		double FinalPrice = purchasedAmount - discountedPrice;
		
		System.out.println("Final Price : "+FinalPrice);
	}

}

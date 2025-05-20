package com.codegnan.fundamentals;

import java.util.Scanner;

public class ShippingCostCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in kgs : ");
		double weight = input.nextDouble();
		System.out.println("Enter distance need to travel");
		double distance = input.nextDouble() ;
		
		
		double shippingCharges = weight < 5 && distance <100 ?50:(weight >=5 && weight <=10) && (distance>=100 && distance <=500)?100:(weight >=10 && distance >0)?150:0.0;
		
		double additionalShippingCharges = distance >500 && weight >0?shippingCharges*0.1:0;
		
		double finalCharges = shippingCharges + additionalShippingCharges;
		System.out.println("Your shipping is : "+shippingCharges);
		System.out.println("Additional shipping charges if (distance >500) : "+additionalShippingCharges);
		System.out.println("Total charges : "+finalCharges);
		input.close();
	}

}

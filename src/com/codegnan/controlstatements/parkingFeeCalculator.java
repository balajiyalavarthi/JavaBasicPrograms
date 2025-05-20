package com.codegnan.controlstatements;

import java.util.Scanner;

public class parkingFeeCalculator {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		//end user enters vehicle type
		System.out.println("Enter vehicle type! Please choose only in these options car, bike, lorry : ");
		int vehicle = input.nextInt();
		//end user enters Number of parking hours
		System.out.println("Enter Number of parking hours : ");
		int parkinghours = input.nextInt();
		//end use enters parking timings
		System.out.println("Enter parking Timing in 24hr format : ");
		int time = input.nextInt();
		double finalParkFee;
		double extraParkFee;
		input.close();
		double parkFee = vehicle == 1?parkinghours*50:vehicle == 2?parkinghours*30:vehicle == 3?parkinghours*100:0;
		
		if((time >=18 && time <=24  || time >=24 && time  <= 8) && (parkinghours > 5)) {
			extraParkFee = (parkFee + parkFee* 0.5);
			finalParkFee = extraParkFee - parkFee*0.2;
			System.out.println("Your Park Fee is : "+finalParkFee);
		}else {
			if((time >=18 && time <=24  || time >=24 && time  <= 8) && (parkinghours < 5)) {
				finalParkFee = parkFee + parkFee* 0.5;
				System.out.println("Your Park Fee is : "+finalParkFee);
			}else {
				if(parkinghours > 5) {
					finalParkFee = parkFee - parkFee*0.2;
					System.out.println("Your parking fee is : "+finalParkFee);
				}else {
					System.out.println("Your parking fee is : "+parkFee);
				}
			}
		}
		
	}
}
package com.codegnan.controlstatements;

import java.util.Scanner;
public class TalkTimePlans{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of minutes to get a best plan : ");
		int min = input.nextInt();
		input.close();
		if(min < 100) {
			System.out.println("For "+min+" Basic plan is a best choice");
		}else {
			if(min >=100 && min <=300) {
				System.out.println("For "+min+" Standard plan is a best choice");
			}else {
				if(min >300 && min <=500) {
					System.out.println("For "+min+" Premium plan is a best choice");
				}else {
					if(min >500) {
						System.out.println("For "+min+" Unlimited plan is a best choice");
					}
				}
			}
		}
	}
}
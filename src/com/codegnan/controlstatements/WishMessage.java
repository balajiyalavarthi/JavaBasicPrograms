package com.codegnan.controlstatements;

import java.util.Scanner;

public class WishMessage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in time in hours(24h format) : ");
		byte time = input.nextByte();
		input.close();
		
		if(time >=4 && time<=12) {
			System.out.println("Good Morning");
		}else {
			if(time >12 && time <=16) {
				System.out.println("Good AfterNoon");
			}else {
				if(time>16 && time<24) {
					System.out.println("Good Evening");
				}else {
					System.out.println("Sorry bye bye");
				}
			}
		}
	}

}

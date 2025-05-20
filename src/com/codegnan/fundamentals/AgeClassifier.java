package com.codegnan.fundamentals;

import java.util.Scanner;

public class AgeClassifier {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter you age : ");
		int age = input.nextInt();
		input.close();
		String res = age<12?"Child":(age>=12 && age<19)?"Teenager":(age>20 && age<64)?"Adult":"Senior";
		System.out.println("you are a : "+res);
	}

}

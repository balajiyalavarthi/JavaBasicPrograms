package com.codegnan.fundamentals;

import java.util.Scanner;

public class TerinaryOperatorEx {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = input.nextInt();
		input.close();
		
		//exp1?exp2:exp3
		
		String eligible = age >=18?"Eligible":"Not Eligible";
		System.out.println(eligible);
	}

}

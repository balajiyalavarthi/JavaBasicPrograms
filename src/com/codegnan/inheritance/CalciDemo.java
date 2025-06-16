package com.codegnan.inheritance;

import java.util.Scanner;

public class CalciDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num1 and num2 values :");
		
		My_Calculation mc =  new My_Calculation(input.nextInt(),input.nextInt());
		System.out.println(mc.multiplication());
		
		
//		Calculator c =  new Calculator(10,20);
//		System.out.println(c.num1);
//		System.out.println(c.num2);
//		System.out.println(c.addition());
		input.close();
	}

}

package com.codegnan.inheritance;

public class My_Calculation extends Calculator {

	My_Calculation(int num1, int num2) {
		super(num1, num2);
	}
	
//	int num1 = super.num1;
//	int num2 = super.num2;


	public int multiplication() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(super.addition());
		
		return num1 * num2;
	}

}

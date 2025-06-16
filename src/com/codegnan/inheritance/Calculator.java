package com.codegnan.inheritance;

public class Calculator {

	int num1;
	int num2;
	
	Calculator(int num1, int num2){
		this.num1= num1;
		this.num2= num2;
	}
	
	public int addition() {
		return num1+num2;
	}
}

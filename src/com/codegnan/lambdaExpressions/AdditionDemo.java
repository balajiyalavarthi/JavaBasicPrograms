package com.codegnan.lambdaExpressions;

public class AdditionDemo {

	public static void main(String[] args) {
		Addition add =  (a, b)-> System.out.println("Addition is : "+(a+b));
		
		add.add(10, 20);

	}

}

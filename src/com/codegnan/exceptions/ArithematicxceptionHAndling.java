package com.codegnan.exceptions;

public class ArithematicxceptionHAndling {

	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}catch (ArithmeticException e){
			System.out.println("Executing after handling the exception");
		}finally {
			System.out.println("Exectues whether exception is handled or not");
		}

	}

}

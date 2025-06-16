package com.codegnan.oop;

public class PolymorphisimTesting {

	public void test() {
		System.out.println("No arguements");
	}
	public void test(int a) {
		System.out.print("A value  : "+a);
	}
	
	public void test(double a, double b) {
		System.out.println("A value : "+a);
		System.out.println("B value : "+b);
	}
	
	public int test(int a, int b) {
		System.out.print("Multiplication of a and b is : ");
		return a*b;
	}
	
	public double test(double num) {
		System.out.println("Sqaure of the number is : ");
		return num*2;
	}
	
}

package exceptionHandling;

import java.util.Scanner;

public class ArithematicExceptionHandling {

	public int divideByZero(int num1, int num2) {
		try {

			int quotient = num1 / num2;
			return quotient;

		} catch (ArithmeticException e) {
			return -1;
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number : ");
		int num1 = input.nextInt();

		System.out.println("Enter second number : ");
		int num2 = input.nextInt();

		ArithematicExceptionHandling reference = new ArithematicExceptionHandling();
		int result = reference.divideByZero(num1, num2);

		//
		if (result >= 0) {
			System.out.println(num1 + " divided by " + num2 + " = " + result);
		} else {
			System.out.println("Cannot divide by zero");
		}

		input.close();
	}

}

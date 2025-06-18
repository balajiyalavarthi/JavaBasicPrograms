package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchBlock {

	
	// Read an integer from user and divide 100 by that number.
	// Handle both InputMismatchException and ArithmeticException using multiple catch blocks.

	
	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		try {
			
			
			System.out.println("Enter a number : ");
			int number =  input.nextInt();
			int res = 100/number;
			System.out.println("result : "+res);
			
			
		}catch(InputMismatchException e) {
			
			System.out.println("Input value must be a integer");
			
		}catch(ArithmeticException e) {
			
			System.out.println("input number must be greater than 0, cannot divide a number by zero");
			
		}
		
		
		

	}

}

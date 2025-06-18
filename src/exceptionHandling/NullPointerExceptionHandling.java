package exceptionHandling;

import java.util.Scanner;

public class NullPointerExceptionHandling {

	// Write a method that returns the length of a string.
	// If the input is null, catch NullPointerException and return -1.

	public static int stringLengthCalculator(String str) {
		try {
			return str.length();
		} catch (NullPointerException e) {
			return -1;
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = input.nextLine();
		
		String newStr = str.equals("null")?null:str;
		
		int result = stringLengthCalculator(newStr);
		System.out.println(result);
		
		if(result >=0) {
			System.out.println("String length : "+result);
		}else {
			System.out.println("String cannot be null");
		}
		
		input.close();
	}

}

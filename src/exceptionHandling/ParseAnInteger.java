package exceptionHandling;

import java.util.Scanner;

public class ParseAnInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a string to parse it into a integer : ");
		String str = input.nextLine();

		try {
			
			double number = Double.parseDouble(str);
			System.out.println("Parsed Number : " + number);
			
			
		} catch (NumberFormatException e) {
			
			System.out.println("Invalid Number, Number format Exception");
			
			
		}
	}

}

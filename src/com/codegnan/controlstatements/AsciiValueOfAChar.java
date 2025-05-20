package com.codegnan.controlstatements;

import java.util.Scanner;

public class AsciiValueOfAChar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char val = input.next().charAt(0);
		int res = (int)val;
		System.out.println("Ascii value of "+val+" is  :"+res);
		input.close();
	}

}

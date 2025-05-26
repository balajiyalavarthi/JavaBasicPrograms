package com.codegnan.Strings;

import java.util.Scanner;

public class RepeatLetter {

	public static String twiceLetter(String word) {
		String newStr = "";
		for(int i=0; i<=word.length()-1; i++) {
			char currnchar = word.charAt(i);
			newStr += currnchar;
			newStr += currnchar;
		}
		
		return newStr;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = input.next();
		
		System.out.println(twiceLetter(str));
		input.close();

	}

}

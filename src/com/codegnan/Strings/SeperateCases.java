package com.codegnan.Strings;

import java.util.Scanner;


public class SeperateCases {
	static String lowerString;
	static String upperString;
	public static String caseSeperator(String fstr) {

		lowerString = "";
		upperString = "";

		for (int i = 0; i < fstr.length(); i++) {
			
			char currnChar = fstr.charAt(i);
			
			if (Character.isLowerCase(currnChar)) {
				lowerString += currnChar;
				
			} else {
				if (Character.isUpperCase(currnChar)) {
					upperString += currnChar;
					
				}
				

			}

		}
		return lowerString +" "+ upperString;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String str1 = input.next();
		System.out.println("Enter String 2 : ");
		String str2 = input.next();

		String fstr = str1 + str2;
		System.out.println(caseSeperator(fstr));

	}

}

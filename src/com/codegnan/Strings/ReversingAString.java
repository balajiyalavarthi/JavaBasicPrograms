package com.codegnan.Strings;

import java.util.Scanner;

public class ReversingAString {

	public static String Reversing(String word) {
		String reversedStr = "";
		for(int i=word.length()-1; i>=0; i--) {
			
			char currnChar = word.charAt(i);
			reversedStr +=currnChar;
		}
		
		return reversedStr;
		 
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String word = input.next();
		
		System.out.println(Reversing(word));

	}

}

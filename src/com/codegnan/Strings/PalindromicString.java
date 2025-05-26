package com.codegnan.Strings;

import java.util.Scanner;

public class PalindromicString {
	
static String Str;
static boolean check = false;

	//methods to reverse the given string
	public static String ReversingString(String word) {
		
		String reversed = "";
		for(int i=word.length()-1; i>=0; i--) {
			char curnChar = word.charAt(i);
			reversed+=curnChar;
		}
		return reversed;
		
	}
	//method to check the given string and reverse string are palindrome or not
	public static boolean isPalindrome() {
		
//		calling ReversingString method
		String revStr = ReversingString(Str);
		//returns true irrespective of the case if both strings are same
		if(revStr.equalsIgnoreCase(Str)) {
			check = true;
		}
		return check;
		
	}
	
	//main method
	public static void main(String[] args) {
		//end user enters a string value
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word : ");
		Str = input.next();
		
		boolean res = isPalindrome();
		
		System.out.println(ReversingString(Str));
//		
//		System.out.println(Str);
		
		if(res ==  true) {
			System.out.println("Palindrome");
		}else {
			if(res == false) {
				System.out.println("Not a palindrome");
			}
		}
		
		input.close();
	}

}

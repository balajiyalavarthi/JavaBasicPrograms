package com.codegnan.fundamentals;

import java.util.Scanner;

public class VowelCheck {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char letter;
		
		do {
		
		System.out.println("Enter a letter : ");
		letter = input.next().charAt(0);
		boolean  vowel = letter =='a'?true:letter =='e'?true:letter =='i'?true:letter =='o'?true:letter =='u'?true:false;
		
		//vowel check
		if(vowel == true) {
			System.out.println("Vowel");
			System.out.println("--- Enter '1' to quit ---");
			System.out.println();
		}else {
			System.out.println("Consonant");
			System.out.println("--- Enter '1' to quit ---");
			System.out.println();
		}
		}while(letter != '1');
		
		input.close();
	}

}

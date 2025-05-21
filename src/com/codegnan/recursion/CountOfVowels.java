package com.codegnan.recursion;

import java.util.Scanner;

public class CountOfVowels {
	
	public static int CountOfVowels(String word) {
		
		int count =0;
		//loop for iterating each character index in the word
		
		word = word.toLowerCase();
		for(int i = 0; i<word.length(); i++) {
			
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
				count +=1;
			}else {
				continue;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String word = input.next();;
		int count = 0;
		
		CountOfVowels obj =  new CountOfVowels();
		
		System.out.println("Count of vowels in "+word+" is  : "+obj.CountOfVowels(word));

	}

}

package com.codegnan.arrays;

public class ArrayWithForLoop {

	public static void main(String[] args) {
		char[] vowels = {'a','e','i','o','u'};
		
		for(int letter = 0;letter <vowels.length;letter++) {
			System.out.println("Vowel  :"+vowels[letter]);
		}
	}

}

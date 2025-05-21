package com.codegnan.patterns;

public class LettersRectangleReverse {

	public static void main(String[] args) {
		
		int val = 106;
		for(int i =0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(" "+(char)(val)+" ");
				val--;
			}
			val = 106;
			System.out.println();
		}

	}

}

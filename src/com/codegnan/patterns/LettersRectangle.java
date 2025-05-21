package com.codegnan.patterns;

public class LettersRectangle {

	public static void main(String[] args) {
		int val = 97;
		for( int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				System.out.print(" "+(char)val+" ");
				val++;
			}
			val = 97;
			System.out.println();
		}

	}

}

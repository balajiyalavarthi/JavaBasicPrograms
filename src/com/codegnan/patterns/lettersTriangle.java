package com.codegnan.patterns;

public class lettersTriangle {

	public static void main(String[] args) {
		int value = 97;
		for(int i =0 ; i<=5; i++) {
			for(int j =0; j<=i; j++) {
				System.out.print(" "+(char)value+" ");
				value++;
			}
			System.out.println();
		}

	}

}

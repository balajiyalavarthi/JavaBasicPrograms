package com.codegnan.patterns;

public class ReverseNumbersTriangle {

	public static void main(String[] args) {
		
		int k = 9;
		for(int i =0; i<=5; i++) {
			for(int j=0; j<=i; j++ ) {
				System.out.print(" "+k+" ");
				k--;
			}
			k=9;
			System.out.println();
		}

	}

}

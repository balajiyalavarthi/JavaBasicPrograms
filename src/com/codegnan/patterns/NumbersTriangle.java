package com.codegnan.patterns;

public class NumbersTriangle {

	public static void main(String[] args) {
		int k = 1;
		for(int i = 0; i<=5; i++) {
			for( int j = 0; j<i; j++) {
				System.out.print(" "+k+" ");
				k++;
			}
			k=1;
			System.out.println();
		}

	}

}

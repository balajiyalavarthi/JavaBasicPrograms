package com.codegnan.patterns;

public class NumbersRectanglePattern {

	public static void main(String[] args) {
		
		int k =0;
		for (int i =0 ; i<10; i++) {
			for( int j=0; j<10; j++) {
				System.out.print(" "+k+" ");
				k++;
			}
			k=0;
			System.out.println();
		}

	}

}

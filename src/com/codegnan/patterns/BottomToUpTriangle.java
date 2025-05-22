package com.codegnan.patterns;

public class BottomToUpTriangle {

	public static void main(String[] args) {
		int rows,columns = 5;
		for(int i =0; i<=5; i++) {
			for(int j =0; j<=i; j++) {
				System.out.print(" ");
			}
			System.out.println();
			for(i = 0; i<=5; i++) {
				for(int j= 0; j<5-i;j++) {
				System.out.print("* ");
				}
			}
			
			System.out.println();
		
		}
		
	}

}

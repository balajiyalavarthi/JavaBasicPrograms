package com.codegnan.patterns;

import java.util.Scanner;

public class SquareHollowPattern {

	public static void squareHollow(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}

			System.out.println();
		}
	}

	public static void triangleHollow(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == n - 1 || i == j || j == n - 1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}

			System.out.println();
		}
	}

	public static void palindromicpattern(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void pyramidPattern(int n) {
		for(int i =1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<= (i*2)-1; j++) {
				System.out.print("*");
			}
		System.out.println(" ");
				
		}
	}
		
	public static void reversePyramidPattern(int n) {
		for(int i =n; i>=1; i--) {
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<= (i*2)-1; j++) {
				System.out.print("*");
			}
		System.out.println(" ");
		}
	}
	
	public static void DiamondHollowPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1;j++) {
				if(j==1 || j==2*i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		for(int i= n-1; i>= 1; i--) {
			for(int j= 1;j<= n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1;j++) {
				if(j==1 || j== 2*i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
				
	public static void diamondPattern(int n) {
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*n-i;j++) {
				if(j==1 || j==2*n-i ) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(int i=n-1;i>=1;i++) {
			for(int j=1; j<=2*i-1;j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1; j++) {
				if(j==1 || j== 2*i-1) {
					System.out.print("*");
				}
			}
			
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter pattern size : ");
		int num = input.nextInt();

		int choice;

		System.out.println("For Square hollow pattern enter 1");
		System.out.println("For Triangle hollow pattern enter 2");
		System.out.println("For palindromic Number pattern enter 3");
		System.out.println("For pyramid pattern enter 4");
		System.out.println("For reverse pyramid pattern enter 5");
		System.out.println("For Diamond Hollow Pattern enter 6");
		System.out.println("For Diamond  Pattern enter 7");
		System.out.println();
		System.out.println("Enter your choice : ");
		choice = input.nextInt();

		switch (choice) {

		case 1:
			squareHollow(num);
			break;
		case 2:
			triangleHollow(num);
			break;
		case 3:
			palindromicpattern(num);
			break;
		case 4:
			pyramidPattern(num);
			break;
		case 5:
			reversePyramidPattern(num);
			break;
		case 6:
			DiamondHollowPattern(num);
			break;
		case 7:
			diamondPattern(num);
			break;
		default:
			System.out.println("Invalid choice");

		}
	}

}

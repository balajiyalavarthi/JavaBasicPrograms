package com.codegnan.controlstatements;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = input.nextInt();
		
		input.close();
		
		for(int i=1;i<=20;i++) {
			
			System.out.println(+num+ " * "+i+" = "+num*i);
			
		}

	}

}

package com.codegnan.controlstatements;

import java.util.Scanner;

public class ReversingANumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter a  number : ");
		int num = input.nextInt();
		int reversedNum = 0;
		
		if(num < 0) {
			num = -(num);
		}
		
		while(num > 0) {
			int lastdigit = num%10;
			
			reversedNum = reversedNum*10 + lastdigit;
			
			num /=10;
		}
		System.out.println("reversed number is  : "+reversedNum);
		input.close();
	}

}

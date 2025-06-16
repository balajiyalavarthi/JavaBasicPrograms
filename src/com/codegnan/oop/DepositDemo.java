package com.codegnan.oop;

import java.util.Scanner;

public class DepositDemo {

	public static void main(String[] args) {
		
		Deposit o =  new Deposit(2000);
		Scanner input = new Scanner(System.in);
		o.depositedAmount(1000);
		o.depositedAmount(123456789, 1000);
		o.depositedAmount(989999989, "balaji", 10000);

	}

}

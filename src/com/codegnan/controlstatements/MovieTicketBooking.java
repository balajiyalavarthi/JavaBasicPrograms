package com.codegnan.controlstatements;

import java.util.Scanner;

public class MovieTicketBooking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String movieName;
		int tickets;
		char continueBooking;
		
		do {
			
			System.out.println("enter movie name : ");
			movieName = input.next();
			
			System.out.println("Enter number of tickets : ");
			tickets = input.nextInt();
			
			int ticketPrice = 150;
			
			System.out.println("Booking successful of movie : "+movieName);
			int totalCost = ticketPrice*tickets;
			System.out.println("Your ticket price : "+totalCost);
			
			System.out.println("Do you want to continue if yes (y) if no (n) : ");
			continueBooking = input.next().charAt(0);
			
		}while(continueBooking == 'y');
		System.out.println("Thank you for booking.");
		input.close();
	}

}

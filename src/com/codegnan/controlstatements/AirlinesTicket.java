package com.codegnan.controlstatements;

import java.util.Scanner;

public class AirlinesTicket {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		double ticketPrice = 5000;
		double discountedTicketPrice;
		double discountedprice;
		double finalDiscountedPrice;
		System.out.println("Welcome to Airlines Ticket Booking");
		//Details of Booking timings
		System.out.println();
		System.out.println("Flight Timings (20pm to 23pm)");
		System.out.println();
		System.out.println("Early booking offers you 20% discount on ticket price(before 12pm)");
		System.out.println("Normal booking offers you 0% discount on ticket price(after 12pm to 17pm)");
		System.out.println("Late booking charges  20% extra charge on ticket price(after 17pm 19pm)");
		System.out.println("No booking accepted in between 19pm to 20pm");
		System.out.println();
		
		//end user enters booking timings
		System.out.println("Enter your booking timings : ");
		int bookingTimings = input.nextInt();
		
		//end user enters age
		System.out.println("Enter your age : ");
		int age = input.nextInt();
		input.close();
		
		//classifying the age of the end user
		String category = (age >=6 && age <=18)?"child":(age >18 && age <=45)?"adult":(age >45)?"senior":"Invalid input";
		
		//classifying booking timings of the end user
		String timings = bookingTimings<12?"early":bookingTimings >=12 && bookingTimings <=17?"normal":bookingTimings >17 && bookingTimings <19?"late":"Invalid output";
		
		if(category == "child" && timings =="early") {
			discountedprice = ticketPrice*0.5;
			discountedTicketPrice = ticketPrice - ticketPrice*0.5;
			finalDiscountedPrice = discountedTicketPrice - ticketPrice*0.1;
			System.out.println("Your Actual ticket price : "+ticketPrice);
			System.out.println("Your are a "+category);
			System.out.println("Discounted price is : "+discountedprice);
			System.out.println("Your discounted ticket price is : "+discountedTicketPrice);
			System.out.println("For early booking you got extra 10% discount");
			System.out.println("Final Ticket price : "+finalDiscountedPrice);
		}else {
			if(category == "child" && timings =="normal") {
				discountedprice = ticketPrice*0.5;
				discountedTicketPrice = ticketPrice - ticketPrice*0.5;
				finalDiscountedPrice = discountedTicketPrice - 0;
				System.out.println("Your Actual ticket price : "+ticketPrice);
				System.out.println("Your are a "+category);
				System.out.println("Discounted price is : "+discountedprice);
				System.out.println("Your discounted ticket price is : "+discountedTicketPrice);
				System.out.println("For normal booking you got 0% discount");
				System.out.println("Final Ticket price : "+finalDiscountedPrice);
			}else {
				if(category == "child" && timings =="late") {
					discountedprice = ticketPrice*0.5;
					discountedTicketPrice = ticketPrice - ticketPrice*0.5;
					finalDiscountedPrice = discountedTicketPrice + ticketPrice*0.2;
					System.out.println("Your Actual ticket price : "+ticketPrice);
					System.out.println("Your are a "+category);
					System.out.println("Discounted price is : "+discountedprice);
					System.out.println("Your discounted ticket price is : "+discountedTicketPrice);
					System.out.println("For late booking you have to pay extra 20% charge on Ticket price");
					System.out.println("Final Ticket price : "+finalDiscountedPrice);
				}else{
					if(category == "adult" && timings =="early") {
						finalDiscountedPrice = ticketPrice - ticketPrice*0.1;
						System.out.println("Your actual ticket price : "+ticketPrice);
						System.out.println("Your are an "+category);
						System.out.println("For early booking you got extra 10% discount");
						System.out.println("Final Ticket price : "+finalDiscountedPrice);
					}else {
						if(category == "adult" && timings =="normal") {
							finalDiscountedPrice = ticketPrice - 0;
							System.out.println("Your actual ticket price : "+ticketPrice);
							System.out.println("Your are an "+category);
							System.out.println("For normal booking you got 0% discount");
							System.out.println("Final Ticket price : "+finalDiscountedPrice);
						}else {
							if(category == "adult" && timings =="late") {
								finalDiscountedPrice = ticketPrice + ticketPrice*0.2;
								System.out.println("Your actual ticket price : "+ticketPrice);
								System.out.println("Your are an "+category);
								System.out.println("For late booking you have to pay extra 20% charge");
								System.out.println("Final Ticket price : "+finalDiscountedPrice);
							}else {
								if(category == "senior" && timings =="early") {
									discountedprice = ticketPrice*0.2;
									discountedTicketPrice = ticketPrice - discountedprice ;
									finalDiscountedPrice = discountedTicketPrice - ticketPrice*0.1;
									System.out.println("Your Actual ticket price : "+ticketPrice);
									System.out.println("Your are a "+category);
									System.out.println("Discounted price is : "+discountedprice);
									System.out.println("Your discounted ticket price is : "+discountedTicketPrice);
									System.out.println("For early booking you got extra 10% discount");
									System.out.println("Final Ticket price : "+finalDiscountedPrice);
								}else {
									if(category == "senior" && timings =="normal") {
										discountedprice = ticketPrice*0.2;
										discountedTicketPrice = ticketPrice - discountedprice ;
										finalDiscountedPrice = discountedTicketPrice - 0;
										System.out.println("Your Actual ticket price : "+ticketPrice);
										System.out.println("Your are a "+category);
										System.out.println("Discounted price is : "+discountedprice);
										System.out.println("Your discounted ticket price is : "+discountedTicketPrice);
										System.out.println("For normal booking you got 0% discount");
										System.out.println("Final Ticket price : "+finalDiscountedPrice);
									}else {
										if(category == "senior" && timings =="late") {
											discountedprice = ticketPrice*0.2;
											discountedTicketPrice = ticketPrice - discountedprice ;
											finalDiscountedPrice = discountedTicketPrice + ticketPrice*0.2;
											System.out.println("Your Actual ticket price : "+ticketPrice);
											System.out.println("Your are a "+category);
											System.out.println("Discounted price is : "+discountedprice);
											System.out.println("Your discounted ticket price is : "+discountedTicketPrice);
											System.out.println("For normal booking you got 0% discount");
											System.out.println("Final Ticket price : "+finalDiscountedPrice);
										}else {
											if(timings == "Invalid output") {
												System.out.println("Booking closed! Out of time.");
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
			
		
	}

}

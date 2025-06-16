package com.codegnan.java_practice;

public class TicketBookingApp {

	public static void main (String[] args) {
		
		MovieTicket morningShow = new MovieTicket("War 2", 300);
		
		morningShow.bookSeats(10);
		morningShow.displayBookingInfo();
		morningShow.getAvailableSeats();
		
		
		System.out.println();
		System.err.println("......................................");
		System.out.println();
		
		MovieTicket matinee = new MovieTicket("Pushpa 2",100);
		matinee.bookSeats(110);
		matinee.displayBookingInfo();
		matinee.getAvailableSeats();
		matinee.resetBooking();
		matinee.getAvailableSeats();
		
		
		
	}

}

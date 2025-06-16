package com.codegnan.java_practice;

public class MovieTicket {

	private String movieName;
	private int totalSeats;
	private int seatBooked;
	
	public MovieTicket(String movieName, int totalSeats) {
		this.movieName = movieName;
		this.totalSeats = totalSeats;
		seatBooked = 0;
	}
	
	public void bookSeats(int number) {
		if(number > totalSeats) {
			System.out.println("Booking failed: Not enough seats available.");
		}else {
			if(number<= totalSeats) {
				seatBooked = number;
				System.out.println(+seatBooked+" "+movieName+" movie tickets booked successfully.");
			}
		}
	}
	
	public void cancelSeats(int number) {
		if(number > seatBooked) {
			System.out.println("Cancellation failed: cannot cancel more seats than booked");
		}else {
			seatBooked -=number;
			System.out.println(+number+" cancelled successfully");
		}
	}
	
	public void displayBookingInfo() {
		
		System.out.println("Movie name : "+movieName);
		System.out.println("Total Seats : "+totalSeats);
		System.out.println("Seats booked : "+seatBooked);
//		int availableSeats = totalSeats- seatBooked;
		System.out.println("Available seats : "+getAvailableSeats());
		
	}
	
	public int getAvailableSeats() {
		return totalSeats- seatBooked;
	}
	
	public boolean isSoldOut() {
		if(getAvailableSeats()<=0) {
			return true;
		}
		
		return false;
	}
	
	public void resetBooking() {
		seatBooked = 0;
	}
}

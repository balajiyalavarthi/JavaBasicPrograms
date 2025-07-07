package com.codegnan.fileIOStreams;

import java.io.Serializable;

public class Transient implements Serializable{

	
	/*
	 * Transient  : 
	 * It is a modifier that applicables only to variables.
	 * While serialization if we don't want to serialize the value of a particular 
	 * variable to meet the security constraint then we should declare that variable with transient modifier.
	 * 
	 * so during the serialization jvm ignores the original value of the transient variable and 
	 * saves the default value of the trasient variable.
	 * 
	 * Hence trasient means not to serialize.
	 */
	
	
	
	String cardHolderName;
	long cardNumber;
	int cvv;
	String expiryDate;
	transient int pinNumber;
	
	
	public Transient(String cardHolderName, long cardNumber, int cvv, String expiryDate, int pinNumber) {
		super();
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
		this.pinNumber = pinNumber;
	}


	@Override
	public String toString() {
		return "Transient [cardHolderName=" + cardHolderName + ", cardNumber=" + cardNumber + ", cvv=" + cvv
				+ ", expiryDate=" + expiryDate + "]";
	}
	
	
	public void displayCardDetails() {
		System.out.println("Card holder name : "+cardHolderName);
		System.out.println("Card number : "+cardNumber);
		System.out.println(" cvv : "+cvv);
		System.out.println(" expiry Date: "+expiryDate);
		System.out.println("Pin number : "+pinNumber);
	}
	
	
	
	
}

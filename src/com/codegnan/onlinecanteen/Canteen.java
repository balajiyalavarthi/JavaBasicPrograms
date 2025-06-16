package com.codegnan.onlinecanteen;

public abstract class Canteen {

	String name;
	double basePrice;
	
	Canteen(String name, double basePrice){
		this.name =  name;
		this.basePrice = basePrice;
	}
	
	public abstract double calculateTotalPrice();
	public abstract String showCategory();
	public abstract int showPreparationTime();
	
	
	public void display() {
		System.out.println("Item name : "+name);
		System.out.println("Base price : "+basePrice);
	}
}

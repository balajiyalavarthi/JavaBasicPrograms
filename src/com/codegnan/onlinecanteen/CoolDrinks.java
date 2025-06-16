package com.codegnan.onlinecanteen;

public class CoolDrinks extends Canteen {

	int extraCharge;
	double totalPrice;
	CoolDrinks(String name, double basePrice, int extraCharge) {
		super(name, basePrice);
		extraCharge =0;
	}

	@Override
	public double calculateTotalPrice() {
		totalPrice = basePrice+ extraCharge;
		return totalPrice;
	}
	
	@Override
	public String showCategory() {
		return "CoolDrinks";
	}
	
	@Override
	public int showPreparationTime() {
		return 5;
	}
	
	
}

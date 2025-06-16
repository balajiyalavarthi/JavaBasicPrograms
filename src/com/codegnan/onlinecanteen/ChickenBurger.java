package com.codegnan.onlinecanteen;

public class ChickenBurger extends Canteen {

	int ExtraCharge;
	double totalPrice;
	
	
	public ChickenBurger(String name, double basePrize, int ExtraCharge ) {
		super(name, basePrize);
		this.ExtraCharge = 70;
	}
	
	
	@Override
	public double calculateTotalPrice() {
		totalPrice = basePrice+ ExtraCharge;
		return totalPrice;
	}
	
	@Override
	public String showCategory() {
		return "Non-Veg";
	}
	
	@Override
	public int showPreparationTime() {
		return 20;
	}
	
}

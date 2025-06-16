package com.codegnan.onlinecanteen;

public class Pizza extends Canteen {

	String size;
	int extraPrice;
	double totalPrice;

	Pizza(String name, double basePrice, String size) {
		super(name, basePrice);
		System.out.println(" Three pizza sizes available /small/medium/large/");
		this.size = size;
	}

	@Override
	public double calculateTotalPrice() {

		if (size.equals("small".toLowerCase())) {
			extraPrice = 50;
			totalPrice = basePrice + extraPrice;

			return totalPrice;

		} else {
			if (size.equals("medium".toLowerCase())) {
				extraPrice = 100;
				totalPrice = basePrice + extraPrice;

				return totalPrice;
			} else {
				if (size.equals("large".toLowerCase())) {
					extraPrice = 200;
					totalPrice = basePrice + extraPrice;

					return totalPrice;
				}
			}
		}
		totalPrice = basePrice;
		return totalPrice;
	}
	
	@Override
	public String showCategory() {
		return "Non-veg";
	}
	
	@Override
	public int showPreparationTime() {
		return 30;
	}
	
	
}

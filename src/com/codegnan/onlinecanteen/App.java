package com.codegnan.onlinecanteen;

public class App {

	public static void main(String[] args) {
		Canteen[] items= new Canteen[6];
		
		
//		//Sample test case
//		Canteen obj  =  new Pizza("Chicken Pizza", 200, "small");
//		obj.display();
//		System.out.println("Total Price : "+obj.calculateTotalPrice());
//		System.out.println("Food type : "+obj.showCategory());
//		System.out.println("Preparition time : "+obj.showPreparationTime());
		
		
		
		//checking real test cases
		items[0]  = new Pizza("Chicken Fried Pizza",200,"large");
		items[1]  =  new Pizza("Fried Chicken Pizza", 200, "small");
		items[2]  =  new ChickenBurger("Spicy Fried Chicken Burger", 100, 70);
		items[3]  =  new ChickenBurger("Simple Chicken Burger", 100, 70);
		items[4]  =  new CoolDrinks("Coke", 40, 0);
		items[5]  =  new CoolDrinks("Sprite", 38, 0);
		
		
		
		for(int i= 0; i<items.length; i++) {
			
			System.out.println("Test case "+(i+1)+" : ");
			System.out.println("..................................................");
			System.out.println();
			items[i].display();
			System.out.println("Total Price : "+items[i].calculateTotalPrice());
			System.out.println("Food type : "+items[i].showCategory());
			System.out.println("Preparition time : "+items[i].showPreparationTime());
			System.out.println();
			System.out.println("..................................................");
		}
		

	}

}

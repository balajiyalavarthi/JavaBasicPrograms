package com.codegnan.java_practice;

public class Product {

	//instance variables
	int productId;
	String productName;
	double price;
	int quantity;
	
	Product(int productId, String productName, double price, int quantity ) {
		this.productId= productId;
		this.productName= productName;
		this.price= price;
		this.quantity= quantity;
	}
	
	Product(int productId, String productName){
		this.productId= productId;
		this.productName= productName;
		
		price= 0.0;
		quantity= 1;
	}
	
	
	public int updateQuantity(int quantity) {
		this.quantity= quantity;
		
		return this.quantity;
	}
	
	public int updateQuantity(int quantity, boolean add) {
		this.quantity= quantity;
		
		if(add= true) {
			this.quantity+= quantity;
			return this.quantity;
		}else {
			return this.quantity;
		}
		
	}
	
	int stock;
	public int addStock(int stock) {
		this.stock= stock;
		System.out.print("Stock : ");
		return stock;
	}
	
	public int removeStock() {
		this.stock-=quantity;
		System.out.print("Stock left : ");
		return this.stock;
	}
	
	double discount;
	public double discount() {
		if(quantity>= 6) {
			discount = 0.15;
		}else {
			if(quantity>= 3 && quantity< 6 ) {
				discount= 0.1;
			}else {
				if(quantity< 3) {
					discount= 0.05;
				}
			}
		}
		return discount;
	}
	
	double totalCost;
	
	public double getTotalCost() {
		this.totalCost = price* quantity;
		System.out.print("Total cost :");
		return this.totalCost;
	}
	
	double discountAmount;
	
	public double getDiscountAmount() {
		this.discountAmount = this.totalCost*this.discount;
		System.out.print("Disocunt amount : ");
		return this.discountAmount;
	}
	
	double finalPrice;
	
	public double getFinalPrice() {
		this.finalPrice = this.totalCost+ this.discountAmount;
		return this.finalPrice;
	}
	
	public void displaydetails()  {
		
		System.out.println("Product Name : "+productName);
		System.out.println("Product Id : "+productId);
		System.out.println("Quantity : "+quantity);
		System.out.println("Price : "+price);
		System.out.println("total Cost : "+totalCost);
		System.out.println("Discount Amount : "+discountAmount);
		System.out.println("Final Price : "+finalPrice);
		
	}
	
	public static void main(String[] args) {
		Product p1 = new Product(1234, "Printer", 12000, 2);
		System.out.println(p1.addStock(10));
		System.out.println(p1.removeStock());
		System.out.println(p1.discount());
		System.out.println(p1.getTotalCost());
		System.out.println(p1.getDiscountAmount());
		System.out.println(p1.getFinalPrice());
		p1.displaydetails();
	}
}

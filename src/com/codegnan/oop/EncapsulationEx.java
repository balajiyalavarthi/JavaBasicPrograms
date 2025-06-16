package com.codegnan.oop;

public class EncapsulationEx {

	private String name;
	private String email;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void displayDetails(String name, String email ) {
		this.name = name;
		this.email= email;
		System.out.println("Name : "+this.name);
		System.out.println("Email : "+this.email);
	}
}

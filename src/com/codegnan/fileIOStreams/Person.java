package com.codegnan.fileIOStreams;

public class Person {

	int id;
	String name;
	String email;
	
	
//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
//	}
	
	public String toCsv() {
		return id+","+name+","+","+email;
	}
	
	
	public Person(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
}

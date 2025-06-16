package com.codegnan.oop;

public class ConstructorOverloading {

	int length, width, height;
	
	ConstructorOverloading(){
		length= 10;
		width= 20;
		height= 10;
	}
	
	ConstructorOverloading(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	ConstructorOverloading(int singleParameter){
		this.length = this.width = this.height = singleParameter;
	}
	
	
	int volume() {
		return length*width*height;
	}
}

package com.codegnan.oop;

public class DisplayBox {

	public static void main(String[] args) {
		Box firstBox = new Box();

		firstBox.width = 20;
		firstBox.height = 20;
		firstBox.depth = 30;
		double volume1 = firstBox.width + firstBox.height + firstBox.depth;

		System.out.println("Box 1 parameters are : ");
		System.out.println("width : " + firstBox.width);
		System.out.println("height : " + firstBox.height);
		System.out.println("depth : " + firstBox.depth);
		System.out.println("Volume of Box 1 : " + volume1);
		System.out.println();
		Box secondBox = new Box();

		secondBox.width = 20;
		secondBox.height = 20;
		secondBox.depth = 30;
		double volume2 = secondBox.width + secondBox.height + secondBox.depth;

		System.out.println("Box 2 parameters are : ");
		System.out.println("width : " + secondBox.width);
		System.out.println("height : " + secondBox.height);
		System.out.println("depth : " + secondBox.depth);
		System.out.println("Volume of Box 1 : " + volume2);
	}

}

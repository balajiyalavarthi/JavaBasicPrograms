package com.codegnan.arrays;

public class Main {

	public static void main(String[] args) {
		String[] DayNames = new String[7];
		DayNames[0] = "Monday";
		DayNames[1] = "Tuesday";
		DayNames[2] = "Wednesday";
		DayNames[3] = "Thursday";
		DayNames[4] = "Friday";
		DayNames[5] = "Saturday";
		DayNames[6] = "Sunday";
		
		for(int i = 0; i <DayNames.length;i++) {
			System.out.println("Day is : "+DayNames[i]);
		}
	}
}

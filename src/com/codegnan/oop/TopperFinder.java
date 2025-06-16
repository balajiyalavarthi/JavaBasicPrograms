package com.codegnan.oop;

public class TopperFinder {

	public static void main(String[] args) {
		Student s1 = new Student("Balaji", 99);
		Student s2 = new Student("Arjun", 97);

		StudentUtil util = new StudentUtil();

		Student topper = util.getTopper(s1, s2);

		if (topper != null) {
			System.out.println("Topper");
			System.out.println(topper);
		} else {
			System.out.println("Both have same marks");
		}
	}

}

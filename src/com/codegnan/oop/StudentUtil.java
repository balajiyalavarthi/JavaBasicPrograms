package com.codegnan.oop;

public class StudentUtil{


	public Student getTopper(Student s1, Student s2){
		
		if(s1.getMarks()> s2.getMarks()) {
			return s1;
		}else {
			if(s2.getMarks() > s1.getMarks()) {
				return s2;
			}
		}
		
		return null;
	}
	

}

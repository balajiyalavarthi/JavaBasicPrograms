package com.codegnan.fileIOStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSeriDemo {

	public static void main(String[] args) {
		String filepath = "EmployeeSerializable.txt";
		
		EmployeeSerializable emp1 = new EmployeeSerializable(1, "Balaji", 3000, "Hyderabad");
		
		
		try(FileOutputStream fos = new FileOutputStream(filepath)) {
			
			System.out.println("Serialization started");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(emp1);
			
			System.out.println("Serialized employee object "+emp1);
			
			System.out.println("Serialization completed");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		// Deserailization implementation 
		try(FileInputStream fis =  new FileInputStream(filepath)){
			ObjectInputStream ois =  new ObjectInputStream(fis);
			try {
				EmployeeSerializable emp2 = (EmployeeSerializable)ois.readObject();
				System.out.println("Emeployee details after deserialization");
				emp2.display();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			
			e.printStackTrace();
			
			
		} catch (IOException e) {
			
			
			e.printStackTrace();
			
			
		}

	}

}

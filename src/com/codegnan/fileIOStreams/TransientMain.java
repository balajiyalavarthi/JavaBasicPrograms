package com.codegnan.fileIOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientMain {

	public static void main(String[] args) {
		
		System.out.println("Serialization started");
		
		Transient atm = new Transient("Balu", 1232323232, 233, "18/09/2027", 1234);
		
		try(FileOutputStream fos =  new FileOutputStream("atm.txt")){
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(atm);
			
			System.out.println("Serialized card : "+atm);
			System.out.println("Serialization completed");
		}catch(IOException e) {
			e.printStackTrace();
		}

		System.out.print(" ");
		
		System.out.println("Deserilaization started");
		
		try(FileInputStream fis =  new FileInputStream("atm.txt")){
			ObjectInputStream ois =  new ObjectInputStream(fis);
			Transient deserializedAtm = (Transient) ois.readObject();
			deserializedAtm.displayCardDetails();
			
			System.out.println("Deserialized concept :"+deserializedAtm);
			System.out.println("Deserialization ended !");
			
			
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

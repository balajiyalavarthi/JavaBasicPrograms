package com.codegnan.fileIOStreams;

public class SerializationAndDeserialization {

	/*
	 * The process of storing or writing state of an object is called serialization.
	 * It is the process of converting a object into byte stream 
	 * By using fileoutput stream and object output stream we can achieve serialization.
	 * 
	 * 
	 * Deserialization : 
	 * The process of reading state of an object from a file is called De- serialiazation but strictly speaking it is the process of converting an object from file supported form or network supported form to 
	 * ✅ Serialization & Deserialization in Java (Simple Explanation + Real-Life Example) 
	 * 
	 * 
	 * What is Serialization? 
	 * 
	 * Serialization is the process of converting a Java object into
	 * a byte stream, so it can be:
	 * 
	 * saved to a file,
	 * 
	 * sent over a network,
	 * 
	 * stored in a database.
	 * 
	 * It allows an object to be converted into a format that can be stored or
	 * transferred.
	 * 
	 * 🔹 What is Deserialization? Deserialization is the reverse process of
	 * serialization — it converts the byte stream back into a Java object.
	 * 
	 * 
	 * 
	 * 
	 * 🔹 Real-Life Example (Very Simple): 
	 * 
	 * 📦 Imagine you want to send a parcel
	 * 
	 * (object) to your friend in another city: You pack the object into a box —
	 * like converting object → bytes → this is serialization.
	 * 
	 * You send the box via courier — like transferring over a network or saving to
	 * disk.
	 * 
	 * Your friend opens the box and gets the original item back — this is
	 * deserialization.
	 */
	
	/*
	 * Steps to perform Serialization : 
	 * 
	 *  1. Prepare serializable object, bydefault objects available in java are not serializable,
	 *  only the objects which are implementing java.io.serializable. Marker Interface are eligible for serialization.
	 *  2. make read target file by using FileOutputStream("Abc.txt")
	 *  
	 *  3. Create object ouput stream with fileoutput stream then object oos = new ObjectOutputStream(fos);
	 *  4. Write serializable object to object outputstream by using writeObject() method
	 *  
	 *  oos.writeObject(emp1);
	 *  
	 *  
	 *  Steps to perform deserialization : 
	 *  1. Create FileInputStream() for getting deserialized object data from the flat file.
	 *  
	 *  fileInputStream() fis = fileInputStream("abc.txt");
	 *  
	 *  2. craete a objectOutputStream with fileInputStream
	 *  ObjectOutputStream ois =  new ObjectOutputStream(fis);
	 *  
	 *  3. Read De-serialized object from ObjectInputStream.
	 *  
	 *  Employee emp2 =  (Employee)ois.readObject();
	 * 
	 */
}

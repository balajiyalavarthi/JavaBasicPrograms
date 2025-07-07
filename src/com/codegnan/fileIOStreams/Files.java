package com.codegnan.fileIOStreams;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Files {

	/*
	 * Files : 
	 * 1. File
	 * 2. File Writer
	 * 3. File Reader
	 * 4. Print writer
	 * 5. Buffer reader
	 * 6. Buffered writer
	 *
	 */
	public static void main(String[] args) {
		try(PrintWriter pw = new PrintWriter("intro.txt")){
			
			pw.write(100);
			pw.print('d');
			
			pw.print("Good evening everyone thank u for allowing me to introduce myself.");
			pw.println("I am Balaji yalavarthi, I am from Guntur, Andhrapradesh");
			pw.println("I am a recent B-Tech graduate from NRI institute of technology in the stream of computer science");
			pw.write("During my academics i had focused on my studies and object oriented programming through java");
			pw.println("I have technical skills like python, java");
			
			System.out.println("File created successfully");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}

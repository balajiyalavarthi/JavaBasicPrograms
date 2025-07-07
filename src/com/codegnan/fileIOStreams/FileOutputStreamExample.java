package com.codegnan.fileIOStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	/*
	 * File output stream purpose : writes raw bytes to a file usage : best for
	 * writing binary data(eg: images, pdf) or when manually converting text to
	 * binary
	 * 
	 * common methods : write(int b) // write one byte. write(byte[] b) writes array
	 * of bites
	 * 
	 * BufferedOutpout stream : 
	 * purpose : writes bytes to a file with buffering to improve performance
	 * wrapped : used on top of fileoutputStream
	 * buffered : stored data in memeory first and writes 
	 * `usage : writing large amounts of data or write in frequently in loops
	 * 
	 */
	public static void main(String[] args) throws IOException {
		String filepath = "JavaFile.txt";
		
		String content = "Created a file through java code using I/O streams.\n next line ";
		//above the content is binary 
		
		try (FileOutputStream fos = new FileOutputStream(filepath)) {
			byte[] data = content.getBytes(); // in this step we are converting content to bytes manually
			// content.getByted(); each content or word in content sting is converted in to byte and stores in byte array
			
			
			//Q: why to convert from string to byte ?
			//A: Beacuse FileOutputStream only writes the data in form of bytes.
			fos.write(data);
		}
		System.out.println("File created sucessfully using I/O stream");
		
		 
		
	}

}

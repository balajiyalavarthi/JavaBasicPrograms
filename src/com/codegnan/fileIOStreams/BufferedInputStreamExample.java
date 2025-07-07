package com.codegnan.fileIOStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
	String filepath = "JavaFile.txt";
		
		try(BufferedInputStream fis = new BufferedInputStream(new FileInputStream(filepath))) {
			
			int bytedata;
			
			while((bytedata= fis.read())  != -1) {
				System.out.print((char)bytedata);
			}
		}catch(IOException e ) {
			e.printStackTrace();
		

	}
	}

}

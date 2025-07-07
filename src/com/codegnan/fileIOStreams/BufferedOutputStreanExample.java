package com.codegnan.fileIOStreams;

import java.io.BufferedOutputStream;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreanExample {

	public static void main(String[] args) {
		String filepath = "bosFileCreator.txt";

		String content = "Buffered output stream is a class which is available \n in FileI/O stream package";

		try (BufferedOutputStream boss = new BufferedOutputStream(new FileOutputStream(filepath))) {
			byte[] data = content.getBytes();
			
			boss.write(data);
			boss.flush();
			System.out.println("File created using bufferent output stream class successfully");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}

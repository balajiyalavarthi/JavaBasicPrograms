package com.codegnan.fileIOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		try(BufferedReader br=  new BufferedReader(new FileReader("intro.txt"))){
			String line;
			
			
			while((line = br.readLine()) !=null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

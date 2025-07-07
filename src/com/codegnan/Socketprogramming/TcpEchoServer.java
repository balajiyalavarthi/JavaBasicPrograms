package com.codegnan.Socketprogramming;

import java.io.*;
import java.net.*;
import java.util.*;
public class TcpEchoServer {
	
	private static ServerSocket ss;
	private static final int port = 1233;
	
	
	public static void main(String[] args) {
		
		System.out.println("Opening port . . .\n");
		
		
		try {
			
			ss = new ServerSocket(port);
			
		} catch (IOException e) {
			
			System.out.println("Unable to attach to port");
			System.exit(1);
			
		}
		do {
			handleClient();
		} while (true);
	}
	private static void handleClient() {
		Socket link = null;
		try {
			link = ss.accept();
			BufferedReader input = new BufferedReader(new InputStreamReader(link.getInputStream()));
			PrintWriter output = new PrintWriter(link.getOutputStream(), true);
			int numMess = 0;
			String message = input.readLine();
			while (!message.equals("***CLOSE***")) {
				System.out.println("Message received.");
				numMess++;
				output.println("Message " + numMess + ": " + message);
				message = input.readLine();
			}
			output.println(numMess + " messages received.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("\nClosing connection . . .");
				link.close();
			} catch (IOException e) {
				System.out.println("Unable to disconnect!");
				System.exit(1);
			}
		}
	}
}

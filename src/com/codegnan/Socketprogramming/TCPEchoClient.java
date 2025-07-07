package com.codegnan.Socketprogramming;

import java.io.*;
import java.net.*;

public class TCPEchoClient {
	private static InetAddress host;
	private static final int port = 1233;

	public static void main(String[] args) {
		
		try {
			host = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			System.out.println("Host id not found");
			System.exit(1);
		}
		accessServer();
		
		
	}

	public static void accessServer() {
		Socket link = null;
		try {
			link = new Socket(host, port);
			BufferedReader input = new BufferedReader(new InputStreamReader(link.getInputStream()));
			PrintWriter output = new PrintWriter(link.getOutputStream(), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String message, response;
			do {
				System.out.println("Enter message");
				message = br.readLine();
				output.println(message);
				response = input.readLine();
				System.out.println("\nServer> " + response);
			} while (!message.equals("***CLOSE***"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Closing connection...");
				link.close();
			} catch (IOException e) {
				System.out.println("Unable to disconnect!");
				System.exit(1);
			}
		}
	}
}

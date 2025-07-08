package com.codegnan.Socketprogramming;

import java.io.*;
import java.net.*;

public class UDPEchoClient {
	
	private static InetAddress host;
	private static final int port = 1234;
	private static DatagramSocket datsock;
	private static DatagramPacket inpack, outpack;
	private static byte[] buffer;

	
	public static void main(String[] args) {
		try {
			host = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			System.out.println("Host Id Not Found");
		}
		accessServer();
	}

	public static void accessServer() {
		try {
			datsock = new DatagramSocket();
			BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
			String msg = "", res = "";
			do {
				System.out.print("Enter Message : ");
				msg = user.readLine();
				if (!msg.equals("CLOSE")) {
					outpack = new DatagramPacket(msg.getBytes(), msg.length(), host, port);
					datsock.send(outpack);
					buffer = new byte[256];
					inpack = new DatagramPacket(buffer, buffer.length);
					datsock.receive(inpack);
					res = new String(inpack.getData(), 0, inpack.getLength());
					System.out.println("Server>" + res);
				}
			} while (!msg.equals("CLOSE"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing connection...");
			datsock.close();
		}
	}
}
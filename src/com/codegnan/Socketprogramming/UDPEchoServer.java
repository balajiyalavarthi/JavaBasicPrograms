package com.codegnan.Socketprogramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPEchoServer {
	private static final int port = 1234;
	private static DatagramSocket datsoc;
	private static DatagramPacket inpack, outpack;
	private static byte[] buffer;

	public static void main(String[] args) {
		System.out.println("Openening port..\n");
		try {
			datsoc = new DatagramSocket(port);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		handleClient();
	}

	public static void handleClient() {
		try {
			String mesin, mesout;
			int numMes = 0;
			do {
				buffer = new byte[256];
				inpack = new DatagramPacket(buffer, buffer.length);
				datsoc.receive(inpack);
				InetAddress cliaddr = inpack.getAddress();
				int cliport = inpack.getPort();
				mesin = new String(inpack.getData(), 0, inpack.getLength());
				System.out.println("Message recived");
				numMes++;
				mesout = "Message " + numMes + " : " + mesin;
				outpack = new DatagramPacket(mesout.getBytes(), mesout.length(), cliaddr, cliport);
				datsoc.send(outpack);
			} while (true);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing connection...");
			datsoc.close();
		}
	}
}

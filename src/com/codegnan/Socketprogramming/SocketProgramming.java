package com.codegnan.Socketprogramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * Soclet programming : 
 * 
 * Socket : 
 * Socket is an end point for sending and recieving data access a computer network. it is a fundamental concept in network programmin
 * and used to enable communication between two machines often a client and a server.
 * 
 * TCP : 
 * ----------
 * server
 * -----------
 * 
 * 1. create a ServerSocket Object
 * serverSocket object = new ServerSocket();
 * 
 * 2. put the server into waiting state;
 * Socket link= serSoc.accept();
 * 
 * 3. setup input and output
 * Scanner input = new Scanner(System.in);
 * 
 * PrintWriter output = new PrintWriter(link.getOutputStream(), true);
 * 
 * 4. send and recieve data
 * output.println("Type the content");
 * 
 * 5.close th connection after completing of the dialog
 * link.close();
 * 
 * 
 * Client : 
 * 
 * 
 * 1. Establish a connections to server with an appropriate ip and port number 
 * Socket link = new Socket(InetAddreess.getByname("LocalHost"), 1234);
 * 
 * 2. setup input and output streams
 * getInputStream().getoutputStream();
 * 
 * 3. send and recieve the data
 * scanner object of client mesage sent by prinworter of server and printwriter 
 * of the client send the message that are recieved by the scanner object at the server
 * 
 * 4.close the connection
 * 
 * 
 */
public class SocketProgramming {
	
	//IpFinder.
	public static void main(String[] args) {
		
		try {
			InetAddress address  = InetAddress.getLocalHost();
				System.out.println("IP Address : "+address);
		}catch(UnknownHostException e ) {
			e.printStackTrace();
		}
		
	}

}

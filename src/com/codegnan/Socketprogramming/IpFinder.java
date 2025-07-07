package com.codegnan.Socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
//import java.util.Scanner;

public class IpFinder {

	public static void main(String[] args) throws IOException {
		BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
//		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a website or host name to get Ip address : ");
		String name = input.readLine();
		
		try {
			InetAddress address =  InetAddress.getByName(name);
			System.out.println(name+"'s Ip address : "+address);
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}

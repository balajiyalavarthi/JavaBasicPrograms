package com.codegnan.fileIOStreams;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ToCsvExample {

	public static void main(String[] args) {
		List<Person> p = new ArrayList<>();

		p.add(new Person(1, "Balu", "balu@gmail.com"));
		p.add(new Person(2, "Arjun", "Arjun@gmail.com"));
		p.add(new Person(3, "Browny", "Browny@gmail.com"));
		p.add(new Person(4, "Casie", "Casie@gmail.com"));
		p.add(new Person(5, "Donald", "Donald@gmail.com"));

		try (PrintWriter out = new PrintWriter("output.csv")) {
			out.println("id,name,email");
			for(Person person: p) {
				out.println(person.toCsv());
			}
			
			System.out.println("Data is written to output.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

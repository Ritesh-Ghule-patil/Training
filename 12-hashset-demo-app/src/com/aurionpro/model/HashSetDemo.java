package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> emplyees = new HashSet<>();
		emplyees.add("Ritesh");
		emplyees.add("Pratik");
		emplyees.add("Immanuel");
		emplyees.add("Ashiash");
		emplyees.add("Shubahm");
		emplyees.add("Shivam");
		emplyees.add("Ritesh");

		System.out.println("-------------- Printing hash Set --------------------\n");
		System.out.println(emplyees);

		emplyees.remove("Ritesh");

		System.out.println("\n------------ Printing Cloned Object -----------------\n");

		Object names;
		names = emplyees.clone();

		// HashSet<String> names = new HashSet<>();
		// names = (HashSet<String>) emplyees.clone();
		System.out.println(names);

		System.out.println("\n------------------- For Each-------------------------\n");

		for (String name : emplyees) {
			System.out.println(name);
		}

		System.out.println("\n------------------- Streams -------------------------\n");

		emplyees.stream().forEach(ele -> System.out.println(ele));

		System.out.println("\n-------------- Sorting Of Hash Set ------------------\n");

		ArrayList<String> employeeName = new ArrayList<>(emplyees);
		Collections.sort(employeeName);
		System.out.println(employeeName);

	}

}

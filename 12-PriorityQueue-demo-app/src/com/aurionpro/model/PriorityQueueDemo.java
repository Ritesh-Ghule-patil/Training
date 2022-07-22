package com.aurionpro.model;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> emplyees = new PriorityQueue<>();
		emplyees.add("Ritesh");
		emplyees.add("Pratik");
		emplyees.add("Immanuel");
		emplyees.add("Ashiash");
		emplyees.add("Shubahm");
		emplyees.add("Shivam");
		emplyees.offer("Ritesh");
		
	

		System.out.println("----------- Printing Priority Queue ----------------\n");
		System.out.println(emplyees);

		System.out.println();
		//display the first item
		//System.out.println(emplyees.peek());
		System.out.println("Removing element : "+ emplyees.remove());
		
		//removed and display
		System.out.println(emplyees.poll());
		
		System.out.println("\n------------------- For Each-------------------------\n");

		for (String name : emplyees) {
			System.out.println(name);
		}

		System.out.println("\n------------------- Streams -------------------------\n");

		emplyees.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("\n----------- Lamda For each ---------------------------\n");
		
		emplyees.forEach(System.out::println);

	

	}

}

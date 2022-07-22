package com.aurionpro.test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet<String> aurionprotrainee = new TreeSet<>();
		aurionprotrainee.add("Ritesh");
		aurionprotrainee.add("Shubham");
		aurionprotrainee.add("Shivam");
		aurionprotrainee.add("Rizwan");
		aurionprotrainee.add("Ashish");
		
		
	System.out.println("---------- Printing tree Set Element -------------");
	System.out.println(aurionprotrainee);
	
	aurionprotrainee.add("Pratik");
	aurionprotrainee.add("Reena");
	aurionprotrainee.add("immanuel");
	aurionprotrainee.add("Ritesh");
	aurionprotrainee.add("Harshal");
	
	System.out.println("\n------- Iterating tree Set -----------------------\n");
	for(String names: aurionprotrainee) {
		System.out.println("Full Stack Java Developer trainee : "+ names);
	}
	
	System.out.println("\n----------- Iterator -----------------------------\n");

	aurionprotrainee.remove("Ritesh");
	Iterator<String> it = aurionprotrainee.descendingIterator();
	//Iterator<String> it =aurionprotrainee.iterator();
	System.out.println("printing in Descending order after removing Ritesh\n");
	
	while(it.hasNext()) {
		System.out.println("java Developer " +it.next());
	}
	
	}

}

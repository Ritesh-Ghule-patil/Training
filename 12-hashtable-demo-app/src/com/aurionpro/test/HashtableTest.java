package com.aurionpro.test;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashtableTest {
	public static void main(String[] args) {

		Map<String, String> developer = new Hashtable<String, String>();

		developer.put("Ritesh", "java");
		developer.put("Rizwan", "python");
		developer.put("Reena", "Embedded c");
		developer.put("Pratik", "Front-End");
		developer.put("Ashish", "Angular");
		developer.put("Shubham", "Full-Stack");
		developer.put("Immanuel", "Java");
		System.out.println("--------------- Printing Hashmap ------------------\n");
		System.out.println(developer);

		System.out.println("\n------------- Iterating using keySet() -------------\n");
		Iterator<String> it = developer.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = developer.get(key);

			System.out.println("Key is : " + key + " Value is : " + value);
		}

		System.out.println("\n------------- Iterating using entrySet() -----------\n");
		Iterator<Entry<String, String>> it1 = developer.entrySet().iterator();

		while (it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println("Key is : " + entry.getKey() + " Value is : " + entry.getValue());

		System.out.println("\n-------- Iterating using java8 forEach() -----------\n");
		developer.forEach((k,v)-> System.out.println("key is :"+k+" Value is : "+v));
		}
		
		System.out.println("\n-------- Iterating using java8 forEach() -----------\n");
		developer.forEach((k,v)->System.out.println(k+" is a "+v+" Developer"));
		
		System.out.println("\n---------- Remove() --------------------------------\n");
		developer.remove("Pratik");
		System.out.println("If pratik exist as a key it will get deleted\n");
		developer.forEach((k,v)->System.out.println(k+" is a "+v+" Developer"));
		
		System.out.println("\n---------- isEmpty() -------------------------------\n");
		System.out.println(developer.isEmpty());

		
		System.out.println("\n---------- clear() ---------------------------------\n");
		developer.clear();
		System.out.println(developer.isEmpty());
		System.out.println(developer);
	}
}

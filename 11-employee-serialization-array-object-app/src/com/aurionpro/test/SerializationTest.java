package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Employee;

public class SerializationTest {
	public static void main(String[] args) {
		
		Employee[] emplyees = {
				new Employee("Ritesh", 101, 50000),
				new Employee("Ashish", 102, 50000),
				new Employee("Shubham", 103, 50000),
				new Employee("Immanual", 104, 50000),
				new Employee("Harshal", 105, 50000),
				new Employee("Shivam", 101, 50000),
				new Employee("Reena", 106, 50000)
		};
		
		try {
			FileOutputStream file = new FileOutputStream("./lib/text.lib");
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(emplyees);
			
			out.close();
			file.close();
			
			System.out.println("object is serialized");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	

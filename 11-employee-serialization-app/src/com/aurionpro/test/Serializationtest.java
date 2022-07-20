package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Employee;

public class Serializationtest {
	public static void main(String[] args) {
		
		Employee emp = new Employee("Ritesh", 101, 50000);
		
		try {
			FileOutputStream file = new FileOutputStream("./lib/text.lib");
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(emp);
			
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

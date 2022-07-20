 package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.aurionpro.model.Employee;

public class deserializationTest {
	public static void main(String[] args) {
			
		Employee[] employees = null;
		
		try {
			FileInputStream file = new FileInputStream("./lib/text.lib");
			ObjectInputStream in = new ObjectInputStream(file);
			
			employees=(Employee[]) in.readObject();
			
			file.close();
			in.close();
			
			System.out.println("------------- Object deserialized ----------------\n");
			
			for(Employee e: employees) {
				System.out.println(e.toString());
				System.out.println("----------------------------------------");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

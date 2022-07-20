package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.aurionpro.model.Employee;

public class deserializationTest {
	public static void main(String[] args) {
			
		Employee emp = null;
		
		try {
			FileInputStream file = new FileInputStream("./lib/text.lib");
			ObjectInputStream in = new ObjectInputStream(file);
			
			emp=(Employee) in.readObject();
			
			file.close();
			in.close();
			
			System.out.println("deserialized");
			
			System.out.println(emp.toString());
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

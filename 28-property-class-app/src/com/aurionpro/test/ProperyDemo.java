package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ProperyDemo {
	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		try {
			OutputStream os = new FileOutputStream("./lib/idPassword.properties");
			p.setProperty("Ritesh",	"Ritesh@123");
			p.setProperty("Harshal", "Harshal@123");
			p.setProperty("Shivam", "Shivam@123");
			p.setProperty("Ashish", "Ashish@123");
			p.setProperty("Immanuel", "Immanuel@123");
			p.setProperty("Reena", "Reena@123");
			
			p.store(os, "password");
			os.close();
			System.out.println("properties are stored into File");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}

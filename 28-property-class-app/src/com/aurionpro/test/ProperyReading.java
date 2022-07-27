package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;


public class ProperyReading {
	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		try {
			InputStream os = new FileInputStream("./lib/idPassword.properties");
			
			p.load(os);
			
			System.out.println(p.getProperty("Ritesh")+"\n");
			
			p.list(System.out);
			
			System.out.println("\n_____________ Getting Properties ____________\n");
			
			Iterator<Object> it = p.keySet().iterator();
			
			while(it.hasNext()) {
				String key = (String) it.next();
				System.out.println(key+"="+p.getProperty(key));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}

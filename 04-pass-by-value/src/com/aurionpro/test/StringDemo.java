package com.aurionpro.test;

public class StringDemo {
	public static void main(String[] args) {
		
		String str = "Ritesh";
		System.out.println("str1 hash code :" +str.hashCode());
		
		String str2 = "Ritesh";
		String str3 = "Riteshq";
			   str ="Aashish";
		
		System.out.println("str (Harshl) hash code :" +str.hashCode() + " "+ str);
		
		System.out.println("str2 hashcode : "+str3.hashCode());
		
		String name1 = new String("Aashish");
		
		String name2 = new String("Aashish").intern();
		
		
		System.out.println("new String hashcode : "+name1.hashCode());
		System.out.println(name2.hashCode());
		
		if(str2==str3) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}
	
}

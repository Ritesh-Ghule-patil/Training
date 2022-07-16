package com.aurionpro.test;

import com.aurionpro.model.Bmi;
import com.aurionpro.model.GenderOption;
import com.aurionpro.model.Person;

public class PersonTest {
	public static void main(String[] args) {

		Person p1 = new Person("RITESH", 23, 168, 65, GenderOption.MALE);
		System.out.println(p1);


		Person p2 = new Person("Harshal", 22, 166, 60, GenderOption.MALE);
		System.out.println("\n"+p2);

		Bmi bmi = new Bmi(p1);
		
		double bmiValue = bmi.getBmi();
		
		System.out.println("\n"+bmiValue);

		System.out.println("\nBMI Status is : " +bmi.getBodyType());

	}
}

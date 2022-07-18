package com.aurionpro.test;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Developer;
import com.aurionpro.model.Employee;
import com.aurionpro.model.Manager;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee manager = new Manager(101,"Ritesh", 1_50_000);
		manager.printSalarySlip();
		System.out.println("--------------------------------------------");
		
		Employee accountant = new Accountant(102,"Shubham", 80_000);
		accountant.printSalarySlip();
		System.out.println("--------------------------------------------");

		Employee developer = new Developer(103,"Harshal", 1_20_000);
		developer.printSalarySlip();
		
		printSalaryDetail();
	}

	private static void printSalaryDetail() {
		// TODO Auto-generated method stub
		
	}

}
	
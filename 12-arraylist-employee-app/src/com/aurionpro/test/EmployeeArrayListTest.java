package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.aurionpro.model.Employee;

public class EmployeeArrayListTest {
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
		
		List <Employee> employeeList = new ArrayList<Employee>();
//		System.out.println(employeeList.size());
//		for(Employee emp :emplyees) {
//			employeeList.add(emp);
//		}
		
		
		System.out.println("------------- Printing Array List ---------------\n");
		System.out.println(employeeList);
		//System.out.println("-------------------------------------------------");
		
		System.out.println("\n----------- Iterating Array List ----------------");
		
		System.out.println("\n********** 1. Iterating using for Loop **********\n");
		for(int i=0; i<employeeList.size(); i++) {
			System.out.println(employeeList.get(i));
		}
		
		System.out.println("\n******** 2. Iterating using for Each Loop *******\n");
		for(Employee emp : employeeList) {
			System.out.println(emp);
		}
		
		System.out.println("\n********* 3. Iterating using Iterator ***********\n");
		Iterator<Employee> it = employeeList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n********* 3. Iterating using Streams ************\n");
		employeeList.stream().forEach(emp -> System.out.println(emp));
		
		System.out.println("\n-----------Deleing 0 th element from List--------\n");
		//employeeList.remove(0);
		employeeList.stream().forEach(emp->System.out.println(emp));
		
		System.out.println("\n---Does ArrayList Contain Ritesh object or not---\n");
		Boolean res =employeeList.contains(emplyees[0]);
		System.out.println(res);
		
	}
}

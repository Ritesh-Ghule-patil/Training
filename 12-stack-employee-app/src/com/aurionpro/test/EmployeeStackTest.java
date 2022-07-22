package com.aurionpro.test;

import java.util.Iterator;

import java.util.Stack;

import com.aurionpro.model.Employee;

public class EmployeeStackTest {
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
		
		Stack <Employee> employeeStack = new Stack<Employee>();
		System.out.println(employeeStack.size());
		for(Employee emp :emplyees) {
			employeeStack.push(emp);
		}
		
		employeeStack.push(new Employee("Pratik",107,50000));
		
		//employeeStack.remove(0);
		//employeeStack.pop();
		//System.out.println(employeeStack.peek());
		
	
		
		System.out.println("------------- Printing Array List ---------------\n");
		System.out.println(employeeStack);
		
		System.out.println("\n----------- Iterating Array List ----------------");
		
		System.out.println("\n********** 1. Iterating using for Loop **********\n");
		for(int i=0; i<employeeStack.size(); i++) {
			System.out.println(employeeStack.get(i));
		}
		
		System.out.println("\n******** 2. Iterating using for Each Loop *******\n");
		for(Employee emp : employeeStack) {
			System.out.println(emp);
		}
		
		System.out.println("\n********* 3. Iterating using Iterator ***********\n");
		Iterator<Employee> it = employeeStack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n********* 4. Iterating using Streams ************\n");
		employeeStack.stream().forEach(emp -> System.out.println(emp));
		
		System.out.println("\n--------- 5. Popping the element from List ------\n");
		employeeStack.pop();
		employeeStack.stream().forEach(emp->System.out.println(emp));
		
		System.out.println("\n--- 6. Searching the element and return index ---\n");
//		Boolean res =employeeStack.contains(emplyees[0]);
		int res =employeeStack.search(emplyees[0]);
		
		System.out.println(res);
		
		
		
	}
}

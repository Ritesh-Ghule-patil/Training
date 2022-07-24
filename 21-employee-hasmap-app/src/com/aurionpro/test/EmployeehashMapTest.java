package com.aurionpro.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.aurionpro.model.Employee;

public class EmployeehashMapTest {

	public static void main(String[] args) {

		Employee[] employees = { new Employee(101, "Ritesh", 30000), 
				new Employee(102, "Ashish", 30000),
				new Employee(103, "Harshal", 30000), 
				new Employee(101, "Reena", 30000) };

		HashMap<Integer, Employee> employee = new HashMap<>();

		for (Employee e : employees) {
			employee.put(e.getEmployeeNumber(), e);
		}

		Iterator<Map.Entry<Integer, Employee>> it = employee.entrySet().iterator();

		while (it.hasNext()) {
			Entry<Integer, Employee> entry = it.next();
			System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());
		}

	}

}

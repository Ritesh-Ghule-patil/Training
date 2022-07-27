package com.aurionpro.test;

import java.time.LocalDate;
import java.time.Month;

import com.aurionpro.model.Employee2;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee2[] employees = { new Employee2(101, "Ritesh", 50000, LocalDate.of(2022, Month.JUNE, 15)),
				new Employee2(102, "Ashish", 50000, LocalDate.of(2022, Month.JUNE, 10)),
				new Employee2(103, "Shubham", 50000, LocalDate.of(2022, Month.JUNE, 10)),
				new Employee2(104, "Shivam", 50000, LocalDate.of(2022, Month.JUNE, 10)),
				new Employee2(105, "Reena", 50000, LocalDate.of(2022, Month.JUNE, 10)),
				new Employee2(106, "Reena", 50000, LocalDate.of(2022, Month.JUNE, 10)),
				new Employee2(107, "Immanual", 50000, LocalDate.of(2022, Month.JUNE, 10)),
				new Employee2(104, "Pratik", 50000, LocalDate.of(2022, Month.JUNE, 20)) };

		for (Employee2 employee : employees) {
			printDetail(employee);
		}

	}

	private static void printDetail(Employee2 employee) {
		System.out.println();
		System.out.println("id : " + employee.getId());
		System.out.println("Name : " + employee.getName());
		System.out.println("Salary : " + employee.getSalary());
		System.out.println("Date of joining: " + employee.getDateOfJoining());
		System.out.println("_________________________________________________");
	}
}

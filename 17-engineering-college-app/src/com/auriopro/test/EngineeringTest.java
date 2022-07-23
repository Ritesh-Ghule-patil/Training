package com.auriopro.test;

import com.auriopro.module.BranchType;
import com.auriopro.module.Professor;
import com.auriopro.module.Student;

public class EngineeringTest {
	public static void main(String[] args) {

		System.out.println("********* Students ***********");

		Student[] students = { new Student(1, "Jalgaon", "20-09-1998", BranchType.CS),
				new Student(2, "Mumbai", "10-10-1999", BranchType.IT),
				new Student(3, "Pune", "12-08-1998", BranchType.ENTC),
				new Student(2, "Surat", "1-1-1999", BranchType.CIVIL) };

		for (Student student : students) {
			student.getDetail();
		}

		System.out.println("********* Professors **********");

		Professor[] professors = { new Professor(101, "Navi-Mumbai", "12-08-1980", 1_20_000),
				new Professor(102, "Andheri", "10-05-1984", 1_10_000),
				new Professor(103, "Dadar", "10-05-1986", 1_00_000)

		};

		for (Professor professor : professors) {
			professor.getDetail();
		}

	}

}

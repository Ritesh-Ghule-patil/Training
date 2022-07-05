package com.aurionpro.test;

public class UpdateMarks {
	public static void main(String[] args) {
		
		int marks[] = {80,90,87,76,80,90};
		System.out.print("Value Before upadate : ");
		for(int i=0; i<marks.length; i++) {
			System.out.print(marks[i]+ " ");
		}
		System.out.println("\n");
		
		updateMarksToZero(marks);
		
		System.out.print("Value After upadate : ");
		for(int i=0; i<marks.length; i++) {
			System.out.print(marks[i]+ "  ");
		}
		
	}
	public static void updateMarksToZero(int[] marks) {
		
		for(int i=0; i<marks.length; i++)
		{
			marks[i] = 0;
		}
		
	}
}

package com.student.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class StudentDao {
	public static boolean insert(Student st)
	{
		boolean f= false;
		try 
		{
			Connection con =CP.createC();
			
			String query = "insert into student(name, dob, doj) values(?,?,?)";
			
			PreparedStatement pstm = con.prepareStatement(query);
			
			
			pstm.setString(1,st.getStudent_name());
			pstm.setString(2, st.getStudent_dob());
			pstm.setString(3, st.getStudent_doj());
		
			//excecute
			pstm.executeUpdate();
			f=true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f; 
	}

	public static boolean delete(int id) {

		boolean f= false;
		try 
		{
			Connection con =CP.createC();
			
			String query = "delete from student where no=?";
			
			PreparedStatement pstm = con.prepareStatement(query);
			
			
			pstm.setInt(1, id);
			
		
			//excecute
			pstm.executeUpdate();
			f=true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}

	public static void display() {
		 
		boolean f= false;
		try 
		{
			Connection con =CP.createC();
			
			String query = "select * from student;";
			
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery(query);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String dob = set.getString(3);
				String doj = set.getString(4);
				
				System.out.println("Student_no : "+ id);
				System.out.println("Student_name : "+ name);
				System.out.println("Student_dob : "+ dob);
				System.out.println("Student_doj : "+ doj);
				System.out.println("---------------------------------");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

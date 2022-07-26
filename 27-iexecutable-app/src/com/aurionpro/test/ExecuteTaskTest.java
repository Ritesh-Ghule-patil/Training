package com.aurionpro.test;

import com.aurionpro.model.ExecuteTask;
import com.aurionpro.model.IExecutable;

public class ExecuteTaskTest {
	public static void main(String[] args) {

		ExecuteTask task = new ExecuteTask();
		task.execute("task1");

		IExecutable ex = new IExecutable() {
			@Override
			public void execute(String msg) {
				System.out.println("Ananymous class " + msg);

			}
		};
		
		ex.execute("task2");

		IExecutable ex1 = (msg) -> {
			System.out.println("Lamda Excecuting " + msg);
		};

		ex1.execute("Task3");

		IExecutable ex2 = ExecuteTaskTest::showMessage; // Static reference
		// its signature requires same as interfece methos name can be different
		ex2.execute("Ritesh");

	}

	public static void showMessage(String msg) {
		System.out.println("hello " + msg);

	}
}

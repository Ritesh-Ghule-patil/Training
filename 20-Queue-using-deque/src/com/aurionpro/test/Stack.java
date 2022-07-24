package com.aurionpro.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
	Deque<Integer> deque = new ArrayDeque<>();

	public static void main(String[] args) {

		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);

		System.out.println(s.toString());

		s.push(40);
		s.push(50);

		System.out.println(s.toString());

		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();

	}

	private void pop() {
		if(deque.isEmpty()) {
			System.out.println("Stack is Empty");
			
		}
		else{
			System.out.println(deque.pollLast());

		}
	}

	public void push(int element) {
		deque.addLast(element);
	}
	
	

	@Override
	public String toString() {
		return "Stack [deque=" + deque + "]";
	}
}

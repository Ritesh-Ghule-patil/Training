package com.aurionpro.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {
	Deque<Integer> deque = new ArrayDeque<>();

	public static void main(String[] args) {
		
		System.out.println("Enter 1. to push");


		Queue s = new Queue();
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
		if (deque.isEmpty()) {
			System.out.println("Queue is Empty");

		} else {
			System.out.println(deque.pollFirst());

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

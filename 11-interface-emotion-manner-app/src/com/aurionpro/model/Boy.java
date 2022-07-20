package com.aurionpro.model;

public class Boy implements IMannerable {

	@Override
	public void greet() {
		System.out.println("Boy is Greeting : Good Morning");
	}

	@Override
	public void depart() {
		System.out.println("Boy is saying Bye-Bye");

	}

}

package com.aurionpro.model;

public class Man implements IMannerable, IEmotionable {

	@Override
	public void cry() {
		System.out.println("man is saying crying");
	}

	@Override
	public void laugh() {
		System.out.println("man is saying laughing");
	}

	@Override
	public void greet() {
		System.out.println("Man is Greeting : Good Morning");

	}

	@Override
	public void depart() {
		System.out.println("man is saying Bye-Bye");

	}

}

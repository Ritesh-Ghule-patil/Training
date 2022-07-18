package com.aurionpro.model;

public class Kid extends Man {
	@Override
	public void play() {
		System.out.println("Kid is Playing");
	}
	@Override
	public void read() {
		System.out.println("Kid is Reading");
	}
}

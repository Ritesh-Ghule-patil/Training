package com.aurionpro.model;

public class FixedDeposit {
	private String name;
	private double principle;
	private int duration;
	private IInterest interest;

	public FixedDeposit(String name, double principle, int duration, IInterest festival) {
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.interest = festival;
	}

	public String getName() {
		return name;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getDuration() {
		return duration;
	}

	public double getTotal() {
		return principle+calculateSimleInterest();
	}
	
	public double calculateSimleInterest() {
		return (principle*interest.getinterest()*duration)/100;
	}

}

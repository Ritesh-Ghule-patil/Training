package com.aurionpro.model;

public class FixedDeposit {
	private String name;
	private double principle;
	private int duration;
	private FestivalType festival;

	public FixedDeposit(String name, double principle, int duration, FestivalType festival) {
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
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

	public FestivalType getFestival() {
		return festival;
	}
	
	public double getInterestrate() {
		
		if(festival==festival.DIWALI) {
			return 7.5;
		}
		if(festival==festival.CHRISTMAS) {
			return 8;
		}
		if(festival==festival.EID) {
			return 8.5;
		}
		if(festival==festival.NEWYEAR) {
			return 9;
		}
		return 6;
	}
	
	public double calculateSimleInterest() {
		return (principle*getInterestrate()*duration)/100;
	}

}

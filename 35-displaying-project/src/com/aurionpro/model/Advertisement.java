package com.aurionpro.model;

public class Advertisement {
	
	IDisplayable device;

	public void setDevise(IDisplayable device) {
		this.device = device;
	}
	
	public void showAdvertisement() {
		device.display();
	}
}

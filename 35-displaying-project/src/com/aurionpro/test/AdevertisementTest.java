package com.aurionpro.test;

import com.aurionpro.model.Advertisement;
import com.aurionpro.model.IDisplayable;
import com.aurionpro.model.Monitor;
import com.aurionpro.model.Projector;
import com.aurionpro.model.Television;

public class AdevertisementTest {
	public static void main(String[] args) {
		
		Advertisement advertise = new Advertisement();

		IDisplayable monitor = new Monitor();
		advertise.setDevise(monitor);
		advertise.showAdvertisement();
		System.out.println();
		
		IDisplayable tv = new Television();
		advertise.setDevise(tv);
		advertise.showAdvertisement();
		System.out.println();
		
		IDisplayable project = new Projector();
		advertise.setDevise(project);
		advertise.showAdvertisement();
		
		
		
			
	}

//	private static void adevertisement(IDisplayable device) {
//		device.display();
//		
//	}

}

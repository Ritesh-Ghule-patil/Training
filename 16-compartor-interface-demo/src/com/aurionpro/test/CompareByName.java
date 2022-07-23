package com.aurionpro.test;

import java.util.Comparator;

import com.aurionpro.model.AurionproTrainee;

public class CompareByName implements Comparator<AurionproTrainee> {
	public int compare(AurionproTrainee o1, AurionproTrainee o2) {
		
		return o1.getName().compareTo(o2.getName());
		
//		if(o1.getRating()>o2.getRating()) {
//			return 1;
//		}
//		return -1;
	}
	
}

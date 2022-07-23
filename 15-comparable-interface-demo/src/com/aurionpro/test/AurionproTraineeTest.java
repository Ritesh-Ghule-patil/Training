package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;

import com.aurionpro.model.AurionproTrainee;

public class AurionproTraineeTest {

	public static void main(String[] args) {
		ArrayList<AurionproTrainee> trainees = new ArrayList<>();
		trainees.add(new AurionproTrainee(1,"Ritesh Ghule",8.14));
		trainees.add(new AurionproTrainee(2,"Ashish Kokane",8.33));
		trainees.add(new AurionproTrainee(3,"Immanuel Ganadurai",7.81));
		trainees.add(new AurionproTrainee(4,"Shivam Singh",7.81));
		trainees.add(new AurionproTrainee(5,"Shubham Gupta",8.14));
		trainees.add(new AurionproTrainee(6,"Ritesh Guntuka",8.14));
		trainees.add(new AurionproTrainee(7,"Rizwan Siddiqui",8));
		trainees.add(new AurionproTrainee(8,"Pratik Poojari",6.52));
		trainees.add(new AurionproTrainee(9,"Reena Kaithwar",7.38));
		trainees.add(new AurionproTrainee(10,"Harshal dandale",7.76));
		
		for(AurionproTrainee trainee : trainees) {
			System.out.println(trainee);
			System.out.println();
			//System.out.println("--------------------------------------------------------------");
		}
		
			System.out.println("\n****************** After Sorting object *********************\n");
		Collections.sort(trainees);
		
		for(AurionproTrainee trainee : trainees) {
			System.out.println(trainee);
			System.out.println();
			//System.out.println("--------------------------------------------------------------");
		}
		
		
		
	}

}

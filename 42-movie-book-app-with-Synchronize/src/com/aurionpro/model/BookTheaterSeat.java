package com.aurionpro.model;

public class BookTheaterSeat {
	
		int totalSeat = 10;
		synchronized public void bookSeats(int seats) {
			
			if(seats <= totalSeat) {
				System.out.println(seats +" Seats Booked Successfully...");
				totalSeat -= seats;
				System.out.println(totalSeat +" Seats Are Availables...");
				
			}
			else {
				System.out.println("Sorry Seats can not booked...!!!");
				System.out.println("Seats Left : "+ totalSeat);
			}
		}
	
}		

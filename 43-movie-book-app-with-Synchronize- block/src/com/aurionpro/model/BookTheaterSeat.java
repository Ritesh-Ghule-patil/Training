package com.aurionpro.model;

public class BookTheaterSeat {

	int totalSeat = 10;

	public void bookSeats(int seats) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Task -> " + i + " is completaed");
		}

		synchronized (this) {
			if (seats <= totalSeat) {
				System.out.println("\n"+seats + " Seats Booked Successfully...");
				totalSeat -= seats;
				System.out.println(totalSeat + " Seats Are Availables...\n");

			} else {
				System.out.println("\nSorry Seats can not booked...!!!");
				System.out.println("Seats Left : " + totalSeat+"\n");
			}
		}

		for (int i = 12; i <= 20; i++) {
			System.out.println("Task -> " + i + " is completaed");
		}
	}

}

package com.aurionpro.model;

public class MovieBookApp extends Thread {
	
	static BookTheaterSeat book ;
	private int seats;
	
	public static void setBook(BookTheaterSeat book) {
		MovieBookApp.book = book;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void run() {
		
		book.bookSeats(seats);
	}

}

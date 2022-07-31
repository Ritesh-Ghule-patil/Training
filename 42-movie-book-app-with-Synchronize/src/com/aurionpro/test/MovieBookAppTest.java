package com.aurionpro.test;

import com.aurionpro.model.BookTheaterSeat;
import com.aurionpro.model.MovieBookApp;

public class MovieBookAppTest {
	public static void main(String[] args) {
		
		BookTheaterSeat book = new BookTheaterSeat();
		MovieBookApp.setBook(book);
		
		MovieBookApp book1 = new MovieBookApp();
		book1.start();
		
		book1.setSeats(7);
		
		MovieBookApp book2 = new MovieBookApp();
		book2.start();
		book2.setSeats(2);
		
		MovieBookApp book3 = new MovieBookApp();
		book3.start();
		book3.setSeats(8);
		
		
	}
}

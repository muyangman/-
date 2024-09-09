package com.refactor.practice;

public class Rental {
	private Movie _movie;
	private int _dayRented;
	public Rental(Movie movie, int dayRented) {
		_movie = movie;
		_dayRented = dayRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	public int getDayRented() {
		return _dayRented;
	}

	public int getFrequentRenterPoints() {
		if((_movie.getPriceCode() == Movie.NEW_RELEASE) &&
				_dayRented > 1){
			return 2;
		}else {
			return 1;
		}
	}

	public double getCharge() {
		return _movie.getCharge(_dayRented);
	}

}

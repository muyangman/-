package com.refactor.practice;

public class Movie {

	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;
	private String _title;
	private int _priceCode;

	public Movie(String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
	}

	public String getTitle() {
		return _title;
	}

	public int getPriceCode() {
		return _priceCode;
	}

	public void setPriceCode(int _priceCode) {
		this._priceCode = _priceCode;
	}

	public double getCharge(int daysRented) {
		double result = 0;
		switch (getPriceCode()) {
			case Movie.REGULAR:
				result += 2;
				if (daysRented > 2) {
					result += (daysRented - 2) * 1.5;
				}
				break;
			case Movie.NEW_RELEASE:
				result += daysRented;
				break;
			case Movie.CHILDRENS:
				result += 1.5;
				if (daysRented > 3) {
					result += (daysRented - 3) * 1.5;
				}
				break;
			default:
				break;
		}
		return result;
	}
}

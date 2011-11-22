package com.hnibach.core;

public class Maker {

	private String mName;
	private int mYearFounded;
	private String mCountry;
	private String mCity;

	public void setCity(String city) {
		mCity = city;
	}

	public String getCity() {
		return mCity;
	}

	public void setCountry(String country) {
		mCountry = country;
	}

	public String getCountry() {
		return mCountry;
	}

	public void setYearFounded(int yearFounded) {
		mYearFounded = yearFounded;
	}

	public int getYearFounded() {
		return mYearFounded;
	}

	public void setName(String name) {
		mName = name;
	}

	public String getName() {
		return mName;
	}

}

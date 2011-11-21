package com.hnibach.core;

public class Nation {

	private String mNationName;

	public Nation(String name) {
		setNationName(name);
	}

	public void setNationName(String nationName) {
		mNationName = nationName;
	}

	public String getNationName() {
		return mNationName;
	}

}

package com.hnibach.core;

public class Watch {

	private String mName;
	private String mModel;
	private int mYear;
	private boolean mLimitedEdition;
	private Maker mMaker;
	private Movement mMovement;
	private boolean mMens;

	public void setName(String name) {
		mName = name;
	}

	public String getName() {
		return mName;
	}

	public void setModel(String model) {
		mModel = model;
	}

	public String getModel() {
		return mModel;
	}

	public void setYear(int year) {
		mYear = year;
	}

	public int getYear() {
		return mYear;
	}

	public void setLimitedEdition(boolean limitedEdition) {
		mLimitedEdition = limitedEdition;
	}

	public boolean isLimitedEdition() {
		return mLimitedEdition;
	}

	public void setMaker(Maker maker) {
		mMaker = maker;
	}

	public Maker getMaker() {
		return mMaker;
	}

	public void setMovement(Movement movement) {
		mMovement = movement;
	}

	public Movement getMovement() {
		return mMovement;
	}

	public void setMens(boolean mens) {
		mMens = mens;
	}

	public boolean isMens() {
		return mMens;
	}

}

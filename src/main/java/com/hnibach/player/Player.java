package com.hnibach.player;

import com.hnibach.core.Person;

public class Player extends Person {

	private final String mFirstName;
	private final String mLastName;

	private SkillSet mSkillSet;
	private MoveSet mMoveSet;

	public Player(String firstName, String lastName) {
		mFirstName = firstName;
		mLastName = lastName;
	}

	public String getFirstName() {
		return mFirstName;
	}

	public String getLastName() {
		return mLastName;
	}

	public void setSkillSet(SkillSet skillSet) {
		mSkillSet = skillSet;
	}

	public SkillSet getSkillSet() {
		return mSkillSet;
	}

	public void setMoveSet(MoveSet moveSet) {
		mMoveSet = moveSet;
	}

	public MoveSet getMoveSet() {
		return mMoveSet;
	}

}

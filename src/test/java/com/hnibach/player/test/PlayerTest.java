package com.hnibach.player.test;

import junit.framework.Assert;

import org.junit.Test;

import com.hnibach.player.Player;

public class PlayerTest {

	private final static String mName = "Stefan";
	private final static String mLastName = "Lövgren";

	@Test
	public void testPlayer() {
		Player p = createDefaultPlayer();
		Assert.assertEquals(p.getFirstName(), mName);
		Assert.assertEquals(p.getLastName(), mLastName);
		boolean value = p.getLastName().equals(mName);
		Assert.assertEquals(false, value);
	}

	private Player createDefaultPlayer() {
		return new Player(mName, mLastName);
	}

}

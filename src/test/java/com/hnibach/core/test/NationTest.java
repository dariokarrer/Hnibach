package com.hnibach.core.test;

import org.junit.Assert;
import org.junit.Test;

import com.hnibach.core.Nation;

public class NationTest {

	private final static String mNationName = "Iceland";

	@Test
	public void testNation() {
		Nation nat = new Nation(mNationName);
		Assert.assertEquals(mNationName, nat.getNationName());
	}

}

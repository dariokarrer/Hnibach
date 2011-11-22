package com.hnibach.core.test;

import junit.framework.Assert;

import org.junit.Test;

import com.hnibach.core.Movement;

public class MovementTest {

	@Test
	public void testMovements() {
		Assert.assertEquals(3, Movement.values().length);
	}

}

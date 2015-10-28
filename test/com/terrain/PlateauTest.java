package com.terrain;

import static org.junit.Assert.*;

import org.junit.Test;

import com.robots.Position;

public class PlateauTest {
	private Plateau SUT;
	
	@Test
	public void testHas() {
		SUT = new Plateau(new Position(0, 0), new Position(2, 2));
		assertFalse(SUT.has(new Position(0,3)));
		assertTrue(SUT.has(new Position(0,2)));
	}
}

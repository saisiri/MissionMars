package com.robots;

import static org.junit.Assert.*;

import org.junit.Test;

public class DirectionTest {
	private Direction SUT;
	
	@Test
	public void testRotateLeft() throws Exception {
		SUT = Direction.N;
		assertEquals(SUT.rotateLeft(), Direction.W);
		SUT = Direction.W;
		assertEquals(SUT.rotateLeft(), Direction.S);
		SUT = Direction.S;
		assertEquals(SUT.rotateLeft(), Direction.E);
		SUT = Direction.E;
		assertEquals(SUT.rotateLeft(), Direction.N);
	}
	
	@Test
	public void testRotateRight() throws Exception {
		SUT = Direction.N;
		assertEquals(SUT.rotateRight(), Direction.E);
		SUT = Direction.E;
		assertEquals(SUT.rotateRight(), Direction.S);
		SUT = Direction.S;
		assertEquals(SUT.rotateRight(), Direction.W);
		SUT = Direction.W;
		assertEquals(SUT.rotateRight(), Direction.N);
	}
}
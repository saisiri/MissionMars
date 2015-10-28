package com.robots;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.terrain.Plateau;

public class RobotManagerTest {

	private RobotManager SUT;
	
	@Before
	public void setUp() {
		 Plateau p = new Plateau(new Position(0, 0), new Position(5, 5));
		 SUT = new RobotManager(p);
	}
	
	@Test
	public void testMove() throws Exception {
		Position init = new Position(1, 2);
		Rover rover = new Rover("test",init , Direction.N);

		SUT.move(rover, Instruction.L);
		assertEquals(init, rover.getPosition());
		assertEquals(Direction.W, rover.getDirection());
		
		Position expected = new Position(0, 2);
		SUT.move(rover, Instruction.M);
		assertEquals(expected, rover.getPosition());
		assertEquals(Direction.W, rover.getDirection());
		
		SUT.move(rover, Instruction.R);
		assertEquals(expected, rover.getPosition());
		assertEquals(Direction.N, rover.getDirection());
	}
	
	@Test(expected = Exception.class)
	public void testMoveThrowsExceptionWhenPositionOutOfBound() throws Exception {
		Position init = new Position(0, 2);
		Rover rover = new Rover("test",init , Direction.W);	
		SUT.move(rover, Instruction.M);
	}
}

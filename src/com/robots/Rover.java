package com.robots;

public class Rover {
	private String name;
	private Position pos;
	private Direction direction;
	
	public Rover(String name, Position position, Direction direction) {
		this.name = name;
		this.pos = position;
		this.direction = direction;
	}

	public String getName() {
		return name;
	}

	public Position getPosition() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}
	
	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
}

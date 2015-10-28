package com.robots;

import com.terrain.Plateau;

public class RobotManager {
	private final Plateau plateau;
	
	public RobotManager(Plateau plateau) {
		this.plateau = plateau;
	}
	
	public void move(Rover rover, Instruction instruction) throws Exception {
		switch (instruction) {
		case L :
			rover.setDirection(rover.getDirection().rotateLeft());
			break;
		case R :
			rover.setDirection(rover.getDirection().rotateRight());
			break;
		case M :
			Position pos = rover.getPosition();
			int newX, newY;
			switch (rover.getDirection()) {
				case N : 
					newX = pos.getX();
					newY = pos.getY() + 1;
					break;
				case E :
					newX = pos.getX() + 1;
					newY = pos.getY();
					break;
				case S :
					newX = pos.getX();
					newY = pos.getY() - 1;
					break;
				case W : 
					newX = pos.getX() - 1;
					newY = pos.getY();
					break;
				default:
					throw new Exception ("unknown direction to move");
			}
			Position newPosition = new Position(newX, newY);
			if (plateau.has(newPosition)) {
				rover.setPos(newPosition);
			} else {
				throw new Exception("can not move. Coordinates out of range");
			}
		}
	}
}

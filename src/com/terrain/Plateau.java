package com.terrain;

import com.robots.Position;

public class Plateau {

	private final Position initialPos;
	private final Position finalPos;
	public Plateau(Position initialPos, Position finalPos) {
		this.initialPos = initialPos;
		this.finalPos = finalPos;
	}
	
	public boolean has(Position pos) {
		int x = pos.getX();
		int y = pos.getY();
		if (x >= initialPos.getX() && x<= finalPos.getX() 
				&& y >= initialPos.getY() && y <= finalPos.getY()) {
			return true;
		}
		return false;
	}
}

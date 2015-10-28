package com.robots;

public enum Direction {
	E(90), W(270), N(0), S(180);
	private int angle;
	private Direction(int angle) {
		this.angle = angle;
	}
	
	private int getAngle() {
		return this.angle;
	}
	
	public Direction rotateLeft() throws Exception {
		int newAngle = (getAngle() + 270) % 360;
		return getByAngle(newAngle);
	}
	
	public Direction rotateRight() throws Exception {
		int newAngle = (getAngle() + 90) % 360;
		return getByAngle(newAngle);
	}
	
	private Direction getByAngle(int angle) throws Exception {
		switch (angle) {
			case 0 : return N;
			case 90 : return E;
			case 180 : return S;
			case 270 : return W;
			default : throw new Exception ("Direction not found for angle " + angle);
		}
	}
}

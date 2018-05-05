package com.here.rover.rover.bean;

public class RoverRestRequest {
	
	private int x;
	private int y;
	private String facing;
	private String commands;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getFacing() {
		return facing;
	}
	public void setFacing(String facing) {
		this.facing = facing;
	}
	public String getCommands() {
		return commands;
	}
	public void setCommands(String commands) {
		this.commands = commands;
	}
}
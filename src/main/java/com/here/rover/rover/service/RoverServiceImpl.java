package com.here.rover.rover.service;

import org.springframework.stereotype.Service;

import com.here.rover.rover.RoverEnum;

@Service
public class RoverServiceImpl implements RoverService{

	Integer x = 0;
	Integer y = 0;
	Integer facing = RoverEnum.N.getKey();

	@Override
	public String processRover(int x, int y, String d, String c) {
		
		RoverServiceImpl rover = new RoverServiceImpl();
		
		if (d.equals(RoverEnum.N.getValue()))
			facing = RoverEnum.N.getKey();
		else if (d.equals(RoverEnum.E.getValue()))
			facing = RoverEnum.E.getKey();
		else if (d.equals(RoverEnum.S.getValue()))
			facing = RoverEnum.S.getKey();
		else if (d.equals(RoverEnum.W.getValue()))
			facing = RoverEnum.W.getKey();
		
		rover.setPosition(x, y, facing);
		rover.process(c);
		return rover.printPosition();
	}
	
	public void setPosition(Integer x, Integer y, Integer facing) {
		this.x = x;
		this.y = y;
		this.facing = facing;
	}
	public String printPosition() {
		char dir = 'N';
		if (facing == 1) {
			dir = 'N';
		} else if (facing == 2) {
			dir = 'E';
		} else if (facing == 3) {
			dir = 'S';
		} else if (facing == 4) {
			dir = 'W';
		}
		System.out.println(x   +" "+   y  + " "+   dir);
		return x.toString()+" "+y.toString()+" "+Character.toString(dir);
		
	}
	public void process(String commands) {
		for (int idx = 0; idx < commands.length(); idx++) {
			process(commands.charAt(idx));
		}
	}
	private void process(Character command) {
		if (command.equals('L')) {
			turnLeft();
		} else if (command.equals('R')) {
			turnRight();
		} else if (command.equals('M')) {
			move();
		} else {
			throw new IllegalArgumentException(
					"Speak in Mars language, please!");
		}
	}
	private void move() {
		if (facing == RoverEnum.N.getKey()) {
			this.y++;
		} else if (facing == RoverEnum.E.getKey()) {
			this.x++;
		} else if (facing == RoverEnum.S.getKey()) {
			this.y--;
		} else if (facing == RoverEnum.W.getKey()) {
			this.x--;
		}
	}
	private void turnLeft() {
		facing = (facing - 1) < RoverEnum.N.getKey() ? RoverEnum.W.getKey() : facing - 1;
	}
	private void turnRight() {
		facing = (facing + 1) > RoverEnum.W.getKey() ? RoverEnum.N.getKey() : facing + 1;
	}
}

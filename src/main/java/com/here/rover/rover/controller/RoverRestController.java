package com.here.rover.rover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.here.rover.rover.service.RoverService;

@RestController
public class RoverRestController {
	
	@Autowired
	private RoverService roverService;
	
	@RequestMapping("/rover/{x}/{y}/{d}/{c}")
	public String getDetails(@PathVariable("x") int x, @PathVariable("y") int y, @PathVariable("d") String d, @PathVariable("c") String c){
		// x -> x-axis value
		// y -> y-axis value
		// d -> direction : N E S W
		// c -> commands : MMRRMMRRLL
		return roverService.processRover(x,y,d,c);
	}
}

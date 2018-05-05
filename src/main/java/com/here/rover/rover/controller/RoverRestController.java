package com.here.rover.rover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.here.rover.rover.bean.RoverRestRequest;
import com.here.rover.rover.bean.RoverRestResponse;
import com.here.rover.rover.service.RoverService;

@RestController
@RequestMapping("/api")
public class RoverRestController {
	
	@Autowired
	private RoverService roverService;
	
	@RequestMapping(value = "/rover", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = "application/json")
	public @ResponseBody RoverRestResponse getDetails(@RequestBody RoverRestRequest restRequest){
		
		return roverService.processRover(restRequest);
	}
}

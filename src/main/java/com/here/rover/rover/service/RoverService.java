package com.here.rover.rover.service;

import com.here.rover.rover.bean.RoverRestRequest;
import com.here.rover.rover.bean.RoverRestResponse;

public interface RoverService {
	
	public RoverRestResponse processRover(RoverRestRequest restRequest);

}

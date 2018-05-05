package com.here.rover.rover;

public enum RoverEnum {
	
	N(1, "N"), E(2, "E"), S(3, "S"), W(4, "W");
	
	private final Integer key;
	private final String value;
	
	RoverEnum(Integer key, String value){
		this.key = key;
		this.value = value;
	}
	
	public Integer getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
}

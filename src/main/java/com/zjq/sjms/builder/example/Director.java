package com.zjq.sjms.builder.example;

public class Director {
	
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.buildPart();
	}
	

}

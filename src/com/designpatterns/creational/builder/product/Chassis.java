package com.designpatterns.creational.builder.product;

public enum Chassis {
	SEDAN("Sedan"), HATCHBACK("Hatchback"), STATIONWAGON("Station Wagon"), SUV ("SUV");
	private String description;
	private Chassis( String description ) {
		this.description = description;
	}
	public String getDescription() { return description; }
}

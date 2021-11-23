package com.designpatterns.creational.builder.product;

public enum FuelType {
	PETROLEUM("Petroleum"), DIESEL("Diesel"), LPG("LPG"), ELECTRIC("Electric");
	private String description;
	private FuelType( String description ) {
		this.description = description;
	}
	public String getDescription() { return description; }
}

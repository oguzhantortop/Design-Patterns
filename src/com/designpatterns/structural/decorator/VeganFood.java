package com.designpatterns.structural.decorator;

public class VeganFood implements Food {

	@Override
	public String getFoodName() {
		return "vegan food";
	}

	@Override
	public double getFoodPrice() {
		return 9.95;
	}

}

package com.designpatterns.structural.decorator;

public abstract class FoodDecorator implements Food {
	protected Food food;
	
	public FoodDecorator(Food food) {
		this.food = food;
	}
	
	public abstract String getFoodName();
	public abstract double getFoodPrice();
	
}

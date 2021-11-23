package com.designpatterns.structural.decorator;

public class CurryDecorator extends FoodDecorator {

	public CurryDecorator(Food food) {
		super(food);
	}

	@Override
	public String getFoodName() {
		return this.food.getFoodName()+" with curry";
	}

	@Override
	public double getFoodPrice() {
		return this.food.getFoodPrice()+3.5;
	}

}

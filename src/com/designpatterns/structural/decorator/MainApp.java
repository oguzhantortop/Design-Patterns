package com.designpatterns.structural.decorator;

public class MainApp {

	public static void main(String[] args) {
		Food veganFood = new VeganFood();
		Food veganFoodWithCurry = new CurryDecorator(veganFood);
		System.out.println(veganFoodWithCurry.getFoodName()+" price is: "+veganFoodWithCurry.getFoodPrice());
	}

}

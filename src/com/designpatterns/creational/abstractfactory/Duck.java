package com.designpatterns.creational.abstractfactory;

public class Duck implements Animal {

	@Override
	public String makeSound() {
		return "Vack vack";
	}

	@Override
	public String getType() {
		return "Duck";
	}

}

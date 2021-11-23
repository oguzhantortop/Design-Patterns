package com.designpatterns.creational.abstractfactory;

public class Cow implements Animal {

	@Override
	public String makeSound() {
		return "mööööö";
	}

	@Override
	public String getType() {
		return "Cow";
	}

}

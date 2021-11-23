package com.designpatterns.creational.abstractfactory;

public class Dog implements Animal {

	@Override
	public String makeSound() {
		return "havhav";
	}

	@Override
	public String getType() {
		return "Dog";
	}

}

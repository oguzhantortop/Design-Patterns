package com.designpatterns.creational.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal> {

	@Override
	public Animal create(String type) {
		if(type.equalsIgnoreCase("dog")) {
			System.out.println("created dog animal");
			return new Dog();
		} else if(type.equalsIgnoreCase("duck")) {
			System.out.println("created duck animal");
			return new Duck();
		} else if(type.equalsIgnoreCase("cow")) {
			System.out.println("created cow animal");
			return new Cow();
		} 
		return null;
	}

}

package com.designpatterns.creational.abstractfactory;

public class Client {

	public static void main(String[] args) {
		AbstractFactory<Animal> animalFactory = FactoryProvider.getFactory("animal");
		Animal dog = animalFactory.create("dog");
		System.out.println(dog.makeSound());
		System.out.println(dog.getType());
		Animal cow = animalFactory.create("cow");
		System.out.println(cow.makeSound());
		System.out.println(cow.getType());
		
		
		AbstractFactory<Color> colorFactory = FactoryProvider.getFactory("color");
		Color yellow = colorFactory.create("yellow");
		System.out.println(yellow.getName());
		
	}

}

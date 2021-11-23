package com.designpatterns.creational.abstractfactory;

public class FactoryProvider {
	
	private final static String  ANIMAL ="animal";
	private final static String  COLOR ="color";

	public static AbstractFactory getFactory(String factoryType) {
		if(factoryType.equalsIgnoreCase(ANIMAL) ) {
			return new AnimalFactory();
		} else if(factoryType.equalsIgnoreCase(COLOR)) {
			return new ColorFactory();
		}
		return null;
	}

}

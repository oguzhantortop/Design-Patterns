package com.designpatterns.creational.abstractfactory;

public class ColorFactory implements AbstractFactory<Color> {

	@Override
	public Color create(String type) {
		if(type.equalsIgnoreCase("brown")) {
			System.out.println("created brown color");
			return new Brown();
		} else if(type.equalsIgnoreCase("yellow")) {
			System.out.println("created yellow color");
			return new Yellow();
		} 
		return null;
	}

}

package com.designpatterns.creational.factory;

public class PolygonFactory {

	public static Polygon getPolygon(String type) {
		if(type.equalsIgnoreCase("square")) {
			System.out.println("square created");
			return new Square();
		} else if(type.equalsIgnoreCase("circle")) {
			System.out.println("circle created");
			return new Circle();
		}  
		return null;
	}

}

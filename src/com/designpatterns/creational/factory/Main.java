package com.designpatterns.creational.factory;

public class Main {

	public static void main(String[] args) {
		Polygon square = PolygonFactory.getPolygon("square");
		System.out.println(square.getPolygonType());
		Polygon circle = PolygonFactory.getPolygon("circle");
		System.out.println(circle.getPolygonType());
	}

}

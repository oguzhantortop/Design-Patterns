package com.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	public static Map<String,Circle> cache = new HashMap<>();
	
	
	public static Shape getCircle(String color) {
		if(!cache.containsKey(color)) {
			Circle c = new Circle(color);
			cache.put(color, c);
		}
		return cache.get(color);
	}
	
}

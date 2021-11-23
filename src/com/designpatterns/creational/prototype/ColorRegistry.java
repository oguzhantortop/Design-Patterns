package com.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorRegistry {
	private static Map<String, Color> colorMap = new HashMap<>();
	
	public static void registerColor(Color color) {
		colorMap.put(color.getColorName(), color);
	}
	
	public static Color getColor(String colorName) {
		if(colorMap.containsKey(colorName))
			return colorMap.get(colorName);
		return null;
	}
	
}

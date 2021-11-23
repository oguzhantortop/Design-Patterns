package com.designpatterns.creational.prototype;

import java.util.Calendar;

public class MainApp {

	public static void main(String[] args) {
		Color purple = new Purple("purple", "#800080",Calendar.getInstance().getTime());
		System.out.println("Origin color name: "+purple.getColorName()+" creation date: "+ purple.getCreationDate()+" hashCode: "+purple.hashCode());
		ColorRegistry.registerColor(purple);
		Color purpleColorFromRegistry = ColorRegistry.getColor("purple");
		Color clonedPurple = purpleColorFromRegistry.clone();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 1);
		clonedPurple.setCreationDate(calendar.getTime());
		System.out.println("Cloned color name: "+clonedPurple.getColorName()+" creation date: "+ clonedPurple.getCreationDate()+" hashCode: "+clonedPurple.hashCode());

	}

}

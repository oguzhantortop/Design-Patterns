package com.designpatterns.creational.prototype;

import java.util.Date;

public class Green extends Color {

	public Green(String colorName, String rgbCode,Date creationDate) {
		super(colorName, rgbCode,creationDate);
	}

	@Override
	public Color clone() {
		return new Green(colorName,rgbCode,creationDate);
	}

}

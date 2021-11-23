package com.designpatterns.creational.prototype;

import java.util.Date;

public class Purple extends Color {
	
	public Purple(String colorName, String rgbCode,Date creationDate) {
		super(colorName, rgbCode, creationDate);
	}
	

	@Override
	public Color clone() {
		return new Purple(colorName,rgbCode,creationDate);
	}

}

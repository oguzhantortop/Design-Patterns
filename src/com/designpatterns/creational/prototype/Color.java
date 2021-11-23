package com.designpatterns.creational.prototype;

import java.util.Date;

public abstract class Color {
	
	protected String colorName;
	protected String rgbCode;
	protected Date creationDate;
	
	public abstract Color clone();
	
	public Color(String colorName, String rgbCode,Date creationDate) {
		this.colorName = colorName;
		this.rgbCode = rgbCode;
		this.creationDate = creationDate;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getRgbCode() {
		return rgbCode;
	}

	public void setRgbCode(String rgbCode) {
		this.rgbCode = rgbCode;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
	
	
}

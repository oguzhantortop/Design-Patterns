package com.designpatterns.structural.bridge;

public abstract class Shape {
	protected DrawAPI drawAPI;
	
	public Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	
	public abstract void drawShape();
	
	
}

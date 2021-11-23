package com.designpatterns.structural.facade;

public class ShapeMakerFacade {
	Shape circle;
	Shape square;
	
	public ShapeMakerFacade() {
		this.circle = new Circle();
		this.square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
	
}

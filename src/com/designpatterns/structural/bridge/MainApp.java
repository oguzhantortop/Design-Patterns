package com.designpatterns.structural.bridge;

public class MainApp {

	public  static void main(String[] args) {
		Circle gc = new Circle(5, 0, 0, new GreenCircle());
		gc.drawShape();
		Circle rc = new Circle(5, 0, 0, new RedCircle());
		rc.drawShape();
	}
	
	
}

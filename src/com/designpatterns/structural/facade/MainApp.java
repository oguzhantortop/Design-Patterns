package com.designpatterns.structural.facade;

public class MainApp {
	public static void main(String[] args) {
		ShapeMakerFacade s = new ShapeMakerFacade();
		s.drawCircle();
		s.drawSquare();
	}
}

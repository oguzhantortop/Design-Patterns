package com.designpatterns.structural.adapter;

public class Square implements Pollygon {

	private int x;
	private int y;


	public Square(int x, int y) {
		this.x = x;
		this.y =y;
	}
	
	
	@Override
	public double getArea() {
		return  x*y;
	}

}

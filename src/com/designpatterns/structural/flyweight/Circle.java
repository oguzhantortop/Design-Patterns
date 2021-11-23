package com.designpatterns.structural.flyweight;

public class Circle implements Shape {

	
	private int radius;
	private int x;
	private int y;
	private String color;

	public Circle(String color) {
		this.color = color;
	}
	
	
	
	
	public int getRadius() {
		return radius;
	}




	public void setRadius(int radius) {
		this.radius = radius;
	}




	public int getX() {
		return x;
	}




	public void setX(int x) {
		this.x = x;
	}




	public int getY() {
		return y;
	}




	public void setY(int y) {
		this.y = y;
	}




	@Override
	public void draw() {
		System.out.println(String.format("radius %d coordinate (%d,%d) color %s", radius,x,y,color) );
	}

}

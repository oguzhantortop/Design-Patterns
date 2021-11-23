package com.designpatterns.structural.adapter;

public class CircleAdaptee {
	private int r;
	
	public CircleAdaptee(int r) {
		this.r = r;
	}
	
	public double calcArea() {
		System.out.println("adaptee is actually calculating the area");
		return r*r*3.14;
	}
	
}

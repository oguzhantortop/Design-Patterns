package com.designpatterns.structural.adapter;

public class CircleAdaptor implements Pollygon {
	
	private CircleAdaptee ca;
	
	public CircleAdaptor(int r) {
		ca =  new CircleAdaptee(r);
	}
	
	
	@Override
	public double getArea() {
		System.out.println("calling adaptee class calcArea method we are in CircleAdapter class's getArea method");
		return ca.calcArea();
	}

}

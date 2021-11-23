package com.designpatterns.structural.adapter;

public class MainApp {

	public static void main(String[] args) {
		Pollygon p = new CircleAdaptor(5);
		System.out.println(p.getArea());

	}

}

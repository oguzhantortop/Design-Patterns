package com.designpatterns.structural.proxy;

public class RealImage implements Image {

	@Override
	public void draw() {
		System.out.println("This is real image");

	}

}

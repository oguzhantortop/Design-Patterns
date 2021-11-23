package com.designpatterns.structural.bridge;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println(String.format("Drawing green circle radius is %d , coordinates are (%d,%d)",radius,x,y));
	}

}

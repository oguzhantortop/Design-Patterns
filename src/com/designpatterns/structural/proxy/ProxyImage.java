package com.designpatterns.structural.proxy;

public class ProxyImage implements Image {
	RealImage r;
	
	
	@Override
	public void draw() {
		if(r==null)
			r= new RealImage();
		r.draw();
	}

}

package com.designpatterns.behavioral.observer;

public class MainApp {
	
	public static void main(String[] args) {
		Subject s = new Subject();
		Observer observer = new IntegerObserver(s);
		s.setState(5);
		s.setState(99);
	}
	
	
}

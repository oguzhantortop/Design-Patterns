package com.designpatterns.behavioral.memento;

public class MainApp {

	public static void main(String[] args) {
		CareTaker ct = new CareTaker();
		
		Originator o1 = new Originator();
		o1.setState("#1");
		System.out.println(o1.getState());
		ct.add(o1.setStateToMemento());
		o1.setState("#2");
		System.out.println(o1.getState());
		ct.add(o1.setStateToMemento());
		o1.getStateFromMemento(ct.get(0));
		System.out.println(o1.getState());
	}

}

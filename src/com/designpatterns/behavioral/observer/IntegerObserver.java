package com.designpatterns.behavioral.observer;

public class IntegerObserver extends Observer {



	public IntegerObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
		
	}
	
	
	@Override
	public void update() {
		System.out.println(this.subject.getState());

	}

}

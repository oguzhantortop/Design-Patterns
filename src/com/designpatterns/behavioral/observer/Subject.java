package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	List<Observer> observerList = new ArrayList<>();
	int state = 0;
	
	public void setState(int state) {
		this.state =state;
		notifyAllObservers();
	}
	
	public int getState() {
		return state;
	}
	
	public void attach(Observer o) {
		observerList.add(o);
	}
	
	public void notifyAllObservers() {
		for (Observer observer : observerList) {
			observer.update();
		}
	}
	
	
}

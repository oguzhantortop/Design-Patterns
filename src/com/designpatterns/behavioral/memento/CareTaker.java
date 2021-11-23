package com.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	List<Memento> list = new ArrayList<>();
	
	public void add(Memento memento) {
		list.add(memento);
	}
	
	public Memento get(int index) {
		if(list.size()>index)
			return list.get(index);
		else
			return null;
	}
}

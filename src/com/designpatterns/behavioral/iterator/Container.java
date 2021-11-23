package com.designpatterns.behavioral.iterator;

public interface Container<T> {
	public Iterator<T> getIterator();
}

package com.designpatterns.behavioral.iterator;

public interface Iterator<T> {
	public boolean hasNext();
	public T getNext();
}

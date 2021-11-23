package com.designpatterns.creational.abstractfactory;

public interface AbstractFactory<T> {
	public T create(String type); 
}

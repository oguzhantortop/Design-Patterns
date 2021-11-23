package com.designpatterns.behavioral.iterator;

public class MainApp {

	public static void main(String[] args) {
		NameRepository nr = new NameRepository();
		Iterator<String> iter = nr.getIterator();
		while(iter.hasNext()) {
			System.out.println(iter.getNext());
		}

	}

}

package com.designpatterns.behavioral.chainofresponsibility;

public class ConsoleLogger extends AbstractLogger {

	@Override
	public void write(String msg) {
		System.out.println("ConsoleLogger: "+msg);
	}
	
	public ConsoleLogger(int level) {
		this.level = level;
	}

}

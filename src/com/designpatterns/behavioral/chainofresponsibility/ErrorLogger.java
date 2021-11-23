package com.designpatterns.behavioral.chainofresponsibility;

public class ErrorLogger extends AbstractLogger {

	@Override
	public void write(String msg) {
		System.out.println("ErrorLogger: "+msg);
	}
	
	public ErrorLogger(int level) {
		this.level = level;
	}

}

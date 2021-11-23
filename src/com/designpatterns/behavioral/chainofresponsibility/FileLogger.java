package com.designpatterns.behavioral.chainofresponsibility;

public class FileLogger extends AbstractLogger {

	@Override
	public void write(String msg) {
		System.out.println("FileLogger: "+msg);
	}
	
	public FileLogger(int level) {
		this.level = level;
	}

}

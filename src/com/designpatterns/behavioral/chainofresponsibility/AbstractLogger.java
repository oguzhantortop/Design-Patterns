package com.designpatterns.behavioral.chainofresponsibility;

public abstract class AbstractLogger {
	public static int INFO =1;
	public static int DEBUG =2;
	public static int ERROR =3;
	
	private AbstractLogger nextLogger;
	
	protected int level;
	
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void logMessage(int logLevel, String msg) {
		if(this.level<= logLevel) {
			write(msg);
		}
		if(null!=this.nextLogger)
			nextLogger.logMessage(logLevel, msg);
	}
	
	public abstract void write(String msg);
	
}

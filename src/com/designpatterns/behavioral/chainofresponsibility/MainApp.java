package com.designpatterns.behavioral.chainofresponsibility;

public class MainApp {

	public static void main(String[] args) {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		errorLogger.logMessage(AbstractLogger.ERROR, "Got an error!");
		
		errorLogger.logMessage(AbstractLogger.INFO, "INFO msg!");

	}

}

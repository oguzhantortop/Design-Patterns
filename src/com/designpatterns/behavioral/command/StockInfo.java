package com.designpatterns.behavioral.command;

public class StockInfo {

	private String stockName;
	private double amount;

	public StockInfo(String stockName, double amount) {
		this.stockName = stockName;
		this.amount = amount;
	}
	
	public void sellStock() {
		System.out.println(amount +" of "+stockName+" has been sold.");
	}
	
	public void buyStock() {
		System.out.println(amount +" of "+stockName+" has been bought.");
	}

}

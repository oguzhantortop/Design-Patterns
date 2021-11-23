package com.designpatterns.behavioral.command;

public class BuyStock implements Order {

	private StockInfo stockInfo;


	public BuyStock(StockInfo stockInfo) {
		this.stockInfo = stockInfo;
	}
	
	
	@Override
	public void execute() {
		stockInfo.buyStock();
	}

}

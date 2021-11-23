package com.designpatterns.behavioral.command;

public class SellStock implements Order {

	
	private StockInfo stockInfo;

	public SellStock(StockInfo stockInfo) {
		this.stockInfo = stockInfo;
	}
	
	@Override
	public void execute() {
		stockInfo.sellStock();
	}

}

package com.designpatterns.behavioral.command;

public class MainApp {

	public static void main(String[] args) {
		Broker b = new Broker();
		
		Order o1 = new SellStock(new StockInfo("YKBNK", 100));
		Order o2 = new BuyStock(new StockInfo("ISCTR", 10));
		
		b.takeOrder(o1);
		b.takeOrder(o2);
		b.placeOrders();
	}

}

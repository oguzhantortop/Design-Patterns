package com.designpatterns.creational.singleton;

public class Main {

	public static void main(String[] args) {
		String googleURL = Configuration.getInstance().getConfigValue("GOOGLE_URL");
		System.out.println(googleURL);
		String yaprak = Configuration.getInstance().getConfigValue("xyz");
		System.out.println(yaprak);
	}

}

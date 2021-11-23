package com.designpatterns.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
	private static Configuration theInstance = null;
	private static Map<String,String> map = new HashMap<>(); 
	
	private Configuration() {
	}
	
	public static Configuration getInstance() {
		if(theInstance == null) {
			theInstance = new Configuration();
			//normalde dosya veya databaseden okunur ama biz hardcoded set ediyoruz
			map.put("GOOGLE_URL", "www.google.com");
			map.put("tubi_iq", "69");
		}
		return theInstance;
	}
	
	public String getConfigValue(String key) {
		if(map.containsKey(key))
			return map.get(key);
		else 
			return null;
		
	}
	
	
}

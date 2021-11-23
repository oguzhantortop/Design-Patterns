package com.designpatterns.creational.builder.product;

public class Transmission {
	private final int gearCount;
	private final boolean isAutomatic;

	public Transmission(int gearCount, boolean isAutomatic) {
		this.gearCount = gearCount;
		this.isAutomatic = isAutomatic;
	}
	public int getGearCount() {
		return gearCount;
	}
	public boolean isAutomatic() {
		return isAutomatic;
	}
	public String toString() {
		String desc = gearCount + " gears ";
		if( isAutomatic )
			desc += " automatic transmission";
		else
			desc += " manual transmission";
		return desc; 
	}
}

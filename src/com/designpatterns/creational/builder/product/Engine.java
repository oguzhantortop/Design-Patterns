package com.designpatterns.creational.builder.product;

public class Engine {
	private FuelType fuel;
	private int volume, power;
	public Engine(FuelType fuel, int volume, int power) {
		this.fuel = fuel;
		this.volume = volume;
		this.power = power;
	}
	public FuelType getFuel() {
		return fuel;
	}
	public int getVolume() {
		return volume;
	}
	public int getPower() {
		return power;
	}
	public void setFuel(FuelType fuel) {
		this.fuel = fuel;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String toString() {
		return fuel.getDescription()+" "+volume+"cc "+power+"HP";
	}

}

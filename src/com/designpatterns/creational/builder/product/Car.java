package com.designpatterns.creational.builder.product;

public class Car {
	private Chassis chassis;
	private Engine engine;
	private Transmission gear;
	private String brand, model;

	public Car(String model) {
		this.model = model;
	}
	public Chassis getChassis() {
		return chassis;
	}
	public void setChassis(Chassis chassis) {
		this.chassis = chassis;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Transmission getGear() {
		return gear;
	}
	public void setGear(Transmission gear) {
		this.gear = gear;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String toString() {
		String description;
		description = "Car: " + brand + " " + model;
		description += " ("+chassis.getDescription() +")\n";
		description += "Engine: " + engine.toString()+"\n";
		description += "Transmission: " + gear.toString()+"\n";
		return description;
	}
}

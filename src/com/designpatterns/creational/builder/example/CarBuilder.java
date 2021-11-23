package com.designpatterns.creational.builder.example;

import com.designpatterns.creational.builder.product.Car;

public abstract class CarBuilder {
	private Car product;
	public CarBuilder( String carModel ) {
		product = new Car(carModel);
	}
	public Car getResult() {
		if( product == null )
			return null;
		Car clone = new Car(product.getModel());
		clone.setBrand(product.getBrand());
		clone.setChassis(product.getChassis());
		clone.setEngine(product.getEngine());
		clone.setGear(product.getGear());
		return clone;
	}
	protected Car getProduct() {
		return product;
	}
	public abstract void buildChassis( );//�asi'yi modele ba�lad�m.
	public abstract void buildEngine(String token);
	public abstract void buildTransmission(String token);
}

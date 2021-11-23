package com.designpatterns.creational.builder.example;

import com.designpatterns.creational.builder.product.Chassis;
import com.designpatterns.creational.builder.product.Engine;
import com.designpatterns.creational.builder.product.FuelType;
import com.designpatterns.creational.builder.product.Transmission;

public class RenaultBuilder extends CarBuilder {
	
	public RenaultBuilder( String carModel ) {
		super(carModel);
		getProduct().setBrand("Renault");
	}

	public void buildChassis( ) {
		String token = getProduct().getModel().toUpperCase();
		if( token.contains("TOURER") )
			getProduct().setChassis(Chassis.STATIONWAGON);
		else if( token.contains("CAPTUR") )
			getProduct().setChassis(Chassis.SUV);
		else if( token.contains("SYMBOL") || token.contains("LATTITUDE"))
			getProduct().setChassis(Chassis.SEDAN);
		else
			getProduct().setChassis(Chassis.HATCHBACK);
		
	}

	public void buildEngine(String token) {
		//Min. values for a Honda engine
		if( getProduct().getEngine() == null )
			getProduct().setEngine( new Engine(FuelType.PETROLEUM, 1150, 60) );
		token = token.toUpperCase();
		if( token.contains("DCI") )
			getProduct().getEngine().setFuel(FuelType.DIESEL);
		else if( token.contains("BG") ) {
			getProduct().getEngine().setPower( Integer.parseInt(token) );
		}
		else if( token.contains(".") ) {
			getProduct().getEngine().setVolume( (int)(Double.parseDouble(token) * 1000) );
		}
	}

	public void buildTransmission(String token) {
		//By default, AutoTransmission has 4 gears and ManualT has 5.
		int gearCount = Integer.parseInt(token);
		boolean isAutomatic = false;
		if( token.toUpperCase().contains("CVT") 
				|| token.toUpperCase().contains("EDC") )
			isAutomatic = true;
		if( isAutomatic && gearCount == 0 )
			gearCount = 4;
		if( !isAutomatic && gearCount == 0 )
			gearCount = 5;
		getProduct().setGear( new Transmission(gearCount, isAutomatic) );
	}
}

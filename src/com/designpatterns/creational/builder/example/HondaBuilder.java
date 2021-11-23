package com.designpatterns.creational.builder.example;

import com.designpatterns.creational.builder.product.Chassis;
import com.designpatterns.creational.builder.product.Engine;
import com.designpatterns.creational.builder.product.FuelType;
import com.designpatterns.creational.builder.product.Transmission;

public class HondaBuilder extends CarBuilder {
	
	public HondaBuilder( String carModel ) {
		super(carModel);
		getProduct().setBrand("Honda");
	}

	public void buildChassis( ) {
		if( getProduct().getModel().toUpperCase().contains("BACK") )
			getProduct().setChassis(Chassis.HATCHBACK);
		else if( getProduct().getModel().toUpperCase().contains("CR-V") )
			getProduct().setChassis(Chassis.SUV);
		else
			getProduct().setChassis(Chassis.SEDAN);
		
	}

	public void buildEngine(String token) {
		//Min. values for a Honda engine
		if( getProduct().getEngine() == null )
			getProduct().setEngine( new Engine(FuelType.PETROLEUM, 1150, 60) );
		token = token.toUpperCase();
		if( token.contains("ECO") )
			getProduct().getEngine().setFuel(FuelType.LPG);
		else if( token.contains("PS") ) {
			int end = token.indexOf("PS");
			token = token.substring(0, end);
			getProduct().getEngine().setPower( Integer.parseInt(token) );
		}
		else if( token.contains("L") ) {
			int end = token.indexOf("L");
			token = token.substring(0, end);
			getProduct().getEngine().setVolume( (int)(Double.parseDouble(token) * 1000) );
		}
	}

	public void buildTransmission(String token) {
		//By default, AutoTransmission has 4 gears and ManualT has 5.
		int gearCount = Integer.parseInt(token.substring(0,1));
		boolean isAutomatic = false;
		if( token.toUpperCase().contains("AT") )
			isAutomatic = true;
		if( isAutomatic && gearCount == 0 )
			gearCount = 4;
		if( !isAutomatic && gearCount == 0 )
			gearCount = 5;
		getProduct().setGear( new Transmission(gearCount, isAutomatic) );
	}
}

package com.designpatterns.creational.builder.example;

public class CarDirector {
	private CarBuilder builder;
	
	public CarDirector(CarBuilder builder) {
		this.builder = builder;
	}
	
	public void construct(String elements[]) {
		builder.buildChassis();
		for( String element : elements ) {
			int tab = element.indexOf("\t");
			String item = element.substring(0,tab);
			String info = element.substring(tab+1,element.length());
			if( item.compareToIgnoreCase("Engine")== 0 )
				builder.buildEngine(info);
			else if( item.compareToIgnoreCase("Gear")== 0 )
				builder.buildTransmission(info);
		}
	}
	public void report( ) {
		System.out.println(builder.getResult());
	}

	public static void main(String[] args) {
		CarDirector director = new CarDirector( new HondaBuilder("Civic Sedan") );
		String elements[] = {"Engine\t125PS","Engine\t1.6L","Gear\t6AT"};
		director.construct(elements);
		director.report();
	}



}

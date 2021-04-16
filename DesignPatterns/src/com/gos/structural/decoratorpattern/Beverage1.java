package com.gos.structural.decoratorpattern;

public class Beverage1 extends Beverage {
	
	public Beverage1() {
		description = "Beverage1";
	}	
	

	@Override
	public int Cost() {
		return 100;
	}

}

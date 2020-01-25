package com.gos.structural.decoratorpattern;

public class Beverage2 extends Beverage {
	
	public Beverage2() {
		description = "Beverage2";
	}

	@Override
	public int Cost() {
		return 200;
	}

}

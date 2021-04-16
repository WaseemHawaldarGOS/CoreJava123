package com.gos.structural.decoratorpattern;

public class CondimentsOrDecorators1 extends CondimentsOrDecorators {
	
	Beverage beverage;
	
	public CondimentsOrDecorators1(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() +" , CondimentsOrDecorators1";
	}

	@Override
	public int Cost() {
		return beverage.Cost() + 35;
	}

}

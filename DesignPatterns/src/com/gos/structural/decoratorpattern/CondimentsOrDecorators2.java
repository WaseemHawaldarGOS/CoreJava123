package com.gos.structural.decoratorpattern;

public class CondimentsOrDecorators2 extends CondimentsOrDecorators {
	
	Beverage beverage;

	public CondimentsOrDecorators2(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() +" , CondimentsOrDecorators2";
	}

	@Override
	public int Cost() {
		return beverage.Cost() + 45;
	}

}

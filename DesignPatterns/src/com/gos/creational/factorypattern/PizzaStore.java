package com.gos.creational.factorypattern;


public abstract class PizzaStore {

	/*
	Concrete method
	 */
	public Pizza orderPizza(String type){
		Pizza pizza = null;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
				
	}

	/*
	Abstract method
	 */
	protected abstract Pizza createPizza(String type);

}

package com.gos.creational.factorypattern;


public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {
		
		if(item.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		}
		else if(item.equals("veggie")){
			return new ChicagoStyleVeggiePizza();
		}
		else return null;		
	}
}

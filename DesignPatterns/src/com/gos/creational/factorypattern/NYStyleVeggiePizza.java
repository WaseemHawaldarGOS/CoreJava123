package com.gos.creational.factorypattern;

public class NYStyleVeggiePizza extends Pizza {

	@SuppressWarnings("unchecked")
	public NYStyleVeggiePizza(){
		name = "NY style sauce and veggie pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara saucce";
		toppings.add("Grated Reggiano vegetable");
	}
}

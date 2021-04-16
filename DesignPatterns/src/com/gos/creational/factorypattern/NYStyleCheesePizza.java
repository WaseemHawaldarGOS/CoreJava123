package com.gos.creational.factorypattern;

public class NYStyleCheesePizza extends Pizza {

	@SuppressWarnings("unchecked")
	public NYStyleCheesePizza(){
		name = "NY style sauce and cheese pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara saucce";
		toppings.add("Grated Reggiano Cheese");
	}
}

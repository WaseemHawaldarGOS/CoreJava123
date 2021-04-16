package com.gos.creational.factorypattern;

public class ChicagoStyleCheesePizza extends Pizza {

	@SuppressWarnings("unchecked")
	public ChicagoStyleCheesePizza(){
		name = "Chaicago style deep dish cheese pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato saucce";
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	void cut(){
		System.out.println("Cutting the pizza into square slices");
	}
}

package com.gos.creational.factorypattern;

public class ChicagoStyleVeggiePizza extends Pizza {

	@SuppressWarnings("unchecked")
	public ChicagoStyleVeggiePizza(){
		name = "Chaicago style deep dish veggie pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato saucce";
		toppings.add("Shredded Mozzarella vegetable");
	}
	
	void cut(){
		System.out.println("Cutting the pizza into round slices");
	}
}

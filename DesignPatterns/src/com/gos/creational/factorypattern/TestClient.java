package com.gos.creational.factorypattern;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+pizza.getName() + "\n");
		
		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a "+pizza.getName() + "\n");		
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a "+pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a "+pizza.getName() + "\n");

	}
}

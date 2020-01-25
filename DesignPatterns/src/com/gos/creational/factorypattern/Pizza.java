package com.gos.creational.factorypattern;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	String dough;
	String sauce;
	@SuppressWarnings("unchecked")
	ArrayList toppings = new ArrayList();
	
	void prepare(){
		
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough "+dough);
		System.out.println("Adding sauce "+sauce);
		System.out.println("Adding toppings:");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("  "+toppings.get(i));
		}
		
	}
	
	void bake(){
		System.out.println("Bake for 25 min at 350");		
	}
	
	void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box(){
		System.out.println("Place pizza in official pizza store box");		
	}
	
	public String getName(){
		return name;
	}

}

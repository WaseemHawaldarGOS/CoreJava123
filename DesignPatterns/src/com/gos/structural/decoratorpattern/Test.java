package com.gos.structural.decoratorpattern;

public class Test {


	public static void main(String[] args) {
	Beverage beverage1 = new Beverage1();
	
	System.out.println("Beverage 1 details : decription = "+beverage1.description +", cost = "+beverage1.Cost());
	
	
	beverage1 = new CondimentsOrDecorators1(beverage1);
	System.out.println("After CondimentsOrDecorators1 has been decorated on top of beverage1");
	System.out.println("Description = " + beverage1.getDescription());
	System.out.println("Cost = "+beverage1.Cost());
	
	Beverage beverage2 = new Beverage2();
	System.out.println("Beverage 2 details : decription = "+beverage2.description +", cost = "+beverage2.Cost());
	
	beverage2 = new CondimentsOrDecorators1(beverage2);
	beverage2 = new CondimentsOrDecorators2(beverage2);
	System.out.println("After CondimentsOrDecorators1 & CondimentsOrDecorators2 has been decorated on top of beverage2");
	System.out.println("Description = " + beverage2.getDescription());
	System.out.println("Cost = "+beverage2.Cost());
	
	}

}

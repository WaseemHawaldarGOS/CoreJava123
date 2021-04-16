package com.gos.behavioral.visitorpattern;

public class That implements Element {

	@Override
	public void accept(Visitor v) {
		v.visit( this );
	   }
	
	   public String that() {
	     return "That";
	   }

}

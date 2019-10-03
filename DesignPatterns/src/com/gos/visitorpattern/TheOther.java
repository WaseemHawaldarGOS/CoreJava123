package com.gos.visitorpattern;

public class TheOther implements Element {

	@Override
	public void accept(Visitor v) {
		v.visit( this );
	   }
	   public String theOther() {
	     return "TheOther"; 
	   }

}

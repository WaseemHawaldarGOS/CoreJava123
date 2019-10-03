package com.gos.visitorpattern;

public class This implements Element {

	@Override
	public void accept(Visitor v) {
		v.visit( this );
	   } 
	
	   public String thiss() {
	     return "This";
	   }

}
